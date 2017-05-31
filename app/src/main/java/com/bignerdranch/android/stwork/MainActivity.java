package com.bignerdranch.android.stwork;

import com.bignerdranch.android.stwork.Constant.ConValue;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    //定义TabHost对象
    private TabHost mTabHost;

    //定义RadioGroup对象
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    /**
     * 初始化组件
     */
    private void initView() {
        // 实例化TabHost对象，得到TabHost
        mTabHost = getTabHost();

        // 得到Activity的个数
        int count = ConValue.mTabClassArray.length;

        for (int i = 0; i < count; i++) {
            //为每一个Tab按钮设置图标、文字和内容
            TabSpec tabSpec = mTabHost.newTabSpec(ConValue.mTextViewArray[i]).setIndicator(ConValue.mTextViewArray[i]).setContent(getTabItemIntent(i));
            //将Tab按钮添加进Tab选项卡中
            mTabHost.addTab(tabSpec);
        }

        //实例化RadioGroup
        radioGroup = (RadioGroup) findViewById(R.id.main_radiogroup);
    }

    private void initData(){
        // 给radioGroup设置监听事件
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.RadioButton0:
                        mTabHost.setCurrentTabByTag(ConValue.mTextViewArray[0]);
                        break;
                    case R.id.RadioButton1:
                        mTabHost.setCurrentTabByTag(ConValue.mTextViewArray[1]);
                        break;
                    case R.id.RadioButton2:
                        mTabHost.setCurrentTabByTag(ConValue.mTextViewArray[2]);
                        break;
                    default:
                        break;
                }

            }});
    }

    /**
     * 给Tab选项卡设置内容（每个内容是一个Activity）
     */
    private Intent getTabItemIntent(int index) {
        Intent intent = new Intent(this, ConValue.mTabClassArray[index]);
        return intent;
    }
}



