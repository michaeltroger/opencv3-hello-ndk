#include <jni.h>
#include <opencv2/core/core.hpp>

extern "C" {
    jint Java_com_example_openCv3HelloNdk_MyActivity_getArea(JNIEnv *env, jobject instance, jint width, jint height) {
        cv::Rect rect = cv::Rect(0, 0, width, height);
        return rect.area();
    }
}