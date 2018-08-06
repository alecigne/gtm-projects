package org.formation.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // xml : <aop:aspectj autoproxy/>
@ComponentScan(basePackages = "org.formation.spring")
public class ConcertConfig {
}
