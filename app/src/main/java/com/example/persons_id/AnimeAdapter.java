package com.example.persons_id;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.ViewHolder>{
    Context context;
    ArrayList<AnimeModel> arranime;
    AnimeAdapter(Context context,ArrayList<AnimeModel> arranime){
        this.context = context;
        this.arranime = arranime;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View a = LayoutInflater.from(context).inflate(R.layout.anime,parent,false);
        ViewHolder viewHolder = new ViewHolder(a);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.img.setImageResource(arranime.get(position).img);
    holder.nm.setText(arranime.get(position).name);
    holder.rn.setText(arranime.get(position).rank);
    }

    @Override
    public int getItemCount() {
        return arranime.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView nm,rn;

        public ViewHolder(View items){
            super(items);
            img = items.findViewById(R.id.imageView1);
            nm = items.findViewById(R.id.textview1);
            rn = items.findViewById(R.id.textview2);

        }
    }

}
