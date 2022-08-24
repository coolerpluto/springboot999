package com.fan.part1.utils;


public class JsonResult<T> {
    private T data;
    private String code;
    private String msg;

    private JsonResult(){
        this.code="0";
        this.msg="success";
    }

    private JsonResult(T data){
        this.data = data;
        this.code = "200";
        this.msg = "success";
    }


}
