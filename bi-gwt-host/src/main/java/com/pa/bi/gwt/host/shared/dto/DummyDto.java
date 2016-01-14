package com.pa.bi.gwt.host.shared.dto;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@SuppressWarnings("serial")
@JsType(namespace = "AinoHost" , name = "DummyDto" )
public class DummyDto implements Pojo {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@JsConstructor
	public DummyDto(){
		
	}

	@JsProperty
	private String name ;
	
	@JsProperty
	private int age ;
	
	@JsIgnore
	private long salary ;
	
    @JsMethod(name = "hello")
	public String sayHello(String nm){
		String last = "Hello " + nm ;  
		return last ;
	}
    
    public String toString(){
    	return sayHello(name) ;
    }
}