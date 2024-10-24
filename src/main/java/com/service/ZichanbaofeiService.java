package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanbaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanbaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanbaofeiView;


/**
 * 资产报废
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanbaofeiService extends IService<ZichanbaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanbaofeiVO> selectListVO(Wrapper<ZichanbaofeiEntity> wrapper);
   	
   	ZichanbaofeiVO selectVO(@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);
   	
   	List<ZichanbaofeiView> selectListView(Wrapper<ZichanbaofeiEntity> wrapper);
   	
   	ZichanbaofeiView selectView(@Param("ew") Wrapper<ZichanbaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanbaofeiEntity> wrapper);
   	

}

