package com.cts.training.maven.cofig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//Auto registers DS
public class WebXmlConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		// return reference of additional config classes 
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		// need to return reference of Servlet Config class ~ dispatcher-servlet.xml
		return new Class[] { ServletConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/" };
	}

}

