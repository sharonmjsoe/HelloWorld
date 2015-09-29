package com.example.sjose.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayName(View view) {
        EditText e = (EditText) findViewById(R.id.EditText);
        String name = e.getText().toString();
        TextView text = (TextView) findViewById(R.id.textView2);
        text.setText("Hello " + name + "!");
        e.setText("");
        TextView text2 = (TextView) findViewById(R.id.textView3);
        text2.setText("");
    }

    public void displayPic(View view) {
        TextView text = (TextView) findViewById(R.id.textView3);
        text.setText(":)");
    }
}
