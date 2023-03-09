package com.fc.v2.component;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Locale;

@Component
public class LocaleMessageSourceService {
    @Resource
    private MessageSource messageSource;



    /**

     * @param code ：get messages key.

     * @return

     */

    public String getMessage(String code){

        return getMessage(code,null);

    }



    /**

     *

     * @param code ：get messages key.

     * @param args : Array.

     * @return

     */

    public String getMessage(String code,Object[] args){

        return getMessage(code, args,"");

    }





    /**

     *

     * @param code ：get messages key.

     * @param args : array.

     * @param defaultMessage : default.

     * @return

     */

    public String getMessage(String code,Object[] args,String defaultMessage){

        Locale locale = LocaleContextHolder.getLocale();

        return messageSource.getMessage(code, args, defaultMessage, locale);

    }

}
