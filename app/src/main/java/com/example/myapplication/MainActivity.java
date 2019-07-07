package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> listBook ;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBook=new ArrayList<>();
        listBook.add(new Book("abc","cat",R.drawable.one));
        listBook.add(new Book("def","cat",R.drawable.sec));
        listBook.add(new Book("ghi","cat",R.drawable.three));
        listBook.add(new Book("abc","cat",R.drawable.four));
        listBook.add(new Book("abc","cat",R.drawable.one));
        listBook.add(new Book("def","cat",R.drawable.sec));
        listBook.add(new Book("ghi","cat",R.drawable.three));
        listBook.add(new Book("abc","cat",R.drawable.four));
        listBook.add(new Book("abc","cat",R.drawable.one));
        listBook.add(new Book("def","cat",R.drawable.sec));
        listBook.add(new Book("ghi","cat",R.drawable.three));
        listBook.add(new Book("abc","cat",R.drawable.four));



        RecyclerView myrv=findViewById(R.id.recycler_id);
        RecyclerViewAdapter myAdap = new RecyclerViewAdapter(this,listBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdap);

    }
}
