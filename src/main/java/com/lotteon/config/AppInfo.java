package com.lotteon.config;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppInfo {

    @Value("${spring.application.version}")
    private String appVersion;


    @Value("${spring.application.name}")
    private String appName;



//    @Value("${spring.application.name}")
//    private String appName;
//
//    @Value("${spring.application.version}")
//    private String appVersion;





}

