package Base;

import android.app.Application;

import Utils.Ulog;
import bean.UserInfo;

/**
 * Created by Administrator on 2016/6/27.
 */
public class MyApplication extends Application {

    private static MyApplication instance;
    private UserInfo.BasicInfo mUserBasicInfo;
    public static String TAG=MyApplication.class.getSimpleName();


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public final UserInfo.BasicInfo getUserBasicInfo() {
        return mUserBasicInfo;
    }

    public void setUserBasicInfo(UserInfo.BasicInfo userBasicInfo) {
        mUserBasicInfo = userBasicInfo;
        updateUserBasicInfo();
    }

    public void updateUserBasicInfo() {
        Ulog.i(TAG, "updateUserBasicInfo", mUserBasicInfo.toString());


    }
}
