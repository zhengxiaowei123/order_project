package com.ruoyi.repertory.mapper;

import java.util.List;
import com.ruoyi.repertory.domain.GoodsOut;

/**
 * 出货单Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
public interface GoodsOutMapper 
{
    /**
     * 查询出货单
     * 
     * @param id 出货单主键
     * @return 出货单
     */
    public GoodsOut selectGoodsOutById(Long id);

    /**
     * 查询出货单列表
     * 
     * @param goodsOut 出货单
     * @return 出货单集合
     */
    public List<GoodsOut> selectGoodsOutList(GoodsOut goodsOut);

    /**
     * 新增出货单
     * 
     * @param goodsOut 出货单
     * @return 结果
     */
    public int insertGoodsOut(GoodsOut goodsOut);

    /**
     * 修改出货单
     * 
     * @param goodsOut 出货单
     * @return 结果
     */
    public int updateGoodsOut(GoodsOut goodsOut);

    /**
     * 删除出货单
     * 
     * @param id 出货单主键
     * @return 结果
     */
    public int deleteGoodsOutById(Long id);

    /**
     * 批量删除出货单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGoodsOutByIds(String[] ids);
}
