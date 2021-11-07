package com.ycyoes.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public IPage blogPage(Page page, Wrapper queryWrapper) {
        return baseMapper.selectPage(page, queryWrapper);
    }
}
