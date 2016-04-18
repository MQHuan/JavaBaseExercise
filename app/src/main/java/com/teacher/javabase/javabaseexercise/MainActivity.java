package com.teacher.javabase.javabaseexercise;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupGroupAdapter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_config){

        }
        return super.onOptionsItemSelected(item);
    }

    public void setupGroupAdapter(){
        List<String> array = myDemoArray();
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        setListAdapter(adapter);
    }

    private List<String> myDemoArray(){
        ArrayList<String> array = new ArrayList<>();
        array.add(getResources().getString(R.string.first_day));
        array.add(getResources().getString(R.string.second_day));
        array.add(getResources().getString(R.string.third_day));
        array.add("FourthDay");
        array.add("FifthDay");
        array.add("SixthDay");
        array.add("SeventhDay");
        array.add("EighthDay");
        array.add("NinthDay");
        array.add("TenthDay");
        array.add("EleventhDay");
        array.add("TwelfthDay");
        array.add("ThirteenthDay");
        return array;
    }

    private String getActivityClassName(String demo){
        return "com.teacher.javabase.javabaseexercise.demo."+ demo + "DemoActivity";
    }

    private void startActivityByName(final String className) {
        try {
            Intent intent = new Intent(this, Class.forName(className));
            startActivity(intent);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
        List<String> array = myDemoArray();
        String name = array.get(position);
        String value = getActivityClassName(name);
        startActivityByName(value);
    }
}
