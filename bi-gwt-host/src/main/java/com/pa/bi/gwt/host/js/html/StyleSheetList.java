
package com.pa.bi.gwt.host.js.html;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class StyleSheetList {
    
    public native StyleSheet item(int idx);
    
    public native int length();
    
}
