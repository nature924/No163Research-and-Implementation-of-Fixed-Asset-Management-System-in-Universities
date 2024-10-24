package com.entity.model;

import com.entity.ZichancaigouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资产采购
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public class ZichancaigouModel  implements Serializable {
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
	 * 资产型号
	 */
	
	private String zichanxinghao;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 采购时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigoushijian;
		
	/**
	 * 采购账号
	 */
	
	private String caigouzhanghao;
		
	/**
	 * 采购姓名
	 */
	
	private String caigouxingming;
				
	
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
	 * 设置：资产型号
	 */
	 
	public void setZichanxinghao(String zichanxinghao) {
		this.zichanxinghao = zichanxinghao;
	}
	
	/**
	 * 获取：资产型号
	 */
	public String getZichanxinghao() {
		return zichanxinghao;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：采购时间
	 */
	 
	public void setCaigoushijian(Date caigoushijian) {
		this.caigoushijian = caigoushijian;
	}
	
	/**
	 * 获取：采购时间
	 */
	public Date getCaigoushijian() {
		return caigoushijian;
	}
				
	
	/**
	 * 设置：采购账号
	 */
	 
	public void setCaigouzhanghao(String caigouzhanghao) {
		this.caigouzhanghao = caigouzhanghao;
	}
	
	/**
	 * 获取：采购账号
	 */
	public String getCaigouzhanghao() {
		return caigouzhanghao;
	}
				
	
	/**
	 * 设置：采购姓名
	 */
	 
	public void setCaigouxingming(String caigouxingming) {
		this.caigouxingming = caigouxingming;
	}
	
	/**
	 * 获取：采购姓名
	 */
	public String getCaigouxingming() {
		return caigouxingming;
	}
			
}
