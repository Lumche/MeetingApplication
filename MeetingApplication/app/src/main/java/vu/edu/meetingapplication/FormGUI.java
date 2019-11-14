package vu.edu.meetingapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class FormGUI extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_gui);
    }
    public String title="Mr";
    public void onClick(View view) {
        Intent i = new Intent(this, DisplayGUI.class);
        final EditText editText = (EditText)
                findViewById(R.id.editText);
        final EditText editText2 = (EditText)
                findViewById(R.id.editText2);
        final EditText editText5 = (EditText)
                findViewById(R.id.editText5);
        final EditText editText6 = (EditText)
                findViewById(R.id.editText6);
        final EditText editText7 = (EditText)
                findViewById(R.id.editText7);
        final EditText editText8 = (EditText)
                findViewById(R.id.editText8);
        RadioGroup TitleRadioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        final RadioButton title1=(RadioButton)findViewById(R.id.radioButton);
        final RadioButton title2=(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton title3=(RadioButton)findViewById(R.id.radioButton3);
        final RadioButton title4=(RadioButton)findViewById(R.id.radioButton4);
        final RadioButton title5=(RadioButton)findViewById(R.id.radioButton5);
        TitleRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if(title1.getId()==checkedId){
                    title=title1.getText().toString();
                }
                if(title2.getId()==checkedId){
                    title=title2.getText().toString();
                }
                if(title3.getId()==checkedId){
                    title=title3.getText().toString();
                }
                if(title4.getId()==checkedId){
                    title=title4.getText().toString();
                }
                if(title5.getId()==checkedId){
                    title=title5.getText().toString();
                }
            }
        });



        String myString = editText.getText().toString();
        String myString2 = editText2.getText().toString();

        String myString6 = editText6.getText().toString();
        String myString7 = editText7.getText().toString();
        String myString8 = editText8.getText().toString();
        i.putExtra("Firstname", myString);
        i.putExtra("Surname", myString2);

        i.putExtra("Location1", myString6);
        i.putExtra("Location2", myString7);
        i.putExtra("Location3", myString8);
        i.putExtra("Title", title);

        if ( android.util.Patterns.EMAIL_ADDRESS.matcher(editText5.getText().toString()).matches() ) {
            String myString5 = editText5.getText().toString();
            i.putExtra("Email", myString5);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "Email Invalid.", Toast.LENGTH_LONG).show();

        }
    }
}
