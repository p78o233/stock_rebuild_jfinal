package domain.vo;
/*
 * @author p78o2
 * @date 2022/3/15
 */

//用户登陆出参
public class UserLoginVo {
//    用户id
    private int id;
//    用户名
    private String name;
//    用户令牌
    private String token;

    @Override
    public String toString() {
        return "UserLoginVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserLoginVo() {
    }

    public UserLoginVo(int id, String name, String token) {
        this.id = id;
        this.name = name;
        this.token = token;
    }
}
