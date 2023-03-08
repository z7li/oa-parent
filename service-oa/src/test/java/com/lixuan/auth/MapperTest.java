package com.lixuan.auth;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lixuan.auth.mapper.SysRoleMapper;
import com.lixuan.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author z7
 * @version 2023/03/07/23:38
 * @description
 */
@SpringBootTest
public class MapperTest {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Test
    void getAll() {
        List<SysRole> sysRoles = sysRoleMapper.selectList(null);
        System.out.println(sysRoles);
    }

    @Test
    void add() {
        SysRole sysRole = new SysRole();
        sysRole.setRoleName("游客");
        sysRole.setRoleCode("visitor");
        sysRole.setDescription("游客");

        int insert = sysRoleMapper.insert(sysRole);

        if (insert == 0){
            System.out.println("添加失败");
        }
    }

    @Test
    void testQuery() {
        QueryWrapper<SysRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("role_name", "游客");

        List<SysRole> roleList = sysRoleMapper.selectList(queryWrapper);
        System.out.println(roleList);
    }

    @Test
    void testLambdaQuery() {
        LambdaQueryWrapper<SysRole> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(SysRole::getRoleName, "游客");

        List<SysRole> sysRoles = sysRoleMapper.selectList(lambdaQueryWrapper);
        System.out.println(sysRoles);
    }

}
