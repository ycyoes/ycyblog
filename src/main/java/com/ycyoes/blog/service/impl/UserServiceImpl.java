package com.ycyoes.blog.service.impl;

import com.ycyoes.blog.entity.User;
import com.ycyoes.blog.mapper.UserMapper;
import com.ycyoes.blog.service.USERervice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ycyoes
 * @since 2021-11-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements USERervice {

}
