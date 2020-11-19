package cl.inacap.examencovid_19.adapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.examencovid_19.R;
import cl.inacap.examencovid_19.dto.Paciente;

public class PacienteListAdapter extends ArrayAdapter<Paciente> {
    private List<Paciente> pacientes ;
    private Activity activity;
    public PacienteListAdapter(@NonNull Activity context, int resource, @NonNull List<Paciente> objects) {
        super(context, resource, objects);
        this.pacientes = objects;
        this.activity = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.activity_paciente_list_view, null, true);
        //Aqui se carga el contenido del layout:
        TextView rut = fila.findViewById(R.id.rut_paciente);
        TextView nombre = fila.findViewById(R.id.nombre_paciente);
        TextView apellido = fila.findViewById(R.id.apellido_paciente);
        TextView temperatura = fila.findViewById(R.id.temperatura_paciente);
        TextView presion = fila.findViewById(R.id.presion_paciente);

        Paciente actual = pacientes.get(position);
        rut.setText(actual.getRut());
        nombre.setText(actual.getNombre());
        apellido.setText(actual.getApellido());
        temperatura.setText(actual.getTemperatura());
        presion.setText(actual.getPresion());

        return fila;
     }
}