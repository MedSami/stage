package com.samia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.samia.Api.ApiRequest;
import com.samia.Api.RetrofitService;
import com.samia.Model.ResponseDataModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Details extends AppCompatActivity {
String CIN;
TextView txtNom,txtFaculter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
txtNom=findViewById(R.id.txtNom);
txtFaculter=findViewById(R.id.txtFaculter);
        Bundle data = getIntent().getExtras();
        if (data != null) {
            CIN = data.getString("CIN");
        }

        ApiRequest api= RetrofitService.getClient().create(ApiRequest.class);

        //Instance Call Methode
        Call<ResponseDataModel> EtudiantDetails=api.EtudiantDetails(CIN);
EtudiantDetails.enqueue(new Callback<ResponseDataModel>() {
    @Override
    public void onResponse(Call<ResponseDataModel> call, Response<ResponseDataModel> response) {
        if(response.isSuccessful()){
            if(response.body().getCode().equals("1")){
            txtNom.setText(response.body().getResult().get(0).getNom());
            txtFaculter.setText(response.body().getResult().get(0).getFaculte());
            }
        }
    }

    @Override
    public void onFailure(Call<ResponseDataModel> call, Throwable t) {
        Toast.makeText(Details.this, "Problem Connexion", Toast.LENGTH_SHORT).show();
    }
});


    }
}
