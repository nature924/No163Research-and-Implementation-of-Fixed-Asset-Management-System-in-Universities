package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanweihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanweihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanweihuView;


/**
 * 资产维护
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanweihuService extends IService<ZichanweihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanweihuVO> selectListVO(Wrapper<ZichanweihuEntity> wrapper);
   	
   	ZichanweihuVO selectVO(@Param("ew") Wrapper<ZichanweihuEntity> wrapper);
   	
   	List<ZichanweihuView> selectListView(Wrapper<ZichanweihuEntity> wrapper);
   	
   	ZichanweihuView selectView(@Param("ew") Wrapper<ZichanweihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanweihuEntity> wrapper);
   	

}

