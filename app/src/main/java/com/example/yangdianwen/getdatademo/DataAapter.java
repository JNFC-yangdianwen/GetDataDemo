package com.example.yangdianwen.getdatademo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yangdianwen on 16-6-18.
 */
public class DataAapter extends BaseAdapter {
    private List<JsonBean.Results>mList;
    private LayoutInflater mInflater;

    public DataAapter(Context context, List<JsonBean.Results> list) {

        mInflater=LayoutInflater.from(context);
        this.mList = list;
    }
     public void addData(List<JsonBean>list){
         list.addAll(list);
     }
    @Override
    public int getCount() {
        if (mList!=null){
            return mList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView==null){
        convertView=mInflater.inflate(R.layout.item,null);
    }
        TextView tv_1 = (TextView) convertView.findViewById(R.id.tv_1);
        String desc=mList.get(position).getDesc();
        String publishedAt=mList.get(position).getPublishedAt();
        String readability=mList.get(position).getReadability();
        String type=mList.get(position).getType();
        String url=mList.get(position).getUrl();
        String who=mList.get(position).getWho();
        tv_1.setText(desc);
        return convertView;
}
}
