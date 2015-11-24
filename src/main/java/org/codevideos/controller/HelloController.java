package org.codevideos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.codevideos.service.api.HelloService;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.ServletContext;
import java.io.Serializable;

/**
 * Created by eturkis on 11/24/2015.
 */
@ViewScoped
@ManagedBean(name = "helloController")
public class HelloController implements Serializable {
    @Autowired
    HelloService helloService;

    @PostConstruct
    public void init(){
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        ServletContext servletContext = (ServletContext) externalContext.getContext();
        WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext).
                getAutowireCapableBeanFactory().
                autowireBean(this);
    }

    public String getString(){
        return helloService.getString();
    }
}
