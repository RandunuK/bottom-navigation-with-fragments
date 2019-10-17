package com.rationalx.applicationbottomnav.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.rationalx.applicationbottomnav.R;

import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {
    private LayoutInflater mInflater;
    private List<String> mData;

    public SimpleAdapter(Context context, List<String> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.li_shops_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return  mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageButton leftImageButton;
        ImageButton rightImageButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rightImageButton = itemView.findViewById(R.id.liShopsRowImageButtonRight);
            leftImageButton = itemView.findViewById(R.id.liShopsRowImageButtonLeft);
        }
    }
}
