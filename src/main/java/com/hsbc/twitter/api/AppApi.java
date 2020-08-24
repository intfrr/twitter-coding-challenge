package com.hsbc.twitter.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AppApi {

    @RequestMapping(value = "/")
    private void swaggerUIRedirect(HttpServletResponse response) throws IOException {
            response.sendRedirect("/swagger-ui.html");
    }

}