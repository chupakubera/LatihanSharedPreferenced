/**
    NIM         : 10118702
    Nama        : Erwin Jelly Barus Tobing
    Kelas       : IF-6k
    Tanggal     : 28/04/2020
    Deskripsi   : mengisikan asset pada drawable dan minimap,
                  menambahkan values colors, dimen, string dan styles,
                  membuat class LoginActivity dan tampilan activity_login,
                  membuat activity_login sebagi tampilan default pada AndroidManifest.xml
                  mengedit tampilan activity_login
 */

package com.chupakubera.latihansharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chupakubera.latihansharedpreferenced.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
