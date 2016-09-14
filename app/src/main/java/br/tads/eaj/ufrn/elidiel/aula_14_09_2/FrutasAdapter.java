package br.tads.eaj.ufrn.elidiel.aula_14_09_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aluno on 14/09/2016.
 */
public class FrutasAdapter extends BaseAdapter {

    private List<Fruta> frutas;
    private Context context;

    public FrutasAdapter (Context context, List<Fruta> frutas){
        super();
        this.context = context;
        this.frutas = frutas;

    }

    @Override
    public int getCount() {
        return frutas != null ? frutas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return frutas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.textview_inflater, parent, false);

        TextView t = (TextView) view.findViewById(R.id.nomeFruta);
        ImageView img = (ImageView) view.findViewById(R.id.imgFruta);
        Fruta fruta = (Fruta)frutas.get(position);
        t.setText(fruta.nome);
        img.setImageResource(fruta.img);
        return view;
    }
}
