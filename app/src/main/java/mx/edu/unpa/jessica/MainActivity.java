package mx.edu.unpa.jessica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hola mundooooooooooooooooo", Toast.LENGTH_SHORT).show();
        // Nuevo comentario
        Toast.makeText(this, "Hola mundo 2", Toast.LENGTH_SHORT).show();
    }
}