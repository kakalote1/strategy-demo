package com.wsy.strategydemo.factory;

import com.wsy.strategydemo.abstracts.CoderAbstract;
import com.wsy.strategydemo.enums.NameEnum;
import com.wsy.strategydemo.exception.CoderException;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CoderFactory {

    @Resource
    Map<String, CoderAbstract> coderStrategyMap = new ConcurrentHashMap<>(NameEnum.values().length);

    public CoderAbstract getCoderStrategyMap(String code) {
        CoderAbstract coderAbstract = coderStrategyMap.get(code);
        if (Objects.isNull(coderAbstract)) {
            throw new CoderException("人没了？？？？");
        }
        return coderAbstract;
    }
}
