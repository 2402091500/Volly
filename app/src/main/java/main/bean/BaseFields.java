package main.bean;

import java.io.Serializable;

import Base.MyApplication;

/**
 * Created by Administrator on 2016/6/27.
 */
public class BaseFields implements Serializable {

    public String token = MyApplication.getInstance().getUserBasicInfo().token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "BaseFields{" +
                "token='" + token + '\'' +
                '}';
    }
}
