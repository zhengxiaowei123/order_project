package com.ruoyi.repertory.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存信息对象 repertory
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
public class Repertory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 自定义编码 */
    @Excel(name = "自定义编码")
    private String code;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 箱子数量 */
    @Excel(name = "箱子数量")
    private BigDecimal boxQuanltity;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 个数 */
    @Excel(name = "个数")
    private String quanltity;

    /** 箱数总价 */
    @Excel(name = "箱数总价")
    private BigDecimal boxTotalPrice;

    /** 入库日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date putDate;

    /** 规格 */
    @Excel(name = "规格")
    private Long sku;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setBoxQuanltity(BigDecimal boxQuanltity) 
    {
        this.boxQuanltity = boxQuanltity;
    }

    public BigDecimal getBoxQuanltity() 
    {
        return boxQuanltity;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setQuanltity(String quanltity) 
    {
        this.quanltity = quanltity;
    }

    public String getQuanltity() 
    {
        return quanltity;
    }
    public void setBoxTotalPrice(BigDecimal boxTotalPrice) 
    {
        this.boxTotalPrice = boxTotalPrice;
    }

    public BigDecimal getBoxTotalPrice() 
    {
        return boxTotalPrice;
    }
    public void setPutDate(Date putDate) 
    {
        this.putDate = putDate;
    }

    public Date getPutDate() 
    {
        return putDate;
    }
    public void setSku(Long sku) 
    {
        this.sku = sku;
    }

    public Long getSku() 
    {
        return sku;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("code", getCode())
            .append("description", getDescription())
            .append("boxQuanltity", getBoxQuanltity())
            .append("price", getPrice())
            .append("unit", getUnit())
            .append("quanltity", getQuanltity())
            .append("boxTotalPrice", getBoxTotalPrice())
            .append("putDate", getPutDate())
            .append("sku", getSku())
            .toString();
    }
}
