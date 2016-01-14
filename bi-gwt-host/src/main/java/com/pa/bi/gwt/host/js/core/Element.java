
package com.pa.bi.gwt.host.js.core;

import com.pa.bi.gwt.host.js.Function;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Element extends Node {
    
    @JsProperty
    public native DOMTokenList getClassList();
    
    public native void addEventListener(String event, Function fn);
    
    public native Object querySelector(String selector);
    
    @JsProperty
    public native void setInnerHTML(String html);
    
    @JsProperty
    public native String getInnerHTML();

}
