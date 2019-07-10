package com.example.apple.recycler;

/**
 * Created by Apple on 2019/7/9.
 */

public class Data {

    private String info;
    private String data;
    private String count;

    public Data(String info,String data,String count) {
        this.info = info;
        this.count=count;
        this.data=data;
    }

    public String getInfo() {
        return info;
    }

    public String getData(){
        return data;
    }
    public String getCount(){
        return count;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
