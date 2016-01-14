package com.pa.bi.gwt.host.js;

import com.google.gwt.core.client.js.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native JS Console
 *
 */
@JsType(isNative = true)
public class Console {

    @JsProperty
    public native MemoryInfo getMemory();

    public native void log(Object... obj);

}
