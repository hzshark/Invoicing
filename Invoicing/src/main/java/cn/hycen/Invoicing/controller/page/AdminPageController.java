package cn.hycen.Invoicing.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 页面跳转
 *
 */
@Controller
@RequestMapping("/templates/admin")
public class AdminPageController {


    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index() {
        return "/login";
    }

    /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String toLoginPage() {
        return "/login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String toMain(){
        return "main";
    }

    @RequestMapping(value = "/table",method = RequestMethod.GET)
    public String toTable(){
        return "table";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String toTest(){
        return "test";
    }


}
