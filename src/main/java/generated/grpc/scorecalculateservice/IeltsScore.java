// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScoreCalculateService.proto

package generated.grpc.scorecalculateservice;

/**
 * <pre>
 * Message defining the IELTS overall band score.
 * </pre>
 *
 * Protobuf type {@code ScoreCalculateService.IeltsScore}
 */
public  final class IeltsScore extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ScoreCalculateService.IeltsScore)
    IeltsScoreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IeltsScore.newBuilder() to construct.
  private IeltsScore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IeltsScore() {
    overallBand_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IeltsScore(
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
          case 9: {

            overallBand_ = input.readDouble();
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
    return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_IeltsScore_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_IeltsScore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.scorecalculateservice.IeltsScore.class, generated.grpc.scorecalculateservice.IeltsScore.Builder.class);
  }

  public static final int OVERALL_BAND_FIELD_NUMBER = 1;
  private double overallBand_;
  /**
   * <code>double overall_band = 1;</code>
   */
  public double getOverallBand() {
    return overallBand_;
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
    if (overallBand_ != 0D) {
      output.writeDouble(1, overallBand_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (overallBand_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, overallBand_);
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
    if (!(obj instanceof generated.grpc.scorecalculateservice.IeltsScore)) {
      return super.equals(obj);
    }
    generated.grpc.scorecalculateservice.IeltsScore other = (generated.grpc.scorecalculateservice.IeltsScore) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getOverallBand())
        == java.lang.Double.doubleToLongBits(
            other.getOverallBand()));
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
    hash = (37 * hash) + OVERALL_BAND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getOverallBand()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.scorecalculateservice.IeltsScore parseFrom(
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
  public static Builder newBuilder(generated.grpc.scorecalculateservice.IeltsScore prototype) {
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
   * Message defining the IELTS overall band score.
   * </pre>
   *
   * Protobuf type {@code ScoreCalculateService.IeltsScore}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ScoreCalculateService.IeltsScore)
      generated.grpc.scorecalculateservice.IeltsScoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_IeltsScore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_IeltsScore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.scorecalculateservice.IeltsScore.class, generated.grpc.scorecalculateservice.IeltsScore.Builder.class);
    }

    // Construct using generated.grpc.scorecalculateservice.IeltsScore.newBuilder()
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
      overallBand_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_IeltsScore_descriptor;
    }

    @java.lang.Override
    public generated.grpc.scorecalculateservice.IeltsScore getDefaultInstanceForType() {
      return generated.grpc.scorecalculateservice.IeltsScore.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.scorecalculateservice.IeltsScore build() {
      generated.grpc.scorecalculateservice.IeltsScore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.scorecalculateservice.IeltsScore buildPartial() {
      generated.grpc.scorecalculateservice.IeltsScore result = new generated.grpc.scorecalculateservice.IeltsScore(this);
      result.overallBand_ = overallBand_;
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
      if (other instanceof generated.grpc.scorecalculateservice.IeltsScore) {
        return mergeFrom((generated.grpc.scorecalculateservice.IeltsScore)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.scorecalculateservice.IeltsScore other) {
      if (other == generated.grpc.scorecalculateservice.IeltsScore.getDefaultInstance()) return this;
      if (other.getOverallBand() != 0D) {
        setOverallBand(other.getOverallBand());
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
      generated.grpc.scorecalculateservice.IeltsScore parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.scorecalculateservice.IeltsScore) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double overallBand_ ;
    /**
     * <code>double overall_band = 1;</code>
     */
    public double getOverallBand() {
      return overallBand_;
    }
    /**
     * <code>double overall_band = 1;</code>
     */
    public Builder setOverallBand(double value) {
      
      overallBand_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double overall_band = 1;</code>
     */
    public Builder clearOverallBand() {
      
      overallBand_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:ScoreCalculateService.IeltsScore)
  }

  // @@protoc_insertion_point(class_scope:ScoreCalculateService.IeltsScore)
  private static final generated.grpc.scorecalculateservice.IeltsScore DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.scorecalculateservice.IeltsScore();
  }

  public static generated.grpc.scorecalculateservice.IeltsScore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IeltsScore>
      PARSER = new com.google.protobuf.AbstractParser<IeltsScore>() {
    @java.lang.Override
    public IeltsScore parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IeltsScore(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IeltsScore> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IeltsScore> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.scorecalculateservice.IeltsScore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

