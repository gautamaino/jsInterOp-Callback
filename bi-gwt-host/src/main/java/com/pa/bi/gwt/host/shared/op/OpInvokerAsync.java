package com.pa.bi.gwt.host.shared.op;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.pa.bi.gwt.host.shared.dto.Pojo;

public interface OpInvokerAsync {
	public void invokeOp(Operation op, AsyncCallback<Result<? extends Pojo>> async);
}
