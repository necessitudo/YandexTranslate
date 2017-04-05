package ru.necessitudo.app.yandextranslate;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import io.realm.Realm;

public class TranslateFragment extends Fragment implements LoaderManager.LoaderCallbacks<String> {

    private EditText inputText;
    private Realm    realmDB;

    public TranslateFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.translate, container, false);

        inputText = (EditText) view.findViewById(R.id.inputText);
        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {


                getActivity().getSupportLoaderManager().initLoader(44, Bundle.EMPTY, TranslateFragment.this);
                Log.d("happy", "it works!");



                //TODO: here set get-query over Retrofit

            }
        });

        return view;
    }

    @Override
    public Loader<String> onCreateLoader(int id, Bundle args) {
        Loader<String> loader = new QueryTranslateLoader(getContext());
        return loader;
    }

    @Override
    public void onLoadFinished(Loader<String> loader, String data) {

    }

    @Override
    public void onLoaderReset(Loader<String> loader) {

    }
}
