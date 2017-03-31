package com.ants.monitor.bean;
import lombok.Data;

/**
 * Created by zxg on 15/11/2.
 */
@Data
public class ResultVO {

    private boolean success;
    private String code = "000";
    private String msg = "";
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultVO wrapSuccessfulResult() {
        ResultVO vo = new ResultVO();
        vo.setSuccess(true);
        return vo;
    }
    public static ResultVO wrapSuccessfulResult(Object data) {
        ResultVO vo = new ResultVO();
        vo.setSuccess(true);
        vo.setData(data);
        return vo;
    }

    public static ResultVO wrapErrorResult(String msgStr) {
        ResultVO vo = new ResultVO();
        vo.setSuccess(false);

        vo.setMsg(msgStr);

        return vo;
    }


    public static ResultVO wrapErrorResult(String code,String msgStr) {
        ResultVO vo = new ResultVO();
        vo.setCode(code);
        vo.setSuccess(false);
        vo.setMsg(msgStr);

        return vo;
    }

}
