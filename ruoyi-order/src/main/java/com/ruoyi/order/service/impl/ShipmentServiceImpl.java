package com.ruoyi.order.service.impl;

import java.util.List;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.order.mapper.ShipmentMapper;
import com.ruoyi.order.domain.Shipment;
import com.ruoyi.order.service.IShipmentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 订单管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Service
public class ShipmentServiceImpl implements IShipmentService 
{
    @Autowired
    private ShipmentMapper shipmentMapper;

    /**
     * 查询订单管理
     * 
     * @param id 订单管理主键
     * @return 订单管理
     */
    @Override
    public Shipment selectShipmentById(String id)
    {
        return shipmentMapper.selectShipmentById(id);
    }

    /**
     * 查询订单管理列表
     * 
     * @param shipment 订单管理
     * @return 订单管理
     */
    @Override
    public List<Shipment> selectShipmentList(Shipment shipment)
    {
        return shipmentMapper.selectShipmentList(shipment);
    }

    /**
     * 新增订单管理
     * 
     * @param shipment 订单管理
     * @return 结果
     */
    @Override
    public int insertShipment(Shipment shipment)
    {
        shipment.setId(IdUtils.simpleUUID());
        shipment.setCreateBy("admin");
        shipment.setCreateTime(DateUtils.getNowDate());
        shipment.setStatus(Constants.STATUS_ACTIVE);
        return shipmentMapper.insertShipment(shipment);
    }

    /**
     * 修改订单管理
     * 
     * @param shipment 订单管理
     * @return 结果
     */
    @Override
    public int updateShipment(Shipment shipment)
    {
        shipment.setUpdateTime(DateUtils.getNowDate());
        return shipmentMapper.updateShipment(shipment);
    }

    /**
     * 批量删除订单管理
     * 
     * @param ids 需要删除的订单管理主键
     * @return 结果
     */
    @Override
    public int deleteShipmentByIds(String ids)
    {
        return shipmentMapper.deleteShipmentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单管理信息
     * 
     * @param id 订单管理主键
     * @return 结果
     */
    @Override
    public int deleteShipmentById(String id)
    {
        return shipmentMapper.deleteShipmentById(id);
    }
}
