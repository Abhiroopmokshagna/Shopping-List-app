package com.example.hp.shopping_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.hp.shoppinglist.extra.REPLY";
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();
    private ArrayList<String> reply;
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        if(intent.getIntExtra("s1",0)==1)
            findViewById(R.id.b1).setVisibility(View.GONE);
        if(intent.getIntExtra("s2",0)==1)
            findViewById(R.id.b2).setVisibility(View.GONE);
        if(intent.getIntExtra("s3",0)==1)
            findViewById(R.id.b3).setVisibility(View.GONE);
        if(intent.getIntExtra("s4",0)==1)
            findViewById(R.id.b4).setVisibility(View.GONE);
        if(intent.getIntExtra("s5",0)==1)
            findViewById(R.id.b5).setVisibility(View.GONE);
        if(intent.getIntExtra("s6",0)==1)
            findViewById(R.id.b6).setVisibility(View.GONE);
        if(intent.getIntExtra("s7",0)==1)
            findViewById(R.id.b7).setVisibility(View.GONE);
        if(intent.getIntExtra("s8",0)==1)
            findViewById(R.id.b8).setVisibility(View.GONE);
        if(intent.getIntExtra("s9",0)==1)
            findViewById(R.id.b9).setVisibility(View.GONE);
        reply = new ArrayList<String>();
        if(savedInstanceState!=null){
            if(savedInstanceState.getBoolean("1")){
                findViewById(R.id.b1).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("2")){
                findViewById(R.id.b2).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("3")){
                findViewById(R.id.b3).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("4")){
                findViewById(R.id.b4).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("5")){
                findViewById(R.id.b5).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("6")){
                findViewById(R.id.b6).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("7")){
                findViewById(R.id.b7).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("8")){
                findViewById(R.id.b8).setVisibility(View.GONE);
            }
            if(savedInstanceState.getBoolean("9")){
                findViewById(R.id.b9).setVisibility(View.GONE);
            }
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(findViewById(R.id.b1).getVisibility()==View.GONE){
            outState.putBoolean("1",true);
        }
        if(findViewById(R.id.b2).getVisibility()==View.GONE){
            outState.putBoolean("2",true);
        }
        if(findViewById(R.id.b3).getVisibility()==View.GONE){
            outState.putBoolean("3",true);
        }
        if(findViewById(R.id.b4).getVisibility()==View.GONE){
            outState.putBoolean("4",true);
        }
        if(findViewById(R.id.b5).getVisibility()==View.GONE){
            outState.putBoolean("5",true);
        }
        if(findViewById(R.id.b6).getVisibility()==View.GONE){
            outState.putBoolean("6",true);
        }
        if(findViewById(R.id.b7).getVisibility()==View.GONE){
            outState.putBoolean("7",true);
        }
        if(findViewById(R.id.b8).getVisibility()==View.GONE){
            outState.putBoolean("8",true);
        }
        if(findViewById(R.id.b9).getVisibility()==View.GONE){
            outState.putBoolean("9",true);
        }

    }

    public void clickb1(View view) {
        b = (Button)findViewById(R.id.b1);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb2(View view) {
        b = (Button)findViewById(R.id.b2);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb3(View view) {
        b = (Button)findViewById(R.id.b3);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb4(View view) {
        b = (Button)findViewById(R.id.b4);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb5(View view) {
        b = (Button)findViewById(R.id.b5);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb6(View view) {
        b = (Button)findViewById(R.id.b6);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb7(View view) {
        b = (Button)findViewById(R.id.b7);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb8(View view) {
        b = (Button)findViewById(R.id.b8);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void clickb9(View view) {
        b = (Button)findViewById(R.id.b9);
        reply.add(b.getText().toString());
        b.setVisibility(View.GONE);
    }

    public void returnReply(View view) {
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        if(findViewById(R.id.b1).getVisibility()==View.GONE)
        replyIntent.putExtra("sec.1",1);
        if(findViewById(R.id.b2).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.2",1);
        if(findViewById(R.id.b3).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.3",1);
        if(findViewById(R.id.b4).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.4",1);
        if(findViewById(R.id.b5).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.5",1);
        if(findViewById(R.id.b6).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.6",1);
        if(findViewById(R.id.b7).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.7",1);
        if(findViewById(R.id.b8).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.8",1);
        if(findViewById(R.id.b9).getVisibility()==View.GONE)
            replyIntent.putExtra("sec.9",1);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
