package br.tads.eaj.ufrn.elidiel.aula_14_09_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lista;
    private List<Fruta> frutas;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.minha_lista);
        frutas = Fruta.getFrutas();
        lista.setAdapter(new FrutasAdapter(this, frutas));
        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick (AdapterView<?> parent, View v, int idx, long id){
        Fruta f = this.frutas.get(idx);
        Toast.makeText(this, "Fruta selecionada: "+ f.nome + ", posicao: " +
                idx, Toast.LENGTH_SHORT).show();
    }
}
