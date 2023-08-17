package com.example.socialnetworkingapp.rest.services;

import com.example.socialnetworkingapp.LoginActivity;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserInterface {

    @POST("Login ")
    Call<Integer> signin(@Body LoginActivity.UserInfo userInfo);

}
