package io.renren.modules.api.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author huyi
 * @create 2017/12/18 11:15
 */
public class RequestAlbumVo {
    @ApiModelProperty(value = "专辑名称", required = true)
    private String name;

    @ApiModelProperty(value = "第三方专辑Id", required = true)
    private String thirdAlbumId;//第三方专辑Id

    @ApiModelProperty(value = "第三方专辑Id", required = true)
    private String thirdSystemId;//第三方系统Id

    @ApiModelProperty(value = "标准图", required = false)
    private String standardPic;//标准图

    @ApiModelProperty(value = "竖图", required = false)
    private String ystandardPic;//竖图

    @ApiModelProperty(value = "水印图片", required = false)
    private String markPic;//水印图片

    @ApiModelProperty(value = "水印图片位置", required = false)
    private String markPosition;//水印图片位置

    @ApiModelProperty(value = "标签", required = false)
    private String tag;//标签

    @ApiModelProperty(value = "评分", required = false)
    private String score;//评分

    @ApiModelProperty(value = "描述", required = false)
    private String description;//描述

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThirdAlbumId() {
        return thirdAlbumId;
    }

    public void setThirdAlbumId(String thirdAlbumId) {
        this.thirdAlbumId = thirdAlbumId;
    }

    public String getThirdSystemId() {
        return thirdSystemId;
    }

    public void setThirdSystemId(String thirdSystemId) {
        this.thirdSystemId = thirdSystemId;
    }

    public String getStandardPic() {
        return standardPic;
    }

    public void setStandardPic(String standardPic) {
        this.standardPic = standardPic;
    }

    public String getYstandardPic() {
        return ystandardPic;
    }

    public void setYstandardPic(String ystandardPic) {
        this.ystandardPic = ystandardPic;
    }

    public String getMarkPic() {
        return markPic;
    }

    public void setMarkPic(String markPic) {
        this.markPic = markPic;
    }

    public String getMarkPosition() {
        return markPosition;
    }

    public void setMarkPosition(String markPosition) {
        this.markPosition = markPosition;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
