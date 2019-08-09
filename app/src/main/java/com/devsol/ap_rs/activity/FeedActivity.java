package com.devsol.ap_rs.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.devsol.ap_rs.R;
import com.devsol.ap_rs.adapter.ListaFeedAdapter;
import com.devsol.ap_rs.helper.RecyclerItemClickListener;
import com.devsol.ap_rs.model.ItemEncontrado;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    private List<ItemEncontrado> encontrado = new ArrayList<>();
    private RecyclerView rvFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Toolbar toolbar = findViewById(R.id.tbFeed);
        setSupportActionBar( toolbar );

        rvFeed = findViewById(R.id.rvListaFeed);

        criarFeed();

        //Configurar Adapter
        final ListaFeedAdapter listaFeed = new ListaFeedAdapter( encontrado );

        //configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvFeed.setLayoutManager( layoutManager );
        rvFeed.setHasFixedSize( true );
        rvFeed.setAdapter( listaFeed );
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rvFeed.getContext(),
                ((LinearLayoutManager) layoutManager).getOrientation());
        rvFeed.addItemDecoration(dividerItemDecoration);

        //Evento de clique da lista
        rvFeed.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        this, rvFeed, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        ItemEncontrado itemEncontrados = encontrado.get( position );
                        Intent i = new Intent( FeedActivity.this, DetalhesEncotradoActivity.class );
                        i.putExtra("itemSelecionado", itemEncontrados);
                        startActivity( i );
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                }
                ));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu_app, menu);



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (item.getItemId()){

        }


        return super.onOptionsItemSelected(item);
    }

    public void criarFeed() {

        //Editar perfil
        ItemEncontrado ie = new ItemEncontrado("Rua Mal Floriano Peixoto",
                "12/12/2012", "CPF, RG, CNH", "Documentos encontrados", R.drawable.padrao
        );
        this.encontrado.add( ie );

        ie = new ItemEncontrado("Rua Dr Mario Totta",
                "12/10/2014", "Carteira com dinheiro", "Carteira", R.drawable.padrao
        );
        this.encontrado.add( ie );
    }
}
