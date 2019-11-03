package com.example.demo;

import com.example.demo.servlet.DemoFilter;
import com.example.demo.servlet.DemoListener;
import com.example.demo.servlet.DemoServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
@Bean
public ServletRegistrationBean getServletRegistrationBean() {
	ServletRegistrationBean sBean = new ServletRegistrationBean(new DemoServlet());
	sBean.addUrlMappings("/demoServlet");
	return sBean;
}

@Bean
public FilterRegistrationBean getFilterRegistrationBean() {
	FilterRegistrationBean filterBean = new FilterRegistrationBean(new DemoFilter());
	// Add filter path
	filterBean.addUrlPatterns("/demoServlet");
	return filterBean;
}

@Bean
public ServletListenerRegistrationBean<DemoListener> getServletListenerRegistrationBean() {
	ServletListenerRegistrationBean listenerBean =
			new ServletListenerRegistrationBean(new DemoListener());
	return listenerBean;
}

}

