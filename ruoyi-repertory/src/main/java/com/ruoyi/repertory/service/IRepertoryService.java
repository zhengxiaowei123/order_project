package com.ruoyi.repertory.service;

import java.util.List;
import com.ruoyi.repertory.domain.Repertory;

/**
 * 库存信息Service接口
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
public interface IRepertoryService 
{
    /**
     * 查询库存信息
     * 
     * @param id 库存信息主键
     * @return 库存信息
     */
    public Repertory selectRepertoryById(Long id);

    /**
     * 查询库存信息列表
     * 
     * @param repertory 库存信息
     * @return 库存信息集合
     */
    public List<Repertory> selectRepertoryList(Repertory repertory);

    /**
     * 新增库存信息
     * 
     * @param repertory 库存信息
     * @return 结果
     */
    public int insertRepertory(Repertory repertory);

    /**
     * 修改库存信息
     * 
     * @param repertory 库存信息
     * @return 结果
     */
    public int updateRepertory(Repertory repertory);

    /**
     * 批量删除库存信息
     * 
     * @param ids 需要删除的库存信息主键集合
     * @return 结果
     */
    public int deleteRepertoryByIds(String ids);

    /**
     * 删除库存信息信息
     * 
     * @param id 库存信息主键
     * @return 结果
     */
    public int deleteRepertoryById(Long id);
}
