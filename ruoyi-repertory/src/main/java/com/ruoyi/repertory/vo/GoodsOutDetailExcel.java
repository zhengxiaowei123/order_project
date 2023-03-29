package com.ruoyi.repertory.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 出货商品详情对象 goods_out_detail
 *
 * @author ruoyi
 * @date 2023-02-09
 */
@Data
public class GoodsOutDetailExcel {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long outId;
    private String consignee;
    @Excel(name = "商品编码")
    private String goodsId;
    @Excel(name = "商品名称")
    private String goodsName;

    /**
     * 出货数量
     */
    @Excel(name = "数量")
    private String outQuantity;

    /**
     * 出货单价
     */
    @Excel(name = "规格")
    private String sku;
    @Excel(name = "箱数")
    private BigDecimal outBox;
    @Excel(name = "出货单价")
    private String outPrice;
    @Excel(name = "出货总价")
    private BigDecimal outTotalPrice;

    private BigDecimal price;
    private String unit;
    private BigDecimal quanltity;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date modifyDate;


}
