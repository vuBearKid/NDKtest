#include <jni.h>

JNIEXPORT jint JNICALL
Java_link_vu1984_ndk_VUCpp_VUadd(JNIEnv *env, jclass type, jint a, jint b) {

    // TODO
    return a+b;
}

JNIEXPORT jstring JNICALL
Java_link_vu1984_ndk_VUCpp_StrFromJni(JNIEnv *env, jclass type, jint which) {

    // TODO
    switch (which){
        case 1:
            return (*env)->NewStringUTF(env, "我来自C，我来看看。");
            break;
        case 2:
            return (*env)->NewStringUTF(env, "我来自C，我是来帮忙的。");
            break;
        default:
            return (*env)->NewStringUTF(env, "我来自C，知道我厉害的让下。");
    }


}

