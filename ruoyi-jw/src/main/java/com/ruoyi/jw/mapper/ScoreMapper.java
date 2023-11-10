package com.ruoyi.jw.mapper;

import java.util.List;

import com.ruoyi.jw.domain.Score;

/**
 * 成绩管理Mapper接口
 *
 * @author mqxu
 * @date 2023-11-06
 */
public interface ScoreMapper {
    /**
     * 查询成绩管理
     *
     * @param id 成绩管理主键
     * @return 成绩管理
     */
    public Score selectScoreById(Long id);

    /**
     * 查询成绩管理列表
     *
     * @param score 成绩管理
     * @return 成绩管理集合
     */
    public List<Score> selectScoreList(Score score);

    /**
     * 新增成绩管理
     *
     * @param score 成绩管理
     * @return 结果
     */
    public int insertScore(Score score);

    /**
     * 修改成绩管理
     *
     * @param score 成绩管理
     * @return 结果
     */
    public int updateScore(Score score);

    /**
     * 删除成绩管理
     *
     * @param id 成绩管理主键
     * @return 结果
     */
    public int deleteScoreById(Long id);

    /**
     * 批量删除成绩管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScoreByIds(Long[] ids);

    public int count();
}
