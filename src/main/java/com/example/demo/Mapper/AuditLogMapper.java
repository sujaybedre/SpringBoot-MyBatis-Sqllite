package com.example.demo.Mapper;

import com.example.demo.Model.HelloModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AuditLogMapper {
    /*
    CREATE TABLE auditlog (
    id          INTEGER CONSTRAINT auditlog_pk PRIMARY KEY ASC AUTOINCREMENT,
    request     BLOB,
    response    BLOB,
    requestedby VARCHAR,
    createdate  VARCHAR
    );
     */
}
