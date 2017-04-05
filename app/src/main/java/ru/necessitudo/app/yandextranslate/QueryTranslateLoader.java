package ru.necessitudo.app.yandextranslate;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class QueryTranslateLoader extends AsyncTaskLoader {
    public QueryTranslateLoader(Context context) {
        super(context);
    }

    @Override
    public String loadInBackground() {
/*

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://translate.yandex.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        YandexTranslateQuery service = retrofit.create(YandexTranslateQuery.class);

        Call<ResultYandexTranslate> call =  service.getData(
                "trnsl.1.1.20170404T122825Z.f9fb305b55f3fbcd.de2eb7888598ba1ae9c1ae33b403d8fb23132e57",
                "hello",
                "en-ru");
        try {
            Response<ResultYandexTranslate> responce = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        Log.d("happy", "it worksToo!");

        //https://translate.yandex.net/api/v1.5/tr.json/translate?
        // key=trnsl.1.1.20170404T122825Z.f9fb305b55f3fbcd.de2eb7888598ba1ae9c1ae33b403d8fb23132e57
        // &text=hello
        // &lang=en-ru

        return "ok";
    }
}
