package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 固定资产
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@TableName("gudingzichan")
public class GudingzichanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GudingzichanEntity() {
		
	}
	
	public GudingzichanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 资产编码
	 */
					
	private String zichanbianma;
	
	/**
	 * 资产名称
	 */
					
	private String zichanmingcheng;
	
	/**
	 * 资产分类
	 */
					
	private String zichanfenlei;
	
	/**
	 * 资产图片
	 */
					
	private String zichantupian;
	
	/**
	 * 资产单价
	 */
					
	private String zichandanjia;
	
	/**
	 * 数量
	 */
					
	private String shuliang;
	
	/**
	 * 使用状况
	 */
					
	private String shiyongzhuangkuang;
	
	/**
	 * 购买时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date goumaishijian;
	
	/**
	 * 资产详情
	 */
					
	private String zichanxiangqing;
	
	/**
	 * 归属说明
	 */
					
	private String guishushuoming;
	
	/**
	 * 使用描述
	 */
					
	private String shiyongmiaoshu;
	
	/**
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：资产编码
	 */
	public void setZichanbianma(String zichanbianma) {
		this.zichanbianma = zichanbianma;
	}
	/**
	 * 获取：资产编码
	 */
	public String getZichanbianma() {
		return zichanbianma;
	}
	/**
	 * 设置：资产名称
	 */
	public void setZichanmingcheng(String zichanmingcheng) {
		this.zichanmingcheng = zichanmingcheng;
	}
	/**
	 * 获取：资产名称
	 */
	public String getZichanmingcheng() {
		return zichanmingcheng;
	}
	/**
	 * 设置：资产分类
	 */
	public void setZichanfenlei(String zichanfenlei) {
		this.zichanfenlei = zichanfenlei;
	}
	/**
	 * 获取：资产分类
	 */
	public String getZichanfenlei() {
		return zichanfenlei;
	}
	/**
	 * 设置：资产图片
	 */
	public void setZichantupian(String zichantupian) {
		this.zichantupian = zichantupian;
	}
	/**
	 * 获取：资产图片
	 */
	public String getZichantupian() {
		return zichantupian;
	}
	/**
	 * 设置：资产单价
	 */
	public void setZichandanjia(String zichandanjia) {
		this.zichandanjia = zichandanjia;
	}
	/**
	 * 获取：资产单价
	 */
	public String getZichandanjia() {
		return zichandanjia;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：使用状况
	 */
	public void setShiyongzhuangkuang(String shiyongzhuangkuang) {
		this.shiyongzhuangkuang = shiyongzhuangkuang;
	}
	/**
	 * 获取：使用状况
	 */
	public String getShiyongzhuangkuang() {
		return shiyongzhuangkuang;
	}
	/**
	 * 设置：购买时间
	 */
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
	}
	/**
	 * 设置：资产详情
	 */
	public void setZichanxiangqing(String zichanxiangqing) {
		this.zichanxiangqing = zichanxiangqing;
	}
	/**
	 * 获取：资产详情
	 */
	public String getZichanxiangqing() {
		return zichanxiangqing;
	}
	/**
	 * 设置：归属说明
	 */
	public void setGuishushuoming(String guishushuoming) {
		this.guishushuoming = guishushuoming;
	}
	/**
	 * 获取：归属说明
	 */
	public String getGuishushuoming() {
		return guishushuoming;
	}
	/**
	 * 设置：使用描述
	 */
	public void setShiyongmiaoshu(String shiyongmiaoshu) {
		this.shiyongmiaoshu = shiyongmiaoshu;
	}
	/**
	 * 获取：使用描述
	 */
	public String getShiyongmiaoshu() {
		return shiyongmiaoshu;
	}
	/**
	 * 设置：员工工号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
	/**
	 * 设置：员工姓名
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}

}
