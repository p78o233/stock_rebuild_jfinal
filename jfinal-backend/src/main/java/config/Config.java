package config;/*
 * @author p78o2
 * @date 2020/5/21
 */

import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import controller.BackController;
import controller.FrontController;
import controller.HelloController;
import domain.po.Test;
import domain.po.Testc;
import domain.po.User;
import interceptor.HeaderInterceptor;
import timer.MyTask;

public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {

    }

    @Override
    public void configRoute(Routes routes) {
//        添加controller
        routes.add("/blank/hello", HelloController.class);
//        后台接口开头 /admin
        routes.add("/admin/blank/test", BackController.class);
//        前端接口开头 /api
        routes.add("/api/blank/test", FrontController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {
//        数据库配置
        DruidPlugin dp = new DruidPlugin("jdbc:mysql://127.0.0.1:3306/oa?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC", "root", "root");
        plugins.add(dp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
//        引入sql文件，用于动态sql语句
        arp.addSqlTemplate("templets/hello.sql");
        arp.addSqlTemplate("templets/more.sql");
        plugins.add(arp);
//        添加对应的数据表
        arp.addMapping("user", User.class);
        arp.addMapping("test", Test.class);
        arp.addMapping("testc", Testc.class);
//        显示执行的sql
        arp.setShowSql(true);
        plugins.add(arp);

//        定时任务配置
//        他妈的要自己引入maven包，牛逼得不行这个框架，详细见jfinal-backend/pom.xml
        Cron4jPlugin cp = new Cron4jPlugin();
//        引入任务，这种表达式叫corn4j 表达式，只有5个参数，详细见http://www.jfinal.com/share/1414
        cp.addTask("* * * * *", new MyTask());
        plugins.add(cp);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {
//        拦截器
        interceptors.add(new HeaderInterceptor());
    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
