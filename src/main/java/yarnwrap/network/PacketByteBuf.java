package yarnwrap.network;
public class PacketByteBuf { public net.minecraft.network.PacketByteBuf wrapperContained; public PacketByteBuf(net.minecraft.network.PacketByteBuf wrapperContained) { this.wrapperContained = wrapperContained; }

// public io.netty.buffer.ByteBuf parent() { return wrapperContained.parent; }
// public void parent(io.netty.buffer.ByteBuf value) { wrapperContained.parent = value; }
public short DEFAULT_MAX_STRING_LENGTH() { return wrapperContained.DEFAULT_MAX_STRING_LENGTH; }
// public void DEFAULT_MAX_STRING_LENGTH(short value) { wrapperContained.DEFAULT_MAX_STRING_LENGTH = value; }
public int MAX_TEXT_LENGTH() { return wrapperContained.MAX_TEXT_LENGTH; }
// public void MAX_TEXT_LENGTH(int value) { wrapperContained.MAX_TEXT_LENGTH = value; }
public int MAX_READ_NBT_SIZE() { return wrapperContained.MAX_READ_NBT_SIZE; }
// public void MAX_READ_NBT_SIZE(int value) { wrapperContained.MAX_READ_NBT_SIZE = value; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
public PacketByteBuf(io.netty.buffer.ByteBuf parent) { this.wrapperContained = new net.minecraft.network.PacketByteBuf(parent); }
public int bytesBefore(byte value) { return wrapperContained.bytesBefore(value); }
public int bytesBefore(int length,byte value) { return wrapperContained.bytesBefore(length,value); }
public int bytesBefore(int index,int length,byte value) { return wrapperContained.bytesBefore(index,length,value); }
public io.netty.buffer.ByteBuf capacity(int capacity) { return wrapperContained.capacity(capacity); }
// public int compareTo(java.lang.Object buf) { return wrapperContained.compareTo(buf); }
public io.netty.buffer.ByteBuf copy(int index,int length) { return wrapperContained.copy(index,length); }
public io.netty.buffer.ByteBuf ensureWritable(int minBytes) { return wrapperContained.ensureWritable(minBytes); }
public int ensureWritable(int minBytes,boolean force) { return wrapperContained.ensureWritable(minBytes,force); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public int forEachByte(int index,int length,io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByte(index,length,byteProcessor); }
public int forEachByte(io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByte(byteProcessor); }
public int forEachByteDesc(int index,int length,io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByteDesc(index,length,byteProcessor); }
public int forEachByteDesc(io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByteDesc(byteProcessor); }
public boolean getBoolean(int index) { return wrapperContained.getBoolean(index); }
public byte getByte(int index) { return wrapperContained.getByte(index); }
public io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf) { return wrapperContained.getBytes(index,buf); }
public io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.getBytes(index,buf,length); }
public io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf,int outputIndex,int length) { return wrapperContained.getBytes(index,buf,outputIndex,length); }
// public io.netty.buffer.ByteBuf getBytes(int index,java.io.OutputStream stream,int length) { return wrapperContained.getBytes(index,stream,length); }
public io.netty.buffer.ByteBuf getBytes(int index,java.nio.ByteBuffer buf) { return wrapperContained.getBytes(index,buf); }
// public int getBytes(int index,java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.getBytes(index,channel,pos,length); }
// public int getBytes(int index,java.nio.channels.GatheringByteChannel channel,int length) { return wrapperContained.getBytes(index,channel,length); }
// public io.netty.buffer.ByteBuf getBytes(int index,byte bytes) { return wrapperContained.getBytes(index,bytes); }
// public io.netty.buffer.ByteBuf getBytes(int index,byte bytes,int outputIndex,int length) { return wrapperContained.getBytes(index,bytes,outputIndex,length); }
public char getChar(int index) { return wrapperContained.getChar(index); }
public java.lang.CharSequence getCharSequence(int index,int length,java.nio.charset.Charset charset) { return wrapperContained.getCharSequence(index,length,charset); }
public double getDouble(int index) { return wrapperContained.getDouble(index); }
public float getFloat(int index) { return wrapperContained.getFloat(index); }
public int getInt(int index) { return wrapperContained.getInt(index); }
public int getIntLE(int index) { return wrapperContained.getIntLE(index); }
public long getLong(int index) { return wrapperContained.getLong(index); }
public long getLongLE(int index) { return wrapperContained.getLongLE(index); }
public int getMedium(int index) { return wrapperContained.getMedium(index); }
public int getMediumLE(int index) { return wrapperContained.getMediumLE(index); }
public short getShort(int index) { return wrapperContained.getShort(index); }
public short getShortLE(int index) { return wrapperContained.getShortLE(index); }
public short getUnsignedByte(int index) { return wrapperContained.getUnsignedByte(index); }
public long getUnsignedInt(int index) { return wrapperContained.getUnsignedInt(index); }
public long getUnsignedIntLE(int index) { return wrapperContained.getUnsignedIntLE(index); }
public int getUnsignedMedium(int index) { return wrapperContained.getUnsignedMedium(index); }
public int getUnsignedMediumLE(int index) { return wrapperContained.getUnsignedMediumLE(index); }
public int getUnsignedShort(int index) { return wrapperContained.getUnsignedShort(index); }
public int getUnsignedShortLE(int index) { return wrapperContained.getUnsignedShortLE(index); }
public int indexOf(int from,int to,byte value) { return wrapperContained.indexOf(from,to,value); }
public java.nio.ByteBuffer internalNioBuffer(int index,int length) { return wrapperContained.internalNioBuffer(index,length); }
public boolean isReadable(int size) { return wrapperContained.isReadable(size); }
public boolean isWritable(int size) { return wrapperContained.isWritable(size); }
public int[] readIntArray() { return wrapperContained.readIntArray(); }
public yarnwrap.network.PacketByteBuf writeString(java.lang.String string,int maxLength) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeString(string,maxLength)); }
// public yarnwrap.network.PacketByteBuf writeLongArray(long array) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeLongArray(array)); }
public java.util.UUID readUuid() { return wrapperContained.readUuid(); }
public yarnwrap.network.PacketByteBuf writeVarLong(long value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeVarLong(value)); }
public long readVarLong() { return wrapperContained.readVarLong(); }
public yarnwrap.network.PacketByteBuf writeNbt(yarnwrap.nbt.NbtElement nbt) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeNbt(nbt.wrapperContained)); }
public byte[] readByteArray() { return wrapperContained.readByteArray(); }
public yarnwrap.network.PacketByteBuf writeDate(java.util.Date date) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeDate(date)); }
public yarnwrap.network.PacketByteBuf writeUuid(java.util.UUID uuid) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeUuid(uuid)); }
public yarnwrap.nbt.NbtCompound readNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt()); }
public int[] readIntArray(int maxSize) { return wrapperContained.readIntArray(maxSize); }
public java.lang.String readString(int maxLength) { return wrapperContained.readString(maxLength); }
// public long[] readLongArray(long toArray) { return wrapperContained.readLongArray(toArray); }
public java.util.Date readDate() { return wrapperContained.readDate(); }
public byte[] readByteArray(int maxSize) { return wrapperContained.readByteArray(maxSize); }
public yarnwrap.network.PacketByteBuf writeVarInt(int value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeVarInt(value)); }
// public yarnwrap.network.PacketByteBuf writeIntArray(int array) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeIntArray(array)); }
public yarnwrap.network.PacketByteBuf writeBlockPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeBlockPos(pos.wrapperContained)); }
// public long[] readLongArray(long toArray,int maxSize) { return wrapperContained.readLongArray(toArray,maxSize); }
public yarnwrap.util.Identifier readIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.readIdentifier()); }
public yarnwrap.util.math.BlockPos readBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.readBlockPos()); }
public yarnwrap.network.PacketByteBuf writeIdentifier(yarnwrap.util.Identifier id) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeIdentifier(id.wrapperContained)); }
// public yarnwrap.network.PacketByteBuf writeByteArray(byte array) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeByteArray(array)); }
public yarnwrap.network.PacketByteBuf writeString(java.lang.String string) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeString(string)); }
public int readVarInt() { return wrapperContained.readVarInt(); }
public yarnwrap.network.PacketByteBuf writeEnumConstant(java.lang.Enum instance) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeEnumConstant(instance)); }
public java.lang.Enum readEnumConstant(java.lang.Class enumClass) { return wrapperContained.readEnumConstant(enumClass); }
public void writeBlockHitResult(yarnwrap.util.hit.BlockHitResult hitResult) { wrapperContained.writeBlockHitResult(hitResult.wrapperContained); }
public yarnwrap.util.hit.BlockHitResult readBlockHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.readBlockHitResult()); }
public yarnwrap.util.math.ChunkSectionPos readChunkSectionPos() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.readChunkSectionPos()); }
public java.lang.String readString() { return wrapperContained.readString(); }
public java.lang.Object decode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,yarnwrap.nbt.NbtSizeTracker sizeTracker) { return wrapperContained.decode(ops,codec,sizeTracker.wrapperContained); }
public yarnwrap.network.PacketByteBuf encode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,java.lang.Object value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.encode(ops,codec,value)); }
public yarnwrap.nbt.NbtElement readNbt(yarnwrap.nbt.NbtSizeTracker sizeTracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.readNbt(sizeTracker.wrapperContained)); }
public long[] readLongArray() { return wrapperContained.readLongArray(); }
public void writeBitSet(java.util.BitSet bitSet) { wrapperContained.writeBitSet(bitSet); }
public java.util.BitSet readBitSet() { return wrapperContained.readBitSet(); }
public it.unimi.dsi.fastutil.ints.IntList readIntList() { return wrapperContained.readIntList(); }
public void writeIntList(it.unimi.dsi.fastutil.ints.IntList list) { wrapperContained.writeIntList(list); }
// public io.netty.handler.codec.EncoderException method_34061(java.lang.Object error) { return wrapperContained.method_34061(error); }
public void writeCollection(java.util.Collection collection,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeCollection(collection,writer.wrapperContained); }
public void writeMap(java.util.Map map,yarnwrap.network.codec.PacketEncoder keyWriter,yarnwrap.network.codec.PacketEncoder valueWriter) { wrapperContained.writeMap(map,keyWriter.wrapperContained,valueWriter.wrapperContained); }
// public void method_34064(yarnwrap.network.codec.PacketEncoder key,yarnwrap.network.codec.PacketEncoder value) { wrapperContained.method_34064(key.wrapperContained,value.wrapperContained); }
public void forEachInCollection(java.util.function.Consumer consumer) { wrapperContained.forEachInCollection(consumer); }
public java.util.List readList(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readList(reader.wrapperContained); }
public java.util.Map readMap(yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader) { return wrapperContained.readMap(keyReader.wrapperContained,valueReader.wrapperContained); }
public java.util.Collection readCollection(java.util.function.IntFunction collectionFactory,yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readCollection(collectionFactory,reader.wrapperContained); }
public java.util.Map readMap(java.util.function.IntFunction mapFactory,yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader) { return wrapperContained.readMap(mapFactory,keyReader.wrapperContained,valueReader.wrapperContained); }
// public io.netty.handler.codec.DecoderException method_34070(yarnwrap.nbt.NbtElement error) { return wrapperContained.method_34070(error.wrapperContained); }
public yarnwrap.network.PacketByteBuf writeChunkPos(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeChunkPos(pos.wrapperContained)); }
public yarnwrap.network.PacketByteBuf writeChunkSectionPos(yarnwrap.util.math.ChunkSectionPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeChunkSectionPos(pos.wrapperContained)); }
public yarnwrap.util.math.ChunkPos readChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.readChunkPos()); }
public void writeOptional(java.util.Optional value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeOptional(value,writer.wrapperContained); }
public java.util.Optional readOptional(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readOptional(reader.wrapperContained); }
// public java.lang.Object method_37452(int value) { return wrapperContained.method_37452(value); }
public java.util.function.IntFunction getMaxValidator(java.util.function.IntFunction applier,int max) { return wrapperContained.getMaxValidator(applier,max); }
public void writeNullable(java.lang.Object value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeNullable(value,writer.wrapperContained); }
public java.lang.Object readNullable(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readNullable(reader.wrapperContained); }
public yarnwrap.registry.RegistryKey readRegistryKey(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.registry.RegistryKey(wrapperContained.readRegistryKey(registryRef.wrapperContained)); }
public void writeGlobalPos(yarnwrap.util.math.GlobalPos pos) { wrapperContained.writeGlobalPos(pos.wrapperContained); }
public yarnwrap.network.PacketByteBuf writePublicKey(java.security.PublicKey publicKey) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writePublicKey(publicKey)); }
public void writeInstant(java.time.Instant instant) { wrapperContained.writeInstant(instant); }
public void writeRegistryKey(yarnwrap.registry.RegistryKey key) { wrapperContained.writeRegistryKey(key.wrapperContained); }
public yarnwrap.util.math.GlobalPos readGlobalPos() { return new yarnwrap.util.math.GlobalPos(wrapperContained.readGlobalPos()); }
public java.time.Instant readInstant() { return wrapperContained.readInstant(); }
public java.security.PublicKey readPublicKey() { return wrapperContained.readPublicKey(); }
public java.util.EnumSet readEnumSet(java.lang.Class type) { return wrapperContained.readEnumSet(type); }
public void writeBitSet(java.util.BitSet bitSet,int size) { wrapperContained.writeBitSet(bitSet,size); }
public void writeEnumSet(java.util.EnumSet enumSet,java.lang.Class type) { wrapperContained.writeEnumSet(enumSet,type); }
public java.util.BitSet readBitSet(int size) { return wrapperContained.readBitSet(size); }
public void writeQuaternionf(org.joml.Quaternionf quaternionf) { wrapperContained.writeQuaternionf(quaternionf); }
public void writeVector3f(org.joml.Vector3f vector3f) { wrapperContained.writeVector3f(vector3f); }
public org.joml.Vector3f readVector3f() { return wrapperContained.readVector3f(); }
public org.joml.Quaternionf readQuaternionf() { return wrapperContained.readQuaternionf(); }
public java.lang.Object decodeAsJson(com.mojang.serialization.Codec codec) { return wrapperContained.decodeAsJson(codec); }
public void encodeAsJson(com.mojang.serialization.Codec codec,java.lang.Object value) { wrapperContained.encodeAsJson(codec,value); }
// public io.netty.handler.codec.EncoderException method_49396(java.lang.Object error) { return wrapperContained.method_49396(error); }
// public io.netty.handler.codec.DecoderException method_49397(java.lang.String error) { return wrapperContained.method_49397(error); }
public java.lang.Object decode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec) { return wrapperContained.decode(ops,codec); }
public void writeVec3d(yarnwrap.util.math.Vec3d vec) { wrapperContained.writeVec3d(vec.wrapperContained); }
public java.lang.Object decode(java.util.function.IntFunction idToValue) { return wrapperContained.decode(idToValue); }
public yarnwrap.network.PacketByteBuf encode(java.util.function.ToIntFunction valueToId,java.lang.Object value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.encode(valueToId,value)); }
public yarnwrap.util.math.Vec3d readVec3d() { return new yarnwrap.util.math.Vec3d(wrapperContained.readVec3d()); }
public yarnwrap.registry.RegistryKey readRegistryRefKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.readRegistryRefKey()); }
public yarnwrap.util.math.BlockPos readBlockPos(io.netty.buffer.ByteBuf buf) { return new yarnwrap.util.math.BlockPos(wrapperContained.readBlockPos(buf)); }
public void writeBlockPos(io.netty.buffer.ByteBuf buf,yarnwrap.util.math.BlockPos pos) { wrapperContained.writeBlockPos(buf,pos.wrapperContained); }
public void writeUuid(io.netty.buffer.ByteBuf buf,java.util.UUID uuid) { wrapperContained.writeUuid(buf,uuid); }
public void writeQuaternionf(io.netty.buffer.ByteBuf buf,org.joml.Quaternionf quaternion) { wrapperContained.writeQuaternionf(buf,quaternion); }
public void writeVector3f(io.netty.buffer.ByteBuf buf,org.joml.Vector3f vector) { wrapperContained.writeVector3f(buf,vector); }
public yarnwrap.nbt.NbtElement readNbt(io.netty.buffer.ByteBuf buf,yarnwrap.nbt.NbtSizeTracker sizeTracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.readNbt(buf,sizeTracker.wrapperContained)); }
public void writeNbt(io.netty.buffer.ByteBuf buf,yarnwrap.nbt.NbtElement nbt) { wrapperContained.writeNbt(buf,nbt.wrapperContained); }
public org.joml.Vector3f readVector3f(io.netty.buffer.ByteBuf buf) { return wrapperContained.readVector3f(buf); }
public org.joml.Quaternionf readQuaternionf(io.netty.buffer.ByteBuf buf) { return wrapperContained.readQuaternionf(buf); }
public java.util.UUID readUuid(io.netty.buffer.ByteBuf buf) { return wrapperContained.readUuid(buf); }
public yarnwrap.nbt.NbtCompound readNbt(io.netty.buffer.ByteBuf buf) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt(buf)); }
public byte[] readByteArray(io.netty.buffer.ByteBuf buf) { return wrapperContained.readByteArray(buf); }
public byte[] readByteArray(io.netty.buffer.ByteBuf buf,int maxSize) { return wrapperContained.readByteArray(buf,maxSize); }
public void writeNullable(io.netty.buffer.ByteBuf buf,java.lang.Object value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeNullable(buf,value,writer.wrapperContained); }
public java.lang.Object readNullable(io.netty.buffer.ByteBuf buf,yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readNullable(buf,reader.wrapperContained); }
// public void writeByteArray(io.netty.buffer.ByteBuf buf,byte array) { wrapperContained.writeByteArray(buf,array); }
public java.nio.ByteBuffer nioBuffer(int index,int length) { return wrapperContained.nioBuffer(index,length); }
public java.nio.ByteBuffer[] nioBuffers(int index,int length) { return wrapperContained.nioBuffers(index,length); }
public io.netty.buffer.ByteBuf order(java.nio.ByteOrder byteOrder) { return wrapperContained.order(byteOrder); }
public io.netty.buffer.ByteBuf readBytes(int length) { return wrapperContained.readBytes(length); }
public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf) { return wrapperContained.readBytes(buf); }
public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.readBytes(buf,length); }
public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf,int outputIndex,int length) { return wrapperContained.readBytes(buf,outputIndex,length); }
// public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream stream,int length) { return wrapperContained.readBytes(stream,length); }
public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer buf) { return wrapperContained.readBytes(buf); }
// public int readBytes(java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.readBytes(channel,pos,length); }
// public int readBytes(java.nio.channels.GatheringByteChannel channel,int length) { return wrapperContained.readBytes(channel,length); }
public io.netty.buffer.ByteBuf readBytes(byte bytes) { return wrapperContained.readBytes(bytes); }
// public io.netty.buffer.ByteBuf readBytes(byte bytes,int outputIndex,int length) { return wrapperContained.readBytes(bytes,outputIndex,length); }
public java.lang.CharSequence readCharSequence(int length,java.nio.charset.Charset charset) { return wrapperContained.readCharSequence(length,charset); }
public io.netty.buffer.ByteBuf readRetainedSlice(int length) { return wrapperContained.readRetainedSlice(length); }
public io.netty.buffer.ByteBuf readSlice(int length) { return wrapperContained.readSlice(length); }
public io.netty.buffer.ByteBuf readerIndex(int index) { return wrapperContained.readerIndex(index); }
public boolean release(int decrement) { return wrapperContained.release(decrement); }
public io.netty.buffer.ByteBuf retain(int increment) { return wrapperContained.retain(increment); }
// public io.netty.util.ReferenceCounted retain(int increment) { return wrapperContained.retain(increment); }
public io.netty.buffer.ByteBuf retainedSlice(int index,int length) { return wrapperContained.retainedSlice(index,length); }
public io.netty.buffer.ByteBuf setBoolean(int index,boolean value) { return wrapperContained.setBoolean(index,value); }
public io.netty.buffer.ByteBuf setByte(int index,int value) { return wrapperContained.setByte(index,value); }
public io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf) { return wrapperContained.setBytes(index,buf); }
public io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.setBytes(index,buf,length); }
public io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf,int sourceIndex,int length) { return wrapperContained.setBytes(index,buf,sourceIndex,length); }
// public int setBytes(int index,java.io.InputStream stream,int length) { return wrapperContained.setBytes(index,stream,length); }
public io.netty.buffer.ByteBuf setBytes(int index,java.nio.ByteBuffer buf) { return wrapperContained.setBytes(index,buf); }
// public int setBytes(int index,java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.setBytes(index,channel,pos,length); }
// public int setBytes(int index,java.nio.channels.ScatteringByteChannel channel,int length) { return wrapperContained.setBytes(index,channel,length); }
// public io.netty.buffer.ByteBuf setBytes(int index,byte bytes) { return wrapperContained.setBytes(index,bytes); }
// public io.netty.buffer.ByteBuf setBytes(int index,byte bytes,int sourceIndex,int length) { return wrapperContained.setBytes(index,bytes,sourceIndex,length); }
public io.netty.buffer.ByteBuf setChar(int index,int value) { return wrapperContained.setChar(index,value); }
public int setCharSequence(int index,java.lang.CharSequence sequence,java.nio.charset.Charset charset) { return wrapperContained.setCharSequence(index,sequence,charset); }
public io.netty.buffer.ByteBuf setDouble(int index,double value) { return wrapperContained.setDouble(index,value); }
public io.netty.buffer.ByteBuf setFloat(int index,float value) { return wrapperContained.setFloat(index,value); }
public io.netty.buffer.ByteBuf setIndex(int readerIndex,int writerIndex) { return wrapperContained.setIndex(readerIndex,writerIndex); }
public io.netty.buffer.ByteBuf setInt(int index,int value) { return wrapperContained.setInt(index,value); }
public io.netty.buffer.ByteBuf setIntLE(int index,int value) { return wrapperContained.setIntLE(index,value); }
public io.netty.buffer.ByteBuf setLong(int index,long value) { return wrapperContained.setLong(index,value); }
public io.netty.buffer.ByteBuf setLongLE(int index,long value) { return wrapperContained.setLongLE(index,value); }
public io.netty.buffer.ByteBuf setMedium(int index,int value) { return wrapperContained.setMedium(index,value); }
public io.netty.buffer.ByteBuf setMediumLE(int index,int value) { return wrapperContained.setMediumLE(index,value); }
public io.netty.buffer.ByteBuf setShort(int index,int value) { return wrapperContained.setShort(index,value); }
public io.netty.buffer.ByteBuf setShortLE(int index,int value) { return wrapperContained.setShortLE(index,value); }
public io.netty.buffer.ByteBuf setZero(int index,int length) { return wrapperContained.setZero(index,length); }
public io.netty.buffer.ByteBuf skipBytes(int length) { return wrapperContained.skipBytes(length); }
public io.netty.buffer.ByteBuf slice(int index,int length) { return wrapperContained.slice(index,length); }
public java.lang.String toString(int index,int length,java.nio.charset.Charset charset) { return wrapperContained.toString(index,length,charset); }
public java.lang.String toString(java.nio.charset.Charset charset) { return wrapperContained.toString(charset); }
public io.netty.util.ReferenceCounted touch(java.lang.Object object) { return wrapperContained.touch(object); }
public io.netty.buffer.ByteBuf writeBoolean(boolean value) { return wrapperContained.writeBoolean(value); }
public io.netty.buffer.ByteBuf writeByte(int value) { return wrapperContained.writeByte(value); }
public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf) { return wrapperContained.writeBytes(buf); }
public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.writeBytes(buf,length); }
public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf,int sourceIndex,int length) { return wrapperContained.writeBytes(buf,sourceIndex,length); }
// public int writeBytes(java.io.InputStream stream,int length) { return wrapperContained.writeBytes(stream,length); }
public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer buf) { return wrapperContained.writeBytes(buf); }
// public int writeBytes(java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.writeBytes(channel,pos,length); }
// public int writeBytes(java.nio.channels.ScatteringByteChannel channel,int length) { return wrapperContained.writeBytes(channel,length); }
// public io.netty.buffer.ByteBuf writeBytes(byte bytes) { return wrapperContained.writeBytes(bytes); }
// public io.netty.buffer.ByteBuf writeBytes(byte bytes,int sourceIndex,int length) { return wrapperContained.writeBytes(bytes,sourceIndex,length); }
public io.netty.buffer.ByteBuf writeChar(int value) { return wrapperContained.writeChar(value); }
public int writeCharSequence(java.lang.CharSequence sequence,java.nio.charset.Charset charset) { return wrapperContained.writeCharSequence(sequence,charset); }
public io.netty.buffer.ByteBuf writeDouble(double value) { return wrapperContained.writeDouble(value); }
public io.netty.buffer.ByteBuf writeFloat(float value) { return wrapperContained.writeFloat(value); }
public io.netty.buffer.ByteBuf writeInt(int value) { return wrapperContained.writeInt(value); }
public io.netty.buffer.ByteBuf writeIntLE(int value) { return wrapperContained.writeIntLE(value); }
public io.netty.buffer.ByteBuf writeLong(long value) { return wrapperContained.writeLong(value); }
public io.netty.buffer.ByteBuf writeLongLE(long value) { return wrapperContained.writeLongLE(value); }
public io.netty.buffer.ByteBuf writeMedium(int value) { return wrapperContained.writeMedium(value); }
public io.netty.buffer.ByteBuf writeMediumLE(int value) { return wrapperContained.writeMediumLE(value); }
public io.netty.buffer.ByteBuf writeShort(int value) { return wrapperContained.writeShort(value); }
public io.netty.buffer.ByteBuf writeShortLE(int value) { return wrapperContained.writeShortLE(value); }
public io.netty.buffer.ByteBuf writeZero(int length) { return wrapperContained.writeZero(length); }
public io.netty.buffer.ByteBuf writerIndex(int index) { return wrapperContained.writerIndex(index); }

}