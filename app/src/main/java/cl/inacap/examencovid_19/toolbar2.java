package cl.inacap.examencovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class toolbar2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar2);

    }

    public void Volver(View view) {
        try {
            Intent volver = new Intent(this, MainActivity.class);
            startActivity(volver);
        } catch (Exception ex) {

        }
    }
}