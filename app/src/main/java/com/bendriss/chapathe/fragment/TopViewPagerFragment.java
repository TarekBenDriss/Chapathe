package com.bendriss.chapathe.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bendriss.chapathe.R;
import com.bendriss.chapathe.adapter.ViewPagerAdapter;

public class TopViewPagerFragment extends Fragment {


    public TopViewPagerFragment() {
        // Required empty public constructor
    }

    public static TopViewPagerFragment newInstance(String param1, String param2) {
        TopViewPagerFragment fragment = new TopViewPagerFragment();

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
        View view = inflater.inflate(R.layout.fragment_top_view_pager, container, false);



        ViewPager viewPager =  view.findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getContext());
        viewPager.setAdapter(viewPagerAdapter);
        return view;
    }


}
