package com.spm.sejarahting4;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class listViewAdapter extends ArrayAdapter<studentConstructor>
{

    private Activity activity;
    private ArrayList<studentConstructor> student ;
    private static LayoutInflater inflater = null;

    public listViewAdapter (Activity activity, int textVieweResourceId,ArrayList<studentConstructor> student )
    {
        super(activity,textVieweResourceId,student );
        try
        {
            this.activity = activity;
            this.student = student  ;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        catch (Exception e)
        {

        }
    }

    public  int getCount(){
        return student .size();
    }

    public long getItemId(int index){
        return index;
    }

    public  static class ViewHolder
    {
        public TextView studId;
        public TextView studName;
        public TextView studEmail;
        public TextView classId;

    }

    public android.view.View getView(int position, android.view.View convertView, ViewGroup parent) {
        android.view.View vi = convertView;
        final ViewHolder holder;

        try {
            if (convertView == null) {
                holder = new ViewHolder();
                vi = inflater.inflate(R.layout.test, null);
                holder.studId = vi.findViewById(R.id.studId);
                holder.studName = vi.findViewById(R.id.studName);
                holder.studEmail = vi.findViewById(R.id.studEmail);
                holder.classId = vi.findViewById(R.id.studEmail);
                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }

            holder.studId.setText(student.get(position).getStudId());
            holder.studName.setText(student.get(position).getStudName());
            holder.studEmail.setText(student.get(position).getStudEmail());
            holder.classId.setText(student.get(position).getClassId());

        } catch (Exception e) {

        }

        return vi;
    }

}
