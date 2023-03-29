package com.ruoyi.repertory.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出货商品详情对象 goods_out_detail
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
public class GoodsOutDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 出库单id */
    @Excel(name = "出库单id")
    private Long outId;

    /** 商品id */
    @Excel(name = "商品id")
    private Long goodsId;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyDate;

    /** 出货数量 */
    @Excel(name = "出货数量")
    private String outQuantity;

    /** 出货单价 */
    @Excel(name = "出货单价")
    private BigDecimal outPrice;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOutId(Long outId) 
    {
        this.outId = outId;
    }

    public Long getOutId() 
    {
        return outId;
    }
    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setModifyDate(Date modifyDate) 
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() 
    {
        return modifyDate;
    }
    public void setOutQuantity(String outQuantity) 
    {
        this.outQuantity = outQuantity;
    }

    public String getOutQuantity() 
    {
        return outQuantity;
    }
    public void setOutPrice(BigDecimal outPrice) 
    {
        this.outPrice = outPrice;
    }

    public BigDecimal getOutPrice() 
    {
        return outPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outId", getOutId())
            .append("goodsId", getGoodsId())
            .append("createDate", getCreateDate())
            .append("modifyDate", getModifyDate())
            .append("outQuantity", getOutQuantity())
            .append("outPrice", getOutPrice())
            .toString();
    }
}
