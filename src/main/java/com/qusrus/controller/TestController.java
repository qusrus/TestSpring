package com.qusrus.controller;

import com.qusrus.dao.TestDAO;
import com.qusrus.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by intern on 2016-11-30.
 */
@Controller
public class TestController {

    @Autowired
    private TestDAO testDAO;

    @RequestMapping(value = "/")
    public ModelAndView Home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("test_main");

        return modelAndView;
    }

    @RequestMapping(value="InsetTest", method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView InsetTest(TestDTO testDTO, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();

        int id = Integer.parseInt(httpServletRequest.getParameter("test_id_pk"));
        String name = httpServletRequest.getParameter("test_name");

        int result = testDAO.insertTest(id, name);

        if(result > 0) {
            modelAndView.setViewName("redirect:/");
        }
        else {
            modelAndView.setViewName("fail");
        }

        return modelAndView;
    }

}
