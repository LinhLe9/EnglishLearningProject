// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestService.proto

package generated.grpc.testservice;

/**
 * <pre>
 * Message identifying the Listening Sound Path
 * </pre>
 *
 * Protobuf type {@code TestService.ListeningSound}
 */
public  final class ListeningSound extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TestService.ListeningSound)
    ListeningSoundOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListeningSound.newBuilder() to construct.
  private ListeningSound(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListeningSound() {
    soundPathId_ = 0;
    soundpath_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListeningSound(
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

            soundPathId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            soundpath_ = s;
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
    return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningSound_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningSound_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.testservice.ListeningSound.class, generated.grpc.testservice.ListeningSound.Builder.class);
  }

  public static final int SOUNDPATHID_FIELD_NUMBER = 1;
  private int soundPathId_;
  /**
   * <code>int32 soundPathId = 1;</code>
   */
  public int getSoundPathId() {
    return soundPathId_;
  }

  public static final int SOUNDPATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object soundpath_;
  /**
   * <code>string soundpath = 2;</code>
   */
  public java.lang.String getSoundpath() {
    java.lang.Object ref = soundpath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      soundpath_ = s;
      return s;
    }
  }
  /**
   * <code>string soundpath = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSoundpathBytes() {
    java.lang.Object ref = soundpath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      soundpath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (soundPathId_ != 0) {
      output.writeInt32(1, soundPathId_);
    }
    if (!getSoundpathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, soundpath_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (soundPathId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, soundPathId_);
    }
    if (!getSoundpathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, soundpath_);
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
    if (!(obj instanceof generated.grpc.testservice.ListeningSound)) {
      return super.equals(obj);
    }
    generated.grpc.testservice.ListeningSound other = (generated.grpc.testservice.ListeningSound) obj;

    boolean result = true;
    result = result && (getSoundPathId()
        == other.getSoundPathId());
    result = result && getSoundpath()
        .equals(other.getSoundpath());
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
    hash = (37 * hash) + SOUNDPATHID_FIELD_NUMBER;
    hash = (53 * hash) + getSoundPathId();
    hash = (37 * hash) + SOUNDPATH_FIELD_NUMBER;
    hash = (53 * hash) + getSoundpath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.testservice.ListeningSound parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningSound parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.testservice.ListeningSound parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.testservice.ListeningSound parseFrom(
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
  public static Builder newBuilder(generated.grpc.testservice.ListeningSound prototype) {
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
   * Message identifying the Listening Sound Path
   * </pre>
   *
   * Protobuf type {@code TestService.ListeningSound}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TestService.ListeningSound)
      generated.grpc.testservice.ListeningSoundOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningSound_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningSound_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.testservice.ListeningSound.class, generated.grpc.testservice.ListeningSound.Builder.class);
    }

    // Construct using generated.grpc.testservice.ListeningSound.newBuilder()
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
      soundPathId_ = 0;

      soundpath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningSound_descriptor;
    }

    @java.lang.Override
    public generated.grpc.testservice.ListeningSound getDefaultInstanceForType() {
      return generated.grpc.testservice.ListeningSound.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.testservice.ListeningSound build() {
      generated.grpc.testservice.ListeningSound result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.testservice.ListeningSound buildPartial() {
      generated.grpc.testservice.ListeningSound result = new generated.grpc.testservice.ListeningSound(this);
      result.soundPathId_ = soundPathId_;
      result.soundpath_ = soundpath_;
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
      if (other instanceof generated.grpc.testservice.ListeningSound) {
        return mergeFrom((generated.grpc.testservice.ListeningSound)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.testservice.ListeningSound other) {
      if (other == generated.grpc.testservice.ListeningSound.getDefaultInstance()) return this;
      if (other.getSoundPathId() != 0) {
        setSoundPathId(other.getSoundPathId());
      }
      if (!other.getSoundpath().isEmpty()) {
        soundpath_ = other.soundpath_;
        onChanged();
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
      generated.grpc.testservice.ListeningSound parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.testservice.ListeningSound) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int soundPathId_ ;
    /**
     * <code>int32 soundPathId = 1;</code>
     */
    public int getSoundPathId() {
      return soundPathId_;
    }
    /**
     * <code>int32 soundPathId = 1;</code>
     */
    public Builder setSoundPathId(int value) {
      
      soundPathId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 soundPathId = 1;</code>
     */
    public Builder clearSoundPathId() {
      
      soundPathId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object soundpath_ = "";
    /**
     * <code>string soundpath = 2;</code>
     */
    public java.lang.String getSoundpath() {
      java.lang.Object ref = soundpath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        soundpath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string soundpath = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSoundpathBytes() {
      java.lang.Object ref = soundpath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        soundpath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string soundpath = 2;</code>
     */
    public Builder setSoundpath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      soundpath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string soundpath = 2;</code>
     */
    public Builder clearSoundpath() {
      
      soundpath_ = getDefaultInstance().getSoundpath();
      onChanged();
      return this;
    }
    /**
     * <code>string soundpath = 2;</code>
     */
    public Builder setSoundpathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      soundpath_ = value;
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


    // @@protoc_insertion_point(builder_scope:TestService.ListeningSound)
  }

  // @@protoc_insertion_point(class_scope:TestService.ListeningSound)
  private static final generated.grpc.testservice.ListeningSound DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.testservice.ListeningSound();
  }

  public static generated.grpc.testservice.ListeningSound getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListeningSound>
      PARSER = new com.google.protobuf.AbstractParser<ListeningSound>() {
    @java.lang.Override
    public ListeningSound parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListeningSound(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListeningSound> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListeningSound> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.testservice.ListeningSound getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

