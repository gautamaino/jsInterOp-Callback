package com.pa.bi.gwt.host.server.op;

import javax.servlet.http.HttpServlet;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.pa.bi.gwt.host.shared.dto.DummyDto;
import com.pa.bi.gwt.host.shared.dto.Pojo;
import com.pa.bi.gwt.host.shared.op.OpInvoker;
import com.pa.bi.gwt.host.shared.op.Operation;
import com.pa.bi.gwt.host.shared.op.Result;

/**
 * Servlet implementation class OpInvokerServlet
 */
public class OpInvokerServlet extends RemoteServiceServlet implements OpInvoker {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OpInvokerServlet() {
        super();
       
    }

	@Override
	public Result<? extends Pojo> invokeOp(Operation op) {
		DummyDto d = new DummyDto() ;
		
		d.setAge(38);
		d.setName("Debasish");
		
		return new Result<DummyDto>(d) ;
	}
}
