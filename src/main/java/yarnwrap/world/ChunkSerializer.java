package yarnwrap.world;
public class ChunkSerializer { public net.minecraft.world.ChunkSerializer wrapperContained; public ChunkSerializer(net.minecraft.world.ChunkSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String UPGRADE_DATA_KEY() { return wrapperContained.UPGRADE_DATA_KEY; }
// public void UPGRADE_DATA_KEY(java.lang.String value) { wrapperContained.UPGRADE_DATA_KEY = value; }
// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.String BLOCK_TICKS() { return wrapperContained.BLOCK_TICKS; }
// public void BLOCK_TICKS(java.lang.String value) { wrapperContained.BLOCK_TICKS = value; }
// public java.lang.String FLUID_TICKS() { return wrapperContained.FLUID_TICKS; }
// public void FLUID_TICKS(java.lang.String value) { wrapperContained.FLUID_TICKS = value; }
public java.lang.String X_POS_KEY() { return wrapperContained.X_POS_KEY; }
// public void X_POS_KEY(java.lang.String value) { wrapperContained.X_POS_KEY = value; }
public java.lang.String Z_POS_KEY() { return wrapperContained.Z_POS_KEY; }
// public void Z_POS_KEY(java.lang.String value) { wrapperContained.Z_POS_KEY = value; }
public java.lang.String HEIGHTMAPS_KEY() { return wrapperContained.HEIGHTMAPS_KEY; }
// public void HEIGHTMAPS_KEY(java.lang.String value) { wrapperContained.HEIGHTMAPS_KEY = value; }
public java.lang.String IS_LIGHT_ON_KEY() { return wrapperContained.IS_LIGHT_ON_KEY; }
// public void IS_LIGHT_ON_KEY(java.lang.String value) { wrapperContained.IS_LIGHT_ON_KEY = value; }
public java.lang.String SECTIONS_KEY() { return wrapperContained.SECTIONS_KEY; }
// public void SECTIONS_KEY(java.lang.String value) { wrapperContained.SECTIONS_KEY = value; }
public java.lang.String BLOCK_LIGHT_KEY() { return wrapperContained.BLOCK_LIGHT_KEY; }
// public void BLOCK_LIGHT_KEY(java.lang.String value) { wrapperContained.BLOCK_LIGHT_KEY = value; }
public java.lang.String SKY_LIGHT_KEY() { return wrapperContained.SKY_LIGHT_KEY; }
// public void SKY_LIGHT_KEY(java.lang.String value) { wrapperContained.SKY_LIGHT_KEY = value; }
public yarnwrap.world.chunk.ChunkType getChunkType(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.ChunkType(wrapperContained.getChunkType(nbt.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound writeStructures(yarnwrap.structure.StructureContext context,yarnwrap.util.math.ChunkPos pos,java.util.Map starts,java.util.Map references) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeStructures(context.wrapperContained,pos.wrapperContained,starts,references)); }
// public Object getEntityLoadingCallback(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.getEntityLoadingCallback(world.wrapperContained,nbt.wrapperContained); }
// public java.util.Map readStructureReferences(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readStructureReferences(registryManager.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public java.util.Map readStructureStarts(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt,long worldSeed) { return wrapperContained.readStructureStarts(context.wrapperContained,nbt.wrapperContained,worldSeed); }
public yarnwrap.nbt.NbtList toNbt(it.unimi.dsi.fastutil.shorts.ShortList[] lists) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt(lists)); }
public yarnwrap.world.chunk.ProtoChunk deserialize(yarnwrap.server.world.ServerWorld world,yarnwrap.world.poi.PointOfInterestStorage poiStorage,yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.ProtoChunk(wrapperContained.deserialize(world.wrapperContained,poiStorage.wrapperContained,key.wrapperContained,chunkPos.wrapperContained,nbt.wrapperContained)); }
public yarnwrap.nbt.NbtCompound serialize(yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.Chunk chunk) { return new yarnwrap.nbt.NbtCompound(wrapperContained.serialize(world.wrapperContained,chunk.wrapperContained)); }
// public void logRecoverableError(yarnwrap.util.math.ChunkPos chunkPos,int y,java.lang.String message) { wrapperContained.logRecoverableError(chunkPos.wrapperContained,y,message); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.registry.Registry biomeRegistry) { return wrapperContained.createCodec(biomeRegistry.wrapperContained); }
// public void serializeTicks(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt,Object tickSchedulers) { wrapperContained.serializeTicks(world.wrapperContained,nbt.wrapperContained,tickSchedulers); }
// public yarnwrap.nbt.NbtList getList(yarnwrap.nbt.NbtCompound nbt,java.lang.String key) { return new yarnwrap.nbt.NbtList(wrapperContained.getList(nbt.wrapperContained,key)); }

}