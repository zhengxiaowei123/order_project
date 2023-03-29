package com.ruoyi.repertory.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.repertory.mapper.RepertoryMapper;
import com.ruoyi.repertory.domain.Repertory;
import com.ruoyi.repertory.service.IRepertoryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
@Service
public class RepertoryServiceImpl implements IRepertoryService 
{
    @Autowired
    private RepertoryMapper repertoryMapper;

    /**
     * 查询库存信息
     * 
     * @param id 库存信息主键
     * @return 库存信息
     */
    @Override
    public Repertory selectRepertoryById(Long id)
    {
        return repertoryMapper.selectRepertoryById(id);
    }

    /**
     * 查询库存信息列表
     * 
     * @param repertory 库存信息
     * @return 库存信息
     */
    @Override
    public List<Repertory> selectRepertoryList(Repertory repertory)
    {
        return repertoryMapper.selectRepertoryList(repertory);
    }

    /**
     * 新增库存信息
     * 
     * @param repertory 库存信息
     * @return 结果
     */
    @Override
    public int insertRepertory(Repertory repertory)
    {
        return repertoryMapper.insertRepertory(repertory);
    }

    /**
     * 修改库存信息
     * 
     * @param repertory 库存信息
     * @return 结果
     */
    @Override
    public int updateRepertory(Repertory repertory)
    {
        return repertoryMapper.updateRepertory(repertory);
    }

    /**
     * 批量删除库存信息
     * 
     * @param ids 需要删除的库存信息主键
     * @return 结果
     */
    @Override
    public int deleteRepertoryByIds(String ids)
    {
        return repertoryMapper.deleteRepertoryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存信息信息
     * 
     * @param id 库存信息主键
     * @return 结果
     */
    @Override
    public int deleteRepertoryById(Long id)
    {
        return repertoryMapper.deleteRepertoryById(id);
    }
}
