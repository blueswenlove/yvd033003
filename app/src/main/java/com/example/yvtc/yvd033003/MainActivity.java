package com.example.yvtc.yvd033003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String data[] = {"蘋果","橘子","香蕉","檸檬"};
    String data2[] = {"apple","lemon","banana","orange"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter();
        lv.setAdapter(adapter);
    }

    class MyAdapter extends BaseAdapter
    {
        @Override
        public int getCount()  {
            return data.length;
        }

        @Override
        public Object getItem(int position) { return null; }

        @Override
        public long getItemId(int position) { return 0;}

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = getLayoutInflater().inflate(R.layout.myitem,null);

            TextView tv = (TextView) v.findViewById(R.id.textView);
            TextView tv2 = (TextView) v.findViewById(R.id.textView2);
            tv.setText(data[position]);
            tv2.setText(data2[position]);
            return v;
        }
    }
}
