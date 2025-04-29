package yarnwrap.network;
public class PacketByteBuf { public net.minecraft.network.PacketByteBuf wrapperContained; public PacketByteBuf(net.minecraft.network.PacketByteBuf wrapperContained) { this.wrapperContained = wrapperContained; }

// public io.netty.buffer.ByteBuf parent() { return wrapperContained.parent; }
// public void parent(io.netty.buffer.ByteBuf value) { wrapperContained.parent = value; }
// public static io.netty.buffer.ByteBuf parent() { return net.minecraft.network.PacketByteBuf.parent; }
// public static void parent(io.netty.buffer.ByteBuf value, ) { net.minecraft.network.PacketByteBuf.parent = value; }

// public short DEFAULT_MAX_STRING_LENGTH() { return wrapperContained.DEFAULT_MAX_STRING_LENGTH; }
// public void DEFAULT_MAX_STRING_LENGTH(short value) { wrapperContained.DEFAULT_MAX_STRING_LENGTH = value; }
public static short DEFAULT_MAX_STRING_LENGTH() { return net.minecraft.network.PacketByteBuf.DEFAULT_MAX_STRING_LENGTH; }
// public static void DEFAULT_MAX_STRING_LENGTH(short value, ) { net.minecraft.network.PacketByteBuf.DEFAULT_MAX_STRING_LENGTH = value; }

// public int MAX_TEXT_LENGTH() { return wrapperContained.MAX_TEXT_LENGTH; }
// public void MAX_TEXT_LENGTH(int value) { wrapperContained.MAX_TEXT_LENGTH = value; }
public static int MAX_TEXT_LENGTH() { return net.minecraft.network.PacketByteBuf.MAX_TEXT_LENGTH; }
// public static void MAX_TEXT_LENGTH(int value, ) { net.minecraft.network.PacketByteBuf.MAX_TEXT_LENGTH = value; }

// public int MAX_READ_NBT_SIZE() { return wrapperContained.MAX_READ_NBT_SIZE; }
// public void MAX_READ_NBT_SIZE(int value) { wrapperContained.MAX_READ_NBT_SIZE = value; }
public static int MAX_READ_NBT_SIZE() { return net.minecraft.network.PacketByteBuf.MAX_READ_NBT_SIZE; }
// public static void MAX_READ_NBT_SIZE(int value, ) { net.minecraft.network.PacketByteBuf.MAX_READ_NBT_SIZE = value; }

// public com.google.gson.Gson GSON() { return wrapperContained.GSON; }
// public void GSON(com.google.gson.Gson value) { wrapperContained.GSON = value; }
// public static com.google.gson.Gson GSON() { return net.minecraft.network.PacketByteBuf.GSON; }
// public static void GSON(com.google.gson.Gson value, ) { net.minecraft.network.PacketByteBuf.GSON = value; }

public PacketByteBuf(io.netty.buffer.ByteBuf parent) { this.wrapperContained = new net.minecraft.network.PacketByteBuf(parent); }
public int bytesBefore(byte value) { return wrapperContained.bytesBefore(value); }
// public static int bytesBefore(byte value, ) { return net.minecraft.network.PacketByteBuf.bytesBefore(value); }
public int bytesBefore(int length,byte value) { return wrapperContained.bytesBefore(length,value); }
// public static int bytesBefore(int length,byte value, ) { return net.minecraft.network.PacketByteBuf.bytesBefore(length,value); }
public int bytesBefore(int index,int length,byte value) { return wrapperContained.bytesBefore(index,length,value); }
// public static int bytesBefore(int index,int length,byte value, ) { return net.minecraft.network.PacketByteBuf.bytesBefore(index,length,value); }
public io.netty.buffer.ByteBuf capacity(int capacity) { return wrapperContained.capacity(capacity); }
// public static io.netty.buffer.ByteBuf capacity(int capacity, ) { return net.minecraft.network.PacketByteBuf.capacity(capacity); }
// public int compareTo(java.lang.Object buf) { return wrapperContained.compareTo(buf); }
// public static int compareTo(java.lang.Object buf, ) { return net.minecraft.network.PacketByteBuf.compareTo(buf); }
public io.netty.buffer.ByteBuf copy(int index,int length) { return wrapperContained.copy(index,length); }
// public static io.netty.buffer.ByteBuf copy(int index,int length, ) { return net.minecraft.network.PacketByteBuf.copy(index,length); }
public io.netty.buffer.ByteBuf ensureWritable(int minBytes) { return wrapperContained.ensureWritable(minBytes); }
// public static io.netty.buffer.ByteBuf ensureWritable(int minBytes, ) { return net.minecraft.network.PacketByteBuf.ensureWritable(minBytes); }
public int ensureWritable(int minBytes,boolean force) { return wrapperContained.ensureWritable(minBytes,force); }
// public static int ensureWritable(int minBytes,boolean force, ) { return net.minecraft.network.PacketByteBuf.ensureWritable(minBytes,force); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.network.PacketByteBuf.equals(o); }
public int forEachByte(int index,int length,io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByte(index,length,byteProcessor); }
// public static int forEachByte(int index,int length,io.netty.util.ByteProcessor byteProcessor, ) { return net.minecraft.network.PacketByteBuf.forEachByte(index,length,byteProcessor); }
public int forEachByte(io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByte(byteProcessor); }
// public static int forEachByte(io.netty.util.ByteProcessor byteProcessor, ) { return net.minecraft.network.PacketByteBuf.forEachByte(byteProcessor); }
public int forEachByteDesc(int index,int length,io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByteDesc(index,length,byteProcessor); }
// public static int forEachByteDesc(int index,int length,io.netty.util.ByteProcessor byteProcessor, ) { return net.minecraft.network.PacketByteBuf.forEachByteDesc(index,length,byteProcessor); }
public int forEachByteDesc(io.netty.util.ByteProcessor byteProcessor) { return wrapperContained.forEachByteDesc(byteProcessor); }
// public static int forEachByteDesc(io.netty.util.ByteProcessor byteProcessor, ) { return net.minecraft.network.PacketByteBuf.forEachByteDesc(byteProcessor); }
public boolean getBoolean(int index) { return wrapperContained.getBoolean(index); }
// public static boolean getBoolean(int index, ) { return net.minecraft.network.PacketByteBuf.getBoolean(index); }
public byte getByte(int index) { return wrapperContained.getByte(index); }
// public static byte getByte(int index, ) { return net.minecraft.network.PacketByteBuf.getByte(index); }
public io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf) { return wrapperContained.getBytes(index,buf); }
// public static io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,buf); }
public io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.getBytes(index,buf,length); }
// public static io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf,int length, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,buf,length); }
public io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf,int outputIndex,int length) { return wrapperContained.getBytes(index,buf,outputIndex,length); }
// public static io.netty.buffer.ByteBuf getBytes(int index,io.netty.buffer.ByteBuf buf,int outputIndex,int length, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,buf,outputIndex,length); }
// public io.netty.buffer.ByteBuf getBytes(int index,java.io.OutputStream stream,int length) { return wrapperContained.getBytes(index,stream,length); }
// public static io.netty.buffer.ByteBuf getBytes(int index,java.io.OutputStream stream,int length, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,stream,length); }
public io.netty.buffer.ByteBuf getBytes(int index,java.nio.ByteBuffer buf) { return wrapperContained.getBytes(index,buf); }
// public static io.netty.buffer.ByteBuf getBytes(int index,java.nio.ByteBuffer buf, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,buf); }
// public int getBytes(int index,java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.getBytes(index,channel,pos,length); }
// public static int getBytes(int index,java.nio.channels.FileChannel channel,long pos,int length, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,channel,pos,length); }
// public int getBytes(int index,java.nio.channels.GatheringByteChannel channel,int length) { return wrapperContained.getBytes(index,channel,length); }
// public static int getBytes(int index,java.nio.channels.GatheringByteChannel channel,int length, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,channel,length); }
// public io.netty.buffer.ByteBuf getBytes(int index,byte bytes) { return wrapperContained.getBytes(index,bytes); }
// public static io.netty.buffer.ByteBuf getBytes(int index,byte bytes, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,bytes); }
// public io.netty.buffer.ByteBuf getBytes(int index,byte bytes,int outputIndex,int length) { return wrapperContained.getBytes(index,bytes,outputIndex,length); }
// public static io.netty.buffer.ByteBuf getBytes(int index,byte bytes,int outputIndex,int length, ) { return net.minecraft.network.PacketByteBuf.getBytes(index,bytes,outputIndex,length); }
public char getChar(int index) { return wrapperContained.getChar(index); }
// public static char getChar(int index, ) { return net.minecraft.network.PacketByteBuf.getChar(index); }
public java.lang.CharSequence getCharSequence(int index,int length,java.nio.charset.Charset charset) { return wrapperContained.getCharSequence(index,length,charset); }
// public static java.lang.CharSequence getCharSequence(int index,int length,java.nio.charset.Charset charset, ) { return net.minecraft.network.PacketByteBuf.getCharSequence(index,length,charset); }
public double getDouble(int index) { return wrapperContained.getDouble(index); }
// public static double getDouble(int index, ) { return net.minecraft.network.PacketByteBuf.getDouble(index); }
public float getFloat(int index) { return wrapperContained.getFloat(index); }
// public static float getFloat(int index, ) { return net.minecraft.network.PacketByteBuf.getFloat(index); }
public int getInt(int index) { return wrapperContained.getInt(index); }
// public static int getInt(int index, ) { return net.minecraft.network.PacketByteBuf.getInt(index); }
public int getIntLE(int index) { return wrapperContained.getIntLE(index); }
// public static int getIntLE(int index, ) { return net.minecraft.network.PacketByteBuf.getIntLE(index); }
public long getLong(int index) { return wrapperContained.getLong(index); }
// public static long getLong(int index, ) { return net.minecraft.network.PacketByteBuf.getLong(index); }
public long getLongLE(int index) { return wrapperContained.getLongLE(index); }
// public static long getLongLE(int index, ) { return net.minecraft.network.PacketByteBuf.getLongLE(index); }
public int getMedium(int index) { return wrapperContained.getMedium(index); }
// public static int getMedium(int index, ) { return net.minecraft.network.PacketByteBuf.getMedium(index); }
public int getMediumLE(int index) { return wrapperContained.getMediumLE(index); }
// public static int getMediumLE(int index, ) { return net.minecraft.network.PacketByteBuf.getMediumLE(index); }
public short getShort(int index) { return wrapperContained.getShort(index); }
// public static short getShort(int index, ) { return net.minecraft.network.PacketByteBuf.getShort(index); }
public short getShortLE(int index) { return wrapperContained.getShortLE(index); }
// public static short getShortLE(int index, ) { return net.minecraft.network.PacketByteBuf.getShortLE(index); }
public short getUnsignedByte(int index) { return wrapperContained.getUnsignedByte(index); }
// public static short getUnsignedByte(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedByte(index); }
public long getUnsignedInt(int index) { return wrapperContained.getUnsignedInt(index); }
// public static long getUnsignedInt(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedInt(index); }
public long getUnsignedIntLE(int index) { return wrapperContained.getUnsignedIntLE(index); }
// public static long getUnsignedIntLE(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedIntLE(index); }
public int getUnsignedMedium(int index) { return wrapperContained.getUnsignedMedium(index); }
// public static int getUnsignedMedium(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedMedium(index); }
public int getUnsignedMediumLE(int index) { return wrapperContained.getUnsignedMediumLE(index); }
// public static int getUnsignedMediumLE(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedMediumLE(index); }
public int getUnsignedShort(int index) { return wrapperContained.getUnsignedShort(index); }
// public static int getUnsignedShort(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedShort(index); }
public int getUnsignedShortLE(int index) { return wrapperContained.getUnsignedShortLE(index); }
// public static int getUnsignedShortLE(int index, ) { return net.minecraft.network.PacketByteBuf.getUnsignedShortLE(index); }
public int indexOf(int from,int to,byte value) { return wrapperContained.indexOf(from,to,value); }
// public static int indexOf(int from,int to,byte value, ) { return net.minecraft.network.PacketByteBuf.indexOf(from,to,value); }
public java.nio.ByteBuffer internalNioBuffer(int index,int length) { return wrapperContained.internalNioBuffer(index,length); }
// public static java.nio.ByteBuffer internalNioBuffer(int index,int length, ) { return net.minecraft.network.PacketByteBuf.internalNioBuffer(index,length); }
public boolean isReadable(int size) { return wrapperContained.isReadable(size); }
// public static boolean isReadable(int size, ) { return net.minecraft.network.PacketByteBuf.isReadable(size); }
public boolean isWritable(int size) { return wrapperContained.isWritable(size); }
// public static boolean isWritable(int size, ) { return net.minecraft.network.PacketByteBuf.isWritable(size); }
public int[] readIntArray() { return wrapperContained.readIntArray(); }
// public static int[] readIntArray() { return net.minecraft.network.PacketByteBuf.readIntArray(); }
public yarnwrap.network.PacketByteBuf writeString(java.lang.String string,int maxLength) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeString(string,maxLength)); }
// public static yarnwrap.network.PacketByteBuf writeString(java.lang.String string,int maxLength, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeString(string,maxLength)); }
// public yarnwrap.network.PacketByteBuf writeLongArray(long array) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeLongArray(array)); }
// public static yarnwrap.network.PacketByteBuf writeLongArray(long array, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeLongArray(array)); }
public java.util.UUID readUuid() { return wrapperContained.readUuid(); }
// public static java.util.UUID readUuid() { return net.minecraft.network.PacketByteBuf.readUuid(); }
public yarnwrap.network.PacketByteBuf writeVarLong(long value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeVarLong(value)); }
// public static yarnwrap.network.PacketByteBuf writeVarLong(long value, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeVarLong(value)); }
public long readVarLong() { return wrapperContained.readVarLong(); }
// public static long readVarLong() { return net.minecraft.network.PacketByteBuf.readVarLong(); }
public yarnwrap.network.PacketByteBuf writeNbt(yarnwrap.nbt.NbtElement nbt) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeNbt(nbt.wrapperContained)); }
// public static yarnwrap.network.PacketByteBuf writeNbt(yarnwrap.nbt.NbtElement nbt, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeNbt(nbt.wrapperContained)); }
public byte[] readByteArray() { return wrapperContained.readByteArray(); }
// public static byte[] readByteArray() { return net.minecraft.network.PacketByteBuf.readByteArray(); }
public yarnwrap.network.PacketByteBuf writeDate(java.util.Date date) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeDate(date)); }
// public static yarnwrap.network.PacketByteBuf writeDate(java.util.Date date, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeDate(date)); }
public yarnwrap.network.PacketByteBuf writeUuid(java.util.UUID uuid) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeUuid(uuid)); }
// public static yarnwrap.network.PacketByteBuf writeUuid(java.util.UUID uuid, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeUuid(uuid)); }
public yarnwrap.nbt.NbtCompound readNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt()); }
// public static yarnwrap.nbt.NbtCompound readNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.PacketByteBuf.readNbt()); }
public int[] readIntArray(int maxSize) { return wrapperContained.readIntArray(maxSize); }
// public static int[] readIntArray(int maxSize, ) { return net.minecraft.network.PacketByteBuf.readIntArray(maxSize); }
public java.lang.String readString(int maxLength) { return wrapperContained.readString(maxLength); }
// public static java.lang.String readString(int maxLength, ) { return net.minecraft.network.PacketByteBuf.readString(maxLength); }
// public long[] readLongArray(long toArray) { return wrapperContained.readLongArray(toArray); }
// public static long[] readLongArray(long toArray, ) { return net.minecraft.network.PacketByteBuf.readLongArray(toArray); }
public java.util.Date readDate() { return wrapperContained.readDate(); }
// public static java.util.Date readDate() { return net.minecraft.network.PacketByteBuf.readDate(); }
public byte[] readByteArray(int maxSize) { return wrapperContained.readByteArray(maxSize); }
// public static byte[] readByteArray(int maxSize, ) { return net.minecraft.network.PacketByteBuf.readByteArray(maxSize); }
public yarnwrap.network.PacketByteBuf writeVarInt(int value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeVarInt(value)); }
// public static yarnwrap.network.PacketByteBuf writeVarInt(int value, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeVarInt(value)); }
// public yarnwrap.network.PacketByteBuf writeIntArray(int array) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeIntArray(array)); }
// public static yarnwrap.network.PacketByteBuf writeIntArray(int array, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeIntArray(array)); }
public yarnwrap.network.PacketByteBuf writeBlockPos(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeBlockPos(pos.wrapperContained)); }
// public static yarnwrap.network.PacketByteBuf writeBlockPos(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeBlockPos(pos.wrapperContained)); }
// public long[] readLongArray(long toArray,int maxSize) { return wrapperContained.readLongArray(toArray,maxSize); }
// public static long[] readLongArray(long toArray,int maxSize, ) { return net.minecraft.network.PacketByteBuf.readLongArray(toArray,maxSize); }
public yarnwrap.util.Identifier readIdentifier() { return new yarnwrap.util.Identifier(wrapperContained.readIdentifier()); }
// public static yarnwrap.util.Identifier readIdentifier() { return new yarnwrap.util.Identifier(net.minecraft.network.PacketByteBuf.readIdentifier()); }
public yarnwrap.util.math.BlockPos readBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.readBlockPos()); }
// public static yarnwrap.util.math.BlockPos readBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.PacketByteBuf.readBlockPos()); }
public yarnwrap.network.PacketByteBuf writeIdentifier(yarnwrap.util.Identifier id) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeIdentifier(id.wrapperContained)); }
// public static yarnwrap.network.PacketByteBuf writeIdentifier(yarnwrap.util.Identifier id, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeIdentifier(id.wrapperContained)); }
// public yarnwrap.network.PacketByteBuf writeByteArray(byte array) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeByteArray(array)); }
// public static yarnwrap.network.PacketByteBuf writeByteArray(byte array, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeByteArray(array)); }
public yarnwrap.network.PacketByteBuf writeString(java.lang.String string) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeString(string)); }
// public static yarnwrap.network.PacketByteBuf writeString(java.lang.String string, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeString(string)); }
public int readVarInt() { return wrapperContained.readVarInt(); }
// public static int readVarInt() { return net.minecraft.network.PacketByteBuf.readVarInt(); }
public yarnwrap.network.PacketByteBuf writeEnumConstant(java.lang.Enum instance) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeEnumConstant(instance)); }
// public static yarnwrap.network.PacketByteBuf writeEnumConstant(java.lang.Enum instance, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeEnumConstant(instance)); }
public java.lang.Enum readEnumConstant(java.lang.Class enumClass) { return wrapperContained.readEnumConstant(enumClass); }
// public static java.lang.Enum readEnumConstant(java.lang.Class enumClass, ) { return net.minecraft.network.PacketByteBuf.readEnumConstant(enumClass); }
public void writeBlockHitResult(yarnwrap.util.hit.BlockHitResult hitResult) { wrapperContained.writeBlockHitResult(hitResult.wrapperContained); }
// public static void writeBlockHitResult(yarnwrap.util.hit.BlockHitResult hitResult, ) { net.minecraft.network.PacketByteBuf.writeBlockHitResult(hitResult.wrapperContained); }
public yarnwrap.util.hit.BlockHitResult readBlockHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.readBlockHitResult()); }
// public static yarnwrap.util.hit.BlockHitResult readBlockHitResult() { return new yarnwrap.util.hit.BlockHitResult(net.minecraft.network.PacketByteBuf.readBlockHitResult()); }
public yarnwrap.util.math.ChunkSectionPos readChunkSectionPos() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.readChunkSectionPos()); }
// public static yarnwrap.util.math.ChunkSectionPos readChunkSectionPos() { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.network.PacketByteBuf.readChunkSectionPos()); }
public java.lang.String readString() { return wrapperContained.readString(); }
// public static java.lang.String readString() { return net.minecraft.network.PacketByteBuf.readString(); }
public java.lang.Object decode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,yarnwrap.nbt.NbtSizeTracker sizeTracker) { return wrapperContained.decode(ops,codec,sizeTracker.wrapperContained); }
// public static java.lang.Object decode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,yarnwrap.nbt.NbtSizeTracker sizeTracker, ) { return net.minecraft.network.PacketByteBuf.decode(ops,codec,sizeTracker.wrapperContained); }
public yarnwrap.network.PacketByteBuf encode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,java.lang.Object value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.encode(ops,codec,value)); }
// public static yarnwrap.network.PacketByteBuf encode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec,java.lang.Object value, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.encode(ops,codec,value)); }
public yarnwrap.nbt.NbtElement readNbt(yarnwrap.nbt.NbtSizeTracker sizeTracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.readNbt(sizeTracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement readNbt(yarnwrap.nbt.NbtSizeTracker sizeTracker, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.network.PacketByteBuf.readNbt(sizeTracker.wrapperContained)); }
public long[] readLongArray() { return wrapperContained.readLongArray(); }
// public static long[] readLongArray() { return net.minecraft.network.PacketByteBuf.readLongArray(); }
public void writeBitSet(java.util.BitSet bitSet) { wrapperContained.writeBitSet(bitSet); }
// public static void writeBitSet(java.util.BitSet bitSet, ) { net.minecraft.network.PacketByteBuf.writeBitSet(bitSet); }
public java.util.BitSet readBitSet() { return wrapperContained.readBitSet(); }
// public static java.util.BitSet readBitSet() { return net.minecraft.network.PacketByteBuf.readBitSet(); }
public it.unimi.dsi.fastutil.ints.IntList readIntList() { return wrapperContained.readIntList(); }
// public static it.unimi.dsi.fastutil.ints.IntList readIntList() { return net.minecraft.network.PacketByteBuf.readIntList(); }
public void writeIntList(it.unimi.dsi.fastutil.ints.IntList list) { wrapperContained.writeIntList(list); }
// public static void writeIntList(it.unimi.dsi.fastutil.ints.IntList list, ) { net.minecraft.network.PacketByteBuf.writeIntList(list); }
// public io.netty.handler.codec.EncoderException method_34061(java.lang.Object error) { return wrapperContained.method_34061(error); }
// public static io.netty.handler.codec.EncoderException method_34061(java.lang.Object error, ) { return net.minecraft.network.PacketByteBuf.method_34061(error); }
public void writeCollection(java.util.Collection collection,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeCollection(collection,writer.wrapperContained); }
// public static void writeCollection(java.util.Collection collection,yarnwrap.network.codec.PacketEncoder writer, ) { net.minecraft.network.PacketByteBuf.writeCollection(collection,writer.wrapperContained); }
public void writeMap(java.util.Map map,yarnwrap.network.codec.PacketEncoder keyWriter,yarnwrap.network.codec.PacketEncoder valueWriter) { wrapperContained.writeMap(map,keyWriter.wrapperContained,valueWriter.wrapperContained); }
// public static void writeMap(java.util.Map map,yarnwrap.network.codec.PacketEncoder keyWriter,yarnwrap.network.codec.PacketEncoder valueWriter, ) { net.minecraft.network.PacketByteBuf.writeMap(map,keyWriter.wrapperContained,valueWriter.wrapperContained); }
// public void method_34064(yarnwrap.network.codec.PacketEncoder key,yarnwrap.network.codec.PacketEncoder value) { wrapperContained.method_34064(key.wrapperContained,value.wrapperContained); }
// public static void method_34064(yarnwrap.network.codec.PacketEncoder key,yarnwrap.network.codec.PacketEncoder value, ) { net.minecraft.network.PacketByteBuf.method_34064(key.wrapperContained,value.wrapperContained); }
public void forEachInCollection(java.util.function.Consumer consumer) { wrapperContained.forEachInCollection(consumer); }
// public static void forEachInCollection(java.util.function.Consumer consumer, ) { net.minecraft.network.PacketByteBuf.forEachInCollection(consumer); }
public java.util.List readList(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readList(reader.wrapperContained); }
// public static java.util.List readList(yarnwrap.network.codec.PacketDecoder reader, ) { return net.minecraft.network.PacketByteBuf.readList(reader.wrapperContained); }
public java.util.Map readMap(yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader) { return wrapperContained.readMap(keyReader.wrapperContained,valueReader.wrapperContained); }
// public static java.util.Map readMap(yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader, ) { return net.minecraft.network.PacketByteBuf.readMap(keyReader.wrapperContained,valueReader.wrapperContained); }
public java.util.Collection readCollection(java.util.function.IntFunction collectionFactory,yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readCollection(collectionFactory,reader.wrapperContained); }
// public static java.util.Collection readCollection(java.util.function.IntFunction collectionFactory,yarnwrap.network.codec.PacketDecoder reader, ) { return net.minecraft.network.PacketByteBuf.readCollection(collectionFactory,reader.wrapperContained); }
public java.util.Map readMap(java.util.function.IntFunction mapFactory,yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader) { return wrapperContained.readMap(mapFactory,keyReader.wrapperContained,valueReader.wrapperContained); }
// public static java.util.Map readMap(java.util.function.IntFunction mapFactory,yarnwrap.network.codec.PacketDecoder keyReader,yarnwrap.network.codec.PacketDecoder valueReader, ) { return net.minecraft.network.PacketByteBuf.readMap(mapFactory,keyReader.wrapperContained,valueReader.wrapperContained); }
// public io.netty.handler.codec.DecoderException method_34070(yarnwrap.nbt.NbtElement error) { return wrapperContained.method_34070(error.wrapperContained); }
// public static io.netty.handler.codec.DecoderException method_34070(yarnwrap.nbt.NbtElement error, ) { return net.minecraft.network.PacketByteBuf.method_34070(error.wrapperContained); }
public yarnwrap.network.PacketByteBuf writeChunkPos(yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeChunkPos(pos.wrapperContained)); }
// public static yarnwrap.network.PacketByteBuf writeChunkPos(yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeChunkPos(pos.wrapperContained)); }
public yarnwrap.network.PacketByteBuf writeChunkSectionPos(yarnwrap.util.math.ChunkSectionPos pos) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writeChunkSectionPos(pos.wrapperContained)); }
// public static yarnwrap.network.PacketByteBuf writeChunkSectionPos(yarnwrap.util.math.ChunkSectionPos pos, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writeChunkSectionPos(pos.wrapperContained)); }
public yarnwrap.util.math.ChunkPos readChunkPos() { return new yarnwrap.util.math.ChunkPos(wrapperContained.readChunkPos()); }
// public static yarnwrap.util.math.ChunkPos readChunkPos() { return new yarnwrap.util.math.ChunkPos(net.minecraft.network.PacketByteBuf.readChunkPos()); }
public void writeOptional(java.util.Optional value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeOptional(value,writer.wrapperContained); }
// public static void writeOptional(java.util.Optional value,yarnwrap.network.codec.PacketEncoder writer, ) { net.minecraft.network.PacketByteBuf.writeOptional(value,writer.wrapperContained); }
public java.util.Optional readOptional(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readOptional(reader.wrapperContained); }
// public static java.util.Optional readOptional(yarnwrap.network.codec.PacketDecoder reader, ) { return net.minecraft.network.PacketByteBuf.readOptional(reader.wrapperContained); }
// public java.lang.Object method_37452(int value) { return wrapperContained.method_37452(value); }
// public static java.lang.Object method_37452(int value, ) { return net.minecraft.network.PacketByteBuf.method_37452(value); }
// public java.util.function.IntFunction getMaxValidator(java.util.function.IntFunction applier,int max) { return wrapperContained.getMaxValidator(applier,max); }
// public static java.util.function.IntFunction getMaxValidator(java.util.function.IntFunction applier,int max, ) { return net.minecraft.network.PacketByteBuf.getMaxValidator(applier,max); }
public void writeNullable(java.lang.Object value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeNullable(value,writer.wrapperContained); }
// public static void writeNullable(java.lang.Object value,yarnwrap.network.codec.PacketEncoder writer, ) { net.minecraft.network.PacketByteBuf.writeNullable(value,writer.wrapperContained); }
public java.lang.Object readNullable(yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readNullable(reader.wrapperContained); }
// public static java.lang.Object readNullable(yarnwrap.network.codec.PacketDecoder reader, ) { return net.minecraft.network.PacketByteBuf.readNullable(reader.wrapperContained); }
public yarnwrap.registry.RegistryKey readRegistryKey(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.registry.RegistryKey(wrapperContained.readRegistryKey(registryRef.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey readRegistryKey(yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.network.PacketByteBuf.readRegistryKey(registryRef.wrapperContained)); }
public void writeGlobalPos(yarnwrap.util.math.GlobalPos pos) { wrapperContained.writeGlobalPos(pos.wrapperContained); }
// public static void writeGlobalPos(yarnwrap.util.math.GlobalPos pos, ) { net.minecraft.network.PacketByteBuf.writeGlobalPos(pos.wrapperContained); }
public yarnwrap.network.PacketByteBuf writePublicKey(java.security.PublicKey publicKey) { return new yarnwrap.network.PacketByteBuf(wrapperContained.writePublicKey(publicKey)); }
// public static yarnwrap.network.PacketByteBuf writePublicKey(java.security.PublicKey publicKey, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.writePublicKey(publicKey)); }
public void writeInstant(java.time.Instant instant) { wrapperContained.writeInstant(instant); }
// public static void writeInstant(java.time.Instant instant, ) { net.minecraft.network.PacketByteBuf.writeInstant(instant); }
public void writeRegistryKey(yarnwrap.registry.RegistryKey key) { wrapperContained.writeRegistryKey(key.wrapperContained); }
// public static void writeRegistryKey(yarnwrap.registry.RegistryKey key, ) { net.minecraft.network.PacketByteBuf.writeRegistryKey(key.wrapperContained); }
public yarnwrap.util.math.GlobalPos readGlobalPos() { return new yarnwrap.util.math.GlobalPos(wrapperContained.readGlobalPos()); }
// public static yarnwrap.util.math.GlobalPos readGlobalPos() { return new yarnwrap.util.math.GlobalPos(net.minecraft.network.PacketByteBuf.readGlobalPos()); }
public java.time.Instant readInstant() { return wrapperContained.readInstant(); }
// public static java.time.Instant readInstant() { return net.minecraft.network.PacketByteBuf.readInstant(); }
public java.security.PublicKey readPublicKey() { return wrapperContained.readPublicKey(); }
// public static java.security.PublicKey readPublicKey() { return net.minecraft.network.PacketByteBuf.readPublicKey(); }
public java.util.EnumSet readEnumSet(java.lang.Class type) { return wrapperContained.readEnumSet(type); }
// public static java.util.EnumSet readEnumSet(java.lang.Class type, ) { return net.minecraft.network.PacketByteBuf.readEnumSet(type); }
public void writeBitSet(java.util.BitSet bitSet,int size) { wrapperContained.writeBitSet(bitSet,size); }
// public static void writeBitSet(java.util.BitSet bitSet,int size, ) { net.minecraft.network.PacketByteBuf.writeBitSet(bitSet,size); }
public void writeEnumSet(java.util.EnumSet enumSet,java.lang.Class type) { wrapperContained.writeEnumSet(enumSet,type); }
// public static void writeEnumSet(java.util.EnumSet enumSet,java.lang.Class type, ) { net.minecraft.network.PacketByteBuf.writeEnumSet(enumSet,type); }
public java.util.BitSet readBitSet(int size) { return wrapperContained.readBitSet(size); }
// public static java.util.BitSet readBitSet(int size, ) { return net.minecraft.network.PacketByteBuf.readBitSet(size); }
public void writeQuaternionf(org.joml.Quaternionf quaternionf) { wrapperContained.writeQuaternionf(quaternionf); }
// public static void writeQuaternionf(org.joml.Quaternionf quaternionf, ) { net.minecraft.network.PacketByteBuf.writeQuaternionf(quaternionf); }
public void writeVector3f(org.joml.Vector3f vector3f) { wrapperContained.writeVector3f(vector3f); }
// public static void writeVector3f(org.joml.Vector3f vector3f, ) { net.minecraft.network.PacketByteBuf.writeVector3f(vector3f); }
public org.joml.Vector3f readVector3f() { return wrapperContained.readVector3f(); }
// public static org.joml.Vector3f readVector3f() { return net.minecraft.network.PacketByteBuf.readVector3f(); }
public org.joml.Quaternionf readQuaternionf() { return wrapperContained.readQuaternionf(); }
// public static org.joml.Quaternionf readQuaternionf() { return net.minecraft.network.PacketByteBuf.readQuaternionf(); }
public java.lang.Object decodeAsJson(com.mojang.serialization.Codec codec) { return wrapperContained.decodeAsJson(codec); }
// public static java.lang.Object decodeAsJson(com.mojang.serialization.Codec codec, ) { return net.minecraft.network.PacketByteBuf.decodeAsJson(codec); }
public void encodeAsJson(com.mojang.serialization.Codec codec,java.lang.Object value) { wrapperContained.encodeAsJson(codec,value); }
// public static void encodeAsJson(com.mojang.serialization.Codec codec,java.lang.Object value, ) { net.minecraft.network.PacketByteBuf.encodeAsJson(codec,value); }
// public io.netty.handler.codec.EncoderException method_49396(java.lang.Object error) { return wrapperContained.method_49396(error); }
// public static io.netty.handler.codec.EncoderException method_49396(java.lang.Object error, ) { return net.minecraft.network.PacketByteBuf.method_49396(error); }
// public io.netty.handler.codec.DecoderException method_49397(java.lang.String error) { return wrapperContained.method_49397(error); }
// public static io.netty.handler.codec.DecoderException method_49397(java.lang.String error, ) { return net.minecraft.network.PacketByteBuf.method_49397(error); }
public java.lang.Object decode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec) { return wrapperContained.decode(ops,codec); }
// public static java.lang.Object decode(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec, ) { return net.minecraft.network.PacketByteBuf.decode(ops,codec); }
public void writeVec3d(yarnwrap.util.math.Vec3d vec) { wrapperContained.writeVec3d(vec.wrapperContained); }
// public static void writeVec3d(yarnwrap.util.math.Vec3d vec, ) { net.minecraft.network.PacketByteBuf.writeVec3d(vec.wrapperContained); }
public java.lang.Object decode(java.util.function.IntFunction idToValue) { return wrapperContained.decode(idToValue); }
// public static java.lang.Object decode(java.util.function.IntFunction idToValue, ) { return net.minecraft.network.PacketByteBuf.decode(idToValue); }
public yarnwrap.network.PacketByteBuf encode(java.util.function.ToIntFunction valueToId,java.lang.Object value) { return new yarnwrap.network.PacketByteBuf(wrapperContained.encode(valueToId,value)); }
// public static yarnwrap.network.PacketByteBuf encode(java.util.function.ToIntFunction valueToId,java.lang.Object value, ) { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.PacketByteBuf.encode(valueToId,value)); }
public yarnwrap.util.math.Vec3d readVec3d() { return new yarnwrap.util.math.Vec3d(wrapperContained.readVec3d()); }
// public static yarnwrap.util.math.Vec3d readVec3d() { return new yarnwrap.util.math.Vec3d(net.minecraft.network.PacketByteBuf.readVec3d()); }
public yarnwrap.registry.RegistryKey readRegistryRefKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.readRegistryRefKey()); }
// public static yarnwrap.registry.RegistryKey readRegistryRefKey() { return new yarnwrap.registry.RegistryKey(net.minecraft.network.PacketByteBuf.readRegistryRefKey()); }
// public yarnwrap.util.math.BlockPos readBlockPos(io.netty.buffer.ByteBuf buf) { return new yarnwrap.util.math.BlockPos(wrapperContained.readBlockPos(buf)); }
// public static yarnwrap.util.math.BlockPos readBlockPos(io.netty.buffer.ByteBuf buf, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.network.PacketByteBuf.readBlockPos(buf)); }
// public void writeBlockPos(io.netty.buffer.ByteBuf buf,yarnwrap.util.math.BlockPos pos) { wrapperContained.writeBlockPos(buf,pos.wrapperContained); }
// public static void writeBlockPos(io.netty.buffer.ByteBuf buf,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.network.PacketByteBuf.writeBlockPos(buf,pos.wrapperContained); }
// public void writeUuid(io.netty.buffer.ByteBuf buf,java.util.UUID uuid) { wrapperContained.writeUuid(buf,uuid); }
// public static void writeUuid(io.netty.buffer.ByteBuf buf,java.util.UUID uuid, ) { net.minecraft.network.PacketByteBuf.writeUuid(buf,uuid); }
// public void writeQuaternionf(io.netty.buffer.ByteBuf buf,org.joml.Quaternionf quaternion) { wrapperContained.writeQuaternionf(buf,quaternion); }
// public static void writeQuaternionf(io.netty.buffer.ByteBuf buf,org.joml.Quaternionf quaternion, ) { net.minecraft.network.PacketByteBuf.writeQuaternionf(buf,quaternion); }
// public void writeVector3f(io.netty.buffer.ByteBuf buf,org.joml.Vector3f vector) { wrapperContained.writeVector3f(buf,vector); }
// public static void writeVector3f(io.netty.buffer.ByteBuf buf,org.joml.Vector3f vector, ) { net.minecraft.network.PacketByteBuf.writeVector3f(buf,vector); }
// public yarnwrap.nbt.NbtElement readNbt(io.netty.buffer.ByteBuf buf,yarnwrap.nbt.NbtSizeTracker sizeTracker) { return new yarnwrap.nbt.NbtElement(wrapperContained.readNbt(buf,sizeTracker.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement readNbt(io.netty.buffer.ByteBuf buf,yarnwrap.nbt.NbtSizeTracker sizeTracker, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.network.PacketByteBuf.readNbt(buf,sizeTracker.wrapperContained)); }
// public void writeNbt(io.netty.buffer.ByteBuf buf,yarnwrap.nbt.NbtElement nbt) { wrapperContained.writeNbt(buf,nbt.wrapperContained); }
// public static void writeNbt(io.netty.buffer.ByteBuf buf,yarnwrap.nbt.NbtElement nbt, ) { net.minecraft.network.PacketByteBuf.writeNbt(buf,nbt.wrapperContained); }
// public org.joml.Vector3f readVector3f(io.netty.buffer.ByteBuf buf) { return wrapperContained.readVector3f(buf); }
// public static org.joml.Vector3f readVector3f(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.readVector3f(buf); }
// public org.joml.Quaternionf readQuaternionf(io.netty.buffer.ByteBuf buf) { return wrapperContained.readQuaternionf(buf); }
// public static org.joml.Quaternionf readQuaternionf(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.readQuaternionf(buf); }
// public java.util.UUID readUuid(io.netty.buffer.ByteBuf buf) { return wrapperContained.readUuid(buf); }
// public static java.util.UUID readUuid(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.readUuid(buf); }
// public yarnwrap.nbt.NbtCompound readNbt(io.netty.buffer.ByteBuf buf) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readNbt(buf)); }
// public static yarnwrap.nbt.NbtCompound readNbt(io.netty.buffer.ByteBuf buf, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.PacketByteBuf.readNbt(buf)); }
// public byte[] readByteArray(io.netty.buffer.ByteBuf buf) { return wrapperContained.readByteArray(buf); }
// public static byte[] readByteArray(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.readByteArray(buf); }
// public byte[] readByteArray(io.netty.buffer.ByteBuf buf,int maxSize) { return wrapperContained.readByteArray(buf,maxSize); }
// public static byte[] readByteArray(io.netty.buffer.ByteBuf buf,int maxSize, ) { return net.minecraft.network.PacketByteBuf.readByteArray(buf,maxSize); }
// public void writeNullable(io.netty.buffer.ByteBuf buf,java.lang.Object value,yarnwrap.network.codec.PacketEncoder writer) { wrapperContained.writeNullable(buf,value,writer.wrapperContained); }
// public static void writeNullable(io.netty.buffer.ByteBuf buf,java.lang.Object value,yarnwrap.network.codec.PacketEncoder writer, ) { net.minecraft.network.PacketByteBuf.writeNullable(buf,value,writer.wrapperContained); }
// public java.lang.Object readNullable(io.netty.buffer.ByteBuf buf,yarnwrap.network.codec.PacketDecoder reader) { return wrapperContained.readNullable(buf,reader.wrapperContained); }
// public static java.lang.Object readNullable(io.netty.buffer.ByteBuf buf,yarnwrap.network.codec.PacketDecoder reader, ) { return net.minecraft.network.PacketByteBuf.readNullable(buf,reader.wrapperContained); }
// public void writeByteArray(io.netty.buffer.ByteBuf buf,byte array) { wrapperContained.writeByteArray(buf,array); }
// public static void writeByteArray(io.netty.buffer.ByteBuf buf,byte array, ) { net.minecraft.network.PacketByteBuf.writeByteArray(buf,array); }
public java.nio.ByteBuffer nioBuffer(int index,int length) { return wrapperContained.nioBuffer(index,length); }
// public static java.nio.ByteBuffer nioBuffer(int index,int length, ) { return net.minecraft.network.PacketByteBuf.nioBuffer(index,length); }
public java.nio.ByteBuffer[] nioBuffers(int index,int length) { return wrapperContained.nioBuffers(index,length); }
// public static java.nio.ByteBuffer[] nioBuffers(int index,int length, ) { return net.minecraft.network.PacketByteBuf.nioBuffers(index,length); }
public io.netty.buffer.ByteBuf order(java.nio.ByteOrder byteOrder) { return wrapperContained.order(byteOrder); }
// public static io.netty.buffer.ByteBuf order(java.nio.ByteOrder byteOrder, ) { return net.minecraft.network.PacketByteBuf.order(byteOrder); }
public io.netty.buffer.ByteBuf readBytes(int length) { return wrapperContained.readBytes(length); }
// public static io.netty.buffer.ByteBuf readBytes(int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(length); }
public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf) { return wrapperContained.readBytes(buf); }
// public static io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.readBytes(buf); }
public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.readBytes(buf,length); }
// public static io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf,int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(buf,length); }
public io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf,int outputIndex,int length) { return wrapperContained.readBytes(buf,outputIndex,length); }
// public static io.netty.buffer.ByteBuf readBytes(io.netty.buffer.ByteBuf buf,int outputIndex,int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(buf,outputIndex,length); }
// public io.netty.buffer.ByteBuf readBytes(java.io.OutputStream stream,int length) { return wrapperContained.readBytes(stream,length); }
// public static io.netty.buffer.ByteBuf readBytes(java.io.OutputStream stream,int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(stream,length); }
public io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer buf) { return wrapperContained.readBytes(buf); }
// public static io.netty.buffer.ByteBuf readBytes(java.nio.ByteBuffer buf, ) { return net.minecraft.network.PacketByteBuf.readBytes(buf); }
// public int readBytes(java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.readBytes(channel,pos,length); }
// public static int readBytes(java.nio.channels.FileChannel channel,long pos,int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(channel,pos,length); }
// public int readBytes(java.nio.channels.GatheringByteChannel channel,int length) { return wrapperContained.readBytes(channel,length); }
// public static int readBytes(java.nio.channels.GatheringByteChannel channel,int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(channel,length); }
public io.netty.buffer.ByteBuf readBytes(byte bytes) { return wrapperContained.readBytes(bytes); }
// public static io.netty.buffer.ByteBuf readBytes(byte bytes, ) { return net.minecraft.network.PacketByteBuf.readBytes(bytes); }
// public io.netty.buffer.ByteBuf readBytes(byte bytes,int outputIndex,int length) { return wrapperContained.readBytes(bytes,outputIndex,length); }
// public static io.netty.buffer.ByteBuf readBytes(byte bytes,int outputIndex,int length, ) { return net.minecraft.network.PacketByteBuf.readBytes(bytes,outputIndex,length); }
public java.lang.CharSequence readCharSequence(int length,java.nio.charset.Charset charset) { return wrapperContained.readCharSequence(length,charset); }
// public static java.lang.CharSequence readCharSequence(int length,java.nio.charset.Charset charset, ) { return net.minecraft.network.PacketByteBuf.readCharSequence(length,charset); }
public io.netty.buffer.ByteBuf readRetainedSlice(int length) { return wrapperContained.readRetainedSlice(length); }
// public static io.netty.buffer.ByteBuf readRetainedSlice(int length, ) { return net.minecraft.network.PacketByteBuf.readRetainedSlice(length); }
public io.netty.buffer.ByteBuf readSlice(int length) { return wrapperContained.readSlice(length); }
// public static io.netty.buffer.ByteBuf readSlice(int length, ) { return net.minecraft.network.PacketByteBuf.readSlice(length); }
public io.netty.buffer.ByteBuf readerIndex(int index) { return wrapperContained.readerIndex(index); }
// public static io.netty.buffer.ByteBuf readerIndex(int index, ) { return net.minecraft.network.PacketByteBuf.readerIndex(index); }
public boolean release(int decrement) { return wrapperContained.release(decrement); }
// public static boolean release(int decrement, ) { return net.minecraft.network.PacketByteBuf.release(decrement); }
public io.netty.buffer.ByteBuf retain(int increment) { return wrapperContained.retain(increment); }
// public static io.netty.buffer.ByteBuf retain(int increment, ) { return net.minecraft.network.PacketByteBuf.retain(increment); }
// public io.netty.util.ReferenceCounted retain(int increment) { return wrapperContained.retain(increment); }
// // public static io.netty.util.ReferenceCounted retain(int increment, ) { return net.minecraft.network.PacketByteBuf.retain(increment); }
public io.netty.buffer.ByteBuf retainedSlice(int index,int length) { return wrapperContained.retainedSlice(index,length); }
// public static io.netty.buffer.ByteBuf retainedSlice(int index,int length, ) { return net.minecraft.network.PacketByteBuf.retainedSlice(index,length); }
public io.netty.buffer.ByteBuf setBoolean(int index,boolean value) { return wrapperContained.setBoolean(index,value); }
// public static io.netty.buffer.ByteBuf setBoolean(int index,boolean value, ) { return net.minecraft.network.PacketByteBuf.setBoolean(index,value); }
public io.netty.buffer.ByteBuf setByte(int index,int value) { return wrapperContained.setByte(index,value); }
// public static io.netty.buffer.ByteBuf setByte(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setByte(index,value); }
public io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf) { return wrapperContained.setBytes(index,buf); }
// public static io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,buf); }
public io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.setBytes(index,buf,length); }
// public static io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf,int length, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,buf,length); }
public io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf,int sourceIndex,int length) { return wrapperContained.setBytes(index,buf,sourceIndex,length); }
// public static io.netty.buffer.ByteBuf setBytes(int index,io.netty.buffer.ByteBuf buf,int sourceIndex,int length, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,buf,sourceIndex,length); }
// public int setBytes(int index,java.io.InputStream stream,int length) { return wrapperContained.setBytes(index,stream,length); }
// public static int setBytes(int index,java.io.InputStream stream,int length, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,stream,length); }
public io.netty.buffer.ByteBuf setBytes(int index,java.nio.ByteBuffer buf) { return wrapperContained.setBytes(index,buf); }
// public static io.netty.buffer.ByteBuf setBytes(int index,java.nio.ByteBuffer buf, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,buf); }
// public int setBytes(int index,java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.setBytes(index,channel,pos,length); }
// public static int setBytes(int index,java.nio.channels.FileChannel channel,long pos,int length, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,channel,pos,length); }
// public int setBytes(int index,java.nio.channels.ScatteringByteChannel channel,int length) { return wrapperContained.setBytes(index,channel,length); }
// public static int setBytes(int index,java.nio.channels.ScatteringByteChannel channel,int length, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,channel,length); }
// public io.netty.buffer.ByteBuf setBytes(int index,byte bytes) { return wrapperContained.setBytes(index,bytes); }
// public static io.netty.buffer.ByteBuf setBytes(int index,byte bytes, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,bytes); }
// public io.netty.buffer.ByteBuf setBytes(int index,byte bytes,int sourceIndex,int length) { return wrapperContained.setBytes(index,bytes,sourceIndex,length); }
// public static io.netty.buffer.ByteBuf setBytes(int index,byte bytes,int sourceIndex,int length, ) { return net.minecraft.network.PacketByteBuf.setBytes(index,bytes,sourceIndex,length); }
public io.netty.buffer.ByteBuf setChar(int index,int value) { return wrapperContained.setChar(index,value); }
// public static io.netty.buffer.ByteBuf setChar(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setChar(index,value); }
public int setCharSequence(int index,java.lang.CharSequence sequence,java.nio.charset.Charset charset) { return wrapperContained.setCharSequence(index,sequence,charset); }
// public static int setCharSequence(int index,java.lang.CharSequence sequence,java.nio.charset.Charset charset, ) { return net.minecraft.network.PacketByteBuf.setCharSequence(index,sequence,charset); }
public io.netty.buffer.ByteBuf setDouble(int index,double value) { return wrapperContained.setDouble(index,value); }
// public static io.netty.buffer.ByteBuf setDouble(int index,double value, ) { return net.minecraft.network.PacketByteBuf.setDouble(index,value); }
public io.netty.buffer.ByteBuf setFloat(int index,float value) { return wrapperContained.setFloat(index,value); }
// public static io.netty.buffer.ByteBuf setFloat(int index,float value, ) { return net.minecraft.network.PacketByteBuf.setFloat(index,value); }
public io.netty.buffer.ByteBuf setIndex(int readerIndex,int writerIndex) { return wrapperContained.setIndex(readerIndex,writerIndex); }
// public static io.netty.buffer.ByteBuf setIndex(int readerIndex,int writerIndex, ) { return net.minecraft.network.PacketByteBuf.setIndex(readerIndex,writerIndex); }
public io.netty.buffer.ByteBuf setInt(int index,int value) { return wrapperContained.setInt(index,value); }
// public static io.netty.buffer.ByteBuf setInt(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setInt(index,value); }
public io.netty.buffer.ByteBuf setIntLE(int index,int value) { return wrapperContained.setIntLE(index,value); }
// public static io.netty.buffer.ByteBuf setIntLE(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setIntLE(index,value); }
public io.netty.buffer.ByteBuf setLong(int index,long value) { return wrapperContained.setLong(index,value); }
// public static io.netty.buffer.ByteBuf setLong(int index,long value, ) { return net.minecraft.network.PacketByteBuf.setLong(index,value); }
public io.netty.buffer.ByteBuf setLongLE(int index,long value) { return wrapperContained.setLongLE(index,value); }
// public static io.netty.buffer.ByteBuf setLongLE(int index,long value, ) { return net.minecraft.network.PacketByteBuf.setLongLE(index,value); }
public io.netty.buffer.ByteBuf setMedium(int index,int value) { return wrapperContained.setMedium(index,value); }
// public static io.netty.buffer.ByteBuf setMedium(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setMedium(index,value); }
public io.netty.buffer.ByteBuf setMediumLE(int index,int value) { return wrapperContained.setMediumLE(index,value); }
// public static io.netty.buffer.ByteBuf setMediumLE(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setMediumLE(index,value); }
public io.netty.buffer.ByteBuf setShort(int index,int value) { return wrapperContained.setShort(index,value); }
// public static io.netty.buffer.ByteBuf setShort(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setShort(index,value); }
public io.netty.buffer.ByteBuf setShortLE(int index,int value) { return wrapperContained.setShortLE(index,value); }
// public static io.netty.buffer.ByteBuf setShortLE(int index,int value, ) { return net.minecraft.network.PacketByteBuf.setShortLE(index,value); }
public io.netty.buffer.ByteBuf setZero(int index,int length) { return wrapperContained.setZero(index,length); }
// public static io.netty.buffer.ByteBuf setZero(int index,int length, ) { return net.minecraft.network.PacketByteBuf.setZero(index,length); }
public io.netty.buffer.ByteBuf skipBytes(int length) { return wrapperContained.skipBytes(length); }
// public static io.netty.buffer.ByteBuf skipBytes(int length, ) { return net.minecraft.network.PacketByteBuf.skipBytes(length); }
public io.netty.buffer.ByteBuf slice(int index,int length) { return wrapperContained.slice(index,length); }
// public static io.netty.buffer.ByteBuf slice(int index,int length, ) { return net.minecraft.network.PacketByteBuf.slice(index,length); }
public java.lang.String toString(int index,int length,java.nio.charset.Charset charset) { return wrapperContained.toString(index,length,charset); }
// public static java.lang.String toString(int index,int length,java.nio.charset.Charset charset, ) { return net.minecraft.network.PacketByteBuf.toString(index,length,charset); }
public java.lang.String toString(java.nio.charset.Charset charset) { return wrapperContained.toString(charset); }
// public static java.lang.String toString(java.nio.charset.Charset charset, ) { return net.minecraft.network.PacketByteBuf.toString(charset); }
public io.netty.util.ReferenceCounted touch(java.lang.Object object) { return wrapperContained.touch(object); }
// public static io.netty.util.ReferenceCounted touch(java.lang.Object object, ) { return net.minecraft.network.PacketByteBuf.touch(object); }
public io.netty.buffer.ByteBuf writeBoolean(boolean value) { return wrapperContained.writeBoolean(value); }
// public static io.netty.buffer.ByteBuf writeBoolean(boolean value, ) { return net.minecraft.network.PacketByteBuf.writeBoolean(value); }
public io.netty.buffer.ByteBuf writeByte(int value) { return wrapperContained.writeByte(value); }
// public static io.netty.buffer.ByteBuf writeByte(int value, ) { return net.minecraft.network.PacketByteBuf.writeByte(value); }
public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf) { return wrapperContained.writeBytes(buf); }
// public static io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.PacketByteBuf.writeBytes(buf); }
public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf,int length) { return wrapperContained.writeBytes(buf,length); }
// public static io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf,int length, ) { return net.minecraft.network.PacketByteBuf.writeBytes(buf,length); }
public io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf,int sourceIndex,int length) { return wrapperContained.writeBytes(buf,sourceIndex,length); }
// public static io.netty.buffer.ByteBuf writeBytes(io.netty.buffer.ByteBuf buf,int sourceIndex,int length, ) { return net.minecraft.network.PacketByteBuf.writeBytes(buf,sourceIndex,length); }
// public int writeBytes(java.io.InputStream stream,int length) { return wrapperContained.writeBytes(stream,length); }
// public static int writeBytes(java.io.InputStream stream,int length, ) { return net.minecraft.network.PacketByteBuf.writeBytes(stream,length); }
public io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer buf) { return wrapperContained.writeBytes(buf); }
// public static io.netty.buffer.ByteBuf writeBytes(java.nio.ByteBuffer buf, ) { return net.minecraft.network.PacketByteBuf.writeBytes(buf); }
// public int writeBytes(java.nio.channels.FileChannel channel,long pos,int length) { return wrapperContained.writeBytes(channel,pos,length); }
// public static int writeBytes(java.nio.channels.FileChannel channel,long pos,int length, ) { return net.minecraft.network.PacketByteBuf.writeBytes(channel,pos,length); }
// public int writeBytes(java.nio.channels.ScatteringByteChannel channel,int length) { return wrapperContained.writeBytes(channel,length); }
// public static int writeBytes(java.nio.channels.ScatteringByteChannel channel,int length, ) { return net.minecraft.network.PacketByteBuf.writeBytes(channel,length); }
// public io.netty.buffer.ByteBuf writeBytes(byte bytes) { return wrapperContained.writeBytes(bytes); }
// public static io.netty.buffer.ByteBuf writeBytes(byte bytes, ) { return net.minecraft.network.PacketByteBuf.writeBytes(bytes); }
// public io.netty.buffer.ByteBuf writeBytes(byte bytes,int sourceIndex,int length) { return wrapperContained.writeBytes(bytes,sourceIndex,length); }
// public static io.netty.buffer.ByteBuf writeBytes(byte bytes,int sourceIndex,int length, ) { return net.minecraft.network.PacketByteBuf.writeBytes(bytes,sourceIndex,length); }
public io.netty.buffer.ByteBuf writeChar(int value) { return wrapperContained.writeChar(value); }
// public static io.netty.buffer.ByteBuf writeChar(int value, ) { return net.minecraft.network.PacketByteBuf.writeChar(value); }
public int writeCharSequence(java.lang.CharSequence sequence,java.nio.charset.Charset charset) { return wrapperContained.writeCharSequence(sequence,charset); }
// public static int writeCharSequence(java.lang.CharSequence sequence,java.nio.charset.Charset charset, ) { return net.minecraft.network.PacketByteBuf.writeCharSequence(sequence,charset); }
public io.netty.buffer.ByteBuf writeDouble(double value) { return wrapperContained.writeDouble(value); }
// public static io.netty.buffer.ByteBuf writeDouble(double value, ) { return net.minecraft.network.PacketByteBuf.writeDouble(value); }
public io.netty.buffer.ByteBuf writeFloat(float value) { return wrapperContained.writeFloat(value); }
// public static io.netty.buffer.ByteBuf writeFloat(float value, ) { return net.minecraft.network.PacketByteBuf.writeFloat(value); }
public io.netty.buffer.ByteBuf writeInt(int value) { return wrapperContained.writeInt(value); }
// public static io.netty.buffer.ByteBuf writeInt(int value, ) { return net.minecraft.network.PacketByteBuf.writeInt(value); }
public io.netty.buffer.ByteBuf writeIntLE(int value) { return wrapperContained.writeIntLE(value); }
// public static io.netty.buffer.ByteBuf writeIntLE(int value, ) { return net.minecraft.network.PacketByteBuf.writeIntLE(value); }
public io.netty.buffer.ByteBuf writeLong(long value) { return wrapperContained.writeLong(value); }
// public static io.netty.buffer.ByteBuf writeLong(long value, ) { return net.minecraft.network.PacketByteBuf.writeLong(value); }
public io.netty.buffer.ByteBuf writeLongLE(long value) { return wrapperContained.writeLongLE(value); }
// public static io.netty.buffer.ByteBuf writeLongLE(long value, ) { return net.minecraft.network.PacketByteBuf.writeLongLE(value); }
public io.netty.buffer.ByteBuf writeMedium(int value) { return wrapperContained.writeMedium(value); }
// public static io.netty.buffer.ByteBuf writeMedium(int value, ) { return net.minecraft.network.PacketByteBuf.writeMedium(value); }
public io.netty.buffer.ByteBuf writeMediumLE(int value) { return wrapperContained.writeMediumLE(value); }
// public static io.netty.buffer.ByteBuf writeMediumLE(int value, ) { return net.minecraft.network.PacketByteBuf.writeMediumLE(value); }
public io.netty.buffer.ByteBuf writeShort(int value) { return wrapperContained.writeShort(value); }
// public static io.netty.buffer.ByteBuf writeShort(int value, ) { return net.minecraft.network.PacketByteBuf.writeShort(value); }
public io.netty.buffer.ByteBuf writeShortLE(int value) { return wrapperContained.writeShortLE(value); }
// public static io.netty.buffer.ByteBuf writeShortLE(int value, ) { return net.minecraft.network.PacketByteBuf.writeShortLE(value); }
public io.netty.buffer.ByteBuf writeZero(int length) { return wrapperContained.writeZero(length); }
// public static io.netty.buffer.ByteBuf writeZero(int length, ) { return net.minecraft.network.PacketByteBuf.writeZero(length); }
public io.netty.buffer.ByteBuf writerIndex(int index) { return wrapperContained.writerIndex(index); }
// public static io.netty.buffer.ByteBuf writerIndex(int index, ) { return net.minecraft.network.PacketByteBuf.writerIndex(index); }

}