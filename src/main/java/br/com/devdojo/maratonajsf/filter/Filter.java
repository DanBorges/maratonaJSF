package br.com.devdojo.maratonajsf.filter;

import br.com.devdojo.maratonajsf.bean.Login.LoginBean;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Filter implements javax.servlet.Filter {
    @Inject
    LoginBean loginBean;
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        String url = req.getRequestURL().toString();
        System.out.println(url);
        if (url.contains("/restricted") && loginBean.getEstudante() == null) {
            res.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml?faces-config=true");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }



    }

    public void destroy() {

    }
}
