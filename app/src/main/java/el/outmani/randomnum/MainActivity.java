package el.outmani.randomnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSubmit = findViewById(R.id.btnSubmit);
        final EditText editText = findViewById(R.id.editTextNumber);
        final TextView textView = findViewById(R.id.textViewDisplay);

        buttonSubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double number = Double.parseDouble(editText.getText().toString());
                        Double rn = Math.random();
                        textView.setText("The result is: "+ number * rn );

                        editText.setText("");

                    }
                }
        );

    }

}
