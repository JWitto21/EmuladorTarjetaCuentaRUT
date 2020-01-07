package com.example.desafiobancoestado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.desafiobancoestado.nfc.OutcomingNfcManager;

public class SinContactoActivity extends AppCompatActivity implements OutcomingNfcManager.NfcActivity {

    private NfcAdapter nfcAdapter;
    private OutcomingNfcManager outcomingNfccallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sincontacto);

        this.nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        this.outcomingNfccallback = new OutcomingNfcManager(this);
        this.nfcAdapter.setOnNdefPushCompleteCallback(outcomingNfccallback, this);
        this.nfcAdapter.setNdefPushMessageCallback(outcomingNfccallback, this);
    }

    @Override
    public String getOutcomingMessage() {
        return "8605";
    }

    @Override
    public void signalResult() {
    }

    public void back(View view){
        SinContactoActivity.this.finish();
    }
}
