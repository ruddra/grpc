// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package org.example.models;

/**
 * Protobuf type {@code Person}
 */
public final class Person extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Person)
    PersonOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Person.newBuilder() to construct.
  private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Person() {
    name_ = "";
    car_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Person();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Person(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Int32Value.Builder subBuilder = null;
            if (age_ != null) {
              subBuilder = age_.toBuilder();
            }
            age_ = input.readMessage(com.google.protobuf.Int32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(age_);
              age_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            org.example.models.Address.Builder subBuilder = null;
            if (address_ != null) {
              subBuilder = address_.toBuilder();
            }
            address_ = input.readMessage(org.example.models.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(address_);
              address_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              car_ = new java.util.ArrayList<org.example.models.Car>();
              mutable_bitField0_ |= 0x00000001;
            }
            car_.add(
                input.readMessage(org.example.models.Car.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        car_ = java.util.Collections.unmodifiableList(car_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.models.PersonOuterClass.internal_static_Person_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.models.PersonOuterClass.internal_static_Person_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.models.Person.class, org.example.models.Person.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value age_;
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return Whether the age field is set.
   */
  @java.lang.Override
  public boolean hasAge() {
    return age_ != null;
  }
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return The age.
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getAge() {
    return age_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : age_;
  }
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder() {
    return getAge();
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private org.example.models.Address address_;
  /**
   * <code>.common.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.common.Address address = 3;</code>
   * @return The address.
   */
  @java.lang.Override
  public org.example.models.Address getAddress() {
    return address_ == null ? org.example.models.Address.getDefaultInstance() : address_;
  }
  /**
   * <code>.common.Address address = 3;</code>
   */
  @java.lang.Override
  public org.example.models.AddressOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int CAR_FIELD_NUMBER = 4;
  private java.util.List<org.example.models.Car> car_;
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.models.Car> getCarList() {
    return car_;
  }
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.models.CarOrBuilder> 
      getCarOrBuilderList() {
    return car_;
  }
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  @java.lang.Override
  public int getCarCount() {
    return car_.size();
  }
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  @java.lang.Override
  public org.example.models.Car getCar(int index) {
    return car_.get(index);
  }
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  @java.lang.Override
  public org.example.models.CarOrBuilder getCarOrBuilder(
      int index) {
    return car_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (age_ != null) {
      output.writeMessage(2, getAge());
    }
    if (address_ != null) {
      output.writeMessage(3, getAddress());
    }
    for (int i = 0; i < car_.size(); i++) {
      output.writeMessage(4, car_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (age_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAge());
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAddress());
    }
    for (int i = 0; i < car_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, car_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.models.Person)) {
      return super.equals(obj);
    }
    org.example.models.Person other = (org.example.models.Person) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasAge() != other.hasAge()) return false;
    if (hasAge()) {
      if (!getAge()
          .equals(other.getAge())) return false;
    }
    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (!getCarList()
        .equals(other.getCarList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasAge()) {
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge().hashCode();
    }
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    if (getCarCount() > 0) {
      hash = (37 * hash) + CAR_FIELD_NUMBER;
      hash = (53 * hash) + getCarList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.models.Person parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.models.Person parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.models.Person parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.models.Person parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.models.Person parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.models.Person parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.models.Person parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.models.Person parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.models.Person parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.models.Person parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.models.Person parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.models.Person parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.models.Person prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Person}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Person)
      org.example.models.PersonOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.models.PersonOuterClass.internal_static_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.models.PersonOuterClass.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.models.Person.class, org.example.models.Person.Builder.class);
    }

    // Construct using org.example.models.Person.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCarFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (ageBuilder_ == null) {
        age_ = null;
      } else {
        age_ = null;
        ageBuilder_ = null;
      }
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      if (carBuilder_ == null) {
        car_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        carBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.models.PersonOuterClass.internal_static_Person_descriptor;
    }

    @java.lang.Override
    public org.example.models.Person getDefaultInstanceForType() {
      return org.example.models.Person.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.models.Person build() {
      org.example.models.Person result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.models.Person buildPartial() {
      org.example.models.Person result = new org.example.models.Person(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (ageBuilder_ == null) {
        result.age_ = age_;
      } else {
        result.age_ = ageBuilder_.build();
      }
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      if (carBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          car_ = java.util.Collections.unmodifiableList(car_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.car_ = car_;
      } else {
        result.car_ = carBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.models.Person) {
        return mergeFrom((org.example.models.Person)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.models.Person other) {
      if (other == org.example.models.Person.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasAge()) {
        mergeAge(other.getAge());
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (carBuilder_ == null) {
        if (!other.car_.isEmpty()) {
          if (car_.isEmpty()) {
            car_ = other.car_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCarIsMutable();
            car_.addAll(other.car_);
          }
          onChanged();
        }
      } else {
        if (!other.car_.isEmpty()) {
          if (carBuilder_.isEmpty()) {
            carBuilder_.dispose();
            carBuilder_ = null;
            car_ = other.car_;
            bitField0_ = (bitField0_ & ~0x00000001);
            carBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCarFieldBuilder() : null;
          } else {
            carBuilder_.addAllMessages(other.car_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.example.models.Person parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.models.Person) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int32Value age_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> ageBuilder_;
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     * @return Whether the age field is set.
     */
    public boolean hasAge() {
      return ageBuilder_ != null || age_ != null;
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     * @return The age.
     */
    public com.google.protobuf.Int32Value getAge() {
      if (ageBuilder_ == null) {
        return age_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : age_;
      } else {
        return ageBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    public Builder setAge(com.google.protobuf.Int32Value value) {
      if (ageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        age_ = value;
        onChanged();
      } else {
        ageBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    public Builder setAge(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (ageBuilder_ == null) {
        age_ = builderForValue.build();
        onChanged();
      } else {
        ageBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    public Builder mergeAge(com.google.protobuf.Int32Value value) {
      if (ageBuilder_ == null) {
        if (age_ != null) {
          age_ =
            com.google.protobuf.Int32Value.newBuilder(age_).mergeFrom(value).buildPartial();
        } else {
          age_ = value;
        }
        onChanged();
      } else {
        ageBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    public Builder clearAge() {
      if (ageBuilder_ == null) {
        age_ = null;
        onChanged();
      } else {
        age_ = null;
        ageBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    public com.google.protobuf.Int32Value.Builder getAgeBuilder() {
      
      onChanged();
      return getAgeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder() {
      if (ageBuilder_ != null) {
        return ageBuilder_.getMessageOrBuilder();
      } else {
        return age_ == null ?
            com.google.protobuf.Int32Value.getDefaultInstance() : age_;
      }
    }
    /**
     * <code>.google.protobuf.Int32Value age = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getAgeFieldBuilder() {
      if (ageBuilder_ == null) {
        ageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                getAge(),
                getParentForChildren(),
                isClean());
        age_ = null;
      }
      return ageBuilder_;
    }

    private org.example.models.Address address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.models.Address, org.example.models.Address.Builder, org.example.models.AddressOrBuilder> addressBuilder_;
    /**
     * <code>.common.Address address = 3;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.common.Address address = 3;</code>
     * @return The address.
     */
    public org.example.models.Address getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? org.example.models.Address.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    public Builder setAddress(org.example.models.Address value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    public Builder setAddress(
        org.example.models.Address.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    public Builder mergeAddress(org.example.models.Address value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            org.example.models.Address.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    public org.example.models.Address.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    public org.example.models.AddressOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            org.example.models.Address.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.common.Address address = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.example.models.Address, org.example.models.Address.Builder, org.example.models.AddressOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.example.models.Address, org.example.models.Address.Builder, org.example.models.AddressOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private java.util.List<org.example.models.Car> car_ =
      java.util.Collections.emptyList();
    private void ensureCarIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        car_ = new java.util.ArrayList<org.example.models.Car>(car_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.models.Car, org.example.models.Car.Builder, org.example.models.CarOrBuilder> carBuilder_;

    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public java.util.List<org.example.models.Car> getCarList() {
      if (carBuilder_ == null) {
        return java.util.Collections.unmodifiableList(car_);
      } else {
        return carBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public int getCarCount() {
      if (carBuilder_ == null) {
        return car_.size();
      } else {
        return carBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public org.example.models.Car getCar(int index) {
      if (carBuilder_ == null) {
        return car_.get(index);
      } else {
        return carBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder setCar(
        int index, org.example.models.Car value) {
      if (carBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarIsMutable();
        car_.set(index, value);
        onChanged();
      } else {
        carBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder setCar(
        int index, org.example.models.Car.Builder builderForValue) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.set(index, builderForValue.build());
        onChanged();
      } else {
        carBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder addCar(org.example.models.Car value) {
      if (carBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarIsMutable();
        car_.add(value);
        onChanged();
      } else {
        carBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder addCar(
        int index, org.example.models.Car value) {
      if (carBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCarIsMutable();
        car_.add(index, value);
        onChanged();
      } else {
        carBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder addCar(
        org.example.models.Car.Builder builderForValue) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.add(builderForValue.build());
        onChanged();
      } else {
        carBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder addCar(
        int index, org.example.models.Car.Builder builderForValue) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.add(index, builderForValue.build());
        onChanged();
      } else {
        carBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder addAllCar(
        java.lang.Iterable<? extends org.example.models.Car> values) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, car_);
        onChanged();
      } else {
        carBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder clearCar() {
      if (carBuilder_ == null) {
        car_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        carBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public Builder removeCar(int index) {
      if (carBuilder_ == null) {
        ensureCarIsMutable();
        car_.remove(index);
        onChanged();
      } else {
        carBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public org.example.models.Car.Builder getCarBuilder(
        int index) {
      return getCarFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public org.example.models.CarOrBuilder getCarOrBuilder(
        int index) {
      if (carBuilder_ == null) {
        return car_.get(index);  } else {
        return carBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public java.util.List<? extends org.example.models.CarOrBuilder> 
         getCarOrBuilderList() {
      if (carBuilder_ != null) {
        return carBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(car_);
      }
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public org.example.models.Car.Builder addCarBuilder() {
      return getCarFieldBuilder().addBuilder(
          org.example.models.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public org.example.models.Car.Builder addCarBuilder(
        int index) {
      return getCarFieldBuilder().addBuilder(
          index, org.example.models.Car.getDefaultInstance());
    }
    /**
     * <code>repeated .common.Car car = 4;</code>
     */
    public java.util.List<org.example.models.Car.Builder> 
         getCarBuilderList() {
      return getCarFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.models.Car, org.example.models.Car.Builder, org.example.models.CarOrBuilder> 
        getCarFieldBuilder() {
      if (carBuilder_ == null) {
        carBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.models.Car, org.example.models.Car.Builder, org.example.models.CarOrBuilder>(
                car_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        car_ = null;
      }
      return carBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Person)
  }

  // @@protoc_insertion_point(class_scope:Person)
  private static final org.example.models.Person DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.models.Person();
  }

  public static org.example.models.Person getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Person>
      PARSER = new com.google.protobuf.AbstractParser<Person>() {
    @java.lang.Override
    public Person parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Person(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Person> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Person> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.models.Person getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

