
package com.pa.bi.gwt.host.js.core;

import com.pa.bi.gwt.host.js.JsObject;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface EventListener<E extends JsObject> {
    public void onEvent(E event);
}
