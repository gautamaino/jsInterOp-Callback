package com.pa.bi.gwt.host.js;

public class JSNI {
    
    public final static native Console createConsole() /*-{
        return $wnd.console;
    }-*/;
    
    public final static native Window createWindow() /*-{
        return $wnd;
    }-*/;
    
    public final static native JSON createJSON() /*-{
        return $wnd.JSON;
    }-*/;
    
}
