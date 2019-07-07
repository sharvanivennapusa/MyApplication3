package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewFolder> {
    private Context mcontext;
    private List<Book> mdata;

    public RecyclerViewAdapter(Context mainActivity, List<Book> listBook) {
        this.mcontext=mainActivity;
        this.mdata=listBook;
    }


    @NonNull
    @Override
    public MyViewFolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater minflater = LayoutInflater.from(mcontext);
        view = minflater.inflate(R.layout.cardview_layout_book,parent,false);
        return new MyViewFolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewFolder holder, int position) {

        holder.tv_book_title.setText(mdata.get(position).getTitle());
        holder.book_thumbnil.setImageResource(mdata.get(position).getThumbnil());

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public static class MyViewFolder extends RecyclerView.ViewHolder{
        TextView tv_book_title;
        ImageView book_thumbnil;


        public MyViewFolder(@NonNull View itemView) {
            super(itemView);
            tv_book_title =  itemView.findViewById(R.id.book_title_id);
            book_thumbnil= itemView.findViewById(R.id.book_image_id) ;

        }
    }

}
