package com.pa.bi.gwt.host.shared.op;

import java.io.Serializable;
import java.util.HashMap;

import com.pa.bi.gwt.host.shared.dto.Pojo;


@SuppressWarnings("serial")
//@JsType(namespace = "BiHost", name = "Operation")
public class Operation implements Pojo {

	private String opName;

	private HashMap<String, Pojo> parameterMap = null;

	public Operation() {

	}

	public Operation(String name, HashMap<String, Pojo> parameters) {
		parameterMap = parameters ;
	}

	public String getOpName() {
		return opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public HashMap<String, Pojo> getParameterMap() {
		if (parameterMap == null)
			parameterMap = new HashMap<String , Pojo >();
		return parameterMap;
	}

	public void setParameterMap(HashMap<String, Pojo> parameterMap) {
		this.parameterMap = parameterMap;
	}


	public void addParameter(String name, Pojo s) {
		getParameterMap().put(name, s);
	}
}
