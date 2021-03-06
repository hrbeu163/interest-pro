package com.interest.user.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserInfoRequest {

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("个人主页")
    private String url;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("个人简介")
    private String info;

    @ApiModelProperty("位置")
    private String location;

    @ApiModelProperty("技能")
    private String skill;

}
