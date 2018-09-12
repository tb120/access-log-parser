/*
 * This file is generated by jOOQ.
 */
package com.ef.generated.tables.records;


import com.ef.generated.tables.Violations;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViolationsRecord extends UpdatableRecordImpl<ViolationsRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 795753759;

    /**
     * Setter for <code>logs.violations.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>logs.violations.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>logs.violations.ip</code>.
     */
    public void setIp(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>logs.violations.ip</code>.
     */
    public String getIp() {
        return (String) get(1);
    }

    /**
     * Setter for <code>logs.violations.comment</code>.
     */
    public void setComment(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>logs.violations.comment</code>.
     */
    public String getComment() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Violations.VIOLATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Violations.VIOLATIONS.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Violations.VIOLATIONS.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViolationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViolationsRecord value2(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViolationsRecord value3(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViolationsRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViolationsRecord
     */
    public ViolationsRecord() {
        super(Violations.VIOLATIONS);
    }

    /**
     * Create a detached, initialised ViolationsRecord
     */
    public ViolationsRecord(Integer id, String ip, String comment) {
        super(Violations.VIOLATIONS);

        set(0, id);
        set(1, ip);
        set(2, comment);
    }
}
