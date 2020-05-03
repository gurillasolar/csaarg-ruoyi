package com.ruoyi.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.system.domain.SysOperLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 操作日志 数据层
 *
 * @author ruoyi
 */
public interface SysOperLogMapper extends BaseMapper<SysOperLog> {

  List<SysOperLog> page(Page<SysOperLog> page, @Param("operLog") SysOperLog operLog);

  /**
   * 清空操作日志
   */
  void clean();
}
