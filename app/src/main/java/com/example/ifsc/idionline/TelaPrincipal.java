package com.example.ifsc.idionline;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {
    private Button btn_proxima_tela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela_principal);
        btn_proxima_tela = (Button) findViewById(R.id.btn_proxima_tela);
        btn_proxima_tela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mag = new AlertDialog.Builder(TelaPrincipal.this);
                mag.setMessage("Você caiu no gemidão do zap");
                mag.setNeutralButton("Ok", null);
                mag.show();
                Intent homem = new Intent(TelaPrincipal.this, TelaDois.class);
                startActivity(homem);
            }


        });
    }
}
