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

import com.entity.JieyongxinxiEntity;
import com.entity.view.JieyongxinxiView;

import com.service.JieyongxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 借用信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@RestController
@RequestMapping("/jieyongxinxi")
public class JieyongxinxiController {
    @Autowired
    private JieyongxinxiService jieyongxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JieyongxinxiEntity jieyongxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			jieyongxinxi.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			jieyongxinxi.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JieyongxinxiEntity> ew = new EntityWrapper<JieyongxinxiEntity>();

		PageUtils page = jieyongxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieyongxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JieyongxinxiEntity jieyongxinxi, 
		HttpServletRequest request){
        EntityWrapper<JieyongxinxiEntity> ew = new EntityWrapper<JieyongxinxiEntity>();

		PageUtils page = jieyongxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jieyongxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JieyongxinxiEntity jieyongxinxi){
       	EntityWrapper<JieyongxinxiEntity> ew = new EntityWrapper<JieyongxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jieyongxinxi, "jieyongxinxi")); 
        return R.ok().put("data", jieyongxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JieyongxinxiEntity jieyongxinxi){
        EntityWrapper< JieyongxinxiEntity> ew = new EntityWrapper< JieyongxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jieyongxinxi, "jieyongxinxi")); 
		JieyongxinxiView jieyongxinxiView =  jieyongxinxiService.selectView(ew);
		return R.ok("查询借用信息成功").put("data", jieyongxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JieyongxinxiEntity jieyongxinxi = jieyongxinxiService.selectById(id);
        return R.ok().put("data", jieyongxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JieyongxinxiEntity jieyongxinxi = jieyongxinxiService.selectById(id);
        return R.ok().put("data", jieyongxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JieyongxinxiEntity jieyongxinxi, HttpServletRequest request){
    	jieyongxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jieyongxinxi);
        jieyongxinxiService.insert(jieyongxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JieyongxinxiEntity jieyongxinxi, HttpServletRequest request){
    	jieyongxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jieyongxinxi);
        jieyongxinxiService.insert(jieyongxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JieyongxinxiEntity jieyongxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jieyongxinxi);
        jieyongxinxiService.updateById(jieyongxinxi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jieyongxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<JieyongxinxiEntity> wrapper = new EntityWrapper<JieyongxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jieyongxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
