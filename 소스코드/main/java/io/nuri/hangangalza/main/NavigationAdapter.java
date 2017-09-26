package io.nuri.hangangalza.main;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import io.nuri.hangangalza.R;
import io.nuri.hangangalza.data.BridgeData;

/**
 * Created by chayongbin on 15. 10. 25..
 */
public class NavigationAdapter extends BaseAdapter {

    private ArrayList<BridgeData> bridgeList;
    private LayoutInflater layoutInflater;
    private Context context;

    public NavigationAdapter(Context context, ArrayList<BridgeData> bridgeList) {

        this.context = context;
        this.bridgeList = bridgeList;
        layoutInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return bridgeList.size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(
                    R.layout.navi_item, parent, false);
        }

        TextView textView = (TextView) convertView;
        String color = "#FFFFFF";
        textView.setTextColor(Color.parseColor(color));
        if (position == bridgeList.size()){
            textView.setText("  " + "앱정보");

        } else {
            textView.setText("  " + bridgeList.get(position).getBridge_kr());
        }

        return convertView;
    }
}
