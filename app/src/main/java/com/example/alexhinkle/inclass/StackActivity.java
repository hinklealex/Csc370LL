package com.example.alexhinkle.inclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import org.w3c.dom.Text;

public class StackActivity extends AppCompatActivity
{

    private Button popButtonClicked;
    private Button pushButtonClicked;
    private Button peekButtonClicked;
    EditText showValueFromButton;
    EditText valueForPush;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);


    }

    public void aButtonClicked(View sender)
    {
     if(sender == this.popButtonClicked)
     {
         System.out.println("popping");
         ListCore.ll.removeFront();
         showValueFromButton.setText((CharSequence) ListCore.ll);

     }
     else if(sender == this.pushButtonClicked)
     {
         System.out.println("pushing");


     }
     else if(sender == this.peekButtonClicked)
     {
         System.out.println("peeking");
         showValueFromButton.setText((CharSequence) ListCore.ll.getAtIndex(0));

     }

    }


}