package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //made a change
    
    private TextView bitsTV, kbitsTV, mbitsTV, gbitsTV, tbitsTV, bytesTV, kbytesTV, mbytesTV, gbytesTV, tbytesTV;
    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bitsTV = (TextView)this.findViewById(R.id.bitsTV);
        this.kbitsTV = (TextView)this.findViewById(R.id.kbitsTV);
        this.mbitsTV = (TextView)this.findViewById(R.id.mbitsTV);
        this.gbitsTV = (TextView)this.findViewById(R.id.gbitsTV);
        this.tbitsTV = (TextView)this.findViewById(R.id.tbitsTV);
        this.bytesTV = (TextView)this.findViewById(R.id.bytesTV);

        this.kbytesTV = (TextView)this.findViewById(R.id.kbytesTV);
        this.mbytesTV = (TextView)this.findViewById(R.id.mbytesTV);
        this.gbytesTV = (TextView)this.findViewById(R.id.gbytesTV);
        this.tbytesTV = (TextView)this.findViewById(R.id.tbytesTV);


        this.mbET = (EditText)this.findViewById(R.id.mbET);
    }

    private String roundOffNumber(double num)
    {
        return String.format("%.7f", num);
    }

    public void clickMeButtonPressed(View v)
    {
        String sValue = this.mbET.getText().toString();
        int iValue = Integer.parseInt(sValue);

        int mbits = iValue * 8;
        int kbytes = iValue * 1024;
        int kbits = kbytes * 8;
        int bytes = kbytes * 1024;
        int bits = bytes * 8;
        double gbytes = (double)iValue / 1024;
        double gbits = gbytes * 8;
        double tbytes = (double)gbytes / 1024;
        double tbits = tbytes * 8;

       // bitsTV.setText("" + (iValue + 5));

        bitsTV.setText("" +  bits + " bits");
        kbitsTV.setText("" +  kbits  + " kb");
        mbitsTV.setText("" +  mbits + " mb");
        gbitsTV.setText("" +  roundOffNumber(gbits) + " gb");
        tbitsTV.setText("" +  roundOffNumber(tbits) + " tb");
        bytesTV.setText("" +  bytes + " bytes");
        kbytesTV.setText("" +  kbytes + " kB");
        mbytesTV.setText("" +  iValue + " MB");
        gbytesTV.setText("" +  roundOffNumber(gbytes) + " GB");
        tbytesTV.setText("" +  roundOffNumber(tbytes) + " TB");

    }
}
