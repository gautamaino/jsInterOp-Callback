
package com.pa.bi.gwt.host.js.promise;

import jsinterop.annotations.JsFunction;

@FunctionalInterface
@JsFunction
public interface RejectedFn {
    void rejected(Object objs);
}
