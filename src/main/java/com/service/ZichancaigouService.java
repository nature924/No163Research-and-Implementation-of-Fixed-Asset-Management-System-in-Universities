package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichancaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichancaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichancaigouView;


/**
 * 资产采购
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichancaigouService extends IService<ZichancaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichancaigouVO> selectListVO(Wrapper<ZichancaigouEntity> wrapper);
   	
   	ZichancaigouVO selectVO(@Param("ew") Wrapper<ZichancaigouEntity> wrapper);
   	
   	List<ZichancaigouView> selectListView(Wrapper<ZichancaigouEntity> wrapper);
   	
   	ZichancaigouView selectView(@Param("ew") Wrapper<ZichancaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichancaigouEntity> wrapper);
   	

}

