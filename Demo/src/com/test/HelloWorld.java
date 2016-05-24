package com.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	// comment added is modified now!
	// one more comment added
	// one more time buddy!
	// command line code...
	@WebMethod String getHelloWorldAsString(String name);
}
