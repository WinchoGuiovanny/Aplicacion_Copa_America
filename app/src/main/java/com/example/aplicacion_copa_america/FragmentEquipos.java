package com.example.aplicacion_copa_america;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentEquipos extends Fragment {

    View v;

    private RecyclerView recyclerView;
    private List<Copa_America> listCopaAmerica;

    public FragmentEquipos() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.equipos_fragment, container, false);
        recyclerView = v.findViewById(R.id.equiposRecyclerView);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), listCopaAmerica);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listCopaAmerica = new ArrayList<>();
        listCopaAmerica.add(new Copa_America("0", "14 de Junio 7:30 pm", "Brasil", "0", "Bolivia", "0", R.drawable.brasil, R.drawable.bolivia));
        listCopaAmerica.add(new Copa_America("1", "15 de Junio 2:00 pm", "Venezuela", "0", "Perú", "0", R.drawable.venezuela, R.drawable.peru));
        listCopaAmerica.add(new Copa_America("2", "15 de Junio 5:00 pm", "Argentina", "0", "Colombia", "0", R.drawable.argentina, R.drawable.colombia));
        listCopaAmerica.add(new Copa_America("3", "16 de Junio 2:00 pm", "Paraguay", "0", "Catar", "0", R.drawable.paraguay, R.drawable.qatar));
        listCopaAmerica.add(new Copa_America("4", "16 de Junio 5:00 pm", "Uruguay", "0", "Ecuador", "0", R.drawable.uruguay, R.drawable.ecuador));
        listCopaAmerica.add(new Copa_America("5", "17 de Junio 6:00 pm", "Japón", "0", "Chile", "0", R.drawable.japon, R.drawable.chile));
        listCopaAmerica.add(new Copa_America("6", "18 de Junio 4:30 pm", "Bolivia", "0", "Perú", "0", R.drawable.bolivia, R.drawable.peru));
        listCopaAmerica.add(new Copa_America("7", "18 de Junio 7:30 pm", "Brasil", "0", "Venezuela", "0", R.drawable.brasil, R.drawable.venezuela));
        listCopaAmerica.add(new Copa_America("8", "19 de Junio 4:30 pm", "Argentina", "0", "Paraguay", "0", R.drawable.argentina, R.drawable.paraguay));
        listCopaAmerica.add(new Copa_America("9", "19 de Junio 7:30 pm", "Chile", "0", "Ecuador", "0", R.drawable.chile, R.drawable.argentina));
        listCopaAmerica.add(new Copa_America("10", "20 de Junio 6:00 pm", "Uruguay", "0", "Japón", "0", R.drawable.uruguay, R.drawable.japon));
        listCopaAmerica.add(new Copa_America("11", "21 de Junio 6:00 pm", "Ecuador", "0", "Chile", "0", R.drawable.ecuador, R.drawable.chile));
        listCopaAmerica.add(new Copa_America("12", "22 de Junio 2:00 pm", "Bolivia", "0", "Venezuela", "0", R.drawable.bolivia, R.drawable.venezuela));
        listCopaAmerica.add(new Copa_America("13", "22 de Junio 2:00 pm", "Perú", "0", "Brasil", "0", R.drawable.peru, R.drawable.brasil));
        listCopaAmerica.add(new Copa_America("14", "23 de Junio 2:00 pm", "Catar", "0", "Argentina", "0", R.drawable.qatar, R.drawable.argentina));
        listCopaAmerica.add(new Copa_America("15", "23 de Junio 2:00 pm", "Colombia", "0", "Paraguay", "0", R.drawable.colombia, R.drawable.paraguay));
        listCopaAmerica.add(new Copa_America("16", "24 de Junio 6:00 pm", "Chile", "0", "Uruguay", "0", R.drawable.chile, R.drawable.uruguay));
        listCopaAmerica.add(new Copa_America("17", "24 de Junio 6:00 pm", "Ecuador", "0", "Japón", "0", R.drawable.ecuador, R.drawable.japon));
    }
}
