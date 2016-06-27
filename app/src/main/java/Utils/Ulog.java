package Utils;

import android.util.Log;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Ulog {

    private static  boolean isDebug=true;
    private static String TAG=Ulog.class.getSimpleName();
    public void setDebug(boolean isDebug){
        this.isDebug=isDebug;
    }

    public static boolean getDebug(){
        return isDebug;
    }


    public static  void i(String tag, String type, String msg){
      String s=String.format("---------【s%】-【s%】-【s%】",tag,type,msg);
        Log.i(TAG,s);
    }

    public static  void w(String tag, String type, String msg){
      String s=String.format("---------【s%】-【s%】-【s%】",tag,type,msg);
        Log.i(TAG,s);
    }

   public static  void v(String tag, String type, String msg){
        String s=String.format("---------【s%】-【s%】-【s%】",tag,type,msg);
        Log.v(TAG,s);
    }

    public static  void e(String tag, String type, String msg){
        String s=String.format("---------【s%】-【s%】-【s%】",tag,type,msg);
        Log.e(TAG,s);
    }

    public static  void d(String tag, String type, String msg){
        String s=String.format("---------【s%】-【s%】-【s%】",tag,type,msg);
        Log.d(TAG,s);
    }

}
