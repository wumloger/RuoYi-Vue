package com.ruoyi.jw.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 课程管理对象 jw_course
 *
 * @author mqxu
 * @date 2023-11-06
 */
public class Course extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 课程名称
     */
    @Excel(name = "课程名称")
    private String courseName;

    /**
     * 状态：0 正常，1 停用
     */
    @Excel(name = "状态：0 正常，1 停用")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;


    /**
     * 封面
     */
    private String cover;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getDelFlag() {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("courseName", getCourseName())
                .append("status", getStatus())
                .append("delFlag", getDelFlag())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
