package com.project.eldalell.eldalell_delivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class OrderContentAdaptor extends RecyclerView.Adapter<OrderContentAdaptor.MyviewHolder> {
    Context mContext;

    List<Orders_content> mData;


    public OrderContentAdaptor(Context mContext, List<Orders_content> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }


    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.order_content, viewGroup, false);
        MyviewHolder vHolder = new MyviewHolder(v);


        return vHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull final MyviewHolder myviewHolder, int position) {



        myviewHolder.OrderCount.setText(mData.get(position).getOrderCount()+"");
        myviewHolder.OrderName.setText(mData.get(position).getOrderName());
        myviewHolder.OrderPrice.setText(mData.get(position).CalcTotalPrice()+"");




    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder {
        //        ImageView img;
        TextView OrderCount;
        TextView OrderName;
        TextView OrderPrice;


        public MyviewHolder(@NonNull View itemView) {


            super(itemView);
//            img = (ImageView) itemView.findViewById(R.id.profile_image);
            OrderCount = (TextView) itemView.findViewById(R.id.tvOrderCount);
            OrderName = itemView.findViewById(R.id.tvOrderName);
            OrderPrice = itemView.findViewById(R.id.tvOrderPrice);


        }
    }
}
