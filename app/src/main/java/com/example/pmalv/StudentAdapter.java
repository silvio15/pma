package com.example.pmalv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<String> dataList;
    public StudentAdapter(List<String> myDataset) {
        dataList = myDataset;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup
                                                              viewGroup, int viewType) {
        // create a new view
        TextView view = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_start, viewGroup, false);
        return new HeaderViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int
            position) {
        HeaderViewHolder myViewHolder = (HeaderViewHolder) viewHolder;
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(@NonNull View itemView) {
            tvTitle=
            super(itemView);
        }
    }
}