package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducersServicesRowSet {

    public static List<Producer> findByNameCallableStatement(String name){
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

}
