# 可滑动改变状态的CheckBox


CheckBoxView布局

<com.veblen.CheckBoxView
    android:id="@+id/checkbox"
    android:layout_width="100dp"
    android:layout_height="40dp"
    android:layout_marginTop="30dp"
    app:falseColor="@color/colorGray" 
    app:slideColor="@color/colorGreen"
    app:trueColor="@color/colorPrimary" />
    
    
    falseColor：CheckBoxView为false时的背景颜色
    trueColor：CheckBoxView为true时的背景颜色
    slideColor：滑块的颜色
    
    监听CheckBoxView改变的状态
     mCheckBoxView.setOnCheckedChangeListener(new CheckBoxView.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CheckBoxView buttonView, boolean isChecked) {
                setTextView(isChecked);
            }
        });
