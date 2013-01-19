/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package kr.co.vcnc.haeinsa.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RowLock implements org.apache.thrift.TBase<RowLock, RowLock._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RowLock");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COMMIT_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("commitTimestamp", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TIMEOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeout", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField PRIMARY_FIELD_DESC = new org.apache.thrift.protocol.TField("primary", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField SECONDARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("secondaries", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField PUTS_FIELD_DESC = new org.apache.thrift.protocol.TField("puts", org.apache.thrift.protocol.TType.LIST, (short)7);
  private static final org.apache.thrift.protocol.TField DELETES_FIELD_DESC = new org.apache.thrift.protocol.TField("deletes", org.apache.thrift.protocol.TType.LIST, (short)8);

  public int version;
  /**
   * 
   * @see RowState
   */
  public RowState state;
  public long commitTimestamp;
  public long timeout;
  public RowKey primary;
  public List<RowKey> secondaries;
  public List<CellKey> puts;
  public List<CellKey> deletes;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VERSION((short)1, "version"),
    /**
     * 
     * @see RowState
     */
    STATE((short)2, "state"),
    COMMIT_TIMESTAMP((short)3, "commitTimestamp"),
    TIMEOUT((short)4, "timeout"),
    PRIMARY((short)5, "primary"),
    SECONDARIES((short)6, "secondaries"),
    PUTS((short)7, "puts"),
    DELETES((short)8, "deletes");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION
          return VERSION;
        case 2: // STATE
          return STATE;
        case 3: // COMMIT_TIMESTAMP
          return COMMIT_TIMESTAMP;
        case 4: // TIMEOUT
          return TIMEOUT;
        case 5: // PRIMARY
          return PRIMARY;
        case 6: // SECONDARIES
          return SECONDARIES;
        case 7: // PUTS
          return PUTS;
        case 8: // DELETES
          return DELETES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VERSION_ISSET_ID = 0;
  private static final int __COMMITTIMESTAMP_ISSET_ID = 1;
  private static final int __TIMEOUT_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RowState.class)));
    tmpMap.put(_Fields.COMMIT_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("commitTimestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TIMEOUT, new org.apache.thrift.meta_data.FieldMetaData("timeout", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRIMARY, new org.apache.thrift.meta_data.FieldMetaData("primary", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RowKey.class)));
    tmpMap.put(_Fields.SECONDARIES, new org.apache.thrift.meta_data.FieldMetaData("secondaries", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RowKey.class))));
    tmpMap.put(_Fields.PUTS, new org.apache.thrift.meta_data.FieldMetaData("puts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CellKey.class))));
    tmpMap.put(_Fields.DELETES, new org.apache.thrift.meta_data.FieldMetaData("deletes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CellKey.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RowLock.class, metaDataMap);
  }

  public RowLock() {
  }

  public RowLock(
    int version,
    RowState state,
    long commitTimestamp)
  {
    this();
    this.version = version;
    setVersionIsSet(true);
    this.state = state;
    this.commitTimestamp = commitTimestamp;
    setCommitTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RowLock(RowLock other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.version = other.version;
    if (other.isSetState()) {
      this.state = other.state;
    }
    this.commitTimestamp = other.commitTimestamp;
    this.timeout = other.timeout;
    if (other.isSetPrimary()) {
      this.primary = new RowKey(other.primary);
    }
    if (other.isSetSecondaries()) {
      List<RowKey> __this__secondaries = new ArrayList<RowKey>();
      for (RowKey other_element : other.secondaries) {
        __this__secondaries.add(new RowKey(other_element));
      }
      this.secondaries = __this__secondaries;
    }
    if (other.isSetPuts()) {
      List<CellKey> __this__puts = new ArrayList<CellKey>();
      for (CellKey other_element : other.puts) {
        __this__puts.add(new CellKey(other_element));
      }
      this.puts = __this__puts;
    }
    if (other.isSetDeletes()) {
      List<CellKey> __this__deletes = new ArrayList<CellKey>();
      for (CellKey other_element : other.deletes) {
        __this__deletes.add(new CellKey(other_element));
      }
      this.deletes = __this__deletes;
    }
  }

  public RowLock deepCopy() {
    return new RowLock(this);
  }

  @Override
  public void clear() {
    setVersionIsSet(false);
    this.version = 0;
    this.state = null;
    setCommitTimestampIsSet(false);
    this.commitTimestamp = 0;
    setTimeoutIsSet(false);
    this.timeout = 0;
    this.primary = null;
    this.secondaries = null;
    this.puts = null;
    this.deletes = null;
  }

  public int getVersion() {
    return this.version;
  }

  public RowLock setVersion(int version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bit_vector.clear(__VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return __isset_bit_vector.get(__VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bit_vector.set(__VERSION_ISSET_ID, value);
  }

  /**
   * 
   * @see RowState
   */
  public RowState getState() {
    return this.state;
  }

  /**
   * 
   * @see RowState
   */
  public RowLock setState(RowState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public long getCommitTimestamp() {
    return this.commitTimestamp;
  }

  public RowLock setCommitTimestamp(long commitTimestamp) {
    this.commitTimestamp = commitTimestamp;
    setCommitTimestampIsSet(true);
    return this;
  }

  public void unsetCommitTimestamp() {
    __isset_bit_vector.clear(__COMMITTIMESTAMP_ISSET_ID);
  }

  /** Returns true if field commitTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetCommitTimestamp() {
    return __isset_bit_vector.get(__COMMITTIMESTAMP_ISSET_ID);
  }

  public void setCommitTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__COMMITTIMESTAMP_ISSET_ID, value);
  }

  public long getTimeout() {
    return this.timeout;
  }

  public RowLock setTimeout(long timeout) {
    this.timeout = timeout;
    setTimeoutIsSet(true);
    return this;
  }

  public void unsetTimeout() {
    __isset_bit_vector.clear(__TIMEOUT_ISSET_ID);
  }

  /** Returns true if field timeout is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeout() {
    return __isset_bit_vector.get(__TIMEOUT_ISSET_ID);
  }

  public void setTimeoutIsSet(boolean value) {
    __isset_bit_vector.set(__TIMEOUT_ISSET_ID, value);
  }

  public RowKey getPrimary() {
    return this.primary;
  }

  public RowLock setPrimary(RowKey primary) {
    this.primary = primary;
    return this;
  }

  public void unsetPrimary() {
    this.primary = null;
  }

  /** Returns true if field primary is set (has been assigned a value) and false otherwise */
  public boolean isSetPrimary() {
    return this.primary != null;
  }

  public void setPrimaryIsSet(boolean value) {
    if (!value) {
      this.primary = null;
    }
  }

  public int getSecondariesSize() {
    return (this.secondaries == null) ? 0 : this.secondaries.size();
  }

  public java.util.Iterator<RowKey> getSecondariesIterator() {
    return (this.secondaries == null) ? null : this.secondaries.iterator();
  }

  public void addToSecondaries(RowKey elem) {
    if (this.secondaries == null) {
      this.secondaries = new ArrayList<RowKey>();
    }
    this.secondaries.add(elem);
  }

  public List<RowKey> getSecondaries() {
    return this.secondaries;
  }

  public RowLock setSecondaries(List<RowKey> secondaries) {
    this.secondaries = secondaries;
    return this;
  }

  public void unsetSecondaries() {
    this.secondaries = null;
  }

  /** Returns true if field secondaries is set (has been assigned a value) and false otherwise */
  public boolean isSetSecondaries() {
    return this.secondaries != null;
  }

  public void setSecondariesIsSet(boolean value) {
    if (!value) {
      this.secondaries = null;
    }
  }

  public int getPutsSize() {
    return (this.puts == null) ? 0 : this.puts.size();
  }

  public java.util.Iterator<CellKey> getPutsIterator() {
    return (this.puts == null) ? null : this.puts.iterator();
  }

  public void addToPuts(CellKey elem) {
    if (this.puts == null) {
      this.puts = new ArrayList<CellKey>();
    }
    this.puts.add(elem);
  }

  public List<CellKey> getPuts() {
    return this.puts;
  }

  public RowLock setPuts(List<CellKey> puts) {
    this.puts = puts;
    return this;
  }

  public void unsetPuts() {
    this.puts = null;
  }

  /** Returns true if field puts is set (has been assigned a value) and false otherwise */
  public boolean isSetPuts() {
    return this.puts != null;
  }

  public void setPutsIsSet(boolean value) {
    if (!value) {
      this.puts = null;
    }
  }

  public int getDeletesSize() {
    return (this.deletes == null) ? 0 : this.deletes.size();
  }

  public java.util.Iterator<CellKey> getDeletesIterator() {
    return (this.deletes == null) ? null : this.deletes.iterator();
  }

  public void addToDeletes(CellKey elem) {
    if (this.deletes == null) {
      this.deletes = new ArrayList<CellKey>();
    }
    this.deletes.add(elem);
  }

  public List<CellKey> getDeletes() {
    return this.deletes;
  }

  public RowLock setDeletes(List<CellKey> deletes) {
    this.deletes = deletes;
    return this;
  }

  public void unsetDeletes() {
    this.deletes = null;
  }

  /** Returns true if field deletes is set (has been assigned a value) and false otherwise */
  public boolean isSetDeletes() {
    return this.deletes != null;
  }

  public void setDeletesIsSet(boolean value) {
    if (!value) {
      this.deletes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Integer)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((RowState)value);
      }
      break;

    case COMMIT_TIMESTAMP:
      if (value == null) {
        unsetCommitTimestamp();
      } else {
        setCommitTimestamp((Long)value);
      }
      break;

    case TIMEOUT:
      if (value == null) {
        unsetTimeout();
      } else {
        setTimeout((Long)value);
      }
      break;

    case PRIMARY:
      if (value == null) {
        unsetPrimary();
      } else {
        setPrimary((RowKey)value);
      }
      break;

    case SECONDARIES:
      if (value == null) {
        unsetSecondaries();
      } else {
        setSecondaries((List<RowKey>)value);
      }
      break;

    case PUTS:
      if (value == null) {
        unsetPuts();
      } else {
        setPuts((List<CellKey>)value);
      }
      break;

    case DELETES:
      if (value == null) {
        unsetDeletes();
      } else {
        setDeletes((List<CellKey>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return new Integer(getVersion());

    case STATE:
      return getState();

    case COMMIT_TIMESTAMP:
      return new Long(getCommitTimestamp());

    case TIMEOUT:
      return new Long(getTimeout());

    case PRIMARY:
      return getPrimary();

    case SECONDARIES:
      return getSecondaries();

    case PUTS:
      return getPuts();

    case DELETES:
      return getDeletes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case STATE:
      return isSetState();
    case COMMIT_TIMESTAMP:
      return isSetCommitTimestamp();
    case TIMEOUT:
      return isSetTimeout();
    case PRIMARY:
      return isSetPrimary();
    case SECONDARIES:
      return isSetSecondaries();
    case PUTS:
      return isSetPuts();
    case DELETES:
      return isSetDeletes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RowLock)
      return this.equals((RowLock)that);
    return false;
  }

  public boolean equals(RowLock that) {
    if (that == null)
      return false;

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_commitTimestamp = true;
    boolean that_present_commitTimestamp = true;
    if (this_present_commitTimestamp || that_present_commitTimestamp) {
      if (!(this_present_commitTimestamp && that_present_commitTimestamp))
        return false;
      if (this.commitTimestamp != that.commitTimestamp)
        return false;
    }

    boolean this_present_timeout = true && this.isSetTimeout();
    boolean that_present_timeout = true && that.isSetTimeout();
    if (this_present_timeout || that_present_timeout) {
      if (!(this_present_timeout && that_present_timeout))
        return false;
      if (this.timeout != that.timeout)
        return false;
    }

    boolean this_present_primary = true && this.isSetPrimary();
    boolean that_present_primary = true && that.isSetPrimary();
    if (this_present_primary || that_present_primary) {
      if (!(this_present_primary && that_present_primary))
        return false;
      if (!this.primary.equals(that.primary))
        return false;
    }

    boolean this_present_secondaries = true && this.isSetSecondaries();
    boolean that_present_secondaries = true && that.isSetSecondaries();
    if (this_present_secondaries || that_present_secondaries) {
      if (!(this_present_secondaries && that_present_secondaries))
        return false;
      if (!this.secondaries.equals(that.secondaries))
        return false;
    }

    boolean this_present_puts = true && this.isSetPuts();
    boolean that_present_puts = true && that.isSetPuts();
    if (this_present_puts || that_present_puts) {
      if (!(this_present_puts && that_present_puts))
        return false;
      if (!this.puts.equals(that.puts))
        return false;
    }

    boolean this_present_deletes = true && this.isSetDeletes();
    boolean that_present_deletes = true && that.isSetDeletes();
    if (this_present_deletes || that_present_deletes) {
      if (!(this_present_deletes && that_present_deletes))
        return false;
      if (!this.deletes.equals(that.deletes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(RowLock other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    RowLock typedOther = (RowLock)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetState()).compareTo(typedOther.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, typedOther.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCommitTimestamp()).compareTo(typedOther.isSetCommitTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommitTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commitTimestamp, typedOther.commitTimestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeout()).compareTo(typedOther.isSetTimeout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeout, typedOther.timeout);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPrimary()).compareTo(typedOther.isSetPrimary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrimary()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.primary, typedOther.primary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecondaries()).compareTo(typedOther.isSetSecondaries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecondaries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secondaries, typedOther.secondaries);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPuts()).compareTo(typedOther.isSetPuts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPuts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.puts, typedOther.puts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeletes()).compareTo(typedOther.isSetDeletes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeletes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deletes, typedOther.deletes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // VERSION
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.version = iprot.readI32();
            setVersionIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // STATE
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.state = RowState.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // COMMIT_TIMESTAMP
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.commitTimestamp = iprot.readI64();
            setCommitTimestampIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // TIMEOUT
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.timeout = iprot.readI64();
            setTimeoutIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PRIMARY
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.primary = new RowKey();
            this.primary.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // SECONDARIES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              this.secondaries = new ArrayList<RowKey>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                RowKey _elem2;
                _elem2 = new RowKey();
                _elem2.read(iprot);
                this.secondaries.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // PUTS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
              this.puts = new ArrayList<CellKey>(_list3.size);
              for (int _i4 = 0; _i4 < _list3.size; ++_i4)
              {
                CellKey _elem5;
                _elem5 = new CellKey();
                _elem5.read(iprot);
                this.puts.add(_elem5);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // DELETES
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
              this.deletes = new ArrayList<CellKey>(_list6.size);
              for (int _i7 = 0; _i7 < _list6.size; ++_i7)
              {
                CellKey _elem8;
                _elem8 = new CellKey();
                _elem8.read(iprot);
                this.deletes.add(_elem8);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetVersion()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetCommitTimestamp()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'commitTimestamp' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(VERSION_FIELD_DESC);
    oprot.writeI32(this.version);
    oprot.writeFieldEnd();
    if (this.state != null) {
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeI32(this.state.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(COMMIT_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.commitTimestamp);
    oprot.writeFieldEnd();
    if (isSetTimeout()) {
      oprot.writeFieldBegin(TIMEOUT_FIELD_DESC);
      oprot.writeI64(this.timeout);
      oprot.writeFieldEnd();
    }
    if (this.primary != null) {
      if (isSetPrimary()) {
        oprot.writeFieldBegin(PRIMARY_FIELD_DESC);
        this.primary.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.secondaries != null) {
      if (isSetSecondaries()) {
        oprot.writeFieldBegin(SECONDARIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.secondaries.size()));
          for (RowKey _iter9 : this.secondaries)
          {
            _iter9.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.puts != null) {
      if (isSetPuts()) {
        oprot.writeFieldBegin(PUTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.puts.size()));
          for (CellKey _iter10 : this.puts)
          {
            _iter10.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.deletes != null) {
      if (isSetDeletes()) {
        oprot.writeFieldBegin(DELETES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, this.deletes.size()));
          for (CellKey _iter11 : this.deletes)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RowLock(");
    boolean first = true;

    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("commitTimestamp:");
    sb.append(this.commitTimestamp);
    first = false;
    if (isSetTimeout()) {
      if (!first) sb.append(", ");
      sb.append("timeout:");
      sb.append(this.timeout);
      first = false;
    }
    if (isSetPrimary()) {
      if (!first) sb.append(", ");
      sb.append("primary:");
      if (this.primary == null) {
        sb.append("null");
      } else {
        sb.append(this.primary);
      }
      first = false;
    }
    if (isSetSecondaries()) {
      if (!first) sb.append(", ");
      sb.append("secondaries:");
      if (this.secondaries == null) {
        sb.append("null");
      } else {
        sb.append(this.secondaries);
      }
      first = false;
    }
    if (isSetPuts()) {
      if (!first) sb.append(", ");
      sb.append("puts:");
      if (this.puts == null) {
        sb.append("null");
      } else {
        sb.append(this.puts);
      }
      first = false;
    }
    if (isSetDeletes()) {
      if (!first) sb.append(", ");
      sb.append("deletes:");
      if (this.deletes == null) {
        sb.append("null");
      } else {
        sb.append(this.deletes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'version' because it's a primitive and you chose the non-beans generator.
    if (state == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'commitTimestamp' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
