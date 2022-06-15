package com.primihub.biz.constant;

import java.util.regex.Pattern;

public class DataConstant {
    public final static String FEDLEARNER_JOB_RUN = "http://fedlearner/job_api/run";
    public final static String MATCHES="[a-zA-Z]+";
    public final static String FIELD_NAME_AS="field_";
    // 模板
    public final static String FREEMARKER_PYTHON_PAHT= "disxgb.ftl";
    public final static String FREEMARKER_PYTHON_EN_PAHT= "disxgb_en.ftl";
    // python dataset host、guest
    public final static String PYTHON_LABEL_DATASET = "label_dataset";
    public final static String PYTHON_GUEST_DATASET = "guest_dataset";

    // 设置超时时间 5分钟
    public final static Integer UPDATE_MODEL_TIMEOUT = 300000;

    public final static Integer INSERT_DATA_TABLE_PAGESIZE = 1000;

    public final static Pattern RESOURCE_PATTERN_INTEGER = Pattern.compile("^-?\\d{1,9}$");
    public final static Pattern RESOURCE_PATTERN_LONG = Pattern.compile("^-?\\d{10,}$");
    public final static Pattern RESOURCE_PATTERN_DOUBLE = Pattern.compile("^-?\\d+\\.\\d+$");
    public final static Integer READ_DATA_ROW = 50;
    public static final Integer COPY_PAGE_NUM = 20;
}
