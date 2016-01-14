package com.pa.bi.gwt.host.js.promise;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Promise {

    public Promise(PromiseFn fn) {}
    
    public Promise() {}
    
    public native Promise then(PromiseThen f);

    public native Promise then(PromiseThen f, PromiseThen error);
    
    @JsMethod(name = "catch")
    public native Promise catchException(PromiseThen error);

    public static native Promise resolve(Object obj);

    public static native Promise reject(Object obj);

    public static native Promise all(Object... objs);

    public static native Promise race(Object... iterable);
}
