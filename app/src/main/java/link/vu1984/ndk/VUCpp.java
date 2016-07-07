package link.vu1984.ndk;

/**
 * Created by Administrator on 2016/7/6.
 */
public class VUCpp {
    static {
        System.loadLibrary("VUNative");//这个名字必须和build.gradle  ndk{moduleName "VUNative"}一样
    }

    public static native int VUadd(int a,int b);//如果为红色，Alt+Enter第一行

    public static native String StrFromJni(int which);


}
