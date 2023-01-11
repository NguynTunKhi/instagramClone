package com.serhat.instagram.api;

public class ApiUtils {
    public static final String BASE_URL = "https://api.instagram.com/oauth/EAAHLJkkZCZBsYBAAEQn40ee1iAyRu37wMEevAdFVHDgxdafJw2rP5uUVCh5PBgHEkkaUn72VjI4fMZCZA0Cyb54ZAGm6rpSpPplX5nP8LiQJDnqwhKR3HLycPhf7OCc5INsabi49XtuadGTwNtb9jwP2xOkefKTSendKxpuV7LoeaFDLlNJQWTw0Fj9xan7rqpPYpyF6ZCCxLuY8rZCZCViO";

    public static ApiInterface getApiService() {
        return ApiClient.getClient(BASE_URL).create(ApiInterface.class);
    }
}
