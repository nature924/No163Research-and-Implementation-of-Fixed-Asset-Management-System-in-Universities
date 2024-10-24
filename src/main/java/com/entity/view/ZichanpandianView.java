package com.entity.view;

import com.entity.ZichanpandianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 资产盘点
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
@TableName("zichanpandian")
public class ZichanpandianView  extends ZichanpandianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZichanpandianView(){
	}
 
 	public ZichanpandianView(ZichanpandianEntity zichanpandianEntity){
 	try {
			BeanUtils.copyProperties(this, zichanpandianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
