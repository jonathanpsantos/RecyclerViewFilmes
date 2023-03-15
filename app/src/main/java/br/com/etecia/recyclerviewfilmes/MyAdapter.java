package br.com.etecia.recyclerviewfilmes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private Context mContexto;
    private List<Filmes> listFilmes;

    //criando o construdor da classe com parâmetros

    public MyAdapter(Context mContexto, List<Filmes> listFilmes) {
        this.mContexto = mContexto;
        this.listFilmes = listFilmes;
    }


    //criando construtor com parâmetros alt+insert

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //criando a class viewHolder

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView idTituloFilmes;
        ImageView idImgFilmes;
        CardView idCardFilmes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idImgFilmes = itemView.findViewById(R.id.idImgFilmes);
            idCardFilmes = itemView.findViewById(R.id.idCardFilmes);

        }
    }


}
