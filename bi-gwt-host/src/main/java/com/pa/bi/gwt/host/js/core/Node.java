package com.pa.bi.gwt.host.js.core;

import com.pa.bi.gwt.host.js.JsObject;

import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Node extends EventTarget {

    public native void bind(String property, JsObject objects);

    public native Element parentElement();

    public native Node parentNode();

    public native Node firstChild();

    public native Node removeChild(Node child);
    
    public native void appendChild(Object child);
}
