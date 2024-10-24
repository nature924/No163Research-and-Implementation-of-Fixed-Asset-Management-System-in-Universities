package com.entity.model;

import com.entity.GudingzichanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 固定资产
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public class GudingzichanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
