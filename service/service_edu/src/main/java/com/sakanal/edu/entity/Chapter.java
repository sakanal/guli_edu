package com.sakanal.edu.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 课程
 * </p>
 *
 * @author sakanal
 * @since 2022-09-13
 */
@Getter
@Setter
@TableName("edu_chapter")
@ApiModel(value = "Chapter对象", description = "课程")
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("章节ID")
    @TableId("id")
    private String id;

    @ApiModelProperty("课程ID")
    @TableField("course_id")
    private String courseId;

    @ApiModelProperty("章节名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("显示排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("创建时间")
    @TableField(value = "gmt_create",fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;

    @ApiModelProperty("更新时间")
    @TableField(value = "gmt_modified",fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;


}
