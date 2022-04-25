package com.yj.boot.template.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/21
 */
public class JwtDemo {
    /**
     * 私钥，生成签名要用
     */
    private final static String SECRET = "123456789";


    public static String createJwtToken() {
        //header
        Map<String, Object> header = new HashMap<>(4);
        header.put("alg", "HS256");
        header.put("typ", "JWT");

        // Payload
        Map<String, Object> claims = new HashMap<>(8);
        //标准中注册的声明
        claims.put("iss", "YG");
        //自定义数据
        claims.put("id", "123456");
        claims.put("userName", "admin");

        //生成JWT
        return Jwts.builder()
                .setHeader(header)
                .setClaims(claims)
                //设置 jti : JWT的唯一标识
                .setId(UUID.randomUUID().toString())
                //签发时间
                .setIssuedAt(new Date())
                //设置过期时间：1小时（3600s）
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))
                .setSubject("YG")
                //通过签名算法和密钥生成签名
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();

    }

    public static Claims getClaimsFromJwt(String jwt) {

        return Jwts.parser().setSigningKey(SECRET).parseClaimsJws(jwt).getBody();
    }

    public static void main(String[] args) {
        String jwtToken = createJwtToken();
        System.out.println("JWT TOKEN : " + jwtToken);
        System.out.println("============================");

        Claims claims = getClaimsFromJwt(jwtToken);
        System.out.println("claims:" + claims);
    }


}
