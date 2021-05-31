package mx.edu.unpa.jessica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Comentario de prueba
        Toast.makeText(this, "Hola mundooooooooooooooooo", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Lo que quieras", Toast.LENGTH_LONG).show();
        
        // Esto es otro comentario de prueba jeje :)
        Toast.makeText(this, ":)", Toast.LENGTH_SHORT).show();
    }
}