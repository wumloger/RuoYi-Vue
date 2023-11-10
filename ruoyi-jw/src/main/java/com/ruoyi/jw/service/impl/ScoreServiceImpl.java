package com.ruoyi.jw.service.impl;

import java.util.List;

import com.ruoyi.common.annotation.DataScope;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.jw.mapper.ScoreMapper;
import com.ruoyi.jw.domain.Score;
import com.ruoyi.jw.service.IScoreService;

/**
 * 成绩管理Service业务层处理
 *
 * @author mqxu
 * @date 2023-11-06
 */
@Service
public class ScoreServiceImpl implements IScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public int count() {
        return scoreMapper.count();
    }

    /**
     * 查询成绩管理
     *
     * @param id 成绩管理主键
     * @return 成绩管理
     */
    @Override
    public Score selectScoreById(Long id) {
        return scoreMapper.selectScoreById(id);
    }

    /**
     * 查询成绩管理列表
     *
     * @param score 成绩管理
     * @return 成绩管理
     */
    @Override
    @DataScope(deptAlias = "t4",userAlias = "t2")
    public List<Score> selectScoreList(Score score) {
        return scoreMapper.selectScoreList(score);
    }

    /**
     * 新增成绩管理
     *
     * @param score 成绩管理
     * @return 结果
     */
    @Override
    public int insertScore(Score score) {
        score.setCreateTime(DateUtils.getNowDate());
        return scoreMapper.insertScore(score);
    }

    /**
     * 修改成绩管理
     *
     * @param score 成绩管理
     * @return 结果
     */
    @Override
    public int updateScore(Score score) {
        score.setUpdateTime(DateUtils.getNowDate());
        return scoreMapper.updateScore(score);
    }

    /**
     * 批量删除成绩管理
     *
     * @param ids 需要删除的成绩管理主键
     * @return 结果
     */
    @Override
    public int deleteScoreByIds(Long[] ids) {
        return scoreMapper.deleteScoreByIds(ids);
    }

    /**
     * 删除成绩管理信息
     *
     * @param id 成绩管理主键
     * @return 结果
     */
    @Override
    public int deleteScoreById(Long id) {
        return scoreMapper.deleteScoreById(id);
    }
}
