package com.bendriss.chapathe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bendriss.chapathe.R;
import com.bendriss.chapathe.model.Salle;

import java.util.List;

public class SallesAdapter extends RecyclerView.Adapter<SallesAdapter.ViewHolder> {

private List<Salle> mData;
private LayoutInflater mInflater;
private ItemClickListener mClickListener;
private Context context;
        // data is passed into the constructor
        public SallesAdapter(Context context, List<Salle> data) {
        this.mInflater = LayoutInflater.from(context);
        this.context=context;
        this.mData = data;
        }

// inflates the row layout from xml when needed
@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.salles_recyclerview_row, parent, false);
        return new ViewHolder(view);
        }

// binds the data to the TextView in each row
@Override
public void onBindViewHolder(ViewHolder holder, int position) {
        Salle salle = mData.get(position);
        holder.title.setText(salle.getTitle());
        holder.city.setText(salle.getCity());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(salle.getImg()));
        }

// total number of rows
@Override
public int getItemCount() {
        return mData.size();
        }


// stores and recycles views as they are scrolled off screen
public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView title;
    TextView city;
    ImageView imageView;

    ViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        city = itemView.findViewById(R.id.city);
        imageView = itemView.findViewById(R.id.img);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
    }
}

    // convenience method for getting data at click position
    Salle getItem(int id) {
        return mData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

// parent activity will implement this method to respond to click events
public interface ItemClickListener {
    void onItemClick(View view, int position);
}
}
