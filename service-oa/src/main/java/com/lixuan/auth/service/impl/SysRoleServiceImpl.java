package com.lixuan.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lixuan.auth.mapper.SysRoleMapper;
import com.lixuan.auth.service.SysRoleService;
import com.lixuan.model.system.SysRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author z7
 * @version 2023/03/08/09:41
 * @description
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;


}
