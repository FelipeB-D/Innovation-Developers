package edu.udea.main.service;

import edu.udea.main.model.Enterprise;
import edu.udea.main.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnterpriseService {
    @Autowired
    EnterpriseRepository enterpriseRepository;

    public List<Enterprise> lookEnterprise(){
        List<Enterprise> enterprises = new ArrayList<Enterprise>();
        enterprises.addAll(enterpriseRepository.findAll());
        return enterprises;

    }
    public void makeEnterprise(Enterprise enterprise){
        enterpriseRepository.save(enterprise);
    }
    public void deleteEnterprise(Long id){
        enterpriseRepository.deleteById(id);
    }

}
