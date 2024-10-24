package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyongxinxiView;


/**
 * 领用信息
 *
 * @author 
 * @email 
 * @date 2023-02-20 10:44:33
 */
public interface LingyongxinxiService extends IService<LingyongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyongxinxiVO> selectListVO(Wrapper<LingyongxinxiEntity> wrapper);
   	
   	LingyongxinxiVO selectVO(@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);
   	
   	List<LingyongxinxiView> selectListView(Wrapper<LingyongxinxiEntity> wrapper);
   	
   	LingyongxinxiView selectView(@Param("ew") Wrapper<LingyongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyongxinxiEntity> wrapper);
   	

}

