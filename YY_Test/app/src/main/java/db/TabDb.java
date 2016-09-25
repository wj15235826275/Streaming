package db;

import eakay.bwie.lenovo.yy_test.R;
import fragment.MyFm;
import fragment.MyZhiBoFm;
import fragment.SheQuFm;
import fragment.ZhiBoFm;

public class TabDb {
	/***
	 * 获得底部所有项
	 */
	public static String[] getTabsTxt() {
		String[] tabs = {"直播","开播","社区","我的"};
		return tabs;
	}
	/***
	 * 获得所有碎片
	 */
	public static Class[] getFramgent(){
		Class[] cls = {ZhiBoFm.class, SheQuFm.class, MyZhiBoFm.class, MyFm.class};
		return cls ;
	}
	/***
	 * 获得所有点击前的图片
	 */
	public static int[] getTabsImg(){
		int[] img = {R.drawable.main_tab_live_unpressed,R.drawable.short_video_unpressed,R.drawable.soft_icon_heart,R.drawable.icon_login_account};
		return img ;
	}
	/***
	 * 获得所有点击后的图片
	 */
	public static int[] getTabsImgLight(){
		int[] img = {R.drawable.main_tab_live_pressed,R.drawable.short_video_pressed,R.drawable.soft_icon_heart_on,R.drawable.icon_login_account_select};
		return img ;
	}
}
