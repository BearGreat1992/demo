package com.service.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-11-24T03:21:50.347Z")

@RpcSchema(schemaId = "demo")
public class DemoImpl implements Demo{

    @Autowired
    private DemoDelegate demoDelegate;


    public String helloworld(String name) {

        return demoDelegate.helloworld(name);
    }

}
