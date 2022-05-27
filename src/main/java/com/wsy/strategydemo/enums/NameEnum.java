package com.wsy.strategydemo.enums;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum NameEnum {

    CBB("chenbinbin", "陈斌斌"),
    WSY("wangsiyuan", "王思远");

    private final String code;

    private final String name;
    NameEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getNameByCode(String code) {
       return Arrays.stream(NameEnum.values()).filter(e -> e.code.equals(code)).map(NameEnum::getName).collect(Collectors.joining());
    }
}
