package quangnd.sis.hust.edu.lunchlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LunchList extends AppCompatActivity {

    Restaurant restaurant = new Restaurant();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //B2: Tao doi tuong listener
        ButtonSaveListener buttonSaveListener = new ButtonSaveListener();
        //B3: Tim doi tuong nguon
        Button buttonSave = (Button)findViewById(R.id.save);
        //B4: Dang ki doi tuong nghe voi doi tuong nguon
        buttonSave.setOnClickListener(buttonSaveListener);
    }

    // B1: tao lop doi tuong listener
    class ButtonSaveListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //Toast.makeText(LunchList.this, "Button Save Click", Toast.LENGTH_LONG).show();
            EditText name=(EditText)findViewById(R.id.name);
            EditText address=(EditText)findViewById(R.id.addr);

            restaurant.setName(name.getText().toString());
            restaurant.setAddress(address.getText().toString());
        }
    }
}
