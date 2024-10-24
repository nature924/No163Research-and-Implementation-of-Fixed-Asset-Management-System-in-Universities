package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigouView;


/**
 * 采购
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface CaigouService extends IService<CaigouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigouVO> selectListVO(Wrapper<CaigouEntity> wrapper);
   	
   	CaigouVO selectVO(@Param("ew") Wrapper<CaigouEntity> wrapper);
   	
   	List<CaigouView> selectListView(Wrapper<CaigouEntity> wrapper);
   	
   	CaigouView selectView(@Param("ew") Wrapper<CaigouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigouEntity> wrapper);
   	

}

