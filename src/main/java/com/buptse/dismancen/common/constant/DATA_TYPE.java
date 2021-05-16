package com.buptse.dismancen.common.constant;

import java.util.*;

public enum DATA_TYPE {

    JSON(new HashSet<String>(Arrays.asList("JSON","json"))),
    XML(new HashSet<String>(Arrays.asList("XML","xml")));

    private HashSet<String> type;

    DATA_TYPE(HashSet<String> type) {
        this.type = type;
    }

    public HashSet<String> getType() {
        return type;
    }

    public void setType(HashSet<String> type) {
        this.type = type;
    }


}
