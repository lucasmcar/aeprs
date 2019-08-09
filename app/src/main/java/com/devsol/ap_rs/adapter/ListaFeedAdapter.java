package com.devsol.ap_rs.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.devsol.ap_rs.R;
import com.devsol.ap_rs.model.ItemEncontrado;
import java.util.List;

public class ListaFeedAdapter extends RecyclerView.Adapter<ListaFeedAdapter.MyViewHolder> {


    private List<ItemEncontrado> itensEncontrados;

    public ListaFeedAdapter(List<ItemEncontrado> listaItensEncontrados) {
        this.itensEncontrados = listaItensEncontrados;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemEncontrado = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_feed, parent, false);

        return new MyViewHolder(itemEncontrado);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ItemEncontrado itemEncontrado = itensEncontrados.get( position );
        holder.txTituloItemEncontrado.setText(itemEncontrado.getTituloItem());
        holder.txDescItemEncotrado.setText(itemEncontrado.getDescItem());
        holder.txDataItemEncontrado.setText(itemEncontrado.getDataItem());
        holder.txLocalItemEncontrado.setText(itemEncontrado.getLocalIten());
        holder.imgItemEncontrado.setImageResource(R.drawable.padrao);
    }

    @Override
    public int getItemCount() {
        return itensEncontrados.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txDataItemEncontrado, txLocalItemEncontrado, txDescItemEncotrado, txTituloItemEncontrado;
        ImageView imgItemEncontrado;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txTituloItemEncontrado = itemView.findViewById(R.id.txItemEncontrado);
            txDescItemEncotrado    = itemView.findViewById(R.id.txDescricaoItemEncontrado);
            txLocalItemEncontrado  = itemView.findViewById(R.id.txLocalItemEncotrado);
            txDataItemEncontrado   = itemView.findViewById(R.id.txDataItemEncontrado);
            imgItemEncontrado      = itemView.findViewById(R.id.imgItemEncontrado);

        }
    }

}
