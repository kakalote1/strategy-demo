package com.wsy.strategydemo.abstracts.swiftcoder;

import com.wsy.strategydemo.abstracts.CoderAbstract;
import org.springframework.stereotype.Component;

@Component("wangsiyuan")
public class Wangsiyuan extends CoderAbstract {
    @Override
    public void work() {
        super.work();
        System.out.println("疯狂敲swift代码");
    }

    @Override
    public void rest() {
        super.rest();
        System.out.println("失眠辣。。。。");
    }
}
