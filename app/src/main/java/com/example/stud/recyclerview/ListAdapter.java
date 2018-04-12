package com.example.stud.recyclerview;

/**
 * Created by W57449 on 2018-04-12.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    List<Planeta> list ;
    public ListAdapter(List<Planeta> planety) {
        this.list = planety;
    }


    @Override
    public ListViewHolder onCreateViewHolder(  ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout. item_view , parent, false );


        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(  ListViewHolder holder, int position) {
    Planeta planeta = this.list.get(position);

    holder.tvNazwa.setText(planeta.nazwa);
    holder.tvRodzaj.setText(planeta.rodzaj);
    holder.tvKsiezyce.setText(String.valueOf(planeta.ksiezyce));

    }


    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvNazwa ;
        TextView tvRodzaj ;
        TextView tvKsiezyce ;

        public ListViewHolder(View itemView) {
            super (itemView);

            tvNazwa = itemView.findViewById(R.id.tvNazwa );
            tvRodzaj = itemView.findViewById(R.id.tvRodzaj );
            tvKsiezyce = itemView.findViewById(R.id.tvKsiezyce );
        }
    }
}