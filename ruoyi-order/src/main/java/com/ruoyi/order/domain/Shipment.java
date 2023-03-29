package com.ruoyi.order.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单管理对象 shipment
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public class Shipment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 商品id */
    @Excel(name = "商品id")
    private String goodsId;

    /** 供货商id */
    @Excel(name = "供货商id")
    private String supplierId;

    /** 供货商名称 */
    @Excel(name = "供货商名称")
    private String supplierName;

    /** 配送地址id */
    @Excel(name = "配送地址id")
    private String targetAddressId;

    /** 配送地址 */
    @Excel(name = "配送地址")
    private String targetAddress;

    /** 1正常 0 删除 */
    @Excel(name = "1正常 0 删除")
    private Integer status;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setGoodsId(String goodsId) 
    {
        this.goodsId = goodsId;
    }

    public String getGoodsId() 
    {
        return goodsId;
    }
    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setTargetAddressId(String targetAddressId) 
    {
        this.targetAddressId = targetAddressId;
    }

    public String getTargetAddressId() 
    {
        return targetAddressId;
    }
    public void setTargetAddress(String targetAddress) 
    {
        this.targetAddress = targetAddress;
    }

    public String getTargetAddress() 
    {
        return targetAddress;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodsName", getGoodsName())
            .append("goodsId", getGoodsId())
            .append("supplierId", getSupplierId())
            .append("supplierName", getSupplierName())
            .append("targetAddressId", getTargetAddressId())
            .append("targetAddress", getTargetAddress())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("status", getStatus())
            .toString();
    }
}
