package com.hjr.framework.appollo.base;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/6 下午10:35
 */
public enum StatusEnum {
    SUCCESS(200, "操作成功"),
    ERROR(300, "操作失败"),
    ;
    private int value;
    private String desc;

    private StatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
