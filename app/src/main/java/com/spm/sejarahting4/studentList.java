package com.spm.sejarahting4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

import java.util.ArrayList;
import java.util.List;

public class studentList extends AppCompatActivity {

    Spinner spinner;
    DatabaseReference databaseReference;
    String[] listItems;
    Button btn_sub;
    ListView lv;
    //FirebaseListAdapter adapter;
    listViewAdapter adapterStudent;
    private DatabaseReference query;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        databaseReference=FirebaseDatabase.getInstance().getReference("student");


        button = findViewById(R.id.btnStudList);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listItems = new String[]{"Kelas A", "Kelas B", "Kelas C"};
                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(studentList.this);
                mBuilder.setTitle("Senarai Pelajar");
                mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        if (i == 0)
                        {
                            Intent j = new Intent(studentList.this,studentKelasa.class);
                            startActivity(j);
                        }
                        /*
                        if (i == 1)
                        {

                            Intent j = new Intent(studentList.this,suggestedgoutfruit.class);
                            startActivity(j);
                        }
                        if (i == 2)
                        {

                            Intent j = new Intent(studentList.this,suggestedgoutvegetables.class);
                            startActivity(j);
                        } */


                    }
                });
                mBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                //show alert dialog
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }
        });

       /* lv = (ListView) findViewById(R.id.listView);
        adapterStudent = new listViewAdapter(this,0,snapshotListData);
        lv.setAdapter(adapterStudent); */
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }
}






