package com.entity.view;

import com.entity.ZichanweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@TableName("zichanweihu")
public class ZichanweihuView  extends ZichanweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanweihuView(){
	}
 
 	public ZichanweihuView(ZichanweihuEntity zichanweihuEntity){
 	try {
			BeanUtils.copyProperties(this, zichanweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
