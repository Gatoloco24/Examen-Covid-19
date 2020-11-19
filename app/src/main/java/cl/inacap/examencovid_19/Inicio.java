package cl.inacap.examencovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import java.util.ArrayList;
import java.util.List;

public class Inicio extends AppCompatActivity {

    EditText usuario_EditText;
    EditText password_EditText;


    public void Siguiente(View view){
        try{
            Intent siguiente = new Intent(this, MainActivity.class);
            startActivity(siguiente);
        }catch(Exception ex){

        }


    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        this.usuario_EditText = findViewById(R.id.usuario_txt);
        this.password_EditText = findViewById(R.id.password_txt);


        //Este metodo realiza el ingreso

        List<String> errores = new ArrayList<>();

        String rut = "";

        try {
            if (usuario_EditText.length() == 0 && usuario_EditText.length() > 8) {

                errores.add("debe ingresar un rut valido");
            }else{
                rut =  rut.toUpperCase();
                rut = rut.replace(".", "");
                rut = rut.replace("-", "");
                rut = usuario_EditText.getText().toString();



            }
        }catch (Exception ex){

        }

        /*char cadena0 = 0 ;
        char cadena1 = 0 ;
        char cadena2 = 0 ;
        char cadena3 = 0 ;

        cadena0= rut.charAt(0);
        cadena1= rut.charAt(1);
        cadena2= rut.charAt(2);
        cadena3= rut.charAt(3);
        String password = usuario_EditText.getText().toString();
        if (password.charAt(0) == cadena0 &&
                password.charAt(1) == cadena1 &&
                password.charAt(2) == cadena2 &&
                password.charAt(3) == cadena3 ){




        }*/
        rut = usuario_EditText.getText().toString();
        // String fecha = (dia+" / "+ mes + " / " + año);
        //String nombre_artista = EditText_artista.getText().toString();

        //String genero = Spinner_musica.getSelectedItem().toString();
    }


}