package com.pa.bi.gwt.host.js;

import jsinterop.annotations.JsFunction;

/**
 * Represent a Function in JS Enviroment.
 */
@JsFunction
public interface Function<T, E> {
    E call(T changed);
}
