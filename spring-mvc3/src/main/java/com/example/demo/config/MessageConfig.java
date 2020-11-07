package com.example.demo.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class MessageConfig {
 
	@Bean
	public MessageSource messageSource() {
		var source = new ReloadableResourceBundleMessageSource();
//		読み込むメッセージファイルを指定します
		source.setBasenames("classpath:i18n/messages","classpath:i18n/ValidationMessages");
//		メッセージの文字コードをUTF-8にします
		source.setDefaultEncoding("UTF-8");
//		システムの言語に関係なく、デフォルトのメッセージを返せるようにします
		source.setFallbackToSystemLocale(false);
		return source;
	}
	@Bean
	public LocalValidatorFactoryBean getValidator(){
//		上のmessageSource()メソッドをセットします
		var bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}
}
