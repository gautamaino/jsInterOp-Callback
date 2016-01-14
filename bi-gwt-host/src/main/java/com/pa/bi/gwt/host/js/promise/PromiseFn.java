
package com.pa.bi.gwt.host.js.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface PromiseFn {

    void call(ResolveFn resolve, RejectedFn rejected);
}
