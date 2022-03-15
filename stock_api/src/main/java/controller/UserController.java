package controller;
/*
 * @author p78o2
 * @date 2022/3/15
 */

import callback.R;
import com.alibaba.fastjson.JSONObject;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.POST;
import com.jfinal.plugin.ehcache.CacheKit;
import domain.po.User;

//用户模块
public class UserController extends Controller {
    @Before(POST.class)
    public void userLogin(){
        String json = getRawData();
        User userLogin = JSONObject.parseObject(json, User.class);
        renderJson(new R(true, 200, userLogin, ""));
    }
}
