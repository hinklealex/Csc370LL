package com.example.alexhinkle.inclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        LinearLayout svLL = (LinearLayout)this.findViewById(R.id.scrollViewLL);
        LinkedList ll = new LinkedList(svLL);
        ll.addFront("a");
        ll.removeFront();
        ll.display();



    /*
        LinearLayout svLL = (LinearLayout)this.findViewById(R.id.scrollViewLL);
        View v;
        for(int i = 0; i <1000; i++)
        {
            v = this.getLayoutInflater().inflate(R.layout.node, null);
            svLL.addView(v);
        }
    */
    }

}
