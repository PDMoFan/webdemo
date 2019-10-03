package edu.mju.www.webdemo.component;

import io.netty.util.internal.StringUtil;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @program: webdemo
 * @description: 手动配置区域信息解析器
 * @author: Mr.Lin
 * @create: 2019-08-17 21:39
 **/
public class MyLocalResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
//        取出请求中带来的区域信息
        String language=httpServletRequest.getParameter("l");
        Locale locale=Locale.getDefault();
        if (!StringUtils.isEmpty(language)){
            String[] split=language.split("_");
            //语言代码和国家代码
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {
    }
}

