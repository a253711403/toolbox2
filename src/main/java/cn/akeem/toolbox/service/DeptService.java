package cn.akeem.toolbox.service;


import cn.akeem.toolbox.dto.DeptDto;

import java.util.List;

public interface DeptService {
    List<DeptDto> getDept(String loc);
    DeptDto getDeptById(Integer id);
}
