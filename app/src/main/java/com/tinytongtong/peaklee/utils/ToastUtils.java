package com.tinytongtong.peaklee.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tinytongtong.peaklee.PeakLeeApplication;

/**
 * Created by tiny on 16/7/30.
 */
public class ToastUtils {

    private static Toast toast;//简单的toast
    private static View viewError;
    private static TextView txt;
    private static ImageView imgerror;
    private static Toast toastError;//错误提示的toast

    /**
     * 单例toast,测试用
     *
     * @param content
     */
    public static void showSingleToast(String content) {
        if (toast == null) {
            toast = Toast.makeText(PeakLeeApplication.instance(), content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }

}
