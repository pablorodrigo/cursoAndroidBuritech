package br.com.agendaescolar.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import br.com.agendaescolar.R;

public class ProfessorFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Ciclo de vida","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de vida","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo de vida","onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ciclo de vida","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de vida","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ciclo de vida","onDestroy");
    }
}
