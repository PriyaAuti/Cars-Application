package com.example.aigentechproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends ArrayAdapter<String> {
    String [] names,prices;
    int [] images;
    Context mContext;

    public MyAdapter(Context context, String[] carNames, int[] carImages, String[] carPrices) {
        super(context, R.layout.listview_item);
        this.names= carNames;
        this.images = carImages;
        this.prices = carPrices;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mImage = (ImageView) convertView.findViewById(R.id.imageView);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.textView);
            mViewHolder.mPrice = (TextView) convertView.findViewById(R.id.textView2);

            convertView.setTag(mViewHolder);
        }else{
            mViewHolder = (ViewHolder)convertView.getTag();
        }

            mViewHolder.mImage.setImageResource(images[position]);
            mViewHolder.mName.setText(names[position]);
            mViewHolder.mPrice.setText(prices[position]);

        return convertView;
    }
    static class ViewHolder{
        ImageView mImage;
        TextView mName;
        TextView mPrice;
    }
}

