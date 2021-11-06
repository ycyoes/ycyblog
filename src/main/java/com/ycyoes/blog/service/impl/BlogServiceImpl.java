package com.ycyoes.blog.service.impl;

import com.ycyoes.blog.entity.Blog;
import com.ycyoes.blog.mapper.BlogMapper;
import com.ycyoes.blog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
