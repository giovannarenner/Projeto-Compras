package br.ulbra.com.compras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox chkarroz, chkleite, chkcarne, chkfeijao;
    Button bttotal;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkarroz = (CheckBox) findViewById(R.id.arroz);
        chkleite = (CheckBox) findViewById(R.id.leite);
        chkcarne = (CheckBox) findViewById(R.id.carne);
        chkfeijao = (CheckBox) findViewById(R.id.feijão);
        Button bttotal = (Button) findViewById(R.id.btnTotal);
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked()) { total += 9.99; }
                if (chkleite.isChecked()) { total += 7.00; }
                if (chkcarne.isChecked()) { total += 9.70; }
                if (chkfeijao.isChecked()) { total += 9.70; }
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra: "+ String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            } });
    }
}