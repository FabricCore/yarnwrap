package yarnwrap.network.packet.s2c.play;
public class ChunkData { public net.minecraft.network.packet.s2c.play.ChunkData wrapperContained; public ChunkData(net.minecraft.network.packet.s2c.play.ChunkData wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_SECTIONS_DATA_SIZE() { return wrapperContained.MAX_SECTIONS_DATA_SIZE; }
// public void MAX_SECTIONS_DATA_SIZE(int value) { wrapperContained.MAX_SECTIONS_DATA_SIZE = value; }
// public yarnwrap.nbt.NbtCompound heightmap() { return new yarnwrap.nbt.NbtCompound(wrapperContained.heightmap); }
// public void heightmap(yarnwrap.nbt.NbtCompound value) { wrapperContained.heightmap = value.wrapperContained; }
// public byte[] sectionsData() { return wrapperContained.sectionsData; }
// public void sectionsData(byte[] value) { wrapperContained.sectionsData = value; }
// public java.util.List blockEntities() { return wrapperContained.blockEntities; }
// public void blockEntities(java.util.List value) { wrapperContained.blockEntities = value; }
public ChunkData(yarnwrap.world.chunk.WorldChunk chunk) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkData(chunk.wrapperContained); }
public ChunkData(yarnwrap.network.RegistryByteBuf buf,int x,int z) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.ChunkData(buf.wrapperContained,x,z); }
public yarnwrap.network.PacketByteBuf getSectionsDataBuf() { return new yarnwrap.network.PacketByteBuf(wrapperContained.getSectionsDataBuf()); }
public java.util.function.Consumer getBlockEntities(int x,int z) { return wrapperContained.getBlockEntities(x,z); }
// public void method_38588(int visitor) { wrapperContained.method_38588(visitor); }
// public int getSectionsPacketSize(yarnwrap.world.chunk.WorldChunk chunk) { return wrapperContained.getSectionsPacketSize(chunk.wrapperContained); }
public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public void writeSections(yarnwrap.network.PacketByteBuf buf,yarnwrap.world.chunk.WorldChunk chunk) { wrapperContained.writeSections(buf.wrapperContained,chunk.wrapperContained); }
// public void iterateBlockEntities(Object consumer,int x,int z) { wrapperContained.iterateBlockEntities(consumer,x,z); }
public yarnwrap.nbt.NbtCompound getHeightmap() { return new yarnwrap.nbt.NbtCompound(wrapperContained.getHeightmap()); }
// public io.netty.buffer.ByteBuf getWritableSectionsDataBuf() { return wrapperContained.getWritableSectionsDataBuf(); }

}