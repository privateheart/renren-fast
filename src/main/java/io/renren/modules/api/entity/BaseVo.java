package io.renren.modules.api.entity;

import io.swagger.annotations.ApiModelProperty;

import java.security.Timestamp;

/**
 * 返回信息
 * @author LBQ-PC
 *
 */
public class BaseVo {

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Boolean success;

    /**
     * 消息
     */
    @ApiModelProperty(value = "消息")
    private String msg;

    /**
     * 服务器当前时间
     */
    @ApiModelProperty(value = "服务器当前时间戳，sample： 1434553831")
    private Long currentTime = System.currentTimeMillis();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String message) {
        this.msg = message;
    }

    public Long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Long currentTime) {
        this.currentTime = currentTime;
    }


}
