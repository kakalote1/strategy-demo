package com.wsy.strategydemo.service;

import com.wsy.strategydemo.abstracts.CoderAbstract;
import com.wsy.strategydemo.dto.NameDTO;
import com.wsy.strategydemo.enums.NameEnum;
import com.wsy.strategydemo.factory.CoderFactory;
import org.springframework.stereotype.Service;

@Service
public class CoderService {

    private final CoderFactory coderFactory;

    public CoderService(CoderFactory coderFactory) {
        this.coderFactory = coderFactory;
    }

    public void active(NameDTO nameDTO) {
        CoderAbstract coderAbstract = coderFactory.getCoderStrategyMap(nameDTO.getName()).setName(NameEnum.getNameByCode(nameDTO.getName()));
        coderAbstract.work();
        coderAbstract.rest();
    }
}
