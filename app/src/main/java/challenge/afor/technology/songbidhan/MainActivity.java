package challenge.afor.technology.songbidhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    Button con;
    Integer[] itemname ={
            R.string.rec_01,
            R.string.rec_02,
            R.string.rec_03,
            R.string.rec_04,
            R.string.rec_05,
            R.string.rec_06,
            R.string.rec_07,
            R.string.rec_08,
            R.string.rec_09,
            R.string.rec_10,
            R.string.rec_11,
            R.string.rec_12,
            R.string.rec_13

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List_of_Advice adapter=new List_of_Advice(this, itemname);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        con=(Button)findViewById(R.id.con);
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentx = new Intent(MainActivity.this,Contributors.class);
                startActivity(intentx);
            }
        });
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Intent intent= new Intent(MainActivity.this,Detailed_Advice.class);
                intent.putExtra("position",position);
                startActivity(intent);
                //  String Slecteditem= itemname[+position];
                // Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
