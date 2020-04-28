/**
     NIM         : 10118702
     Nama        : Erwin Jelly Barus Tobing
     Kelas       : IF-6k
     Tanggal     : 28/04/2020
     Deskripsi   : membuat empty activity Home,
                   menambahkan tampilan activity_home,
                   menambahkan kelas HomeActivity
 */

package com.chupakubera.latihansharedpreference;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chupakubera.latihansharedpreferenced.R;
import com.chupakubera.latihansharedpreference.util.Preferences;

public class HomeActivity extends AppCompatActivity {
    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }

    private void declareView(){
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
