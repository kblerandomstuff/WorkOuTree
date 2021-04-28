package ovh.krs.madgp.ui.myinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ovh.krs.madgp.R;
import ovh.krs.madgp.ui.myhis.wohis;

public class MyiListAdapter extends ArrayAdapter<bi> {
    private ArrayList<bi> data = null;

    public MyiListAdapter(Context context, ArrayList<bi> dataList) {
        super(context, R.layout.l3c,dataList);
        this.data = dataList;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.l3c, null);
            viewHolder = new ViewHolder();
            viewHolder.t = (TextView) convertView.findViewById(R.id.col1);
            viewHolder.h =(TextView)convertView.findViewById(R.id.col2);
            viewHolder.w =(TextView)convertView.findViewById(R.id.col3);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        bi myDataItem = getItem(position);
        viewHolder.t.setText(myDataItem.gett());
        viewHolder.h.setText(String.valueOf(myDataItem.geth())+" kg");
        viewHolder.w.setText(String.valueOf(myDataItem.getw())+" cm");
        return convertView;
    }

    public class ViewHolder {
        TextView t;
        TextView h;
        TextView w;
    }
}