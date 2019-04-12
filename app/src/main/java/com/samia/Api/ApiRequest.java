package com.samia.Api;

import com.samia.Model.ResponseDataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {

    /******************** Get Student*******************/
    @GET("SelectEtudiant.php")
    Call<ResponseDataModel> EtudiantDetails(@Query("cin") String cin);
}
