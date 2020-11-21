package com.example.navigationdrawer;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Storage_Internal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Storage_Internal extends Fragment {

    EditText textmsg;
    static final int READ_BLOCK_SIZE = 100;
    Button read;
    Button write;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Storage_Internal() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Storage_Internal.
     */
    // TODO: Rename and change types and number of parameters
    public static Storage_Internal newInstance(String param1, String param2) {
        Storage_Internal fragment = new Storage_Internal();
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
            EditText textmsg = getView().findViewById(R.id.internalEditText);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_storage__internal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       Button read = view.findViewById(R.id.InternalButton2);
        Button write = view.findViewById(R.id.InternalButton1);
        final EditText textmsg = getView().findViewById(R.id.internalEditText);

        read.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try {

                   FileOutputStream fileout=getActivity().openFileOutput("mytextfile.txt", MODE_PRIVATE);
                   OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                   outputWriter.write(textmsg.getText().toString());
                   outputWriter.close();
                   //display file saved message
                   Toast.makeText(getActivity().getBaseContext(), "File saved successfully!",
                           Toast.LENGTH_SHORT).show();
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }

       });

       write.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                   try {
                       FileInputStream fileIn=getActivity().openFileInput("mytextfile.txt");
                       InputStreamReader InputRead= new InputStreamReader(fileIn);
                       char[] inputBuffer= new char[READ_BLOCK_SIZE];
                       String s="";
                       int charRead;
                       while ((charRead=InputRead.read(inputBuffer))>0) {
                           // char to string conversion
                           String readstring=String.copyValueOf(inputBuffer,0,charRead);
                           s +=readstring;
                       }
                       InputRead.close();
                       textmsg.setText(s);
                       //Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }

       });

    }


}