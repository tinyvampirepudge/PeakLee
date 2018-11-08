package com.tinytongtong.peaklee.mock;

import com.tinytongtong.peaklee.biz.cate.CateListBean;
import com.tinytongtong.peaklee.biz.home.HomeListBean;
import com.tinytongtong.peaklee.biz.signin.SignInBean;

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

    public static List<CateListBean> generateCateList() {
        List<CateListBean> listBeans = new ArrayList<>();
        listBeans.add(new CateListBean("黄焖鸡米饭", "优惠五折"));
        listBeans.add(new CateListBean("麻辣香锅", "优惠五折"));
        listBeans.add(new CateListBean("重庆小面", "优惠五折"));
        return listBeans;
    }

    public static List<CateListBean> generateSupermarketList() {
        List<CateListBean> listBeans = new ArrayList<>();
        listBeans.add(new CateListBean("牛奶", "今日优惠", "supermarket"));
        listBeans.add(new CateListBean("面包", "今日优惠", "supermarket"));
        listBeans.add(new CateListBean("酸奶", "今日优惠", "supermarket"));
        return listBeans;
    }

    public static List<SignInBean> generateSignInList() {
        List<SignInBean> listBeans = new ArrayList<>();
        listBeans.add(new SignInBean("上课签到", "skqd"));
        listBeans.add(new SignInBean("打卡签到", "dkqd"));
        listBeans.add(new SignInBean("发起签到", "fqqd"));
        listBeans.add(new SignInBean("我的位置", "wdwz"));
        listBeans.add(new SignInBean("个人中心", "grzx"));
        return listBeans;
    }

    public static List<SignInBean> generateStartSignInList() {
        List<SignInBean> listBeans = new ArrayList<>();
        listBeans.add(new SignInBean("晨跑签到", "cpqd"));
        listBeans.add(new SignInBean("早餐签到", "zcqd"));
        listBeans.add(new SignInBean("晨读签到", "cdqd"));
        return listBeans;
    }

    public static List<SignInBean> generateEnteredSignInList() {
        List<SignInBean> listBeans = new ArrayList<>();
        listBeans.add(new SignInBean("英语角签到", "yyjqd"));
        listBeans.add(new SignInBean("夏令营签到", "xlyqd"));
        listBeans.add(new SignInBean("运动签到", "ydqd"));
        return listBeans;
    }
}
