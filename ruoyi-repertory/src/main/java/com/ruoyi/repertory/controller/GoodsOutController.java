package com.ruoyi.repertory.controller;

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
import com.ruoyi.repertory.domain.GoodsOut;
import com.ruoyi.repertory.service.IGoodsOutService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出货单Controller
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
@Controller
@RequestMapping("/repertory/out")
public class GoodsOutController extends BaseController
{
    private String prefix = "repertory/out";

    @Autowired
    private IGoodsOutService goodsOutService;

    @RequiresPermissions("repertory:out:view")
    @GetMapping()
    public String out()
    {
        return prefix + "/out";
    }

    /**
     * 查询出货单列表
     */
    @RequiresPermissions("repertory:out:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GoodsOut goodsOut)
    {
        startPage();
        List<GoodsOut> list = goodsOutService.selectGoodsOutList(goodsOut);
        return getDataTable(list);
    }

    /**
     * 导出出货单列表
     */
    @RequiresPermissions("repertory:out:export")
    @Log(title = "出货单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GoodsOut goodsOut)
    {
        List<GoodsOut> list = goodsOutService.selectGoodsOutList(goodsOut);
        ExcelUtil<GoodsOut> util = new ExcelUtil<GoodsOut>(GoodsOut.class);
        return util.exportExcel(list, "出货单数据");
    }

    /**
     * 新增出货单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出货单
     */
    @RequiresPermissions("repertory:out:add")
    @Log(title = "出货单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GoodsOut goodsOut)
    {
        return toAjax(goodsOutService.insertGoodsOut(goodsOut));
    }

    /**
     * 修改出货单
     */
    @RequiresPermissions("repertory:out:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        GoodsOut goodsOut = goodsOutService.selectGoodsOutById(id);
        mmap.put("goodsOut", goodsOut);
        return prefix + "/edit";
    }

    /**
     * 修改保存出货单
     */
    @RequiresPermissions("repertory:out:edit")
    @Log(title = "出货单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GoodsOut goodsOut)
    {
        return toAjax(goodsOutService.updateGoodsOut(goodsOut));
    }

    /**
     * 删除出货单
     */
    @RequiresPermissions("repertory:out:remove")
    @Log(title = "出货单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(goodsOutService.deleteGoodsOutByIds(ids));
    }
}
