package com.bytedance.androidcamp.network.dou.api;

import com.bytedance.androidcamp.network.dou.model.Video;
import com.google.gson.annotations.SerializedName;

import static java.lang.Boolean.TRUE;

public class PostVideoResponse {
   //  @SerializedName("result") private Object result;
     @SerializedName("url") private String url;
     @SerializedName("success") private boolean success;

     public boolean isSuccess() {
          return success == TRUE;
     }
     public String getUrl() {
          return url;
     }
     public void setSuccess(boolean success) {
          this.success = success;
     }

     public void setUrl(String url) {
          this.url = url;
     }
}
