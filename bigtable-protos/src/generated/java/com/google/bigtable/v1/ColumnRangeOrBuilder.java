// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_data.proto

package com.google.bigtable.v1;

public interface ColumnRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.ColumnRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string family_name = 1;</code>
   *
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   */
  java.lang.String getFamilyName();
  /**
   * <code>optional string family_name = 1;</code>
   *
   * <pre>
   * The name of the column family within which this range falls.
   * </pre>
   */
  com.google.protobuf.ByteString
      getFamilyNameBytes();

  /**
   * <code>optional bytes start_qualifier_inclusive = 2;</code>
   *
   * <pre>
   * Used when giving an inclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartQualifierInclusive();

  /**
   * <code>optional bytes start_qualifier_exclusive = 3;</code>
   *
   * <pre>
   * Used when giving an exclusive lower bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getStartQualifierExclusive();

  /**
   * <code>optional bytes end_qualifier_inclusive = 4;</code>
   *
   * <pre>
   * Used when giving an inclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndQualifierInclusive();

  /**
   * <code>optional bytes end_qualifier_exclusive = 5;</code>
   *
   * <pre>
   * Used when giving an exclusive upper bound for the range.
   * </pre>
   */
  com.google.protobuf.ByteString getEndQualifierExclusive();
}
