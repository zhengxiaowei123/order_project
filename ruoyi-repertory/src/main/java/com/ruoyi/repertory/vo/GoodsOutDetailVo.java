package com.ruoyi.repertory.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class GoodsOutDetailVo {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long outId;
    private String consignee;
    private Long goodsId;
    private String goodsName;

    /**
     * 出货数量
     */
    private String outQuantity;

    /**
     * 出货单价
     */
    private BigDecimal outPrice;
    private BigDecimal outBox;
    private BigDecimal outTotalPrice;
    private Integer sku;
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
