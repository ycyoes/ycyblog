package com.ycyoes.blog.utils;

import io.jsonwebtoken.*;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "ycyoes.jwt")
public class JwtUtils {
    private String secret;
    private long expire;
    private String header;

    public String generateToken(long userId) {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate expireDate = currentDate.plus(expire * 1000, ChronoUnit.SECONDS);
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + expire * 1000);
        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setSubject(userId + "")
                .setIssuedAt(currentDate)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public Claims getClaimByToken(String token) {
        try {
            return Jwts.parser().setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            log.debug("validate is token error ", e);
            return null;
        }
    }

    /**
     * 判断token是否过期
     * @param expiration
     * @return true: 过期
     */
    public boolean isTokenExpire(Date expiration) {
        return expiration.before(new Date());
    }
}
