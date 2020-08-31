package cn.akeem.toolbox.service.impl;

import cn.akeem.toolbox.dto.DeptDto;
import cn.akeem.toolbox.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* DeptService 实现类
* */
@Service
public class DeptServiceBean implements DeptService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //	结果集记录的一行,映射特定的对象
    RowMapper<DeptDto> mapper = (rs, rowNum) -> {
        DeptDto dept = new DeptDto();
        dept.setId(rs.getInt("id"));
        dept.setTitle(rs.getString("title"));
        dept.setLoc(rs.getString("loc"));
        return dept;
    };

    @Override
    public List<DeptDto> getDept(String loc) {

        // sql语句
        String sql = "select * from dept where 1=1 ";
        if(loc!=null&&!loc.isEmpty()) {
            sql += " and loc = '" + loc + "'";
        }
        // 执行查询
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public DeptDto getDeptById(Integer id) {
        // sql语句
        String sql = "select * from dept where loc like ?";

        // 参数
        Object[] args = {id};
        // 执行查询
        return jdbcTemplate.query(sql, args, mapper).get(0);
    }
}
