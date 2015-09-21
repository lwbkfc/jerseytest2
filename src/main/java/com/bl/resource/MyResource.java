package com.bl.resource;

import com.bl.service.MyService;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by lwb on 2015/9/20.
 */
@Path("/my")
@Component
public class MyResource {
    @Resource
    private MyService myService;
    @GET
    @Path("/aaa")
    @Produces("text/plain")
    public String sayHello(){
        return myService.sayHello();
    }
}
