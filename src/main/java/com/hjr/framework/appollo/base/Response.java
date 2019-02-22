package com.hjr.framework.appollo.base;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/6 下午10:23
 */
public class Response<T> {
    private int status;
    private String msg;
    private T data;

    public static Response create() {
        return new Response();
    }

    public static Response success() {
        return new Response().setStatus(StatusEnum.SUCCESS.getValue()).setMsg(StatusEnum.SUCCESS.getDesc());
    }

    public static Response failure() {
        return new Response().setStatus(StatusEnum.ERROR.getValue()).setMsg(StatusEnum.ERROR.getDesc());
    }

    public boolean isSuccess() {
        return StatusEnum.SUCCESS.getValue() == status;
    }

    public int getStatus() {
        return status;
    }

    public Response setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Response setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Response setData(T data) {
        this.data = data;
        return this;
    }
}
