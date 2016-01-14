
package com.pa.bi.gwt.host.js;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class Window {

    @JsProperty
    public native Console getConsole();
    
    @JsProperty
    public native Document getDocument();
}
