package com.example.aplicacion_copa_america;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    Context mContex;
    List<Copa_America> mData;

    public RecyclerViewAdapter(Context mContex, List<Copa_America> mData) {
        this.mContex = mContex;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContex).inflate(R.layout.item_equipos, viewGroup, false);
        final MyViewHolder viewHolder = new MyViewHolder(v);

        viewHolder.itemEquipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(mContex, "Test Click: "+String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Copa_America copa_america = mData.get(i);

        myViewHolder.fechaEncuentro.setText(copa_america.getmDate());
        myViewHolder.equipoA.setText(copa_america.getmEquipoA());
        myViewHolder.equipoB.setText(copa_america.getmEquipoB());
        myViewHolder.puntosA.setText(copa_america.getPuntosEquipoA());
        myViewHolder.puntosB.setText(copa_america.getPuntosEquipoB());
        myViewHolder.banderaA.setImageResource(copa_america.getBanderaEquipoA());
        myViewHolder.banderaB.setImageResource(copa_america.getBanderaEquipoB());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView fechaEncuentro, equipoA, equipoB, puntosA, puntosB;
        ImageView banderaA, banderaB;
        ConstraintLayout itemEquipos;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            fechaEncuentro = itemView.findViewById(R.id.fechaencuentro);
            equipoA = itemView.findViewById(R.id.equipoA);
            equipoB = itemView.findViewById(R.id.equipoB);
            puntosA = itemView.findViewById(R.id.puntosA);
            puntosB = itemView.findViewById(R.id.puntosB);
            banderaA = itemView.findViewById(R.id.banderaA);
            banderaB = itemView.findViewById(R.id.banderaB);
            itemEquipos = itemView.findViewById(R.id.equiposItemId);
        }
    }
}
