package com.example.myappproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn_problem);
        listView = findViewById(R.id.list);





        ArrayList<Drive> datas = new ArrayList<Drive>();
        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db= helper.getReadableDatabase();
        String selectSql = "select * from tb_drive ";
        Cursor cursor =  db.rawQuery(selectSql,null);

        while (cursor.moveToNext()){
            Drive drive = new Drive();
            drive.name = cursor.getString(1);
            datas.add(drive);
        }

        final DriveAdapter adapter = new DriveAdapter(this,R.layout.item,datas);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String animal_name = adapter.getName(position);
                String pos = String.valueOf(position);
                Intent intent = new Intent(MainActivity.this, ExplainActivity.class);
                intent.putExtra("name",animal_name);
                intent.putExtra("pos",pos);
                startActivity(intent);
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProblemActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
