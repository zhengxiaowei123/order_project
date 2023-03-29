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
import com.ruoyi.repertory.domain.Repertory;
import com.ruoyi.repertory.service.IRepertoryService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存信息Controller
 * 
 * @author ruoyi
 * @date 2023-02-09
 */
@Controller
@RequestMapping("/repertory/repertory")
public class RepertoryController extends BaseController
{
    private String prefix = "repertory/repertory";

    @Autowired
    private IRepertoryService repertoryService;

    @RequiresPermissions("repertory:repertory:view")
    @GetMapping()
    public String repertory()
    {
        return prefix + "/repertory";
    }

    /**
     * 查询库存信息列表
     */
    @RequiresPermissions("repertory:repertory:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Repertory repertory)
    {
        startPage();
        List<Repertory> list = repertoryService.selectRepertoryList(repertory);
        return getDataTable(list);
    }

    /**
     * 导出库存信息列表
     */
    @RequiresPermissions("repertory:repertory:export")
    @Log(title = "库存信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Repertory repertory)
    {
        List<Repertory> list = repertoryService.selectRepertoryList(repertory);
        ExcelUtil<Repertory> util = new ExcelUtil<Repertory>(Repertory.class);
        return util.exportExcel(list, "库存信息数据");
    }

    /**
     * 新增库存信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存信息
     */
    @RequiresPermissions("repertory:repertory:add")
    @Log(title = "库存信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Repertory repertory)
    {
        return toAjax(repertoryService.insertRepertory(repertory));
    }

    /**
     * 修改库存信息
     */
    @RequiresPermissions("repertory:repertory:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Repertory repertory = repertoryService.selectRepertoryById(id);
        mmap.put("repertory", repertory);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存信息
     */
    @RequiresPermissions("repertory:repertory:edit")
    @Log(title = "库存信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Repertory repertory)
    {
        return toAjax(repertoryService.updateRepertory(repertory));
    }

    /**
     * 删除库存信息
     */
    @RequiresPermissions("repertory:repertory:remove")
    @Log(title = "库存信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(repertoryService.deleteRepertoryByIds(ids));
    }
}
