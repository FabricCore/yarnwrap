package yarnwrap.network;
public class PacketByteBuf { public net.minecraft.network.PacketByteBuf wrapperContained; public PacketByteBuf(net.minecraft.network.PacketByteBuf wrapperContained) { this.wrapperContained = wrapperContained; }

// public io.netty.buffer.ByteBuf parent() { return wrapperContained.parent; }
public short DEFAULT_MAX_STRING_LENGTH() { return wrapperContained.DEFAULT_MAX_STRING_LENGTH; }
public int MAX_TEXT_LENGTH() { return wrapperContained.MAX_TEXT_LENGTH; }
public int MAX_READ_NBT_SIZE() { return wrapperContained.MAX_READ_NBT_SIZE; }
// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
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
public void writeCollection(java.util.Collection collection,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeCollection(collection,writer.wrapperContained); }
public void writeMap(java.util.Map map,yarnwrap.network.codec.PacketEncoder keyWriter,yarnwrap.network.codec.PacketEncoder valueWriter) { wrapperContained.writeMap(map,keyWriter.wrapperContained,valueWriter.wrapperContained); }
public void forEachInCollection(java.util.function.Consumer consumer) { wrapperContained.forEachInCollection(consumer); }
public java.util.List readList(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readList(reader.wrapperContained); }
public java.util.Map readMap(yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader) { return wrapperContained.readMap(keyReader.wrapperContained,valueReader.wrapperContained); }
public java.util.Collection readCollection(java.util.function.IntFunction collectionFactory,yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readCollection(collectionFactory,reader.wrapperContained); }
public java.util.Map readMap(java.util.function.IntFunction mapFactory,yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader) { return wrapperContained.readMap(mapFactory,keyReader.wrapperContained,valueReader.wrapperContained); }
public yarnwrap.network.PacketByteBuf writeChunkPos(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeChunkPos(pos.wrapperContained)); }
public yarnwrap.network.PacketByteBuf writeChunkSectionPos(yarnwrap.util.math.ChunkSectionPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeChunkSectionPos(pos.wrapperContained)); }
public yarnwrap.util.math.ChunkPos readChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.readChunkPos()); }
public void writeOptional(java.util.Optional value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeOptional(value,writer.wrapperContained); }
public java.util.Optional readOptional(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readOptional(reader.wrapperContained); }
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

}