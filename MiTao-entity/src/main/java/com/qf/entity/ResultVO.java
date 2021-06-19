package com.qf.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO implements Serializable {

    private boolean flag;
    private String msg;
    private  Object data;

    private ResultVO(boolean flag) {
        this.flag = flag;
    }

    private ResultVO(boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    private ResultVO(boolean flag, String msg, Object data) {
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public static ResultVO success(){
        return new ResultVO(true);
    }

    public static ResultVO success(String msg){
        return new ResultVO(true,msg);
    }

    public static ResultVO success(String msg,Object data){
        return new ResultVO(true,msg,data);
    }

    public static ResultVO fail(){
        return new ResultVO(false);
    }

    public static ResultVO fail(String msg){
        return new ResultVO(false,msg);
    }

    public static ResultVO fail(String msg,Object data){
        return new ResultVO(false,msg,data);
    }

}
