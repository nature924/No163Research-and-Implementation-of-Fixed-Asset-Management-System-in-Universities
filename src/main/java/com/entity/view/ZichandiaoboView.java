package com.entity.view;

import com.entity.ZichandiaoboEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产调拨
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@TableName("zichandiaobo")
public class ZichandiaoboView  extends ZichandiaoboEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichandiaoboView(){
	}
 
 	public ZichandiaoboView(ZichandiaoboEntity zichandiaoboEntity){
 	try {
			BeanUtils.copyProperties(this, zichandiaoboEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
