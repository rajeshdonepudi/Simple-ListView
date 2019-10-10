package rajeshdonepudi.rajeshdnp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> itemsArrayList= new ArrayList<>();
        itemsArrayList.add("Rajesh");
        itemsArrayList.add("tech");

        itemsArrayList.add("Micke");

        itemsArrayList.add("Boy");

        itemsArrayList.add("Welcome");
        itemsArrayList.add("Powerful");
        itemsArrayList.add("Tom");
        itemsArrayList.add("Jerry");

        ArrayAdapter  listAdapter = new ArrayAdapter(getApplicationContext(),R.layout.list_item_layout,itemsArrayList);
        listView.setAdapter(listAdapter);


    }
}
