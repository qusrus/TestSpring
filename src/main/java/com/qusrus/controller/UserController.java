package com.qusrus.controller;

import com.qusrus.dao.UserDAO;
import com.qusrus.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by intern on 2016-12-05.
 */
@Controller
public class UserController {
    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "Home")
    public String Home(){
        return "Home";
    }

    @RequestMapping(value = "AddUserForm", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView AddUserForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("AddUserForm");
        return modelAndView;
    }
    @RequestMapping(value = "AddUser", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView AddUser(UserDTO userDTO, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        userDAO.InsertUser(userDTO);
        modelAndView.setViewName("Home");
        return modelAndView;
    }
    @RequestMapping(value = "SearchUserForm", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView SearchUserForm () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("SearchUserForm");
        return modelAndView;
    }
    @RequestMapping(value = "SearchUser", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView SearchUser (UserDTO userDTO, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView();
        List<UserDTO> list = userDAO.SelectUser(userDTO.user_id_pk);
        httpServletRequest.setAttribute("UserInfo", list);
        modelAndView.setViewName("SearchUser");
        return modelAndView;
    }


}
