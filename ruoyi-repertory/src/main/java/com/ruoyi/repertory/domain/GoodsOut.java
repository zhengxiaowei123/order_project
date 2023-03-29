package com.ruoyi.repertory.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出货单对象 goods_out
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
public class GoodsOut extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 领货人 */
    @Excel(name = "领货人")
    private String consignee;

    /** 出货日期 */
    @Excel(name = "出货日期")
    private String outDate;

    /** 自定义编码 */
    @Excel(name = "自定义编码")
    private String code;

    /** 出货总价 */
    @Excel(name = "出货总价")
    private BigDecimal totalPrice;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setConsignee(String consignee) 
    {
        this.consignee = consignee;
    }

    public String getConsignee() 
    {
        return consignee;
    }
    public void setOutDate(String outDate) 
    {
        this.outDate = outDate;
    }

    public String getOutDate() 
    {
        return outDate;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setTotalPrice(BigDecimal totalPrice) 
    {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() 
    {
        return totalPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("consignee", getConsignee())
            .append("outDate", getOutDate())
            .append("code", getCode())
            .append("totalPrice", getTotalPrice())
            .toString();
    }
}
