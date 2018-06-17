package com.demo.patterns.flyweight.test;

public class ClientTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.use(new User("小菜"));
		
		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.use(new User("大鸟"));
		
		WebSite fz = f.getWebSiteCategory("产品展示");
		fz.use(new User("娇娇"));
		
		WebSite f1 = f.getWebSiteCategory("博客");
		f1.use(new User("老顽童"));
		
		WebSite fm = f.getWebSiteCategory("博客");
		fm.use(new User("桃谷六仙"));
		
		WebSite fn = f.getWebSiteCategory("博客");
		fn.use(new User("南海鳄神"));
		
		System.out.println("网站分类总数为:"+f.getWebSiteCount());
	}

}
