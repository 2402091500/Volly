package com.example.administrator.volly;

import android.util.Log;

import main.bean.BaseFields;
import main.bean.VolleyCallBack;

/**
 * Created by Administrator on 2016/6/21.
 */
public class VolleyUtils {

    private static final String TAG=VolleyUtils.class.getSimpleName();
    private static VolleyUtils volleyUtils=new VolleyUtils();
/*********
  *
  * @author llf
  * creat at 2016/6/21 18:36
  *********
  */
    private VolleyUtils() {

    }

    public VolleyUtils getInstans(){
        return volleyUtils;
    }



    public void serverCallback(BaseFields baseFields, String url, VolleyCallBack volleyCallBack) {
        serverCallback(GsonUtils.getClass2Json(baseFields), url, volleyCallBack);
    }


    public void serverCallback(final String arguments, final String url, final VolleyCallBack volleyCallBack){

        if (arguments == null) {
            Log.e(TAG, "参数为空");
            volleyCallBack.onVolleyCallBack(-1, null);
            return;
        }
    }

}
