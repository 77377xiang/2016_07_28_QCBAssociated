package com.xiang.cbassociatedporject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {
    QuickContactBadge badge;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        badge= (QuickContactBadge) findViewById(R.id.bacge);
        //组件与特定电话号码关联
        badge.assignContactFromEmail("020-888888",false);
    }
}
