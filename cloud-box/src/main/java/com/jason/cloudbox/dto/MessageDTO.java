package com.jason.cloudbox.dto;

/**
 *
 * @author zssjz
 */
public class MessageDTO {

    private Integer status;

    private String code;

    private String msg;

    private Object content;

    public MessageDTO() {
    }

    public MessageDTO(Integer status, String code, String msg, Object content) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
