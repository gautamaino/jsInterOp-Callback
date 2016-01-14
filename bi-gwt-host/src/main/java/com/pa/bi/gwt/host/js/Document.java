
package com.pa.bi.gwt.host.js;

import com.pa.bi.gwt.host.js.core.Element;
import com.pa.bi.gwt.host.js.core.NodeList;
import com.pa.bi.gwt.host.js.html.HTMLBodyElement;
import com.pa.bi.gwt.host.js.html.HTMLElement;
import com.pa.bi.gwt.host.js.html.StyleSheetList;


import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represent a Document
 *
 */
@JsType(isNative = true)
public class Document {

    public native HTMLElement createElement(String element);

    public native HTMLElement getElementsByTagName(String body);

    @JsProperty
    public native HTMLBodyElement getBody();

    public native Element querySelector(String selector);

    public native NodeList querySelectorAll(String selector);
    
    @JsProperty
    public native StyleSheetList getStyleSheets();
}
