package com.calculatrice.alb.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultat;
    TextView resultat2;
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bPlus;
    Button bMoins;
    Button bMultiplier;
    Button bDiviser;
    Button bPoint;
    Button bClear;
    Button bEgale;
    String operande;
    String operande1;
    String operane2;
    String resultatEnCoursText;
    int resultatEnCours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultat = (TextView)findViewById(R.id.textCalc);
        resultat2 = (TextView) findViewById(R.id.textCalc2);
        b0 = (Button)findViewById(R.id.button0);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        bPlus = (Button)findViewById(R.id.buttonPlus);
        bMoins = (Button)findViewById(R.id.buttonMoins);
        bMultiplier = (Button)findViewById(R.id.buttonMultiplier);
        bDiviser = (Button)findViewById(R.id.buttonDiviser);
        bPoint = (Button)findViewById(R.id.buttonPoint);
        bClear = (Button)findViewById(R.id.buttonClear);
        bEgale = (Button)findViewById(R.id.buttonEgale);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bMoins.setOnClickListener(this);
        bMultiplier.setOnClickListener(this);
        bDiviser.setOnClickListener(this);
        bPoint.setOnClickListener(this);
        bClear.setOnClickListener(this);
        bEgale.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            /*
            * Les boutons permettent d'afficher leurs contenus dans le TextView (exepté le bouton Clear)
            * Les boutons de 0 à 9 et . si il y a un zero qui est le 1er le change par le chiffre sur lequel on clique
            * Le bouton Clear effacera toute la ligne
            * Le bouton egale nous mettrera le resultat final
            * les boutons + - * / permettra de faire le calcul de 2 operandes, si on passe à une 2 ele ioeratuib fait a 1ere operation
            */
            case R.id.button0 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = operande;
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b0.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button1 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b1.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText = resultatEnCours + b1.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button2 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b2.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b2.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button3 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b3.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b3.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button4 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b4.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b4.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button5 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b5.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b5.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button6 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b6.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b6.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button7 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b7.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b7.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button8 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b8.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b8.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.button9 :
                operande = resultat.getText().toString();
                if (operande.equals("0")){
                    resultatEnCoursText = b9.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    resultatEnCoursText += b9.getText().toString();
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.buttonPlus :
                if (operande1 == null){
                    operande1 = resultatEnCoursText;
                    resultatEnCoursText += "+";
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);

                }
                else {
                    resultatEnCours = Integer.parseInt(resultatEnCoursText)
                            + Integer.parseInt(operande1);
                    operande1 = ""+resultatEnCours;

                    resultatEnCoursText = ""+resultatEnCours+"+";
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.buttonMoins :
                break;
            case R.id.buttonMultiplier :
                break;
            case R.id.buttonDiviser :
                break;
            case R.id.buttonPoint :
                break;
            case R.id.buttonClear :
                break;
            case R.id.buttonEgale :
                break;
        }

    }
}
