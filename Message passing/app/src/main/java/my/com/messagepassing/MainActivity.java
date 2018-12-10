package my.com.messagepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new ClickListener());
    }

    public class  ClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            i.putExtra("text",editText.getText().toString());
            startActivity(i);
        }
    }
}
