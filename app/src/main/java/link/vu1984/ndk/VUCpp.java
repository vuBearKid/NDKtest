package link.vu1984.ndk;

/**
 * Created by Administrator on 2016/7/6.
 */
public class VUCpp {
    static {
        System.loadLibrary("VUNative");
    }

    public static native int VUadd(int a,int b);

    public static native String StrFromJni(int which);


}
