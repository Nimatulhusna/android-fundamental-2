package com.dicoding.picodiploma.githubuserapp2.api

import com.dicoding.picodiploma.githubuserapp2.data.model.DetailUserResponse
import com.dicoding.picodiploma.githubuserapp2.data.model.User
import com.dicoding.picodiploma.githubuserapp2.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: ghp_sSETTVgRRs4VpsvSK5u9hBYonnHq2S3xdQLO")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: ghp_sSETTVgRRs4VpsvSK5u9hBYonnHq2S3xdQLO")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: ghp_sSETTVgRRs4VpsvSK5u9hBYonnHq2S3xdQLO")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: sidiqghp_sSETTVgRRs4VpsvSK5u9hBYonnHq2S3xdQLO")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}