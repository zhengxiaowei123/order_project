package com.ruoyi.order.service;

import java.util.List;
import com.ruoyi.order.domain.Shipment;

/**
 * 订单管理Service接口
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
public interface IShipmentService 
{
    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    public Shipment selectShipmentById(String id);

    /**
     * 查询订单管理列表
     * 
     * @param shipment 订单管理
     * @return 订单管理集合
     */
    public List<Shipment> selectShipmentList(Shipment shipment);

    /**
     * 新增订单管理
     * 
     * @param shipment 订单管理
     * @return 结果
     */
    public int insertShipment(Shipment shipment);

    /**
     * 修改订单管理
     * 
     * @param shipment 订单管理
     * @return 结果
     */
    public int updateShipment(Shipment shipment);

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理主键集合
     * @return 结果
     */
    public int deleteShipmentByIds(String ids);

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    public int deleteShipmentById(String id);
}
