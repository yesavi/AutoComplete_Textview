package avnish.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] texts={"Avnish","Arjun","Aryan","Naina","Sims",
                "Hemraj","Kajal","Sunil","Mohit","Abhishek","Phalesh","Sachin","Ayan"};
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,texts);
        autoCompleteTextView.setAdapter(adapter);
    }
}
