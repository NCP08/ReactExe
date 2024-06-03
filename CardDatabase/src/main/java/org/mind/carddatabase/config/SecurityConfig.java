package org.mind.carddatabase.config;

import lombok.RequiredArgsConstructor;
import org.mind.carddatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
spring security설정을 하게 되면
직접 서버의 주소로 접근하려고 하면 무조건, login화면으로 이동한다
user 사용자

CONSOLE창에 아래와 같이 출력된다.
Using generated security password: 6c109eeb-c5a1-4a83-b9c9-f35b03171b40
*/
/* 스프링 시큐리티
1) 권한 부여(ROLE 부여)
   해당 서비스 접근 가능 여부
* 인증(Authentication) : 당신이 누구인지 증명해라, id/password
* 인가(Authorization)  : 권한이 있으면 허용해줄께, ROLE(역할)
2) PASSWORD 암호화
3) 웹 보안에 취약, 보안 관련 기능 강화
...
* */

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    // 사용자인증을 위한 userDetailsService 설정/패스워드 암호화 알고리즘 설정
    // 암호를 DB에 저장하기 전에 BCrypt 암호화 처리
    @Autowired
    public void configGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    // 인증 검사하는 객체를 Bean으로 생성
//    @Bean
//    public AuthenticationManager authenticationManager() throws Exception {
//        return authenticationManager();
//    }

    // 보안설정/주소 권한 허용 설정
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }
}
