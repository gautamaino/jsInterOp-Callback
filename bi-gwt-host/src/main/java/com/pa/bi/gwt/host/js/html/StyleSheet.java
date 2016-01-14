
package com.pa.bi.gwt.host.js.html;

import com.pa.bi.gwt.host.js.core.Node;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class StyleSheet {
    
    @JsProperty
    public native boolean getDisabled();
    
    @JsProperty
    public native void setDisabled(boolean disabled);
    
    @JsProperty
    public native Node getOwnerNode();
    
    @JsProperty
    public native StyleSheet getParentStyleSheet();
    
    @JsProperty
    public native String getTitle();

    @JsProperty
    public native String getType();
    
    @JsProperty
    public native String getHref();
}
