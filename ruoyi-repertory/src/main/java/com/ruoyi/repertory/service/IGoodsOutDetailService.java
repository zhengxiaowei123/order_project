package com.ruoyi.repertory.service;

import java.util.List;
import com.ruoyi.repertory.domain.GoodsOutDetail;
import com.ruoyi.repertory.vo.GoodsOutDetailExcel;
import com.ruoyi.repertory.vo.GoodsOutDetailVo;

/**
 * 出货商品详情Service接口
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
public interface IGoodsOutDetailService 
{
    /**
     * 查询出货商品详情
     * 
     * @param id 出货商品详情主键
     * @return 出货商品详情
     */
    public GoodsOutDetailVo selectGoodsOutDetailById(Long id);
    public List<GoodsOutDetailExcel> export(Long id);

    /**
     * 查询出货商品详情列表
     * 
     * @param goodsOutDetail 出货商品详情
     * @return 出货商品详情集合
     */
    public List<GoodsOutDetail> selectGoodsOutDetailList(GoodsOutDetail goodsOutDetail);

    /**
     * 新增出货商品详情
     * 
     * @param goodsOutDetail 出货商品详情
     * @return 结果
     */
    public int insertGoodsOutDetail(GoodsOutDetail goodsOutDetail);

    /**
     * 修改出货商品详情
     * 
     * @param goodsOutDetail 出货商品详情
     * @return 结果
     */
    public int updateGoodsOutDetail(GoodsOutDetail goodsOutDetail);

    /**
     * 批量删除出货商品详情
     * 
     * @param ids 需要删除的出货商品详情主键集合
     * @return 结果
     */
    public int deleteGoodsOutDetailByIds(String ids);

    /**
     * 删除出货商品详情信息
     * 
     * @param id 出货商品详情主键
     * @return 结果
     */
    public int deleteGoodsOutDetailById(Long id);

    /**
     * 根据出货单查询商品明细
     * @param outId
     * @return
     */
    List<GoodsOutDetailVo> selectGoodsOutDetailByOutId(Long outId);
}
