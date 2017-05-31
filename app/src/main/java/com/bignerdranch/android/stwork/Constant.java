package com.bignerdranch.android.stwork;

/**
 * Created by ASUS on 2017/5/18.
 */
public class Constant {

    public static final class ConValue{
        /**
         * Tab选项卡的图标
         */
        public static int mImageViewArray[] = {
                R.drawable.tab_icon1,
                R.drawable.tab_icon2,
                R.drawable.tab_icon3,
        };
        /**
         * Tab选项卡的文字
         */
        public static String mTextViewArray[] = {"登录", "注册", "设置"};

        /**
         * 每一个Tab界面
         */
        public static Class<?> mTabClassArray[] = {
                LoginActivity.class,
                RegisterActivity.class,
                SetActivity.class

        };
    }
}
