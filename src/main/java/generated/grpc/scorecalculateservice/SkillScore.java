// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScoreCalculateService.proto

package generated.grpc.scorecalculateservice;

/**
 * <pre>
 * Message defining a single skill score (for one skill at a time).
 * </pre>
 *
 * Protobuf type {@code ScoreCalculateService.SkillScore}
 */
public  final class SkillScore extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ScoreCalculateService.SkillScore)
    SkillScoreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkillScore.newBuilder() to construct.
  private SkillScore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkillScore() {
    score_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SkillScore(
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
          case 17: {

            score_ = input.readDouble();
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
    return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_SkillScore_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_SkillScore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.scorecalculateservice.SkillScore.class, generated.grpc.scorecalculateservice.SkillScore.Builder.class);
  }

  public static final int SCORE_FIELD_NUMBER = 2;
  private double score_;
  /**
   * <code>double score = 2;</code>
   */
  public double getScore() {
    return score_;
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
    if (score_ != 0D) {
      output.writeDouble(2, score_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (score_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, score_);
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
    if (!(obj instanceof generated.grpc.scorecalculateservice.SkillScore)) {
      return super.equals(obj);
    }
    generated.grpc.scorecalculateservice.SkillScore other = (generated.grpc.scorecalculateservice.SkillScore) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getScore())
        == java.lang.Double.doubleToLongBits(
            other.getScore()));
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
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getScore()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.scorecalculateservice.SkillScore parseFrom(
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
  public static Builder newBuilder(generated.grpc.scorecalculateservice.SkillScore prototype) {
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
   * Message defining a single skill score (for one skill at a time).
   * </pre>
   *
   * Protobuf type {@code ScoreCalculateService.SkillScore}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ScoreCalculateService.SkillScore)
      generated.grpc.scorecalculateservice.SkillScoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_SkillScore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_SkillScore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.scorecalculateservice.SkillScore.class, generated.grpc.scorecalculateservice.SkillScore.Builder.class);
    }

    // Construct using generated.grpc.scorecalculateservice.SkillScore.newBuilder()
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
      score_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.internal_static_ScoreCalculateService_SkillScore_descriptor;
    }

    @java.lang.Override
    public generated.grpc.scorecalculateservice.SkillScore getDefaultInstanceForType() {
      return generated.grpc.scorecalculateservice.SkillScore.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.scorecalculateservice.SkillScore build() {
      generated.grpc.scorecalculateservice.SkillScore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.scorecalculateservice.SkillScore buildPartial() {
      generated.grpc.scorecalculateservice.SkillScore result = new generated.grpc.scorecalculateservice.SkillScore(this);
      result.score_ = score_;
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
      if (other instanceof generated.grpc.scorecalculateservice.SkillScore) {
        return mergeFrom((generated.grpc.scorecalculateservice.SkillScore)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.scorecalculateservice.SkillScore other) {
      if (other == generated.grpc.scorecalculateservice.SkillScore.getDefaultInstance()) return this;
      if (other.getScore() != 0D) {
        setScore(other.getScore());
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
      generated.grpc.scorecalculateservice.SkillScore parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.scorecalculateservice.SkillScore) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double score_ ;
    /**
     * <code>double score = 2;</code>
     */
    public double getScore() {
      return score_;
    }
    /**
     * <code>double score = 2;</code>
     */
    public Builder setScore(double value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double score = 2;</code>
     */
    public Builder clearScore() {
      
      score_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:ScoreCalculateService.SkillScore)
  }

  // @@protoc_insertion_point(class_scope:ScoreCalculateService.SkillScore)
  private static final generated.grpc.scorecalculateservice.SkillScore DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.scorecalculateservice.SkillScore();
  }

  public static generated.grpc.scorecalculateservice.SkillScore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkillScore>
      PARSER = new com.google.protobuf.AbstractParser<SkillScore>() {
    @java.lang.Override
    public SkillScore parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SkillScore(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SkillScore> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkillScore> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.scorecalculateservice.SkillScore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

