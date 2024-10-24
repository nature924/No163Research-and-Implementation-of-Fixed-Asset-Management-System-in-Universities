package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZichanpandianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZichanpandianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZichanpandianView;


/**
 * 资产盘点
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface ZichanpandianService extends IService<ZichanpandianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZichanpandianVO> selectListVO(Wrapper<ZichanpandianEntity> wrapper);
   	
   	ZichanpandianVO selectVO(@Param("ew") Wrapper<ZichanpandianEntity> wrapper);
   	
   	List<ZichanpandianView> selectListView(Wrapper<ZichanpandianEntity> wrapper);
   	
   	ZichanpandianView selectView(@Param("ew") Wrapper<ZichanpandianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZichanpandianEntity> wrapper);
   	

}

