package com.example.myapplication.ui;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JSONPlaceHolderApi {
    // @GET("/posts/1") //
    @POST("/slada/{patch}")
    public Call<Post> getPostWithID(@Body RegistrationBody registrationBody, @Path("patch") String patch);

    @POST("/slada/api.php")
    public Call<Post> postWithID(@Body RegistrationBody registrationBody);
}
