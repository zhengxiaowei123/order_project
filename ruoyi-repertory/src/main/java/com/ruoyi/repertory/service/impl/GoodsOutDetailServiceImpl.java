package com.ruoyi.repertory.service.impl;

import java.util.List;

import com.ruoyi.repertory.vo.GoodsOutDetailExcel;
import com.ruoyi.repertory.vo.GoodsOutDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.repertory.mapper.GoodsOutDetailMapper;
import com.ruoyi.repertory.domain.GoodsOutDetail;
import com.ruoyi.repertory.service.IGoodsOutDetailService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出货商品详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
@Service
public class GoodsOutDetailServiceImpl implements IGoodsOutDetailService 
{
    @Autowired
    private GoodsOutDetailMapper goodsOutDetailMapper;

    /**
     * 查询出货商品详情
     * 
     * @param id 出货商品详情主键
     * @return 出货商品详情
     */
    @Override
    public GoodsOutDetailVo selectGoodsOutDetailById(Long id)
    {
        return goodsOutDetailMapper.selectGoodsOutDetailById(id);
    }

    @Override
    public List<GoodsOutDetailExcel> export(Long outId) {
        return goodsOutDetailMapper.export(outId);
    }

    /**
     * 查询出货商品详情列表
     * 
     * @param goodsOutDetail 出货商品详情
     * @return 出货商品详情
     */
    @Override
    public List<GoodsOutDetail> selectGoodsOutDetailList(GoodsOutDetail goodsOutDetail)
    {
        return goodsOutDetailMapper.selectGoodsOutDetailList(goodsOutDetail);
    }

    /**
     * 新增出货商品详情
     * 
     * @param goodsOutDetail 出货商品详情
     * @return 结果
     */
    @Override
    public int insertGoodsOutDetail(GoodsOutDetail goodsOutDetail)
    {
        return goodsOutDetailMapper.insertGoodsOutDetail(goodsOutDetail);
    }

    /**
     * 修改出货商品详情
     * 
     * @param goodsOutDetail 出货商品详情
     * @return 结果
     */
    @Override
    public int updateGoodsOutDetail(GoodsOutDetail goodsOutDetail)
    {
        return goodsOutDetailMapper.updateGoodsOutDetail(goodsOutDetail);
    }

    /**
     * 批量删除出货商品详情
     * 
     * @param ids 需要删除的出货商品详情主键
     * @return 结果
     */
    @Override
    public int deleteGoodsOutDetailByIds(String ids)
    {
        return goodsOutDetailMapper.deleteGoodsOutDetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出货商品详情信息
     * 
     * @param id 出货商品详情主键
     * @return 结果
     */
    @Override
    public int deleteGoodsOutDetailById(Long id)
    {
        return goodsOutDetailMapper.deleteGoodsOutDetailById(id);
    }

    /**
     * 根据出货单id查询出货明细
     * @param outId
     * @return
     */
    @Override
    public List<GoodsOutDetailVo> selectGoodsOutDetailByOutId(Long outId) {
        List<GoodsOutDetailVo> list =   goodsOutDetailMapper.selectGoodsOutDetailByOutId(outId);
        return list;
    }
}
