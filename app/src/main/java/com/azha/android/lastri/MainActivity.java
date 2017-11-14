package com.azha.android.lastri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View Login = findViewById(R.id.login);
        Login.setOnClickListener(this);

        View scncd = findViewById(R.id.scbcd);
        scncd.setOnClickListener(this);

        View dashboard = findViewById(R.id.continuesignup);
        dashboard.setOnClickListener(this);
    }

    public void loadSlides(View view)
    {
        new PreferenceManager(this).clearPreference();
        startActivity(new Intent(this,WelcomeActivity.class));
        finish();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                Intent Login = new Intent(this, LoginActivity.class);
                startActivity(Login);
                break;

            case R.id.continuesignup:
                Intent dashboard = new Intent(this, DashboardActivity.class);
                startActivity(dashboard);
                break;

            case R.id.scbcd:
                Intent scbcd = new Intent(this, BarcodeActivity.class);
                startActivity(scbcd);
                break;
        }
    }
}



