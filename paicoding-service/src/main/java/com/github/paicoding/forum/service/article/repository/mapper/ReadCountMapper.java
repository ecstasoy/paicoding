package com.github.paicoding.forum.service.article.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.paicoding.forum.service.article.repository.entity.ReadCountDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * 标签mapper接口
 *
 * @author louzai
 * @date 2022-07-18
 */
public interface ReadCountMapper extends BaseMapper<ReadCountDO> {
  @Update("update read_count set cnt = cnt + 1 where id = #{id} and `deleted`=0")
  int incrReadCntById(@Param("id") Long id);
}
