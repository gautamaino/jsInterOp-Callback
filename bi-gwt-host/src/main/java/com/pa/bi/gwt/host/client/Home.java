package com.pa.bi.gwt.host.client;

import java.util.HashMap;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pa.bi.gwt.host.js.Changed;
import com.pa.bi.gwt.host.js.Console;
import com.pa.bi.gwt.host.js.JSNI;
import com.pa.bi.gwt.host.js.JsObject;
import com.pa.bi.gwt.host.js.promise.*;
import com.pa.bi.gwt.host.js.promise.ResolveFn;
import com.pa.bi.gwt.host.shared.dto.Pojo;
import com.pa.bi.gwt.host.shared.op.OpInvoker;
import com.pa.bi.gwt.host.shared.op.OpInvokerAsync;
import com.pa.bi.gwt.host.shared.op.Operation;
import com.pa.bi.gwt.host.shared.op.Result;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Home implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		Window.alert("onModuleLoad Called");
		
		HashMap<String, Pojo> map = new HashMap<String, Pojo>() ;
		Operation op = new Operation("someOperation" , map) ;
		OpInvokerAsync async = GWT.create(OpInvoker.class) ;
		
		async.invokeOp(op, new AsyncCallback<Result<?>>(){

			@Override
			public void onFailure(Throwable caught) {
				
			}

			@Override
			public void onSuccess(Result<?> result) {
				
				Window.alert("Data retrieived from server - " + result.getReturnedData()) ;
				timer.scheduleRepeating(50);;
			}
			
		});
		
	}

	    
	    Console console = JSNI.createConsole();
	    
	    final Timer timer = new Timer() {
	      public void run() {
	        testJsInvoke();
	      }
	    };
	    
	    public void testJsInvoke() {

	        Promise p = new Promise((ResolveFn resolve, RejectedFn rejected) -> {
	            timer.schedule(3000);
	            resolve.resolve(true);
	        });
	        
	        PromiseThen then = (Object obj) -> {
	            console.log("Resolve--------------");
	            console.log(obj);
	            console.log("REsolve--------------");
	            testNativeCode();
	            return null;
	        };
	        
	        PromiseThen error = (Object obj) -> {
	            console.log("Rejected");
	            console.log(obj);
	            return null;
	        };
	        
	        p.then(then).catchException(error);
	        
	        Person model= new Person("Gautam", "Anand");
	        JsObject.observe(model, (Changed<Person>[] changed) -> {
	            console.log("Observe:");
	            console.log(changed);
	            return null;
	        });
	        
	        model.setName("Totme totme");
	    }

	    public static native void testNativeCode()/*-{
		     var person = new $wnd.aino.Person("Gautam", "Anand");
		     console.log(person.name);
		     console.log(person.surname);
		     console.log(person.getName());
		     console.log(person.getSurname());
	     }-*/;

}
