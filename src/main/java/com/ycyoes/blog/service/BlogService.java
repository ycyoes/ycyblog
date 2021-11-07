package com.ycyoes.blog.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ycyoes.blog.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ycyoes
 * @since 2021-11-06
 */
public interface BlogService extends IService<Blog> {
    IPage blogPage(Page page, Wrapper<Blog> queryWrapper);
}
