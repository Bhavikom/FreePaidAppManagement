package com.om.freepaidappmanage;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.widget.TextView textView = (android.widget.TextView) findViewById(R.id.text);

        if (BuildConfig.PAID_VERSION) {// this is the flag configured in build.gradle
            textView.setText("Is Paid Version");
        } else {
            textView.setText("Is Free Version");
        }
    }
}
