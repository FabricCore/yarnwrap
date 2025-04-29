package yarnwrap.network.packet.s2c.play;
public class ChunkData { public net.minecraft.network.packet.s2c.play.ChunkData wrapperContained; public ChunkData(net.minecraft.network.packet.s2c.play.ChunkData wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_SECTIONS_DATA_SIZE() { return wrapperContained.MAX_SECTIONS_DATA_SIZE; }
// public void MAX_SECTIONS_DATA_SIZE(int value) { wrapperContained.MAX_SECTIONS_DATA_SIZE = value; }
// public static int MAX_SECTIONS_DATA_SIZE() { return net.minecraft.network.packet.s2c.play.ChunkData.MAX_SECTIONS_DATA_SIZE; }
// public static void MAX_SECTIONS_DATA_SIZE(int value, ) { net.minecraft.network.packet.s2c.play.ChunkData.MAX_SECTIONS_DATA_SIZE = value; }

// public yarnwrap.nbt.NbtCompound heightmap() { return new yarnwrap.nbt.NbtCompound(wrapperContained.heightmap); }
// public void heightmap(yarnwrap.nbt.NbtCompound value) { wrapperContained.heightmap = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound heightmap() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.packet.s2c.play.ChunkData.heightmap); }
// public static void heightmap(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.network.packet.s2c.play.ChunkData.heightmap = value.wrapperContained; }

// public byte[] sectionsData() { return wrapperContained.sectionsData; }
// public void sectionsData(byte[] value) { wrapperContained.sectionsData = value; }
// public static byte[] sectionsData() { return net.minecraft.network.packet.s2c.play.ChunkData.sectionsData; }
// public static void sectionsData(byte[] value, ) { net.minecraft.network.packet.s2c.play.ChunkData.sectionsData = value; }

// public java.util.List blockEntities() { return wrapperContained.blockEntities; }
// public void blockEntities(java.util.List value) { wrapperContained.blockEntities = value; }
// public static java.util.List blockEntities() { return net.minecraft.network.packet.s2c.play.ChunkData.blockEntities; }
// public static void blockEntities(java.util.List value, ) { net.minecraft.network.packet.s2c.play.ChunkData.blockEntities = value; }

public ChunkData(yarnwrap.world.chunk.WorldChunk chunk) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkData(chunk.wrapperContained); }
public ChunkData(yarnwrap.network.RegistryByteBuf buf,int x,int z) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkData(buf.wrapperContained,x,z); }
public yarnwrap.network.PacketByteBuf getSectionsDataBuf() { return new yarnwrap.network.PacketByteBuf(wrapperContained.getSectionsDataBuf()); }
// public static yarnwrap.network.PacketByteBuf getSectionsDataBuf() { return new yarnwrap.network.PacketByteBuf(net.minecraft.network.packet.s2c.play.ChunkData.getSectionsDataBuf()); }
public java.util.function.Consumer getBlockEntities(int x,int z) { return wrapperContained.getBlockEntities(x,z); }
// public static java.util.function.Consumer getBlockEntities(int x,int z, ) { return net.minecraft.network.packet.s2c.play.ChunkData.getBlockEntities(x,z); }
// public void method_38588(int visitor) { wrapperContained.method_38588(visitor); }
// public static void method_38588(int visitor, ) { net.minecraft.network.packet.s2c.play.ChunkData.method_38588(visitor); }
// public int getSectionsPacketSize(yarnwrap.world.chunk.WorldChunk chunk) { return wrapperContained.getSectionsPacketSize(chunk.wrapperContained); }
// public static int getSectionsPacketSize(yarnwrap.world.chunk.WorldChunk chunk, ) { return net.minecraft.network.packet.s2c.play.ChunkData.getSectionsPacketSize(chunk.wrapperContained); }
public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.ChunkData.write(buf.wrapperContained); }
// public void writeSections(yarnwrap.network.PacketByteBuf buf,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.writeSections(buf.wrapperContained,chunk.wrapperContained); }
// public static void writeSections(yarnwrap.network.PacketByteBuf buf,yarnwrap.world.chunk.WorldChunk chunk, ) { net.minecraft.network.packet.s2c.play.ChunkData.writeSections(buf.wrapperContained,chunk.wrapperContained); }
// public void iterateBlockEntities(Object consumer,int x,int z) { wrapperContained.iterateBlockEntities(consumer,x,z); }
// public static void iterateBlockEntities(Object consumer,int x,int z, ) { net.minecraft.network.packet.s2c.play.ChunkData.iterateBlockEntities(consumer,x,z); }
public yarnwrap.nbt.NbtCompound getHeightmap() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getHeightmap()); }
// public static yarnwrap.nbt.NbtCompound getHeightmap() { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.packet.s2c.play.ChunkData.getHeightmap()); }
// public io.netty.buffer.ByteBuf getWritableSectionsDataBuf() { return wrapperContained.getWritableSectionsDataBuf(); }
// public static io.netty.buffer.ByteBuf getWritableSectionsDataBuf() { return net.minecraft.network.packet.s2c.play.ChunkData.getWritableSectionsDataBuf(); }

}