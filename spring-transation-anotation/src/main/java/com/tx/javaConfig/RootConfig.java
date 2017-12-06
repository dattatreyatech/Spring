package com.tx.javaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PresistacyConfig.class)
@ComponentScan({ "com.tx.services", "com.tx.controller" })
public class RootConfig {

}
