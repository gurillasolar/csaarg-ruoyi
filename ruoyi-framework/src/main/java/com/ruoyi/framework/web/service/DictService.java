package com.ruoyi.framework.web.service;

import com.ruoyi.system.domain.SysDictData;
import com.ruoyi.system.service.ISysDictDataService;
import com.ruoyi.system.service.ISysDictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * RuoYi首创 html调用 thymeleaf 实现字典读取 —— 小朋友表示有很多问号
 *
 * @author ruoyi
 */
@Service("dict")
public class DictService {

  @Autowired
  private ISysDictTypeService dictTypeService;
  @Autowired
  private ISysDictDataService dictDataService;

  /**
   * 根据字典类型查询字典数据信息
   *
   * @param dictType 字典类型
   * @return 参数键值
   */
  public List<SysDictData> getType(String dictType) {
    return dictDataService.listByType(dictType);
  }

  /**
   * 根据字典类型和字典键值查询字典数据信息
   *
   * @param dictType  字典类型
   * @param dictValue 字典键值
   * @return 字典标签
   */
  public String getLabel(String dictType, String dictValue) {
    return dictDataService.getLabel(dictType, dictValue);
  }
}
