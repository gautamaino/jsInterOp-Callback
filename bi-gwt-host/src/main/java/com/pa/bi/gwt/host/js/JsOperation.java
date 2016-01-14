package com.pa.bi.gwt.host.js;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace="AinoHost", name="JsOp")
public class JsOperation{
	
	@JsProperty 
	private String name ;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
