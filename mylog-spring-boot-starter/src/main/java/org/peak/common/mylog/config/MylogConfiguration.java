package org.peak.common.mylog.config;

import lombok.extern.slf4j.Slf4j;
import org.peak.common.mylog.MethodLogger;
import org.peak.common.mylog.MethodLoggingCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
@ConditionalOnClass(MethodLoggingCondition.class)
@ConditionalOnProperty(prefix = "peak.method.log", name="enable", havingValue = "true")
@EnableConfigurationProperties(MylogProperties.class)
public class MylogConfiguration {

    //@ConditionalOnMissingBean
    @Autowired
    MylogProperties mylogProperties;
    @Bean
    MethodLogger methodLogger(){
       return new MethodLogger();
    }


}
