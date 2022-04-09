package net.cmsc_434.cs_advising_app;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomizedExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> expandableTitleList;
    private HashMap<String, List<String>> expandableDetailList;

    public CustomizedExpandableListAdapter(Context context, List<String> expandableListTitle,
                                           HashMap<String, List<String>> expandableListDetail) {
        this.context = context;
        this.expandableTitleList = expandableListTitle;
        this.expandableDetailList = expandableListDetail;
    }



    @Override
    public int getGroupCount() {
        return this.expandableTitleList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return this.expandableDetailList.get(this.expandableTitleList.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.expandableTitleList.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return this.expandableDetailList.get(this.expandableTitleList.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String listTitle = (String) getGroup(i);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_group, null);
        }
        TextView listTitleTextView = (TextView) view.findViewById(R.id.listTitle);
        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle);
        listTitleTextView.setTextSize(40.0f);

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String expandedListText = (String) getChild(i, i1);
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_item, null);
        }
        TextView expandedListTextView = (TextView) view.findViewById(R.id.expandedListItem);
        expandedListTextView.setText(Html.fromHtml(expandedListText));
        expandedListTextView.setTextSize(30.0f);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
