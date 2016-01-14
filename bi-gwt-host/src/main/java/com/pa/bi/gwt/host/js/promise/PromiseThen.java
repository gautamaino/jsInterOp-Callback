
package com.pa.bi.gwt.host.js.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface PromiseThen {
    Promise call(Object obj);
}
