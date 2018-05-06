package com.veblen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBoxView mCheckBoxView;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheckBoxView = findViewById(R.id.checkbox);
        mTextView = findViewById(R.id.tv);

        mCheckBoxView.setOnCheckedChangeListener(new CheckBoxView.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CheckBoxView buttonView, boolean isChecked) {
                setTextView(isChecked);
            }
        });

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCheckBoxView.setChecked(!mCheckBoxView.isChecked());
            }
        });

        setTextView(mCheckBoxView.isChecked());

    }


    private void setTextView(boolean isChecked) {
        mTextView.setText("CheckBoxView的状态：" + isChecked);
    }

}
