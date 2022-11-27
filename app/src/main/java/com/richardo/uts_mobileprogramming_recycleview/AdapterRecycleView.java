package com.richardo.uts_mobileprogramming_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder> {
    Vector<ItemModel> DataItem;
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView MovieTitle;
        TextView MovieYear;
        ImageView MovieImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            MovieTitle = itemView.findViewById(R.id.image_title);
            MovieYear = itemView.findViewById(R.id.year_text);
            MovieImage = itemView.findViewById(R.id.movie_image);

        }
    }
    AdapterRecycleView(Vector<ItemModel> data)
    {
        this.DataItem = data;

    }
    @NonNull
    @Override
    public AdapterRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycleView.ViewHolder holder, int position) {
        TextView movie_title = holder.MovieTitle;
        TextView movie_year = holder.MovieYear;
        ImageView movie_image = holder.MovieImage;

        movie_title.setText(DataItem.get(position).getName());
        movie_year.setText(DataItem.get(position).getYear());
        movie_image.setImageResource(DataItem.get(position).getMovie());

    }

    @Override
    public int getItemCount() {
        return DataItem.size();

    }


}
