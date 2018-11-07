package com.tinytongtong.peaklee.biz.home;

/**
 * @Description:
 * @Author wangjianzhou@qding.me
 * @Date 2018/9/14 3:22 PM
 * @Version v4.2
 */
public class HomeListBean {
    private String title;
    private String type;

    public HomeListBean(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HomeListBean{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
