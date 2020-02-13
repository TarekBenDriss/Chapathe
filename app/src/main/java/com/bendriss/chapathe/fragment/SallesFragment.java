package com.bendriss.chapathe.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bendriss.chapathe.R;
import com.bendriss.chapathe.adapter.SallesAdapter;
import com.bendriss.chapathe.model.Salle;

import java.util.ArrayList;
import java.util.List;

public class SallesFragment extends Fragment {


    private RecyclerView sallesRecyclerView;

    public SallesFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_salles, container, false);
        sallesRecyclerView = view.findViewById(R.id.sallesRecyclerView);
        sallesRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Salle> salles = new ArrayList<>();
        Salle s1 = new Salle();
        Salle s2 = new Salle();
        Salle s3 = new Salle();
        Salle s4 = new Salle();
        Salle s5 = new Salle();
        s1.setCity("Amersfoort");
        s1.setTitle("PATHE AMERSFOORT");
        s1.setImg(R.drawable.amersfoort);
        s2.setCity("Amsterdam");
        s2.setTitle("PATHE ARENA");
        s2.setImg(R.drawable.arena);
        s3.setCity("Amsterdam");
        s3.setTitle("PATHE CITY");
        s3.setImg(R.drawable.city);
        s4.setCity("Amsterdam");
        s4.setTitle("PATHE DE MUNT");
        s4.setImg(R.drawable.de_munt);
        s5.setCity("Amsterdam");
        s5.setTitle("PATHE TUSCHINSKI");
        s5.setImg(R.drawable.tusinchski);
        salles.add(s1);
        salles.add(s2);
        salles.add(s3);
        salles.add(s4);
        salles.add(s5);
        SallesAdapter adapter = new SallesAdapter(getContext(),salles);

        Log.e("ERROR","YES");
        sallesRecyclerView.setAdapter(adapter);


        return view;
    }


}
