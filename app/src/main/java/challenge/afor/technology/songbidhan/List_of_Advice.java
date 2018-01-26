package challenge.afor.technology.songbidhan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class List_of_Advice extends ArrayAdapter<Integer> {

    private final Activity context;
    private final Integer[] itemname;




    public List_of_Advice(Activity context, Integer[] itemname) {
        super(context, R.layout.list_of_content, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_of_content, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);



        txtTitle.setText(itemname[position]);


        return rowView;

    };
}