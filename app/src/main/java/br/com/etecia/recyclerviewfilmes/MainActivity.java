package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(

                new Filmes("Creed: nascido para lutar",
                        "Adonis Johnson never knew his famous father, world heavyweight champion Apollo Creed, who died before he was born. Still, there's no denying that boxing is in his blood, so Adonis heads to Philadelphia, the site of Apollo Creed's legendary match with a tough upstart named Rocky Balboa. ",
                        "Ação",R.drawable.creed)
        );


        //criando a classe adaptadore passando os parêmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);
    }
}