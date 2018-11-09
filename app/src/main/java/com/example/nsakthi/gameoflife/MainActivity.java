package com.example.nsakthi.gameoflife;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Integer> position_array = new ArrayList<>();
    ArrayList<Integer> myarray = new ArrayList<>();
    ArrayList<String> student_array = new ArrayList<>();
    int[][] color = {{1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0}, {1,1,1,0,0,0,1}, {0, 0, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 0}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        //gridview.setAdapter(new ImageAdapter(this));
        //final String[] student_array= {"","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
        Button button = (Button) findViewById(R.id.start);



        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                myarray.add(color[i][j]);
                student_array.add("");
            }
        }
        for (int i = 0; i < myarray.size(); i++)
            if (myarray.get(i).equals(1))
                position_array.add(i);

        Log.d("sak", position_array + "");

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, student_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, student_array) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                //int color = 0x00FFFFFF; // Transparent
                //int color = 0x00000000;
                int color = Color.GRAY;// Black
                for (int s : position_array) {
                    if (s == position)
                        color = Color.BLUE;

                }

//                if (position_array.contains(position)) {
//                    color = 0xFF0000FF; // Opaque Blue
//                }


                view.setBackgroundColor(color);

                return view;
            }
        };

        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
//        Handler handler = new Handler();
//        for (int ml = 0; ml < 15; ml++) {
//
//
//            handler.postDelayed(new Runnable() {
//
//                public void run() {
//                    // yourMethod();
//
//                    startmethod();
//                }
//            }, 10000);

        //startmethod();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startmethod();
            }
        });

    }

    public void startmethod() {
        //final List<Integer> position_array = new ArrayList<>();
        Myclass myclass = new Myclass();
        int[][] color = myclass.color;

        GridView gridview = (GridView) findViewById(R.id.gridview);
        //gridview.setAdapter(new ImageAdapter(this));
        position_array = new ArrayList<>();
        myarray= new ArrayList<>();
        //Log.d("sak",Arrays.deepToString(color));
        Myclass.gridbehaviour(Myclass.color);
        color = myclass.color;
        Log.d("sak",Arrays.deepToString(color));
        for(int i=0;i<7;i++) {
            for (int j = 0; j < 7; j++) {
                myarray.add(Myclass.color[i][j]);
                //student_array.add("");
            }
        }
            //Log.d("sak",myarray+"");
        for (int i = 0; i < myarray.size(); i++)
            if(myarray.get(i).equals(1))
                position_array.add(i);

        Log.d("sak",position_array+"");

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, student_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, student_array) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                //int color = 0x00FFFFFF; // Transparent
                //int color = 0x00000000;
                int color = Color.GRAY;// Black
                for(int s: position_array){
                    if(s == position)
                        color = Color.BLUE;

                }

//                if (position_array.contains(position)) {
//                    color = 0xFF0000FF; // Opaque Blue
//                }


                view.setBackgroundColor(color);

                return view;
            }
        };
        //
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
       try {
           Thread.sleep(1000);
       }
       catch (Exception e)
       {
       }
    }
    public void endmethod(View v){

    }
}
