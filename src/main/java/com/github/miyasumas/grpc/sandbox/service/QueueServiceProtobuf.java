// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueueService.proto

package com.github.miyasumas.grpc.sandbox.service;

public final class QueueServiceProtobuf {
  private QueueServiceProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QueueRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sandbox.QueueRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 priority = 1;</code>
     */
    int getPriority();

    /**
     * <code>optional int64 userId = 2;</code>
     */
    long getUserId();
  }
  /**
   * Protobuf type {@code sandbox.QueueRequest}
   */
  public  static final class QueueRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:sandbox.QueueRequest)
      QueueRequestOrBuilder {
    // Use QueueRequest.newBuilder() to construct.
    private QueueRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private QueueRequest() {
      priority_ = 0;
      userId_ = 0L;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private QueueRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              priority_ = input.readInt32();
              break;
            }
            case 16: {

              userId_ = input.readInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.class, com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.Builder.class);
    }

    public static final int PRIORITY_FIELD_NUMBER = 1;
    private int priority_;
    /**
     * <code>optional int32 priority = 1;</code>
     */
    public int getPriority() {
      return priority_;
    }

    public static final int USERID_FIELD_NUMBER = 2;
    private long userId_;
    /**
     * <code>optional int64 userId = 2;</code>
     */
    public long getUserId() {
      return userId_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (priority_ != 0) {
        output.writeInt32(1, priority_);
      }
      if (userId_ != 0L) {
        output.writeInt64(2, userId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (priority_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, priority_);
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, userId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code sandbox.QueueRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sandbox.QueueRequest)
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.class, com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.Builder.class);
      }

      // Construct using com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        priority_ = 0;

        userId_ = 0L;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueRequest_descriptor;
      }

      public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest getDefaultInstanceForType() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.getDefaultInstance();
      }

      public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest build() {
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest buildPartial() {
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest result = new com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest(this);
        result.priority_ = priority_;
        result.userId_ = userId_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest) {
          return mergeFrom((com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest other) {
        if (other == com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.getDefaultInstance()) return this;
        if (other.getPriority() != 0) {
          setPriority(other.getPriority());
        }
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int priority_ ;
      /**
       * <code>optional int32 priority = 1;</code>
       */
      public int getPriority() {
        return priority_;
      }
      /**
       * <code>optional int32 priority = 1;</code>
       */
      public Builder setPriority(int value) {
        
        priority_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 priority = 1;</code>
       */
      public Builder clearPriority() {
        
        priority_ = 0;
        onChanged();
        return this;
      }

      private long userId_ ;
      /**
       * <code>optional int64 userId = 2;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>optional int64 userId = 2;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 userId = 2;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:sandbox.QueueRequest)
    }

    // @@protoc_insertion_point(class_scope:sandbox.QueueRequest)
    private static final com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest();
    }

    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueueRequest>
        PARSER = new com.google.protobuf.AbstractParser<QueueRequest>() {
      public QueueRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new QueueRequest(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<QueueRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueueRequest> getParserForType() {
      return PARSER;
    }

    public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface QueueResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:sandbox.QueueResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 priority = 1;</code>
     */
    int getPriority();

    /**
     * <code>optional int64 userId = 2;</code>
     */
    long getUserId();

    /**
     * <code>optional int32 status = 3;</code>
     */
    int getStatus();
  }
  /**
   * Protobuf type {@code sandbox.QueueResponse}
   */
  public  static final class QueueResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:sandbox.QueueResponse)
      QueueResponseOrBuilder {
    // Use QueueResponse.newBuilder() to construct.
    private QueueResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private QueueResponse() {
      priority_ = 0;
      userId_ = 0L;
      status_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private QueueResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              priority_ = input.readInt32();
              break;
            }
            case 16: {

              userId_ = input.readInt64();
              break;
            }
            case 24: {

              status_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.class, com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.Builder.class);
    }

    public static final int PRIORITY_FIELD_NUMBER = 1;
    private int priority_;
    /**
     * <code>optional int32 priority = 1;</code>
     */
    public int getPriority() {
      return priority_;
    }

    public static final int USERID_FIELD_NUMBER = 2;
    private long userId_;
    /**
     * <code>optional int64 userId = 2;</code>
     */
    public long getUserId() {
      return userId_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private int status_;
    /**
     * <code>optional int32 status = 3;</code>
     */
    public int getStatus() {
      return status_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (priority_ != 0) {
        output.writeInt32(1, priority_);
      }
      if (userId_ != 0L) {
        output.writeInt64(2, userId_);
      }
      if (status_ != 0) {
        output.writeInt32(3, status_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (priority_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, priority_);
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, userId_);
      }
      if (status_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, status_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code sandbox.QueueResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:sandbox.QueueResponse)
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.class, com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.Builder.class);
      }

      // Construct using com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        priority_ = 0;

        userId_ = 0L;

        status_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.internal_static_sandbox_QueueResponse_descriptor;
      }

      public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse getDefaultInstanceForType() {
        return com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.getDefaultInstance();
      }

      public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse build() {
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse buildPartial() {
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse result = new com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse(this);
        result.priority_ = priority_;
        result.userId_ = userId_;
        result.status_ = status_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse) {
          return mergeFrom((com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse other) {
        if (other == com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.getDefaultInstance()) return this;
        if (other.getPriority() != 0) {
          setPriority(other.getPriority());
        }
        if (other.getUserId() != 0L) {
          setUserId(other.getUserId());
        }
        if (other.getStatus() != 0) {
          setStatus(other.getStatus());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int priority_ ;
      /**
       * <code>optional int32 priority = 1;</code>
       */
      public int getPriority() {
        return priority_;
      }
      /**
       * <code>optional int32 priority = 1;</code>
       */
      public Builder setPriority(int value) {
        
        priority_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 priority = 1;</code>
       */
      public Builder clearPriority() {
        
        priority_ = 0;
        onChanged();
        return this;
      }

      private long userId_ ;
      /**
       * <code>optional int64 userId = 2;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>optional int64 userId = 2;</code>
       */
      public Builder setUserId(long value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 userId = 2;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0L;
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <code>optional int32 status = 3;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 3;</code>
       */
      public Builder setStatus(int value) {
        
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 3;</code>
       */
      public Builder clearStatus() {
        
        status_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:sandbox.QueueResponse)
    }

    // @@protoc_insertion_point(class_scope:sandbox.QueueResponse)
    private static final com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse();
    }

    public static com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueueResponse>
        PARSER = new com.google.protobuf.AbstractParser<QueueResponse>() {
      public QueueResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new QueueResponse(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<QueueResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueueResponse> getParserForType() {
      return PARSER;
    }

    public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_sandbox_QueueRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_sandbox_QueueRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_sandbox_QueueResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_sandbox_QueueResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022QueueService.proto\022\007sandbox\"0\n\014QueueRe" +
      "quest\022\020\n\010priority\030\001 \001(\005\022\016\n\006userId\030\002 \001(\003\"" +
      "A\n\rQueueResponse\022\020\n\010priority\030\001 \001(\005\022\016\n\006us" +
      "erId\030\002 \001(\003\022\016\n\006status\030\003 \001(\0052\206\001\n\014QueueServ" +
      "ice\022:\n\007enqueue\022\025.sandbox.QueueRequest\032\026." +
      "sandbox.QueueResponse\"\000\022:\n\007dequeue\022\025.san" +
      "dbox.QueueRequest\032\026.sandbox.QueueRespons" +
      "e\"\000BA\n)com.github.miyasumas.grpc.sandbox" +
      ".serviceB\024QueueServiceProtobufb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_sandbox_QueueRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sandbox_QueueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_sandbox_QueueRequest_descriptor,
        new java.lang.String[] { "Priority", "UserId", });
    internal_static_sandbox_QueueResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sandbox_QueueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_sandbox_QueueResponse_descriptor,
        new java.lang.String[] { "Priority", "UserId", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
