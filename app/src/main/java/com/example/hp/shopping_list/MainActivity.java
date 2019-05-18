package com.example.hp.shopping_list;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private static int i = 0;
    private static TextView t[];
    private EditText mStoreEditText;
    ArrayList<String> result;
    boolean b1,b2,b3,b4,b5,b6,b7,b8,b9;
    // private String alreadyselected[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = new TextView[9];
        //alreadyselected = new String[9];
        t[0]=findViewById(R.id.tv1);
        t[1]=findViewById(R.id.tv2);
        t[2]=findViewById(R.id.tv3);
        t[3]=findViewById(R.id.tv4);
        t[4]=findViewById(R.id.tv5);
        t[5]=findViewById(R.id.tv6);
        t[6]=findViewById(R.id.tv7);
        t[7]=findViewById(R.id.tv8);
        t[8]=findViewById(R.id.tv9);
        mStoreEditText = findViewById(R.id.store_location_edittext);
        if(savedInstanceState!=null){
            t[0].setText(savedInstanceState.getString("0"));
            t[1].setText(savedInstanceState.getString("1"));
            t[2].setText(savedInstanceState.getString("2"));
            t[3].setText(savedInstanceState.getString("3"));
            t[4].setText(savedInstanceState.getString("4"));
            t[5].setText(savedInstanceState.getString("5"));
            t[6].setText(savedInstanceState.getString("6"));
            t[7].setText(savedInstanceState.getString("7"));
            t[8].setText(savedInstanceState.getString("8"));
        }
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button clicked!");
        Intent intent = new Intent(this,SecondActivity.class);
        if(b1)
            intent.putExtra("s1",1);
        if(b2)
            intent.putExtra("s2",1);
        if(b3)
            intent.putExtra("s3",1);
        if(b4)
            intent.putExtra("s4",1);
        if(b5)
            intent.putExtra("s5",1);
        if(b6)
            intent.putExtra("s6",1);
        if(b7)
            intent.putExtra("s7",1);
        if(b8)
            intent.putExtra("s8",1);
        if(b9)
            intent.putExtra("s9",1);
        startActivityForResult(intent,1);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (!(t[0].getText() == "")) {
            outState.putString("0", t[0].getText().toString());
        }
        if (!(t[1].getText() == "")) {
            outState.putString("1", t[1].getText().toString());
        }
        if (!(t[2].getText() == "")) {
            outState.putString("2", t[2].getText().toString());
        }
        if (!(t[3].getText() == "")) {
            outState.putString("3", t[3].getText().toString());
        }
        if (!(t[4].getText() == "")) {
            outState.putString("4", t[4].getText().toString());
        }
        if (!(t[5].getText() == "")) {
            outState.putString("5", t[5].getText().toString());
        }
        if (!(t[6].getText() == "")) {
            outState.putString("6", t[6].getText().toString());
        }
        if (!(t[7].getText() == "")) {
            outState.putString("7", t[7].getText().toString());
        }
        if (!(t[8].getText() == "")) {
            outState.putString("8", t[8].getText().toString());
        }
    }
    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                result = data.getStringArrayListExtra(SecondActivity.EXTRA_REPLY);
                if(data.getIntExtra("sec.1",0)==1)
                    b1 = true;
                if(data.getIntExtra("sec.2",0)==1)
                    b2 = true;
                if(data.getIntExtra("sec.3",0)==1)
                    b3 = true;
                if(data.getIntExtra("sec.4",0)==1)
                    b4 = true;
                if(data.getIntExtra("sec.5",0)==1)
                    b5 = true;
                if(data.getIntExtra("sec.6",0)==1)
                    b6 = true;
                if(data.getIntExtra("sec.7",0)==1)
                    b7 = true;
                if(data.getIntExtra("sec.8",0)==1)
                    b8 = true;
                if(data.getIntExtra("sec.9",0)==1)
                    b9 = true;
                for(int j=0;j<result.size();j++){
                    Log.d(LOG_TAG,result.get(j));
                    if(i<9) {
                        t[i].setText(result.get(j));
                        i = i + 1;
                    }
                }

            }
        }
    }

    public void openMap(View view) {
        String loc = mStoreEditText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q="+loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
