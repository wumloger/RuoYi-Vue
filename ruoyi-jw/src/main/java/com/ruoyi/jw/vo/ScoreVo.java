package com.ruoyi.jw.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.jw.domain.Score;

/**
 * @author mqxu
 * @date 2023/11/6
 * @description ScoreVo
 **/
public class ScoreVo extends BaseEntity {
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
    @Excel(name = "删除标志：0 存在，1 停用，2 删除")
    private String delFlag;

    @Excel(name = "学生姓名")
    private String nickName;

    @Excel(name = "课程名称")
    private String courseName;

    @Excel(name = "课程状态")
    private String courseStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}
