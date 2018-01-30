package cn.hycen.Invoicing.controller.user;

import cn.hycen.Invoicing.controller.BaseController;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
/**
 * Created by Administrator on 2017/10/29.
 */
@RestController
@RequestMapping("/templates/admin")
public class AccountController extends BaseController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public JSONObject Login(){
        JSONObject resp = new JSONObject();
        resp.put("name","Ryan");
        resp.put("status",true);
        resp.put("rel",true);
        return resp;
    }


    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void loginOut() {
        session.invalidate();

    }
}
