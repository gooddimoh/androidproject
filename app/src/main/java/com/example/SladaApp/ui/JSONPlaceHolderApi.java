package com.example.SladaApp.ui;

import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {
    // @GET("/posts/1") //
    @POST("/slada/{patch}")
    public Call<com.example.SladaApp.ui.RegistrationBody> getPostWithID(@Body com.example.SladaApp.ui.RegistrationBody registrationBody, @Path("patch") String patch);

    // @GET("/slada/api.php?action=selectdevicename&devicename=device2") //
    @POST("/slada/api.php?action=selectdevicename&devicename=device2")
    public Call<com.example.SladaApp.ui.RegistrationBody> selectdevicenameWithID(@Body com.example.SladaApp.ui.RegistrationBody registrationBody);

}
