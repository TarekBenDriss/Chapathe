package com.bendriss.chapathe.fragment;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import com.bendriss.chapathe.R;

public class MoviesCategoriesFragment extends Fragment {

    private ConstraintLayout accueil, verwacht, events, kids;
    private TextView accueilT, verwachtT, eventsT, kidsT;
    private HorizontalScrollView horizontalScrollView;
    public MoviesCategoriesFragment() {
        // Required empty public constructor
    }

    public static MoviesCategoriesFragment newInstance(String param1, String param2) {
        MoviesCategoriesFragment fragment = new MoviesCategoriesFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movies_categories, container, false);
        accueil = view.findViewById(R.id.actueel);
        verwacht = view.findViewById(R.id.verwacht);
        events = view.findViewById(R.id.events);
        kids = view.findViewById(R.id.kids);
        accueilT = view.findViewById(R.id.actueelT);
        verwachtT = view.findViewById(R.id.verwachtT);
        eventsT = view.findViewById(R.id.eventsT);
        kidsT = view.findViewById(R.id.kidsT);


        horizontalScrollView = view.findViewById(R.id.horizontalScrollView);
        accueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeMenuClors(1);
            }
        });
        verwacht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeMenuClors(2);
            }
        });
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeMenuClors(3);
            }
        });
        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeMenuClors(4);
            }
        });
        return view;
    }

    private void changeMenuClors(int id)
    {
        if(id==1)
        {
            accueil.setBackground(getResources().getDrawable(R.drawable.menu_titles_bg));
            verwacht.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            events.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            kids.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));

            accueilT.setTextColor(getResources().getColor(R.color.black));
            verwachtT.setTextColor(getResources().getColor(R.color.whited));
            eventsT.setTextColor(getResources().getColor(R.color.whited));
            kidsT.setTextColor(getResources().getColor(R.color.whited));
        }
        else if (id==2)
        {
            accueil.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            verwacht.setBackground(getResources().getDrawable(R.drawable.menu_titles_bg));
            events.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            kids.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            accueilT.setTextColor(getResources().getColor(R.color.whited));
            verwachtT.setTextColor(getResources().getColor(R.color.black));
            eventsT.setTextColor(getResources().getColor(R.color.whited));
            kidsT.setTextColor(getResources().getColor(R.color.whited));
        }
        else if (id==3)
        {
            accueil.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            verwacht.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            events.setBackground(getResources().getDrawable(R.drawable.menu_titles_bg));
            kids.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            accueilT.setTextColor(getResources().getColor(R.color.whited));
            verwachtT.setTextColor(getResources().getColor(R.color.whited));
            eventsT.setTextColor(getResources().getColor(R.color.black));
            kidsT.setTextColor(getResources().getColor(R.color.whited));
        }
        else if (id==4)
        {
            accueil.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            verwacht.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            events.setBackground(getResources().getDrawable(R.drawable.menu_rounded_bg));
            kids.setBackground(getResources().getDrawable(R.drawable.menu_titles_bg));
            accueilT.setTextColor(getResources().getColor(R.color.whited));
            verwachtT.setTextColor(getResources().getColor(R.color.whited));
            eventsT.setTextColor(getResources().getColor(R.color.whited));
            kidsT.setTextColor(getResources().getColor(R.color.black));
        }
    }


}
