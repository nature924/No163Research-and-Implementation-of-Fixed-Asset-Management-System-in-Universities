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

import com.entity.ZichandiaoboEntity;
import com.entity.view.ZichandiaoboView;

import com.service.ZichandiaoboService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 资产调拨
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@RestController
@RequestMapping("/zichandiaobo")
public class ZichandiaoboController {
    @Autowired
    private ZichandiaoboService zichandiaoboService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZichandiaoboEntity zichandiaobo,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			zichandiaobo.setYuangonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZichandiaoboEntity> ew = new EntityWrapper<ZichandiaoboEntity>();

		PageUtils page = zichandiaoboService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichandiaobo), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZichandiaoboEntity zichandiaobo, 
		HttpServletRequest request){
        EntityWrapper<ZichandiaoboEntity> ew = new EntityWrapper<ZichandiaoboEntity>();

		PageUtils page = zichandiaoboService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zichandiaobo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZichandiaoboEntity zichandiaobo){
       	EntityWrapper<ZichandiaoboEntity> ew = new EntityWrapper<ZichandiaoboEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zichandiaobo, "zichandiaobo")); 
        return R.ok().put("data", zichandiaoboService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZichandiaoboEntity zichandiaobo){
        EntityWrapper< ZichandiaoboEntity> ew = new EntityWrapper< ZichandiaoboEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zichandiaobo, "zichandiaobo")); 
		ZichandiaoboView zichandiaoboView =  zichandiaoboService.selectView(ew);
		return R.ok("查询资产调拨成功").put("data", zichandiaoboView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZichandiaoboEntity zichandiaobo = zichandiaoboService.selectById(id);
        return R.ok().put("data", zichandiaobo);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZichandiaoboEntity zichandiaobo = zichandiaoboService.selectById(id);
        return R.ok().put("data", zichandiaobo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZichandiaoboEntity zichandiaobo, HttpServletRequest request){
    	zichandiaobo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichandiaobo);
        zichandiaoboService.insert(zichandiaobo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZichandiaoboEntity zichandiaobo, HttpServletRequest request){
    	zichandiaobo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zichandiaobo);
        zichandiaoboService.insert(zichandiaobo);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZichandiaoboEntity zichandiaobo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zichandiaobo);
        zichandiaoboService.updateById(zichandiaobo);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zichandiaoboService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZichandiaoboEntity> wrapper = new EntityWrapper<ZichandiaoboEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zichandiaoboService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
