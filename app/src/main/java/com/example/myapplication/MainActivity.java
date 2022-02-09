package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private ImageButton novoTreino;
    private View customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = ((Activity) this).getLayoutInflater();

        novoTreino = findViewById(R.id.novoTreino);
        customDialog = inflater.inflate(R.layout.novo_treino, null);

        novoTreino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new MaterialAlertDialogBuilder(MainActivity.this)
                        .setTitle("Novo treino")
                        .setMessage("Criar rotina de treino")
                        .setView(customDialog)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Cancelando
                            }
                        })
                        .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Salvando novo treino
                            }
                        })
                        .show();
            }
        });

    }
}