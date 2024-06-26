package com.benjelloun.moviesappv2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrailerResponse {
    @SerializedName("id")
    private int id;
    @SerializedName("results")
    private List<Trailer> trailers;

    public int getId() {
        return id;
    }

    public List<Trailer> getTrailers() {
        return trailers;
    }
}