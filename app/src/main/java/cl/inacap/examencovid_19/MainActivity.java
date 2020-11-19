package cl.inacap.examencovid_19;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import cl.inacap.examencovid_19.adapter.PacienteListAdapter;
import cl.inacap.examencovid_19.dao.PacienteDao;
import cl.inacap.examencovid_19.dao.PacienteDaoLista;
import cl.inacap.examencovid_19.dto.Paciente;

public class MainActivity extends AppCompatActivity {

    private ListView pacienteListView;
    private PacienteListAdapter pacienteAdapter;



    private List<Paciente> pacientes;
    private PacienteDao pacienteDAO = PacienteDaoLista.getInstance();

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);

        this.pacientes = this.pacienteDAO.getAll();
        this.pacienteListView = findViewById(R.id.List_view);

        this.pacienteAdapter = new PacienteListAdapter(this,R.layout.activity_main,
                this.pacientes);


        this.pacienteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Paciente paciente = pacientes.get(i);

                Intent intent = new Intent(MainActivity.this,
                        PacienteListView.class);
                intent.putExtra("paciente", String.valueOf(paciente));
                startActivity(intent);

            }
        });

        this.btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrar = new Intent(MainActivity.this , RegistroPaciente.class);
                startActivity(registrar);
            }
        });


        }




}