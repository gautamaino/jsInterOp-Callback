package com.pa.bi.gwt.host.shared.op;

import com.pa.bi.gwt.host.shared.dto.Pojo;

public class Result<T extends Pojo> implements Pojo {
	
	private T returned = null ;

	public Result(){
		
	}
	
	public Result(T t){
		returned = t ;
	}
	
	public T getReturnedData() {
		return returned;
	} 
}
