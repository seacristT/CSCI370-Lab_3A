package com.introandroid.advancedadapterseacrist;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Context;
import android.os.Bundle;
//import android.text.Layout;
//import android.view.LayoutInflater;
import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.BaseAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
//import android.widget.TextView;

//import java.lang.reflect.Array;
import java.util.ArrayList;
//import com.introandroid.advancedadapterseacrist.Student;

public class MainActivity extends AppCompatActivity {

    Student student1 = new Student("Josh", "Smith", "Public Health");
    Student student2 = new Student("Mac", "Bush", "Theater");
    Student student3 = new Student("Dylan", "Coakley", "Education");
    Student student4 = new Student("Jamar", "Lavier", "Communications");
    Student student5 = new Student("Kameron", "Foster", "Public Health");
    Student student6 = new Student("Ruthie", "Midkiff", "German/Business");

    ArrayList<Student> students = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        StudentAdapter myAdapter = new StudentAdapter(getApplicationContext(), students);

        ListView listView = findViewById(R.id.student);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String myToast = "Hello";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(),myToast,duration);
                toast.show();

            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return false;

                //String myToast = "Hello";
                //int duration = Toast.LENGTH_SHORT;

                //Toast toast = Toast.makeText(getApplicationContext(),myToast,duration);
                //toast.show();

            }
        });
    }



}
