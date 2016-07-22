package link.vu1984.ndk;

/**
 * Java_full_package_name_className_functionName()
 */
public class VUCpp {
    static {
        System.loadLibrary("VUNative");//这个名字必须和build.gradle  ndk{moduleName "VUNative"}一样
    }

    public static native int VUadd(int a,int b);//如果为红色，Alt+Enter第一行

    public static native String StrFromJni(int which);

    public static native String abc();

}
