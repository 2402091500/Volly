package bean;

import com.google.gson.JsonArray;

/**
 * Created by Administrator on 2016/6/27.
 */
public class UserInfo {

    public BasicInfo                    mBasicInfo;     //基本信息，内存
    public ExtInfo                      mExtInfo;        //扩展信息

    public static class BasicInfo {
        public String   nickName;           //昵称
        public String   uid;                //用户id
        public String   daren;             //是否为达人
        public int      gender;            //性别:0,男，1：女
        public int      banned;
        public String   praiseCount;
        public String   fansCount;
        public String   focusCount;
        public String   signature;         //签名
        public String   profilePicture;   //头像网络url
        public String   wechatId;
        public String   qqId;
        public String   weiboId;
        public String   token;
        public String   homePage;
        public HxUser hxuser;
        public int      rgb;              //用户背景色0-9
        public int      shape;            //赞的形状0-4
        public int jbcount;
        public String tel;
        public RedBag redbag;          //红包
        public NewRedBag new_redbag;          //新人或2.1老用户第一次登录红包

        @Override
        public String toString() {
            return "BasicInfo{" +
                    "nickName='" + nickName + '\'' +
                    ", uid='" + uid + '\'' +
                    ", daren='" + daren + '\'' +
                    ", gender=" + gender +
                    ", banned=" + banned +
                    ", praiseCount='" + praiseCount + '\'' +
                    ", fansCount='" + fansCount + '\'' +
                    ", focusCount='" + focusCount + '\'' +
                    ", signature='" + signature + '\'' +
                    ", profilePicture='" + profilePicture + '\'' +
                    ", wechatId='" + wechatId + '\'' +
                    ", qqId='" + qqId + '\'' +
                    ", weiboId='" + weiboId + '\'' +
                    ", token='" + token + '\'' +
                    ", homePage='" + homePage + '\'' +
                    ", hxuser=" + hxuser +
                    ", rgb=" + rgb +
                    ", shape=" + shape +
                    ", jbcount=" + jbcount +
                    ", tel=" + tel +
                    ", redbag=" + redbag +
                    ", new_redbag=" + new_redbag +
                    '}';
        }
    }

    public static class ExtInfo {
        public JsonArray posts;  //相册
        public String   lastOnline;     //最后登录时间
        public String   createdAt;      //注册时间

        @Override
        public String toString() {
            return "ExtInfo{" +
                    ", lastOnline='" + lastOnline + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    "posts=" + posts;
        }
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "mBasicInfo=" + mBasicInfo +
                ", mExtInfo=" + mExtInfo +
                '}';
    }

}
