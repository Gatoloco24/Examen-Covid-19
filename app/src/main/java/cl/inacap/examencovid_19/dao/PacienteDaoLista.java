package cl.inacap.examencovid_19.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.examencovid_19.dto.Paciente;

public class PacienteDaoLista implements PacienteDao {

    private static List<Paciente> pacientes = new ArrayList<>();

    private static PacienteDaoLista instancia;

    public static PacienteDaoLista getInstance(){
        if(instancia == null){
           instancia = new PacienteDaoLista();
        }
        return instancia;
    }

    private PacienteDaoLista(){
        Paciente p = new Paciente();
        //aca faltan los datos interiores para agregar
        p.setRut(193368956);
        p.setNombre("Diego");
        p.setApellido("Gutierrez");
        p.setTemperatura(36);
        p.setPresion(78);
        pacientes.add(p);
    }
    @Override
    public Paciente save(Paciente p) {
        return null;
    }

    @Override
    public List<Paciente> getAll() {
        return null;
    }
}
