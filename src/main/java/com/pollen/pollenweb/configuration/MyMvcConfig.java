package com.pollen.pollenweb.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyMvcConfig implements WebMvcConfigurer {
    //样式加载不进来加一句话
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/*").addResourceLocations("classpath:/static");
//    }

////    @Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        //前端主页控制实现，可以加载样式
////        registry.addViewController("/").setViewName("index");
////        registry.addViewController("/index.html").setViewName("index");
////    }
//    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
//        "classpath:/META-INF/resources/", "classpath:/resources/",
//        "classpath:/static/", "classpath:/public/" };
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if (!registry.hasMappingForPattern("/webjars/**")) {
//            registry.addResourceHandler("/webjars/**").addResourceLocations(
//                    "classpath:/META-INF/resources/webjars/");
//        }
//        if (!registry.hasMappingForPattern("/**")) {
//            registry.addResourceHandler("/**").addResourceLocations(
//                    CLASSPATH_RESOURCE_LOCATIONS);
//        }
//    }


}
