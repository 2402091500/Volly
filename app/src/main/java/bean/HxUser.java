package bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/27.
 */
public class HxUser implements Serializable {
    public String hxname;
    public String hxpwd;

    @Override
    public String toString() {
        return "HxUser [hxname=" + hxname + ", hxpwd=" + hxpwd + "]";
    }
}
