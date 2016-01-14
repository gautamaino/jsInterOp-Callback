
package com.pa.bi.gwt.host.js;

import jsinterop.annotations.JsType;


/**
 * Native JS Array
 *
 *
 */
@JsType(isNative = true)
public class Array extends JsObject{
    
    //Class Method
    public static native boolean isArray(Object obj);
    public static native Array of(Object[] objs);
    
    public native int push(int element);
    public native int push(int element, int element2);
    public native int push(String element);
    public native int pop();
    public native Array filter(Function<Boolean,Object> fn);
}
