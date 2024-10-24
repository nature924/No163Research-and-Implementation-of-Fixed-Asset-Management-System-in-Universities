package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZichancaigouEntity;
import com.entity.view.ZichancaigouView;

import com.service.ZichancaigouService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 资产采购
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@RestController
@RequestMapping("/zichancaigou")
public class ZichancaigouController {
    @Autowired
    private ZichancaigouService zichancaigouService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichancaigouEntity zichancaigou,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("caigou")) {
			zichancaigou.setCaigouzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZichancaigouEntity> ew = new EntityWrapper<ZichancaigouEntity>();

		PageUtils page = zichancaigouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichancaigou), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichancaigouEntity zichancaigou, 
		HttpServletRequest request){
        EntityWrapper<ZichancaigouEntity> ew = new EntityWrapper<ZichancaigouEntity>();

		PageUtils page = zichancaigouService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichancaigou), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichancaigouEntity zichancaigou){
       	EntityWrapper<ZichancaigouEntity> ew = new EntityWrapper<ZichancaigouEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zichancaigou, "zichancaigou")); 
        return R.ok().put("data", zichancaigouService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZichancaigouEntity zichancaigou){
        EntityWrapper< ZichancaigouEntity> ew = new EntityWrapper< ZichancaigouEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zichancaigou, "zichancaigou")); 
		ZichancaigouView zichancaigouView =  zichancaigouService.selectView(ew);
		return R.ok("查询资产采购成功").put("data", zichancaigouView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZichancaigouEntity zichancaigou = zichancaigouService.selectById(id);
        return R.ok().put("data", zichancaigou);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZichancaigouEntity zichancaigou = zichancaigouService.selectById(id);
        return R.ok().put("data", zichancaigou);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZichancaigouEntity zichancaigou, HttpServletRequest request){
    	zichancaigou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichancaigou);
        zichancaigouService.insert(zichancaigou);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZichancaigouEntity zichancaigou, HttpServletRequest request){
    	zichancaigou.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichancaigou);
        zichancaigouService.insert(zichancaigou);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZichancaigouEntity zichancaigou, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zichancaigou);
        zichancaigouService.updateById(zichancaigou);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zichancaigouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZichancaigouEntity> wrapper = new EntityWrapper<ZichancaigouEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("caigou")) {
			wrapper.eq("caigouzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zichancaigouService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
