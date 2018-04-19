package com.example.fernana6.actionbarstylessnackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSnackBar;
    Snackbar miSnackBar;
    TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnackBar = findViewById(R.id.btnSnackBar);
        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                miSnackBar.make(view, R.string.texto_snack_bar, Snackbar.LENGTH_LONG).setAction("Cerrar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        miSnackBar.dismiss();
                    }
                }).show();
            }
        });



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.add:
            tvCount=(TextView)findViewById(R.id.tvCount);
            tvCount.setText("Add is clicked");
            return(true);
        case R.id.reset:
            tvCount=(TextView)findViewById(R.id.tvCount);
            tvCount.setText("Nothing is selected");
            return(true);
        case R.id.about:
            Toast.makeText(this, "Has pulsado el boton about", Toast.LENGTH_LONG).show();
            return(true);
        case R.id.exit:
            finish();
            return(true);

    }
        return(super.onOptionsItemSelected(item));
    }
}
