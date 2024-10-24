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
 * 资产采购
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@TableName("zichancaigou")
public class ZichancaigouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZichancaigouEntity() {
		
	}
	
	public ZichancaigouEntity(T t) {
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
	 * 采购编号
	 */
					
	private String caigoubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：采购编号
	 */
	public void setCaigoubianhao(String caigoubianhao) {
		this.caigoubianhao = caigoubianhao;
	}
	/**
	 * 获取：采购编号
	 */
	public String getCaigoubianhao() {
		return caigoubianhao;
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
