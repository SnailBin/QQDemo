package com.example.administrator.qqdemo;

import android.os.Bundle;
import android.widget.TextView;

import com.example.administrator.qqdemo.mvp.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.qq)
    TextView qq;




    @Override
    public void initData(Bundle savedInstanceState) {
        qq.setText("rrr");
        findView();
    }

    private void findView() {


    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public Object newP() {
        return null;
    }
}
