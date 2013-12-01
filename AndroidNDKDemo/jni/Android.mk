LOCAL_PATH := $(call my-dir)
 
include $(CLEAR_VARS)
 
LOCAL_MODULE    := exponential
LOCAL_SRC_FILES := exponential.c
 
include $(BUILD_SHARED_LIBRARY)