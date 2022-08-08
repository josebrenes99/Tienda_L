
package com.Tienda_L;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
/**
 *
 * @author Jose Ignacio
 */
@Configuration

public class WebConfig implements WebMvcConfigurer{
    @Bean
    public LocaleResolver LocaleResolver(){
        var slr= new SessionLocaleResolver();
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }
    @Bean
    public LocaleChangeInterceptor LocaleChangeInterceptor(){
        var lci= new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(LocaleChangeInterceptor());
    }
}
