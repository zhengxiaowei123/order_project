package com.ruoyi.order.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.order.domain.Shipment;
import com.ruoyi.order.service.IShipmentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单管理Controller
 * 
 * @author ruoyi
 * @date 2023-03-29
 */
@Controller
@RequestMapping("/order/shipment")
public class ShipmentController extends BaseController
{
    private String prefix = "order/shipment";

    @Autowired
    private IShipmentService shipmentService;

    @RequiresPermissions("order:shipment:view")
    @GetMapping()
    public String shipment()
    {
        return prefix + "/shipment";
    }

    /**
     * 查询订单管理列表
     */
    @RequiresPermissions("order:shipment:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Shipment shipment)
    {
        startPage();
        List<Shipment> list = shipmentService.selectShipmentList(shipment);
        return getDataTable(list);
    }

    /**
     * 导出订单管理列表
     */
    @RequiresPermissions("order:shipment:export")
    @Log(title = "订单管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Shipment shipment)
    {
        List<Shipment> list = shipmentService.selectShipmentList(shipment);
        ExcelUtil<Shipment> util = new ExcelUtil<Shipment>(Shipment.class);
        return util.exportExcel(list, "订单管理数据");
    }

    /**
     * 新增订单管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单管理
     */
    @RequiresPermissions("order:shipment:add")
    @Log(title = "订单管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Shipment shipment)
    {
        return toAjax(shipmentService.insertShipment(shipment));
    }

    /**
     * 修改订单管理
     */
    @RequiresPermissions("order:shipment:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        Shipment shipment = shipmentService.selectShipmentById(id);
        mmap.put("shipment", shipment);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单管理
     */
    @RequiresPermissions("order:shipment:edit")
    @Log(title = "订单管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Shipment shipment)
    {
        return toAjax(shipmentService.updateShipment(shipment));
    }

    /**
     * 删除订单管理
     */
    @RequiresPermissions("order:shipment:remove")
    @Log(title = "订单管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(shipmentService.deleteShipmentByIds(ids));
    }
}
