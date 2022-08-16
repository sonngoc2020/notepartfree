package com.example.myapplication.AdapterRecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.Text;

import java.util.ArrayList;

public class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHoder> {
    private Context mContext;
    private ArrayList<Text> mText;

    public TextAdapter(Context mContext, ArrayList<Text> mText) {
        this.mContext = mContext;
        this.mText = mText;
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.iteam_rc,parent,false);

        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
Text text = mText.get(position);
holder.tvName.setText(text.getName());
        holder.tvTime.setText(text.getTime());
    }

    @Override
    public int getItemCount() {
        return mText.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        private TextView tvName ,tvTime;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            tvName=(TextView)itemView.findViewById(R.id.name);
            tvTime=(TextView)itemView.findViewById(R.id.time);


        }
    }
}
