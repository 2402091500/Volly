package bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/27.
 */
public class NewRedBag implements Serializable {
    public String redid;
    public String value;

    @Override
    public String toString() {
        return "RedBag{" +
                "redid='" + redid + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
