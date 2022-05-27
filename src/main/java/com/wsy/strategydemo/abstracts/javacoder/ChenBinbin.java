package com.wsy.strategydemo.abstracts.javacoder;

import com.wsy.strategydemo.abstracts.CoderAbstract;
import org.springframework.stereotype.Component;

@Component("chenbinbin")
public class ChenBinbin extends CoderAbstract {
    @Override
    public void work() {
        super.work();
        System.out.println("但是是java代码");
    }

    @Override
    public void rest() {
        super.rest();
        System.out.println("睡得很香。。。。");
    }
}
