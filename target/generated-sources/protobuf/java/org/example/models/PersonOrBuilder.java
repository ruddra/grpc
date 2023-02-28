// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package org.example.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return The age.
   */
  com.google.protobuf.Int32Value getAge();
  /**
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>.common.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.common.Address address = 3;</code>
   * @return The address.
   */
  org.example.models.Address getAddress();
  /**
   * <code>.common.Address address = 3;</code>
   */
  org.example.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<org.example.models.Car> 
      getCarList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  org.example.models.Car getCar(int index);
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<? extends org.example.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  org.example.models.CarOrBuilder getCarOrBuilder(
      int index);
}
