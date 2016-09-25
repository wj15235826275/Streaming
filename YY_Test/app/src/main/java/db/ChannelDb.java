package db;

import java.util.ArrayList;
import java.util.List;

import bean.Channel;


public class ChannelDb {

	private static List<Channel>   selectedChannel=new ArrayList<Channel>();

	static{
		selectedChannel.add(new Channel("T1348647909107","热门",0,
				"http://idx.3g.yy.com/mobyy/nav/recommend/index/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=0&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
		selectedChannel.add(new Channel("T1348648517839","发现",0,
				"http://data.3g.yy.com/mobyy/nav/recommend/discover/near?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=0&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
		selectedChannel.add(new Channel("T1348649079062","好声音",0,
				"http://data.3g.yy.com/mobyy/nav/recommend/sing/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=0&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
		selectedChannel.add(new Channel("T134 8648756099","脱口秀",0,"http://data.3g.yy.com/mobyy/nav/recommend/talk/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=0&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));

		selectedChannel.add(new Channel("","然舞蹈",0,
				"http://data.3g.yy.com/mobyy/nav/recommend/dance/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=0&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
		selectedChannel.add(new Channel("","潮音乐",0,"http://data.3g.yy.com/mobyy/nav/recommend/mc/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=2&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
		selectedChannel.add(new Channel("","潮人",0,"http://data.3g.yy.com/mobyy/nav/recommend/red/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=0&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
		selectedChannel.add(new Channel("","明星",0,"http://data.3g.yy.com/mobyy/nav/recommend/star/idx?sdkVersion=5.9.1&osVersion=4.4.4&imei=352284047846435&uid=1620699551&os=android&yyVersion=5.9.1&model=iToolsAVM&ispType=4&bkt=2&channel=baidu&netType=2&mac=08%3A00%3A27%3A63%3A2a%3A42",""));
	}
	public static  List<Channel> getSelectedChannel(){
		return selectedChannel;
	}


}
