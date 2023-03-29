package com.ruoyi.repertory.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.repertory.mapper.GoodsOutMapper;
import com.ruoyi.repertory.domain.GoodsOut;
import com.ruoyi.repertory.service.IGoodsOutService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出货单Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
@Service
public class GoodsOutServiceImpl implements IGoodsOutService 
{
    @Autowired
    private GoodsOutMapper goodsOutMapper;

    /**
     * 查询出货单
     * 
     * @param id 出货单主键
     * @return 出货单
     */
    @Override
    public GoodsOut selectGoodsOutById(Long id)
    {
        return goodsOutMapper.selectGoodsOutById(id);
    }

    /**
     * 查询出货单列表
     * 
     * @param goodsOut 出货单
     * @return 出货单
     */
    @Override
    public List<GoodsOut> selectGoodsOutList(GoodsOut goodsOut)
    {
        return goodsOutMapper.selectGoodsOutList(goodsOut);
    }

    /**
     * 新增出货单
     * 
     * @param goodsOut 出货单
     * @return 结果
     */
    @Override
    public int insertGoodsOut(GoodsOut goodsOut)
    {
        return goodsOutMapper.insertGoodsOut(goodsOut);
    }

    /**
     * 修改出货单
     * 
     * @param goodsOut 出货单
     * @return 结果
     */
    @Override
    public int updateGoodsOut(GoodsOut goodsOut)
    {
        return goodsOutMapper.updateGoodsOut(goodsOut);
    }

    /**
     * 批量删除出货单
     * 
     * @param ids 需要删除的出货单主键
     * @return 结果
     */
    @Override
    public int deleteGoodsOutByIds(String ids)
    {
        return goodsOutMapper.deleteGoodsOutByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出货单信息
     * 
     * @param id 出货单主键
     * @return 结果
     */
    @Override
    public int deleteGoodsOutById(Long id)
    {
        return goodsOutMapper.deleteGoodsOutById(id);
    }
}
