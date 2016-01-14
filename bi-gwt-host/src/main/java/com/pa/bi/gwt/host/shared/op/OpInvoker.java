package com.pa.bi.gwt.host.shared.op;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.pa.bi.gwt.host.shared.dto.Pojo;

@RemoteServiceRelativePath("OpInvoke")
public interface OpInvoker extends RemoteService{
	public Result<? extends Pojo> invokeOp(Operation op);
}
