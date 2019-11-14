package vu.edu.meetingapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayGUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_gui);

        Bundle extras = getIntent().getExtras();
        if(extras==null){
            return;
        }



        String firstname = extras.getString("Firstname");
        String surname = extras.getString("Surname");
        String email = extras.getString("Email");
        String location1 = extras.getString("Location1");
        String location2 = extras.getString("Location2");
        String location3 = extras.getString("Location3");
        String title = extras.getString("Title");
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        String paragraph1="Welcome "+firstname+", "+title+" "+surname;
        String paragraph2="Your email: "+email;
        String paragraph3="In "+location3+", you will be located in Office/Room: "+location1+", "+location2;
        textView5.setText(paragraph1);
        textView8.setText(paragraph2);
        textView9.setText(paragraph3);

    }
}
