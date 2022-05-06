package sg.edu.rp.c346.id21022328.lecturerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //step 2: create object of widget
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 3: Link object with UI widget in activity main
        btn = findViewById(R.id.btn1);

        //onclick is called when u click on the button for toast message
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "the button is clicked", Toast.LENGTH_LONG).show();
            }
        });

    }
}