package com.example.Addition.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.Addition.dto.request.AdditionRequest;
import com.example.Addition.dto.response.AdditionResponse;
import com.example.Addition.entity.AdditionEntity;
import com.example.Addition.repository.AdditionRepository;

@Service
public class AdditionService {
    private  final AdditionRepository additionRepository;

    public AdditionService(AdditionRepository additionRepository) {
        this.additionRepository = additionRepository;
    }

    public AdditionResponse calculation(AdditionRequest request){
       
       Integer a = request.getA();
       Integer b=request.getB();
       Integer c=a+b;

       AdditionEntity additionEntity = new AdditionEntity();

       additionEntity.setA(a);
       additionEntity.setB(b);
       additionEntity.setC(c);

       AdditionEntity saved = additionRepository.save(additionEntity);

       AdditionResponse additionResponse = new AdditionResponse();
       
       additionResponse.setA(saved.getA());
       additionResponse.setB(saved.getB());
       additionResponse.setC(saved.getC());
       

       return  additionResponse;


    }
   public List<AdditionResponse> getEveryAddition() {

    List<AdditionEntity> additionEntities = additionRepository.findAll();

    return additionEntities.stream()
            .map(add -> {
                AdditionResponse res = new AdditionResponse();
                res.setA(add.getA());
                res.setB(add.getB());
                res.setC(add.getC()); 
                return res; 
            })
            .collect(Collectors.toList());
}

}
