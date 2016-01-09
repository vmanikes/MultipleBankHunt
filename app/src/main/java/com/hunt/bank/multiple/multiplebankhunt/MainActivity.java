package com.hunt.bank.multiple.multiplebankhunt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    //Declaring all ImageButtons
    ImageButton andhra;
    ImageButton axis;
    ImageButton baroda;
    ImageButton canada;
    ImageButton citi;
    ImageButton dcb;
    ImageButton hdfc;
    ImageButton hsbc;
    ImageButton icici;
    ImageButton kotak;
    ImageButton pnb;
    ImageButton sbh;
    ImageButton sbi;
    ImageButton uco;
    ImageButton vijaya;

    //Here all the onClick() functions will be implemented for the respective banks
    public void andhra(View view){
        andhra=(ImageButton)findViewById(R.id.andhra);
        Intent andhraBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlineandhrabank.net.in/"));
        startActivity(andhraBank);
    }

    public void axis(View view){
        axis=(ImageButton)findViewById(R.id.axis);
        Intent axisBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.axisbank.com/pre-login/internetbanking_prelogin.aspx"));
        startActivity(axisBank);
    }

    public void baroda(View view){
        baroda=(ImageButton)findViewById(R.id.baroda);
        Intent barodaBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bankofbarodauk.com/net-banking/"));
        startActivity(barodaBank);
    }

    public void canara(View view){
        canada=(ImageButton)findViewById(R.id.canara);
        Intent canaraBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.canarabank.in/English/Scripts/Home.aspx/"));
        startActivity(canaraBank);
    }

    public void citi(View view){
        citi=(ImageButton)findViewById(R.id.citi);
        Intent citiBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm"));
        startActivity(citiBank);
    }

    public void dcb(View view){
        dcb=(ImageButton)findViewById(R.id.dcb);
        Intent dcbBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dcbbank.com/onlinebanking/"));
        startActivity(dcbBank);
    }

    public void hdfc(View view){
        hdfc=(ImageButton)findViewById(R.id.hdfc);
        Intent hdfcBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://netbanking.hdfcbank.com/netbanking/"));
        startActivity(hdfcBank);
    }

    public void hsbc(View view){
        hsbc=(ImageButton)findViewById(R.id.hsbc);
        Intent hsbcBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hsbc.co.in/1/2/personal/internet-and-self-service-banking/internet-banking"));
        startActivity(hsbcBank);
    }

    public void icici(View view){
        icici=(ImageButton)findViewById(R.id.icici);
        Intent iciciBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.icicibank.com/safe-online-banking/safe-online-banking.html"));
        startActivity(iciciBank);
    }

    public void kotak(View view){
        kotak=(ImageButton)findViewById(R.id.kotak);
        Intent kotakBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kotak.com/personal-banking/convenience-banking/net-banking.html"));
        startActivity(kotakBank);
    }

    public void pnb(View view){
        pnb=(ImageButton)findViewById(R.id.punjab);
        Intent pnbBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.netpnb.com/"));
        startActivity(pnbBank);
    }

    public void sbh(View view){
        sbh=(ImageButton)findViewById(R.id.sbh);
        Intent sbhBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinesbh.com/"));
        startActivity(sbhBank);
    }

    public void sbi(View view){
        sbi=(ImageButton)findViewById(R.id.sbi);
        Intent sbiBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinesbi.com/"));
        startActivity(sbiBank);
    }

    public void uco(View view){
        uco=(ImageButton)findViewById(R.id.uco);
        Intent ucoBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ucoebanking.com/"));
        startActivity(ucoBank);
    }

    public void vijaya(View view) {
        vijaya=(ImageButton)findViewById(R.id.vijaya);
        Intent vijayaBank=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vijayabankonline.in/index.html"));
        startActivity(vijayaBank);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
