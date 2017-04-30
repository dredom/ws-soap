package com.dredom.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloService {

    Logger log = Logger.getLogger(getClass());

    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name = "guestname") String guestname) {
        log.info("sayHello: guestname='" + guestname + "'");
        if (guestname == null) {
            return "Hello";
        }
        return "Hello " + guestname;
    }
}
