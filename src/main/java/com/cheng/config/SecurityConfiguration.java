package com.cheng.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <h3>springboot-study</h3>
 *
 * @author cheng
 * @description <p>security配置类</p>
 * @date 2023-03-27 13:30
 */

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .anyRequest().hasRole("user")
                .and()
                .formLogin();
    }
}
