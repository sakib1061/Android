package com.SFILab.weather;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Recyler extends RecyclerView.Adapter<Recyler.viewHolder> {

    private Context context;
    private List<Datum> datumList;

    public Recyler(Context context, List<Datum> datumList) {
        this.context = context;
        this.datumList = datumList;
    }

    @NonNull
    @Override
    public Recyler.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view,viewGroup,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Recyler.viewHolder viewHolder, int i) {
        Datum datum=datumList.get(i);
        String ic=datum.getWeather().getIcon();
        viewHolder.iv.setImageResource(context.getResources().getIdentifier("drawable/"+ic,null,context.getPackageName()));
        viewHolder.date.setText(""+datum.getDatetime());
        viewHolder.tv.setText(""+datum.getTemp()+"°C");
    }

    @Override
    public int getItemCount() {
        return datumList.size();
    }
    public class viewHolder extends RecyclerView.ViewHolder {
            TextView tv,date;
            ImageView iv;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.Temp);
            date=itemView.findViewById(R.id.Date);
            iv=itemView.findViewById(R.id.Image);
        }
    }
}
