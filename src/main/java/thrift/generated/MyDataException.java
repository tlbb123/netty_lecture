///**
// * Autogenerated by Thrift Compiler (0.12.0)
// *
// * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
// *  @generated
// */
//package thrift.generated;
//
//@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
//@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-06-14")
//public class MyDataException extends org.apache.thrift.TException implements org.apache.thrift.TBase<MyDataException, MyDataException._Fields>, java.io.Serializable, Cloneable, Comparable<MyDataException> {
//  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MyDataException");
//
//  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
//  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)2);
//
//  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MyDataExceptionStandardSchemeFactory();
//  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MyDataExceptionTupleSchemeFactory();
//
//  public long id; // required
//  public @org.apache.thrift.annotation.Nullable String message; // optional
//
//  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
//  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
//    ID((short)1, "id"),
//    MESSAGE((short)2, "message");
//
//    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();
//
//    static {
//      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
//        byName.put(field.getFieldName(), field);
//      }
//    }
//
//    /**
//     * Find the _Fields constant that matches fieldId, or null if its not found.
//     */
//    @org.apache.thrift.annotation.Nullable
//    public static _Fields findByThriftId(int fieldId) {
//      switch(fieldId) {
//        case 1: // ID
//          return ID;
//        case 2: // MESSAGE
//          return MESSAGE;
//        default:
//          return null;
//      }
//    }
//
//    /**
//     * Find the _Fields constant that matches fieldId, throwing an exception
//     * if it is not found.
//     */
//    public static _Fields findByThriftIdOrThrow(int fieldId) {
//      _Fields fields = findByThriftId(fieldId);
//      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
//      return fields;
//    }
//
//    /**
//     * Find the _Fields constant that matches name, or null if its not found.
//     */
//    @org.apache.thrift.annotation.Nullable
//    public static _Fields findByName(String name) {
//      return byName.get(name);
//    }
//
//    private final short _thriftId;
//    private final String _fieldName;
//
//    _Fields(short thriftId, String fieldName) {
//      _thriftId = thriftId;
//      _fieldName = fieldName;
//    }
//
//    public short getThriftFieldId() {
//      return _thriftId;
//    }
//
//    public String getFieldName() {
//      return _fieldName;
//    }
//  }
//
//  // isset id assignments
//  private static final int __ID_ISSET_ID = 0;
//  private byte __isset_bitfield = 0;
//  private static final _Fields optionals[] = {_Fields.MESSAGE};
//  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
//  static {
//    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
//    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED,
//        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
//    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL,
//        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
//    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
//    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MyDataException.class, metaDataMap);
//  }
//
//  public MyDataException() {
//  }
//
//  public MyDataException(
//    long id)
//  {
//    this();
//    this.id = id;
//    setIdIsSet(true);
//  }
//
//  /**
//   * Performs a deep copy on <i>other</i>.
//   */
//  public MyDataException(MyDataException other) {
//    __isset_bitfield = other.__isset_bitfield;
//    this.id = other.id;
//    if (other.isSetMessage()) {
//      this.message = other.message;
//    }
//  }
//
//  public MyDataException deepCopy() {
//    return new MyDataException(this);
//  }
//
//  @Override
//  public void clear() {
//    setIdIsSet(false);
//    this.id = 0;
//    this.message = null;
//  }
//
//  public long getId() {
//    return this.id;
//  }
//
//  public MyDataException setId(long id) {
//    this.id = id;
//    setIdIsSet(true);
//    return this;
//  }
//
//  public void unsetId() {
//    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
//  }
//
//  /** Returns true if field id is set (has been assigned a value) and false otherwise */
//  public boolean isSetId() {
//    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
//  }
//
//  public void setIdIsSet(boolean value) {
//    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
//  }
//
//  @org.apache.thrift.annotation.Nullable
//  public String getMessage() {
//    return this.message;
//  }
//
//  public MyDataException setMessage(@org.apache.thrift.annotation.Nullable String message) {
//    this.message = message;
//    return this;
//  }
//
//  public void unsetMessage() {
//    this.message = null;
//  }
//
//  /** Returns true if field message is set (has been assigned a value) and false otherwise */
//  public boolean isSetMessage() {
//    return this.message != null;
//  }
//
//  public void setMessageIsSet(boolean value) {
//    if (!value) {
//      this.message = null;
//    }
//  }
//
//  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
//    switch (field) {
//    case ID:
//      if (value == null) {
//        unsetId();
//      } else {
//        setId((Long)value);
//      }
//      break;
//
//    case MESSAGE:
//      if (value == null) {
//        unsetMessage();
//      } else {
//        setMessage((String)value);
//      }
//      break;
//
//    }
//  }
//
//  @org.apache.thrift.annotation.Nullable
//  public Object getFieldValue(_Fields field) {
//    switch (field) {
//    case ID:
//      return getId();
//
//    case MESSAGE:
//      return getMessage();
//
//    }
//    throw new IllegalStateException();
//  }
//
//  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
//  public boolean isSet(_Fields field) {
//    if (field == null) {
//      throw new IllegalArgumentException();
//    }
//
//    switch (field) {
//    case ID:
//      return isSetId();
//    case MESSAGE:
//      return isSetMessage();
//    }
//    throw new IllegalStateException();
//  }
//
//  @Override
//  public boolean equals(Object that) {
//    if (that == null)
//      return false;
//    if (that instanceof MyDataException)
//      return this.equals((MyDataException)that);
//    return false;
//  }
//
//  public boolean equals(MyDataException that) {
//    if (that == null)
//      return false;
//    if (this == that)
//      return true;
//
//    boolean this_present_id = true;
//    boolean that_present_id = true;
//    if (this_present_id || that_present_id) {
//      if (!(this_present_id && that_present_id))
//        return false;
//      if (this.id != that.id)
//        return false;
//    }
//
//    boolean this_present_message = true && this.isSetMessage();
//    boolean that_present_message = true && that.isSetMessage();
//    if (this_present_message || that_present_message) {
//      if (!(this_present_message && that_present_message))
//        return false;
//      if (!this.message.equals(that.message))
//        return false;
//    }
//
//    return true;
//  }
//
//  @Override
//  public int hashCode() {
//    int hashCode = 1;
//
//    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);
//
//    hashCode = hashCode * 8191 + ((isSetMessage()) ? 131071 : 524287);
//    if (isSetMessage())
//      hashCode = hashCode * 8191 + message.hashCode();
//
//    return hashCode;
//  }
//
//  @Override
//  public int compareTo(MyDataException other) {
//    if (!getClass().equals(other.getClass())) {
//      return getClass().getName().compareTo(other.getClass().getName());
//    }
//
//    int lastComparison = 0;
//
//    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
//    if (lastComparison != 0) {
//      return lastComparison;
//    }
//    if (isSetId()) {
//      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
//      if (lastComparison != 0) {
//        return lastComparison;
//      }
//    }
//    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
//    if (lastComparison != 0) {
//      return lastComparison;
//    }
//    if (isSetMessage()) {
//      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
//      if (lastComparison != 0) {
//        return lastComparison;
//      }
//    }
//    return 0;
//  }
//
//  @org.apache.thrift.annotation.Nullable
//  public _Fields fieldForId(int fieldId) {
//    return _Fields.findByThriftId(fieldId);
//  }
//
//  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
//    scheme(iprot).read(iprot, this);
//  }
//
//  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
//    scheme(oprot).write(oprot, this);
//  }
//
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder("MyDataException(");
//    boolean first = true;
//
//    sb.append("id:");
//    sb.append(this.id);
//    first = false;
//    if (isSetMessage()) {
//      if (!first) sb.append(", ");
//      sb.append("message:");
//      if (this.message == null) {
//        sb.append("null");
//      } else {
//        sb.append(this.message);
//      }
//      first = false;
//    }
//    sb.append(")");
//    return sb.toString();
//  }
//
//  public void validate() throws org.apache.thrift.TException {
//    // check for required fields
//    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
//    // check for sub-struct validity
//  }
//
//  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
//    try {
//      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
//    } catch (org.apache.thrift.TException te) {
//      throw new java.io.IOException(te);
//    }
//  }
//
//  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
//    try {
//      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
//      __isset_bitfield = 0;
//      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
//    } catch (org.apache.thrift.TException te) {
//      throw new java.io.IOException(te);
//    }
//  }
//
//  private static class MyDataExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
//    public MyDataExceptionStandardScheme getScheme() {
//      return new MyDataExceptionStandardScheme();
//    }
//  }
//
//  private static class MyDataExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<MyDataException> {
//
//    public void read(org.apache.thrift.protocol.TProtocol iprot, MyDataException struct) throws org.apache.thrift.TException {
//      org.apache.thrift.protocol.TField schemeField;
//      iprot.readStructBegin();
//      while (true)
//      {
//        schemeField = iprot.readFieldBegin();
//        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
//          break;
//        }
//        switch (schemeField.id) {
//          case 1: // ID
//            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
//              struct.id = iprot.readI64();
//              struct.setIdIsSet(true);
//            } else {
//              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//            }
//            break;
//          case 2: // MESSAGE
//            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
//              struct.message = iprot.readString();
//              struct.setMessageIsSet(true);
//            } else {
//              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//            }
//            break;
//          default:
//            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
//        }
//        iprot.readFieldEnd();
//      }
//      iprot.readStructEnd();
//
//      // check for required fields of primitive type, which can't be checked in the validate method
//      if (!struct.isSetId()) {
//        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
//      }
//      struct.validate();
//    }
//
//    public void write(org.apache.thrift.protocol.TProtocol oprot, MyDataException struct) throws org.apache.thrift.TException {
//      struct.validate();
//
//      oprot.writeStructBegin(STRUCT_DESC);
//      oprot.writeFieldBegin(ID_FIELD_DESC);
//      oprot.writeI64(struct.id);
//      oprot.writeFieldEnd();
//      if (struct.message != null) {
//        if (struct.isSetMessage()) {
//          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
//          oprot.writeString(struct.message);
//          oprot.writeFieldEnd();
//        }
//      }
//      oprot.writeFieldStop();
//      oprot.writeStructEnd();
//    }
//
//  }
//
//  private static class MyDataExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
//    public MyDataExceptionTupleScheme getScheme() {
//      return new MyDataExceptionTupleScheme();
//    }
//  }
//
//  private static class MyDataExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<MyDataException> {
//
//    @Override
//    public void write(org.apache.thrift.protocol.TProtocol prot, MyDataException struct) throws org.apache.thrift.TException {
//      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
//      oprot.writeI64(struct.id);
//      java.util.BitSet optionals = new java.util.BitSet();
//      if (struct.isSetMessage()) {
//        optionals.set(0);
//      }
//      oprot.writeBitSet(optionals, 1);
//      if (struct.isSetMessage()) {
//        oprot.writeString(struct.message);
//      }
//    }
//
//    @Override
//    public void read(org.apache.thrift.protocol.TProtocol prot, MyDataException struct) throws org.apache.thrift.TException {
//      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
//      struct.id = iprot.readI64();
//      struct.setIdIsSet(true);
//      java.util.BitSet incoming = iprot.readBitSet(1);
//      if (incoming.get(0)) {
//        struct.message = iprot.readString();
//        struct.setMessageIsSet(true);
//      }
//    }
//  }
//
//  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
//    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
//  }
//}
//