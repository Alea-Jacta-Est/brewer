package com.defranchi.brewer.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.defranchi.brewer.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Configura��o para informar ao Spring como achar os controllers
		return new Class<?> []{ WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// Padr�o da URL que ser� delegado ao dispatcherServlet / = qualquer url da aplica��o
		return new String[] {"/"};
	}

}
