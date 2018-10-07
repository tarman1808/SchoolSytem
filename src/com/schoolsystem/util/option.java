package com.schoolsystem.util;

public enum option {

    Admin, Student, TSF;

    option(){}

    public String value(){
        return name();
    }

    public static option fromvalue(String v){
        return  valueOf(v);
    }
}
