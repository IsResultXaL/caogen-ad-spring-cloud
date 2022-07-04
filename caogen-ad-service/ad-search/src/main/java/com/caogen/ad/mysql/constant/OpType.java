package com.caogen.ad.mysql.constant;

import com.github.shyiko.mysql.binlog.event.EventType;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 19:35
 */
public enum OpType {

    ADD,
    UPDATE,
    DELETE,
    OTHER;

    public static OpType to(EventType eventType) {
        switch (eventType) {
            case EXT_WRITE_ROWS:
                return ADD;
            case EXT_UPDATE_ROWS:
                return UPDATE;
            case EXT_DELETE_ROWS:
                return DELETE;
            default:
                return OTHER;
        }
    }
}
