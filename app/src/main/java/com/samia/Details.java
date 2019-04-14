package com.samia;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
TextView txtNom,txtFaculter,txtSimestre1,txtSimestre2,txtSimestre3,txtCaution;
Button btnScan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txtNom=findViewById(R.id.txtNom);
        txtFaculter=findViewById(R.id.txtFaculter);
        txtSimestre1=findViewById(R.id.txtSimestre1);
        txtSimestre2=findViewById(R.id.txtSimestre2);
        txtSimestre3=findViewById(R.id.txtSimestre3);
        txtCaution=findViewById(R.id.txtCaution);
        btnScan=findViewById(R.id.btnScan);
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
            if(response.body().getResult().get(0).getSimetreUn().equals("0")){
                txtSimestre1.setTextColor(ContextCompat.getColor(Details.this, R.color.colorRed));
            }
            if(response.body().getResult().get(0).getSimetreUn().equals("1")){
                txtSimestre1.setTextColor(ContextCompat.getColor(Details.this, R.color.colorGreen));
            }

                if(response.body().getResult().get(0).getSimestreDeux().equals("0")){
                    txtSimestre2.setTextColor(ContextCompat.getColor(Details.this, R.color.colorRed));
                }
                if(response.body().getResult().get(0).getSimestreDeux().equals("1")){
                    txtSimestre2.setTextColor(ContextCompat.getColor(Details.this, R.color.colorGreen));
                }
                if(response.body().getResult().get(0).getSimestreTrois().equals("0")){
                    txtSimestre3.setTextColor(ContextCompat.getColor(Details.this, R.color.colorRed));
                }
                if(response.body().getResult().get(0).getSimestreTrois().equals("1")){
                    txtSimestre3.setTextColor(ContextCompat.getColor(Details.this, R.color.colorGreen));
                }
                if(response.body().getResult().get(0).getCaution().equals("0")){
                    txtCaution.setTextColor(ContextCompat.getColor(Details.this, R.color.colorRed));
                }
                if(response.body().getResult().get(0).getCaution().equals("1")){
                    txtCaution.setTextColor(ContextCompat.getColor(Details.this, R.color.colorGreen));
                }
            }
        }
    }

    @Override
    public void onFailure(Call<ResponseDataModel> call, Throwable t) {
        Toast.makeText(Details.this, "Problem Connexion", Toast.LENGTH_SHORT).show();
    }
});

btnScan.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Details.this,MainActivity.class);
        startActivity(i);
        finish();
    }
});
    }
}
