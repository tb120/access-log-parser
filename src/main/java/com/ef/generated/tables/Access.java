/*
 * This file is generated by jOOQ.
 */
package com.ef.generated.tables;


import com.ef.generated.Indexes;
import com.ef.generated.Keys;
import com.ef.generated.Logs;
import com.ef.generated.tables.records.AccessRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Access extends TableImpl<AccessRecord> {

    private static final long serialVersionUID = -1286481593;

    /**
     * The reference instance of <code>logs.access</code>
     */
    public static final Access ACCESS = new Access();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccessRecord> getRecordType() {
        return AccessRecord.class;
    }

    /**
     * The column <code>logs.access.ip</code>.
     */
    public final TableField<AccessRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>logs.access.request</code>.
     */
    public final TableField<AccessRecord, String> REQUEST = createField("request", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>logs.access.status</code>.
     */
    public final TableField<AccessRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>logs.access.userAgent</code>.
     */
    public final TableField<AccessRecord, String> USERAGENT = createField("userAgent", org.jooq.impl.SQLDataType.VARCHAR(2024).nullable(false), this, "");

    /**
     * The column <code>logs.access.id</code>.
     */
    public final TableField<AccessRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>logs.access.date</code>.
     */
    public final TableField<AccessRecord, Timestamp> DATE = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>logs.access</code> table reference
     */
    public Access() {
        this(DSL.name("access"), null);
    }

    /**
     * Create an aliased <code>logs.access</code> table reference
     */
    public Access(String alias) {
        this(DSL.name(alias), ACCESS);
    }

    /**
     * Create an aliased <code>logs.access</code> table reference
     */
    public Access(Name alias) {
        this(alias, ACCESS);
    }

    private Access(Name alias, Table<AccessRecord> aliased) {
        this(alias, aliased, null);
    }

    private Access(Name alias, Table<AccessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Access(Table<O> child, ForeignKey<O, AccessRecord> key) {
        super(child, key, ACCESS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Logs.LOGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ACCESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AccessRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AccessRecord> getPrimaryKey() {
        return Keys.KEY_ACCESS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AccessRecord>> getKeys() {
        return Arrays.<UniqueKey<AccessRecord>>asList(Keys.KEY_ACCESS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Access as(String alias) {
        return new Access(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Access as(Name alias) {
        return new Access(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Access rename(String name) {
        return new Access(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Access rename(Name name) {
        return new Access(name, null);
    }
}
