package com.turismo.robso.turismocity1.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.turismo.robso.turismocity1.R;

import java.util.ArrayList;


public class cidadesFragment extends Fragment {

ListView lv;
ArrayList<String> al;
ArrayAdapter<String> ad;
    View v;
    public cidadesFragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_cidades,container, false);
        lv = (ListView) v.findViewById(R.id.list_cidade);
        al = new ArrayList<String>();
        ad = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1,al);
        lv.setAdapter(ad);
        al.add("Recife");
        al.add("Olinda");
        al.add("Abreu e Lima");
        al.add("Igarassu");
        al.add("Jaboatão");
        al.add("Paulista");

        return v;
    }

}
