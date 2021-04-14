package com.wkcto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author 梁超
 * @create 2021-04-13 10:50
 */
@Configuration
public class ApplicationConfig {
    public PasswordEncoder passwordEncoder() {
        //推荐使用的密码加密类
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }

    //创建UserDetailService的实现类对象
    @Bean
    public UserDetailsService userDetailsService() {
        PasswordEncoder encoder = passwordEncoder();
        //创建内存的UserDetailsService的实现类对象
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        //创建用户
        manager.createUser(User.withUsername("admin")
                .password(encoder.encode("admin"))
                .roles("ADMIN", "USER").build());

        manager.createUser(User.withUsername("lc")
                .password(encoder.encode("111"))
                .roles("USER").build());

        return manager;
    }
}
