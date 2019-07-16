package com.bytedance.androidcamp.network.dou.api;

import com.bytedance.androidcamp.network.dou.model.Video;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideosResponse {
    @SerializedName ("feeds") List<Video> videos;
    public List<Video> getVideos() {
        return videos;
    }
}
