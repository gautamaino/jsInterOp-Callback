
package com.pa.bi.gwt.host.js.html;

import com.pa.bi.gwt.host.js.JsObject;
import com.pa.bi.gwt.host.js.core.Element;
import com.pa.bi.gwt.host.js.core.EventListener;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true)
public class HTMLElement extends Element {

    @JsMethod
    public static native void setAttribute(String align, String center);

    @JsMethod
    public static native void appendChild(HTMLElement element);

    @JsMethod
    public static native void addEventListener(String event, EventListener<? extends JsObject> handler);

    @JsProperty
    public static native void setInnerText(String text);
 
    @JsProperty
    public static native String getInnerText();

}
