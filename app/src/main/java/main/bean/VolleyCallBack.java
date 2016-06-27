package main.bean;

import com.google.gson.JsonObject;

/**
 * Created by Administrator on 2016/6/21.
 */
public interface VolleyCallBack {
    public void onVolleyCallBack(int result, JsonObject data);
}
