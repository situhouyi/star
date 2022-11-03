package com.star.diary.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@ApiModel
@Data
@TableName("user_info")
public class User {

    @TableId(value="id",type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户名")
    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;
}
