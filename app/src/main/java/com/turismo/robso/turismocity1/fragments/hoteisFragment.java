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


public class hoteisFragment extends Fragment {
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> ad;
    View v;
    public hoteisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_hoteis,container,false);
        lv = (ListView) v.findViewById(R.id.hoteislist);
        al = new ArrayList<String>();
        ad = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1,al);
        lv.setAdapter(ad);
        al.add("Hotel Boa Viagem");
        al.add("Ibis");
        al.add("Mar Hotel");
        al.add("Aconchego");
        al.add("Recife Praia Hotel");
        al.add("Manibu");

        return v;
    }

}
