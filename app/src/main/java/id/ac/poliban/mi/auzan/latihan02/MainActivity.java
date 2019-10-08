package id.ac.poliban.mi.auzan.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PASANG EVENT LISTENER & HANDLER
        //dengan object yang kita buat
        Button btKrisna = findViewById(R.id.btKrisna);
        Button btBisma = findViewById(R.id.btBismaDewaBrata);
        Button btBasudewa = findViewById(R.id.btBasudewa);

        //pasang event listener & event Handler
        //menggunakan kelas anonim yang mengimplementasikan intervace
        // View.onClickListener
        btKrisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Krisna, advisor of Arjuna", Toast.LENGTH_SHORT).show();
            }
        });

        btBisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Bisma Dewa Brata, the godfather of Hastina", Toast.LENGTH_SHORT).show();
            }
        });

        btBasudewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'am Basudewa, The Brother of Krisna", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
