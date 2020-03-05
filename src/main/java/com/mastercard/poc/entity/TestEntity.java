package com.mastercard.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "mctesttbl", schema = "mcdbuser")
public class TestEntity {

    @Id
    @Column(name = "FIELD1")
    String field1;


    @Column(name = "FIELD2")
    String field2;
    @Column(name = "FIELD3")
    Long field3;
    @Column(name = "FIELD4")
    String field4;
    @Column(name = "FIELD5")
    Long field5;
    @Column(name = "FIELD6")
    String field6;
    @Column(name = "CREATE_TIMESTAMP")
    BigDecimal createTimeStamp;


    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public Long getField3() {
        return field3;
    }

    public void setField3(Long field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public Long getField5() {
        return field5;
    }

    public void setField5(Long field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public BigDecimal getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(BigDecimal createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }
}
