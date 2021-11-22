package com.example.retrovolley;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodHTTP {
    @GET("User_Registration.php")
    Call<UserResponse> getUser();

    @POST("User_Resistration.php")
    Call<Request> senUser(@Body User user);
}
