package ovh.krs.madgp.ui.myhis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ovh.krs.madgp.R;

public class MyDataListAdapter extends ArrayAdapter<wohis> {
    private ArrayList<wohis> data = null;

    public MyDataListAdapter(Context context, ArrayList<wohis> dataList) {
        super(context, R.layout.l2c,dataList);
        this.data = dataList;

    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.l2c, null);
            viewHolder = new ViewHolder();
            viewHolder.t = (TextView) convertView.findViewById(R.id.col1);
            viewHolder.n =(TextView)convertView.findViewById(R.id.col2);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final wohis myDataItem = getItem(position);
        viewHolder.t.setText(myDataItem.gett());
        viewHolder.n.setText(myDataItem.getn());
        return convertView;
    }

    public class ViewHolder {
        TextView t;
        TextView n;
    }
}