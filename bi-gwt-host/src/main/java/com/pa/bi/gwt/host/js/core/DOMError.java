package com.pa.bi.gwt.host.js.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class DOMError {

    @JsProperty
    public native String getName();

}
