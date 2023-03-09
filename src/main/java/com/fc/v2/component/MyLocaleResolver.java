package com.fc.v2.component;

import com.fc.v2.util.StringUtils;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 *
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        String lang = request.getParameter("lang");
        if(StringUtils.isEmpty(lang))
            lang = (String) request.getSession().getAttribute("lang");
        Locale locale = Locale.getDefault();
        if(StringUtils.isNotEmpty(lang) && lang.indexOf("_")>0){
            request.getSession().setAttribute("lang",lang);
            String[] split = lang.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {
        response.setLocale(locale);
    }
}
