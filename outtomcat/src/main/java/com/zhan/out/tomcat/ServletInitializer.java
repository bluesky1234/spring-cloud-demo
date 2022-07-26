package com.zhan.out.tomcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 继承 SpringBootServletInitializer 类
// 重写 configure 方法
@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 传入SpringBoot应用的主程序
        // 自定义应用程序或调用application.sources（...）以添加源
        // 由于我们的示例本身就是@Configuration类（通过@SpringBootApplication）
        // 我们实际上不需要重写此方法
        return builder.sources(ServletInitializer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServletInitializer.class, args);
    }

}
