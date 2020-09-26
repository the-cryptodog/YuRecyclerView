package com.yulibrary;

public class DemoModel implements BaseModel {

    public static final String TYPE = "DemoModel";
    String id = "";
    String content = "";

    @Override
    public String getType() {
        return TYPE;
    }
}
