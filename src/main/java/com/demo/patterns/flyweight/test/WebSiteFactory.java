package com.demo.patterns.flyweight.test;

import java.util.Hashtable;

public class WebSiteFactory {
	private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<String, ConcreteWebSite>();
	
	public WebSite getWebSiteCategory(String key) {
		if(!flyweights.containsKey(key))
			flyweights.put(key, new ConcreteWebSite(key));
		return (WebSite)flyweights.get(key);
	}
	
	public int getWebSiteCount() {
		return flyweights.size();
	}
}
