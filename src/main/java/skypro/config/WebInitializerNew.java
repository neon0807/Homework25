package skypro.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.swing.*;

public class WebInitializerNew extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses(){
        return null;
    }

    protected Class<?>[] getServletConfigClasses(){
        return new Class[]{ConfigNew.class};
    }

    protected String[] getServletMappings(){
        return new String[]{"/"};
    }
}
