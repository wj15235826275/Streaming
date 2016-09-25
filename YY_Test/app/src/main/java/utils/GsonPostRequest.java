package utils;

import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Convert a JsonElement into a list of objects or an object with Google Gson.
 * <p>
 * The JsonElement is the response object for a
 * {@link Method} POST call.
 *
 * @author https://plus.google.com/+PabloCostaTirado/about
 */
public class GsonPostRequest<T> extends JsonRequest<T> {
    private final Gson gson;
    private final Class<?> mClass;
    private final Response.Listener<T> listener;
    private final Response.ErrorListener errorListener;
    private static Map<String, String> mHeader = new HashMap<String, String>();

    /**
     * Make a GET request and return a parsed object from JSON.
     *
     * @param url           URL of the request to make
     * @param mClass        is the type of the object to be returned
     * @param listener      is the listener for the right answer
     * @param errorListener
     */
    public GsonPostRequest(String url, String body, Class<?> mClass, Gson gson, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(Method.POST, url, body, listener, errorListener);
//        Log.i("net", ".....http.url........" + url);
//        Log.i("net", ".....http.body........" + body);

        this.gson = gson;
        this.mClass = mClass;
        this.listener = listener;
        this.errorListener = errorListener;
        mHeader.put("Content Type", "application/json");
    }

    public GsonPostRequest(String url, String body, Class<?> mClass, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(Method.POST, url, body, listener, errorListener);
//        Log.i("net", ".....http.url........" + url);
//        Log.i("net", ".....http.body........" + body);

        this.gson = new Gson();
        this.mClass = mClass;
        this.errorListener = errorListener;
        this.listener = listener;
        mHeader.put("Content Type", "application/json");
    }


    @Override
    public void deliverError(VolleyError error) {
        errorListener.onErrorResponse(error);
        error.printStackTrace();


    }


    @Override
    protected VolleyError parseNetworkError(VolleyError volleyError) {
        return super.parseNetworkError(volleyError);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return mHeader;
    }

    @Override
    protected void deliverResponse(T response) {
        listener.onResponse(response);
    }


    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        String errorMessage;
        try {

            String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            Log.i("net", "接口返回" + json);

            try {
                return (Response<T>) Response.success(gson.fromJson(json, mClass), HttpHeaderParser.parseCacheHeaders(response));

            } catch (Exception e) {
                e.printStackTrace();
                Log.i("net", "jons1");
                return Response.error(new ParseError(e));
            }
        } catch (UnsupportedEncodingException e) {
            Log.i("net", "jons2");
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            Log.i("net", "jons3");
            e.printStackTrace();
            return Response.error(new ParseError(e));
        }
    }
}
