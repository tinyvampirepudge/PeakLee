package com.tinytongtong.peaklee.biz.cate;

/**
 * @Description:
 * @Author wangjianzhou@qding.me
 * @Date 2018/9/14 3:22 PM
 * @Version v4.2
 */
public class CateListBean {
    private String title;
    private String desc;
    private String type;

    public CateListBean(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public CateListBean(String title, String desc, String type) {
        this.title = title;
        this.desc = desc;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CateListBean{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
