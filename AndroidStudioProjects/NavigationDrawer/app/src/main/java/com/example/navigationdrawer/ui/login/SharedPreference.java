package com.example.navigationdrawer.ui.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.navigationdrawer.R;

public class SharedPreference extends Fragment {

        SharedPreferences sharedPreferences;
        EditText name;
        EditText email;
        public static final String mypreference="mypref";
        public static final String Name="nameKey";
        public static final String Email="emailKey";




        // TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private static final String ARG_PARAM1 = "param1";
        private static final String ARG_PARAM2 = "param2";
        // TODO: Rename and change types of parameters
        private String mParam1;
        private String mParam2;
        public void sharedpreferences() {
            // Required empty public constructor
        }
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment sharedpreferences.
         */
        // TODO: Rename and change types and number of parameters
        public static SharedPreference newInstance(String param1, String param2) {
            SharedPreference fragment = new SharedPreference();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, param1);
            args.putString(ARG_PARAM2, param2);
            fragment.setArguments(args);
            return fragment;
        }
        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            if (getArguments() != null) {
                mParam1 = getArguments().getString(ARG_PARAM1);
                mParam2 = getArguments().getString(ARG_PARAM2);
            }
            sharedPreferences = getActivity().getSharedPreferences(mypreference, Context.MODE_PRIVATE);
        }
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_shared_preference, container, false);



        }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //  private Activity view;
        Button btnSave = view.findViewById(R.id.save);
        Button btnClear=view.findViewById(R.id.clear);
        Button btnRetrive=view.findViewById(R.id.retrive);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                String e=email.getText().toString();
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(Name,n);
                editor.putString(Email,e);
                editor.commit();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=(EditText) getView().findViewById(R.id.username);
                email=(EditText) getView().findViewById(R.id.EmailID);
                name.setText("");
                email.setText("");
            }
        });

        btnRetrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            name = (EditText) getView().findViewById(R.id.username);
            email = (EditText) getView().findViewById(R.id.EmailID);
            sharedPreferences = getActivity().getSharedPreferences(mypreference,Context.MODE_PRIVATE);
            if(sharedPreferences.contains(Name)) {
                name.setText(sharedPreferences.getString(Name,""));
            }
                if(sharedPreferences.contains(Email)) {
                    email.setText(sharedPreferences.getString(Email,""));
                }
            }
        });
    }
}
