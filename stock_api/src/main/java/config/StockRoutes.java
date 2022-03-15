package config;
/*
 * @author p78o2
 * @date 2022/3/15
 */

import com.jfinal.config.Routes;
import controller.UserController;

public class StockRoutes extends Routes {
    @Override
    public void config() {
//        用户模块
        add("/stock/user", UserController.class);
    }
}
