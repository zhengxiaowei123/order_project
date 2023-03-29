package com.ruoyi.repertory.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.repertory.domain.Repertory;
import com.ruoyi.repertory.service.IRepertoryService;
import com.ruoyi.repertory.vo.GoodsOutDetailExcel;
import com.ruoyi.repertory.vo.GoodsOutDetailVo;
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
import com.ruoyi.repertory.domain.GoodsOutDetail;
import com.ruoyi.repertory.service.IGoodsOutDetailService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出货商品详情Controller
 *
 * @author ruoyi
 * @date 2023-02-09
 */
@Controller
@RequestMapping("/repertory/detail")
public class GoodsOutDetailController extends BaseController {
    private String prefix = "repertory/detail";

    @Autowired
    private IGoodsOutDetailService goodsOutDetailService;
    @Autowired
    private IRepertoryService repertoryService;

    @RequiresPermissions("repertory:detail:view")
    @GetMapping("/list/{id}")
    public String list(@PathVariable("id") Long id, ModelMap mmap) {
        mmap.put("outId", id);
        return prefix + "/detail";
    }

    /**
     * 查询出货商品详情列表
     */
    @RequiresPermissions("repertory:detail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GoodsOutDetail goodsOutDetail) {
        startPage();
        List<GoodsOutDetailVo> list = goodsOutDetailService.selectGoodsOutDetailByOutId(goodsOutDetail.getOutId());
        return getDataTable(list);
    }

    /**
     * 导出出货商品详情列表
     */
    @RequiresPermissions("repertory:detail:export")
    @Log(title = "出货商品详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GoodsOutDetail goodsOutDetail) {
        List<GoodsOutDetailExcel> list = goodsOutDetailService.export(goodsOutDetail.getOutId());
        BigDecimal sum = BigDecimal.ZERO;
        for (GoodsOutDetailExcel goodsOutDetailExcel : list) {
            sum= sum.add(goodsOutDetailExcel.getOutTotalPrice());
        }
        GoodsOutDetailExcel vo = new GoodsOutDetailExcel();
        vo.setGoodsId("领货人");
        vo.setGoodsName(list.get(0).getConsignee());
        vo.setOutQuantity("领单日期");
        vo.setSku(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        vo.setOutPrice("总计");
        vo.setOutTotalPrice(sum);
        list.add(vo);
        ExcelUtil<GoodsOutDetailExcel> util = new ExcelUtil<GoodsOutDetailExcel>(GoodsOutDetailExcel.class);
        return util.exportExcel(list, "出货商品详情数据");
    }

    /**
     * 新增出货商品详情
     */
    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") Long outId, ModelMap mmap) {
        List<Repertory> list = repertoryService.selectRepertoryList(new Repertory());
        mmap.put("goodsList", list);
        mmap.put("outId", outId);
        return prefix + "/add";
    }

    /**
     * 新增保存出货商品详情
     */
    @RequiresPermissions("repertory:detail:add")
    @Log(title = "出货商品详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GoodsOutDetail goodsOutDetail) {
        goodsOutDetail.setCreateDate(new Date());
        return toAjax(goodsOutDetailService.insertGoodsOutDetail(goodsOutDetail));
    }

    /**
     * 修改出货商品详情
     */
    @RequiresPermissions("repertory:detail:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        GoodsOutDetailVo goodsOutDetail = goodsOutDetailService.selectGoodsOutDetailById(id);
        mmap.put("goodsOutDetail", goodsOutDetail);
        List<Repertory> list = repertoryService.selectRepertoryList(new Repertory());
        mmap.put("goodsList", list);
        return prefix + "/edit";
    }

    /**
     * 修改保存出货商品详情
     */
    @RequiresPermissions("repertory:detail:edit")
    @Log(title = "出货商品详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GoodsOutDetail goodsOutDetail) {
        goodsOutDetail.setUpdateTime(new Date());
        return toAjax(goodsOutDetailService.updateGoodsOutDetail(goodsOutDetail));
    }

    /**
     * 删除出货商品详情
     */
    @RequiresPermissions("repertory:detail:remove")
    @Log(title = "出货商品详情", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(goodsOutDetailService.deleteGoodsOutDetailByIds(ids));
    }
}
