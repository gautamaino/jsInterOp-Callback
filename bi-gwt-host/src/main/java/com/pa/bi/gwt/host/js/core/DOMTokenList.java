
package com.pa.bi.gwt.host.js.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class DOMTokenList {

    /**
     * This interface doesn't inherit any property.
     *
     * DOMTokenList.length Read only Is an integer representing the number of
     * objects stored in the object.
     * @return 
     */
    @JsProperty
    public native int getLength();

    /**
     * Returns an item in the list by its index (or undefined if the number is
     * greater than or equal to the length of the list, prior to Gecko 7.0
     * returned null)
     *
     * @param index
     * @return
     */
    public native String item(int index);

    /**
     * Returns true if the underlying string contains token, otherwise false
     *
     * @param obj
     * @return
     */
    public native Boolean contains(String obj);

    /**
     * Adds token to the underlying string
     *
     * @param obj
     */
    public native void add(String obj);

    /**
     * Removes token from the underlying string
     *
     * @param obj
     */
    public native void remove(String obj);

    /**
     * Removes token from string and returns false. If token doesn't exist it's
     * added and the function returns true
     *
     * @param obj
     * @return
     */
    public native Boolean toggle(String obj);

}
