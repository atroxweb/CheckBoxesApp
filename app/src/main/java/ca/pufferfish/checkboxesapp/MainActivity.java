package ca.pufferfish.checkboxesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CheckBox checkBox1,checkBox2,checkBox3;
    private Button button;
    private String  selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        button = findViewById(R.id.button);
        selection = "Desktop"; // Default selection
    }

    public void onClickShow(View v){
        selection = "";
        if(checkBox1.isChecked()) selection = "Desktop\n";
        if(checkBox2.isChecked()) selection += "Laptop\n";
        if(checkBox3.isChecked()) selection += "iPad\n";

        textView.setText(selection);
    }



}
