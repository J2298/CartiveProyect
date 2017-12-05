package com.job.cartiveweb.services;

import java.util.List;

import com.job.cartiveweb.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
	
	String API_BASE_URL = "https://cartive-alejovictor.c9users.io/";

    @GET("api/v1/loginUsers")
    Call<List<User>> getUsers();

    @FormUrlEncoded
    @POST("api/v1/login")
    Call<User> loginUser
            (@Field("username")String username,
             @Field("password") String password
            );

    @FormUrlEncoded
    @POST("api/v1/register")
    Call<ResponseMessage> createUsuario(@Field("username") String username,
                                        @Field("password") String password,
                                        @Field("email") String email);


}