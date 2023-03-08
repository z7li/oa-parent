package com.lixuan.auth;

import com.lixuan.auth.service.SysRoleService;
import com.lixuan.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author z7
 * @version 2023/03/08/11:53
 * @description
 */
@SpringBootTest
public class ServiceTest {

    @Resource
    private SysRoleService sysRoleService;

    @Test
    public void testSelect() {
        List<SysRole> list = sysRoleService.list();
        list.forEach(System.out::println);
    }

}
