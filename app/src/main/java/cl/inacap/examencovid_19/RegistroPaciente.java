package cl.inacap.examencovid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.examencovid_19.dao.PacienteDao;
import cl.inacap.examencovid_19.dao.PacienteDaoLista;
import cl.inacap.examencovid_19.dto.Paciente;

public class RegistroPaciente extends AppCompatActivity {

    private List<Paciente> pacientes;
    private PacienteDao pacientedao = PacienteDaoLista.getInstance();

    private EditText rut_EditText;
    private EditText nombre_EditText;
    private EditText apellido_EditText;
    private EditText temperatura_EditText;
    private EditText presion_EditText;
    private Button agregar_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_paciente);
        this.rut_EditText = findViewById(R.id.rut_paciente);
        this.nombre_EditText = findViewById(R.id.nombre_paciente);
        this.apellido_EditText = findViewById(R.id.apellido_paciente);
        this.temperatura_EditText = findViewById(R.id.temperatura_paciente);
        this.presion_EditText = findViewById(R.id.presion_paciente);
        this.agregar_Button = findViewById(R.id.button);
        this.agregar_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                List<String> errores = new ArrayList<>();
                if (rut_EditText==null || nombre_EditText==null || apellido_EditText==null
                    || temperatura_EditText==null || presion_EditText==null ){
                    errores.add("");
                }

                int rut;
                rut = Integer.parseInt(rut_EditText.getText().toString()) ;
                String nombre = nombre_EditText.getText().toString();
                String apellido = apellido_EditText.getText().toString();
                int temperatura;
                temperatura = Integer.parseInt(temperatura_EditText.getText().toString());
                int presion;
                presion = Integer.parseInt(presion_EditText.getText().toString());

                if (errores.isEmpty()){
                    Paciente p = new Paciente();
                    p.setRut(rut);
                    p.setNombre(nombre);
                    p.setApellido(apellido);
                    p.setTemperatura(temperatura);
                    p.setPresion(presion);
                    pacientes.add(p);



                }


            }

        });



    }

}