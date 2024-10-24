package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanfenleiView;


/**
 * 资产分类
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanfenleiService extends IService<ZichanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanfenleiVO> selectListVO(Wrapper<ZichanfenleiEntity> wrapper);
   	
   	ZichanfenleiVO selectVO(@Param("ew") Wrapper<ZichanfenleiEntity> wrapper);
   	
   	List<ZichanfenleiView> selectListView(Wrapper<ZichanfenleiEntity> wrapper);
   	
   	ZichanfenleiView selectView(@Param("ew") Wrapper<ZichanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanfenleiEntity> wrapper);
   	

}

