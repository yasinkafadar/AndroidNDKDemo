#include "exponential.h";

JNIEXPORT jint JNICALL Java_tr_com_turkcellteknoloji_demo_ndk_ExponentialWrapper_exponential
  (JNIEnv *je, jclass jc, jint number, jint power){
	jint i=0;
	jint result = 1;
	for(i = 0; i<power; i++){
		result *= number;
	}

	return result;
}
