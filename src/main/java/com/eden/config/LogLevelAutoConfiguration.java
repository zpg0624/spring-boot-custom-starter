package com.eden.config;

import com.eden.LogLevelProperties;
import com.eden.service.LogLevelService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @created by eden
 * @since 2019-04-04 下午 5:09:00
 */

@Configuration
@EnableConfigurationProperties(LogLevelProperties.class)
@ConditionalOnClass(LogLevelService.class)
public class LogLevelAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LogLevelService levelService(){
        return new LogLevelService();
    }
}
