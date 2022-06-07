package com.cst2335.magg0008;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button clickherebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickherebutton = findViewById(R.id.clickhere);
        clickherebutton.setOnClickListener(this);

        Switch switchy = (Switch)findViewById(R.id.switch1);
        switchy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.isChecked() == true){
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.switch1), getString(R.string.SnackbarOnMessage), Snackbar.LENGTH_LONG);
                    snackbar.setAction(getString(R.string.Undo), click -> buttonView.setChecked(!isChecked)).show();

                }
                else {
                    Snackbar snackbar = Snackbar.make(findViewById(R.id.switch1), getString(R.string.SnackbarOffMessage), Snackbar.LENGTH_LONG);
                    snackbar.setAction(getString(R.string.Undo), click -> buttonView.setChecked(!isChecked)).show();

                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(this, getString(R.string.ToastMessage), Toast.LENGTH_SHORT);
        toast.show();

    }


}