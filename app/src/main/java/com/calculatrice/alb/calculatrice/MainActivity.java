package com.calculatrice.alb.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    String operande1;
    String signe = "";
    String resultatEnCoursText;
    double resultatEnCours;
    boolean premierErOperande = true;

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
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b0.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b0.getText().toString();
                }
                else {
                    resultatEnCoursText += b0.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button1 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b1.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b1.getText().toString();
                }
                else {
                    resultatEnCoursText += b1.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button2 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b2.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b2.getText().toString();
                }
                else {
                    resultatEnCoursText += b2.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button3 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b3.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b3.getText().toString();
                }
                else {
                    resultatEnCoursText += b3.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button4 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b4.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b4.getText().toString();
                }
                else {
                    resultatEnCoursText += b4.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button5 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b5.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b5.getText().toString();
                }
                else {
                    resultatEnCoursText += b5.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button6 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b6.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b6.getText().toString();
                }
                else {
                    resultatEnCoursText += b6.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button7 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b7.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b7.getText().toString();
                }
                else {
                    resultatEnCoursText += b7.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button8 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b8.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b8.getText().toString();
                }
                else {
                    resultatEnCoursText += b8.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.button9 :
                resultatEnCoursText = resultat.getText().toString();
                if (resultatEnCoursText.equals("0")){
                    resultatEnCoursText = b9.getText().toString();
                }
                else if (resultatEnCoursText.equals("-0")){
                    resultatEnCoursText = "-"+b9.getText().toString();
                }
                else {
                    resultatEnCoursText += b9.getText().toString();
                }
                resultat.setText(resultatEnCoursText);
                break;
            case R.id.buttonPlus :
                if (premierErOperande){
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    premierErOperande = false;
                    operande1 = resultatEnCoursText;
                    signe = "+";
                    resultatEnCoursText += signe;
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);

                }
                else {
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    switch (signe)
                    {
                        case "-":
                            resultatEnCours = Double.parseDouble(operande1)
                                                      - Double.parseDouble(resultatEnCoursText);
                            break;
                        case "/":
                            if (resultatEnCoursText.equals("0"))
                            {
                                Toast.makeText(this, "Division par 0 impossible", Toast.LENGTH_LONG).show();
                                return;
                            }
                            resultatEnCours = Double.parseDouble(operande1)
                                                      / Double.parseDouble(resultatEnCoursText);
                            break;
                        case "*":
                            resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                      * Double.parseDouble(operande1);
                            break;
                        case "+" :
                            resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                      + Double.parseDouble(operande1);
                            break;
                        default:
                            Toast.makeText(this, "Veuillez entrer le 2eme operande", Toast.LENGTH_LONG).show();
                            return;
                    }
                    signe = "+";
                    operande1 = ""+resultatEnCours;

                    resultatEnCoursText = ""+resultatEnCours+"+";
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.buttonMoins :
                if (resultat.getText().toString().equals("0")){
                    resultatEnCoursText = "-0";
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    if (premierErOperande){
                        premierErOperande = false;
                        operande1 = resultatEnCoursText;
                        signe = "-";
                        resultatEnCoursText += signe;
                        resultat2.setText(resultatEnCoursText);
                        resultatEnCoursText = "0";
                        resultat.setText(resultatEnCoursText);

                    }
                    else {
                        if (resultatEnCoursText.endsWith(".")){
                            Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                            return;
                        }
                        switch (signe)
                        {
                            case "+":
                                resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                          + Double.parseDouble(operande1);
                                break;
                            case "/":
                                if (resultatEnCoursText.equals("0"))
                                {
                                    Toast.makeText(this, "Division par 0 impossible", Toast.LENGTH_LONG).show();
                                    return;
                                }
                                resultatEnCours = Double.parseDouble(operande1)
                                                          / Double.parseDouble(resultatEnCoursText);
                                break;
                            case "*":
                                resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                          * Double.parseDouble(operande1);
                                break;
                            case "-" :
                                resultatEnCours = Double.parseDouble(operande1)
                                                          - Double.parseDouble(resultatEnCoursText);
                                break;
                            default:
                                Toast.makeText(this, "Veuillez entrer le 2eme operande", Toast.LENGTH_LONG).show();
                                return;
                        }

                        signe = "-";
                        operande1 = ""+resultatEnCours;
                        resultatEnCoursText = ""+resultatEnCours+"-";
                        resultat2.setText(resultatEnCoursText);
                        resultatEnCoursText = "0";
                        resultat.setText(resultatEnCoursText);
                    }
                }
                break;
            case R.id.buttonMultiplier :
                if (premierErOperande){
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    premierErOperande = false;
                    operande1 = resultatEnCoursText;
                    resultatEnCoursText += "x";
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);

                }
                else {
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    switch (signe)
                    {
                        case "+":
                            resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                      + Double.parseDouble(operande1);
                            break;
                        case "-":
                            resultatEnCours = Double.parseDouble(operande1)
                                                      - Double.parseDouble(resultatEnCoursText);
                            break;
                        case "/":
                            if (resultatEnCoursText.equals("0"))
                            {
                                Toast.makeText(this, "Division par 0 impossible", Toast.LENGTH_LONG).show();
                                return;
                            }
                            resultatEnCours = Double.parseDouble(operande1)
                                                      / Double.parseDouble(resultatEnCoursText);
                            break;
                        case "*" :
                            resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                      * Double.parseDouble(operande1);
                            break;
                        default:
                            Toast.makeText(this, "Veuillez entrer le 2eme operande", Toast.LENGTH_LONG).show();
                            return;
                    }

                    signe = "*";
                    operande1 = ""+resultatEnCours;
                    resultatEnCoursText = ""+resultatEnCours+"x";
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.buttonDiviser :
                if (premierErOperande){
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    premierErOperande = false;
                    operande1 = resultatEnCoursText;
                    signe = "/";
                    resultatEnCoursText += signe;
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);

                }
                else {
                    if (resultatEnCoursText.endsWith(".")){
                        Toast.makeText(this, "Veuillez mettre un chiffre", Toast.LENGTH_LONG).show();
                        return;
                    }
                    switch (signe)
                    {
                        case "+":
                            resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                      + Double.parseDouble(operande1);
                            break;
                        case "-":
                            resultatEnCours = Double.parseDouble(operande1)
                                                      - Double.parseDouble(resultatEnCoursText);
                            break;
                        case "*":
                            resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                      * Double.parseDouble(operande1);
                            break;
                        case "/" :
                            if (resultatEnCoursText.equals("0"))
                            {
                                Toast.makeText(this, "Division par 0 impossible", Toast.LENGTH_LONG).show();
                                return;
                            }
                            resultatEnCours = Double.parseDouble(operande1)
                                                      / Double.parseDouble(resultatEnCoursText);
                            break;
                        default:
                            Toast.makeText(this, "Veuillez entrer le 2eme operande", Toast.LENGTH_LONG).show();
                            return;
                    }

                    signe = "/";
                    operande1 = ""+resultatEnCours;
                    resultatEnCoursText = ""+resultatEnCours+"/";
                    resultat2.setText(resultatEnCoursText);
                    resultatEnCoursText = "0";
                    resultat.setText(resultatEnCoursText);
                }
                break;
            case R.id.buttonPoint :
                if (!resultatEnCoursText.contains(".")){
                    resultatEnCoursText = resultat.getText().toString();
                    if (resultatEnCoursText.equals("0")){
                        resultatEnCoursText += bPoint.getText().toString();;
                    }
                    else if (resultatEnCoursText.equals("-0")){
                        resultatEnCoursText += bPoint.getText().toString();;
                    }
                    else {
                        resultatEnCoursText += bPoint.getText().toString();
                    }
                    resultat.setText(resultatEnCoursText);
                }
                else {
                    Toast.makeText(this, "Veuillez mettre 1 seul point", Toast.LENGTH_LONG).show();
                    return;
                }
                break;
            case R.id.buttonClear :
                premierErOperande = true;
                resultat.setText("0");
                resultat2.setText("");
                break;
            case R.id.buttonEgale :
                switch (signe)
                {
                    case "+":
                        resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                  + Double.parseDouble(operande1);
                        break;
                    case "-":
                        resultatEnCours = Double.parseDouble(operande1)
                                                  - Double.parseDouble(resultatEnCoursText);
                        break;
                    case "/":
                        if (resultatEnCoursText.equals("0"))
                        {
                            Toast.makeText(this, "Division par 0 impossible", Toast.LENGTH_LONG).show();
                            return;
                        }
                        resultatEnCours = Double.parseDouble(operande1)
                                                  / Double.parseDouble(resultatEnCoursText);
                        break;
                    case "*" :
                        resultatEnCours = Double.parseDouble(resultatEnCoursText)
                                                  * Double.parseDouble(operande1);
                        break;
                    default:
                        Toast.makeText(this, "Veuillez entrer le 2eme operande", Toast.LENGTH_LONG).show();
                        return;
                }
                resultatEnCoursText = ""+resultatEnCours;
                resultat.setText("0");
                resultat2.setText(resultatEnCoursText);
                premierErOperande = true;
                break;
        }
    }
}
