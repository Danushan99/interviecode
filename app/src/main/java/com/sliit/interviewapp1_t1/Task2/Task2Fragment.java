package com.sliit.interviewapp1_t1.Task2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sliit.interviewapp1_t1.R;


public class Task2Fragment extends Fragment {
    private Button nextbtn;
    private DatabaseReference mDatabaseReference;
    private FirebaseDatabase mFirebaseInstance;

    public Task2Fragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EditText name = (EditText) findViewById(R.id.name1);
        EditText phone = (EditText) findViewById(R.id.phone1);
        TextView email = (TextView) findViewById(R.id.email1);

        FirebaseApp.initializeApp(this);
        mFirebaseInstance = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseInstance.getReference("interviewapp");
        nextbtn=findViewById(R.id.button11);
        nextbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
               Details user = new Details(name.getText().toString()
                        ,phone.getText().toString(),
                       email.getText().toString());
                mDatabaseReference.child("Medicine").child("MkI1k44O_feft_Wu3d2");
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task2, container, false);
    }
}