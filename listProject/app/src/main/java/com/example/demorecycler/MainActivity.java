package com.example.demorecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts;
    private ListView list;
    private ContactAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<Contact>();
        list = findViewById(R.id.items); // list is linked

        // Optional
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111"));

        myAdapter = new ContactAdapter(this,contacts);
        list.setAdapter(myAdapter);
    }
}
