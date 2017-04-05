package ru.necessitudo.app.yandextranslate;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YandexTranslateQuery {
    @GET("/api/v1.5/tr.json/translate")
    Call<ResultYandexTranslate> getData(
            @Query("key") String key,
            @Query("text") String text,
            @Query("lang") String lang
    );


}
