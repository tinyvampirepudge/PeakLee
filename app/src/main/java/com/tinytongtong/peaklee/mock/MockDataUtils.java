package com.tinytongtong.peaklee.mock;

import com.tinytongtong.peaklee.biz.home.HomeListBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 生成假数据
 * @Author wangjianzhou@qding.me
 * @Date 2018/11/7 1:43 PM
 * @Version TODO
 */
public class MockDataUtils {

    public static List<HomeListBean> generateHomeList() {
        List<HomeListBean> listBeans = new ArrayList<>();
        listBeans.add(new HomeListBean("美食优惠", "msyh"));
        listBeans.add(new HomeListBean("火车票预订", "hcpyd"));
        listBeans.add(new HomeListBean("生活研修", "shyx"));
        listBeans.add(new HomeListBean("易班签到", "ybqd"));
        listBeans.add(new HomeListBean("人文艺术", "rwys"));
        return listBeans;
    }

    public static List<HomeListBean> generateCateHomeList() {
        List<HomeListBean> listBeans = new ArrayList<>();
        listBeans.add(new HomeListBean("外卖", "waimai"));
        listBeans.add(new HomeListBean("美食", "meishi"));
        listBeans.add(new HomeListBean("超市", "chaoshi"));
        return listBeans;
    }
}
