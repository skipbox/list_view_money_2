package com.example.laowai.list_view_money_2;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.Toast;

//public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    String classNames[]={"yen","won","dollar","HK dollar","Peso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void but_3_xxx(View v){
        Button but_3_obj = (Button)findViewById(R.id.button3);
        but_3_obj.setText("this is button3");
        Toast.makeText(this, "This is button button3", Toast.LENGTH_SHORT).show();

        ListView my_listview = (ListView)findViewById(R.id.id_lv);

        ArrayAdapter<String> my_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classNames);
        my_listview.setAdapter(my_adapter);

        my_listview.setOnItemClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button2:
                String bbb="bbb";
                //Toast.makeText(this, "This is button 1", Toast.LENGTH_SHORT).show();
                //Toast.makeText(list_v, bbb, Toast.LENGTH_SHORT).show();

                break;
            case R.id.button3:
                ListView my_listview = (ListView)findViewById(R.id.id_lv);

                ArrayAdapter<String> my_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classNames);
                my_listview.setAdapter(my_adapter);

                my_listview.setOnItemClickListener(this);
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, classNames[i] , Toast.LENGTH_SHORT).show();
        if (i==0){
            Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
        }
        if (i==1){
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
        }
        Button but_2_obj = (Button)findViewById(R.id.button2);
        but_2_obj.setText(classNames[i]);

    }
}

