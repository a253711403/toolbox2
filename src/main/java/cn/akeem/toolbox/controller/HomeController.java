package cn.akeem.toolbox.controller;

import java.util.List;

import cn.akeem.toolbox.dto.DeptDto;
import cn.akeem.toolbox.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private DeptService deptService;

    public String index() {
        return "success";
    }

    @GetMapping("/dept/")
    public List<DeptDto> findAll() {
        return deptService.getDept("");
    }

    @GetMapping("/dept/{loc}")
    public List<DeptDto> find(@PathVariable String loc) {
        return deptService.getDept(loc);
    }

}
