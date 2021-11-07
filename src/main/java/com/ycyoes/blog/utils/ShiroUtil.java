package com.ycyoes.blog.utils;

import com.ycyoes.blog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile)SecurityUtils.getSubject();
    }
}
