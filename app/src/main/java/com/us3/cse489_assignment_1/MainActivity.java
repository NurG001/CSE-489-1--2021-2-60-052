package com.us3.cse489_assignment_1;

import android.os.Bundle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showFiguresButton = findViewById(R.id.showFiguresButton);
        showFiguresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFiguresDialog();
            }
        });
    }

    private void showFiguresDialog() {
        // Options for each figure
        String[] options = {"Figure 1", "Figure 2", "Figure 3", "Figure 4"};

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Select a Figure to View")
                .setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                startActivity(new Intent(MainActivity.this, Figure01Activity.class));
                                break;
                            case 1:
                                startActivity(new Intent(MainActivity.this, Figure02Activity.class));
                                break;
                            case 2:
                                startActivity(new Intent(MainActivity.this, Figure03Activity.class));
                                break;
                            case 3:
                                startActivity(new Intent(MainActivity.this, Figure04Activity.class));
                                break;
                        }
                    }
                })
                .show();
    }
}
