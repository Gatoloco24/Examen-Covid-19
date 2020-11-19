package cl.inacap.examencovid_19.dao;

import java.util.List;

import cl.inacap.examencovid_19.dto.Paciente;

public interface PacienteDao {

    Paciente save(Paciente p);
    List<Paciente> getAll();

}
