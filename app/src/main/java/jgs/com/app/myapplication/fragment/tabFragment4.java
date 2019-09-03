package jgs.com.app.myapplication.fragment;

/**
 * Created by user on 2018-06-10.
 */

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import jgs.com.app.myapplication.R;

public class tabFragment4 extends BaseFragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_tab_4, container, false);

        initView(rootView);

        initSet();

        initData();

        setListener();

        return rootView;
    }

    public void initView(View v){



    }

    public void setListener() {

    }

    public void initSet(){


    }



    public void initData(){



    }


}