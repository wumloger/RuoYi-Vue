package com.ruoyi.jw.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 成绩管理对象 jw_score
 *
 * @author mqxu
 * @date 2023-11-06
 */
public class Score extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 课程id
     */
    @Excel(name = "课程id")
    private Long courseId;

    /**
     * 用户id
     */
    @Excel(name = "用户id")
    private Long userId;

    /**
     * 分数
     */
    @Excel(name = "分数")
    private Long score;

    /**
     * 状态：0 正常，1 停用
     */
    @Excel(name = "状态：0 正常，1 停用")
    private String status;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getScore() {
        return score;
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
                .append("courseId", getCourseId())
                .append("userId", getUserId())
                .append("score", getScore())
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
