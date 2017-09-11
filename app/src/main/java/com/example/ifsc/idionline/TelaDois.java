package com.example.ifsc.idionline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class TelaDois extends AppCompatActivity {
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tela_dois);

        final RadioButton opcao1  = (RadioButton) findViewById(R.id.rbopcao1);
        final RadioButton opcao2  = (RadioButton) findViewById(R.id.rbopcao2);
        final RadioButton opcao3  = (RadioButton) findViewById(R.id.rbopcao3);
        final RadioButton opcao4  = (RadioButton) findViewById(R.id.rbopcao4);
        ok = (Button) findViewById(R.id.btnOK);
        ok.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(opcao1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Você acertou",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
