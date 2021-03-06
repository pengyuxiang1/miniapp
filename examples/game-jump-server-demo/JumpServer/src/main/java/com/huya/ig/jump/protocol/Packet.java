// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

/**
 * <pre>
 * 数据协议，所有接受和发送的数据包都以Packet作为数据协议
 * </pre>
 *
 * Protobuf type {@code pb.Packet}
 */
public  final class Packet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:pb.Packet)
    PacketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Packet.newBuilder() to construct.
  private Packet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Packet() {
    uri_ = 0;
    body_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Packet(
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
          case 8: {

            uri_ = input.readInt32();
            break;
          }
          case 18: {

            body_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_Packet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.huya.ig.jump.protocol.Jump.internal_static_pb_Packet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.huya.ig.jump.protocol.Packet.class, com.huya.ig.jump.protocol.Packet.Builder.class);
  }

  public static final int URI_FIELD_NUMBER = 1;
  private int uri_;
  /**
   * <pre>
   * 协议号
   * </pre>
   *
   * <code>int32 uri = 1;</code>
   */
  public int getUri() {
    return uri_;
  }

  public static final int BODY_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString body_;
  /**
   * <pre>
   * 数据包，proto二进制
   * </pre>
   *
   * <code>bytes body = 2;</code>
   */
  public com.google.protobuf.ByteString getBody() {
    return body_;
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
    if (uri_ != 0) {
      output.writeInt32(1, uri_);
    }
    if (!body_.isEmpty()) {
      output.writeBytes(2, body_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uri_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, uri_);
    }
    if (!body_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, body_);
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
    if (!(obj instanceof com.huya.ig.jump.protocol.Packet)) {
      return super.equals(obj);
    }
    com.huya.ig.jump.protocol.Packet other = (com.huya.ig.jump.protocol.Packet) obj;

    boolean result = true;
    result = result && (getUri()
        == other.getUri());
    result = result && getBody()
        .equals(other.getBody());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri();
    hash = (37 * hash) + BODY_FIELD_NUMBER;
    hash = (53 * hash) + getBody().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.huya.ig.jump.protocol.Packet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.Packet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.Packet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.huya.ig.jump.protocol.Packet parseFrom(
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
  public static Builder newBuilder(com.huya.ig.jump.protocol.Packet prototype) {
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
   * <pre>
   * 数据协议，所有接受和发送的数据包都以Packet作为数据协议
   * </pre>
   *
   * Protobuf type {@code pb.Packet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:pb.Packet)
      com.huya.ig.jump.protocol.PacketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_Packet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_Packet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.huya.ig.jump.protocol.Packet.class, com.huya.ig.jump.protocol.Packet.Builder.class);
    }

    // Construct using com.huya.ig.jump.protocol.Packet.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      uri_ = 0;

      body_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.huya.ig.jump.protocol.Jump.internal_static_pb_Packet_descriptor;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.Packet getDefaultInstanceForType() {
      return com.huya.ig.jump.protocol.Packet.getDefaultInstance();
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.Packet build() {
      com.huya.ig.jump.protocol.Packet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.huya.ig.jump.protocol.Packet buildPartial() {
      com.huya.ig.jump.protocol.Packet result = new com.huya.ig.jump.protocol.Packet(this);
      result.uri_ = uri_;
      result.body_ = body_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.huya.ig.jump.protocol.Packet) {
        return mergeFrom((com.huya.ig.jump.protocol.Packet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.huya.ig.jump.protocol.Packet other) {
      if (other == com.huya.ig.jump.protocol.Packet.getDefaultInstance()) return this;
      if (other.getUri() != 0) {
        setUri(other.getUri());
      }
      if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
        setBody(other.getBody());
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
      com.huya.ig.jump.protocol.Packet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.huya.ig.jump.protocol.Packet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int uri_ ;
    /**
     * <pre>
     * 协议号
     * </pre>
     *
     * <code>int32 uri = 1;</code>
     */
    public int getUri() {
      return uri_;
    }
    /**
     * <pre>
     * 协议号
     * </pre>
     *
     * <code>int32 uri = 1;</code>
     */
    public Builder setUri(int value) {
      
      uri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 协议号
     * </pre>
     *
     * <code>int32 uri = 1;</code>
     */
    public Builder clearUri() {
      
      uri_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 数据包，proto二进制
     * </pre>
     *
     * <code>bytes body = 2;</code>
     */
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }
    /**
     * <pre>
     * 数据包，proto二进制
     * </pre>
     *
     * <code>bytes body = 2;</code>
     */
    public Builder setBody(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      body_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 数据包，proto二进制
     * </pre>
     *
     * <code>bytes body = 2;</code>
     */
    public Builder clearBody() {
      
      body_ = getDefaultInstance().getBody();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:pb.Packet)
  }

  // @@protoc_insertion_point(class_scope:pb.Packet)
  private static final com.huya.ig.jump.protocol.Packet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.huya.ig.jump.protocol.Packet();
  }

  public static com.huya.ig.jump.protocol.Packet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Packet>
      PARSER = new com.google.protobuf.AbstractParser<Packet>() {
    @java.lang.Override
    public Packet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Packet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Packet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Packet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.huya.ig.jump.protocol.Packet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

