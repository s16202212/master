package webadv.s16202212.p9;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import webadv.s16202212.p9.aop.AuthInterceptor;

@Configuration          
public class WebConfig implements WebMvcConfigurer   {
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new AuthInterceptor());     
        registration.addPathPatterns("/**");         //����·����������
        registration.excludePathPatterns("/","/login","/css/**","/js/**","/javascript/**");       //��Ӳ�����·��

    }

}