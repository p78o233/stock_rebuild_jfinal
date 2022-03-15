package domain.po;/*
 * @author p78o2
 * @date 2020/5/25
 */

import com.jfinal.plugin.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

public class User extends Model<User> implements Serializable {
    public static final User dao = new User().dao();

    private Integer id;
    private String name;
    private String email_address;
    private String pwd;
    private Date create_time;
    private Date opt_time;
    private boolean isdel;
    private String token;
    private Date latest_login;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", pwd='" + pwd + '\'' +
                ", create_time=" + create_time +
                ", opt_time=" + opt_time +
                ", isdel=" + isdel +
                ", token='" + token + '\'' +
                ", latest_login=" + latest_login +
                '}';
    }

    public static User getDao() {
        return dao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getOpt_time() {
        return opt_time;
    }

    public void setOpt_time(Date opt_time) {
        this.opt_time = opt_time;
    }

    public boolean isIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLatest_login() {
        return latest_login;
    }

    public void setLatest_login(Date latest_login) {
        this.latest_login = latest_login;
    }

    public User() {
    }

    public User(Integer id, String name, String email_address, String pwd, Date create_time, Date opt_time, boolean isdel, String token, Date latest_login) {
        this.id = id;
        this.name = name;
        this.email_address = email_address;
        this.pwd = pwd;
        this.create_time = create_time;
        this.opt_time = opt_time;
        this.isdel = isdel;
        this.token = token;
        this.latest_login = latest_login;
    }
}
