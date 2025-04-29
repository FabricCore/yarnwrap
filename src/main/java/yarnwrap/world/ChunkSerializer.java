package yarnwrap.world;
public class ChunkSerializer { public net.minecraft.world.ChunkSerializer wrapperContained; public ChunkSerializer(net.minecraft.world.ChunkSerializer wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.ChunkSerializer.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.ChunkSerializer.LOGGER = value; }

// public java.lang.String UPGRADE_DATA_KEY() { return wrapperContained.UPGRADE_DATA_KEY; }
// public void UPGRADE_DATA_KEY(java.lang.String value) { wrapperContained.UPGRADE_DATA_KEY = value; }
// public static java.lang.String UPGRADE_DATA_KEY() { return net.minecraft.world.ChunkSerializer.UPGRADE_DATA_KEY; }
// public static void UPGRADE_DATA_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.UPGRADE_DATA_KEY = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.ChunkSerializer.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.ChunkSerializer.CODEC = value; }

// public java.lang.String BLOCK_TICKS() { return wrapperContained.BLOCK_TICKS; }
// public void BLOCK_TICKS(java.lang.String value) { wrapperContained.BLOCK_TICKS = value; }
// public static java.lang.String BLOCK_TICKS() { return net.minecraft.world.ChunkSerializer.BLOCK_TICKS; }
// public static void BLOCK_TICKS(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.BLOCK_TICKS = value; }

// public java.lang.String FLUID_TICKS() { return wrapperContained.FLUID_TICKS; }
// public void FLUID_TICKS(java.lang.String value) { wrapperContained.FLUID_TICKS = value; }
// public static java.lang.String FLUID_TICKS() { return net.minecraft.world.ChunkSerializer.FLUID_TICKS; }
// public static void FLUID_TICKS(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.FLUID_TICKS = value; }

// public java.lang.String X_POS_KEY() { return wrapperContained.X_POS_KEY; }
// public void X_POS_KEY(java.lang.String value) { wrapperContained.X_POS_KEY = value; }
public static java.lang.String X_POS_KEY() { return net.minecraft.world.ChunkSerializer.X_POS_KEY; }
// public static void X_POS_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.X_POS_KEY = value; }

// public java.lang.String Z_POS_KEY() { return wrapperContained.Z_POS_KEY; }
// public void Z_POS_KEY(java.lang.String value) { wrapperContained.Z_POS_KEY = value; }
public static java.lang.String Z_POS_KEY() { return net.minecraft.world.ChunkSerializer.Z_POS_KEY; }
// public static void Z_POS_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.Z_POS_KEY = value; }

// public java.lang.String HEIGHTMAPS_KEY() { return wrapperContained.HEIGHTMAPS_KEY; }
// public void HEIGHTMAPS_KEY(java.lang.String value) { wrapperContained.HEIGHTMAPS_KEY = value; }
public static java.lang.String HEIGHTMAPS_KEY() { return net.minecraft.world.ChunkSerializer.HEIGHTMAPS_KEY; }
// public static void HEIGHTMAPS_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.HEIGHTMAPS_KEY = value; }

// public java.lang.String IS_LIGHT_ON_KEY() { return wrapperContained.IS_LIGHT_ON_KEY; }
// public void IS_LIGHT_ON_KEY(java.lang.String value) { wrapperContained.IS_LIGHT_ON_KEY = value; }
public static java.lang.String IS_LIGHT_ON_KEY() { return net.minecraft.world.ChunkSerializer.IS_LIGHT_ON_KEY; }
// public static void IS_LIGHT_ON_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.IS_LIGHT_ON_KEY = value; }

// public java.lang.String SECTIONS_KEY() { return wrapperContained.SECTIONS_KEY; }
// public void SECTIONS_KEY(java.lang.String value) { wrapperContained.SECTIONS_KEY = value; }
public static java.lang.String SECTIONS_KEY() { return net.minecraft.world.ChunkSerializer.SECTIONS_KEY; }
// public static void SECTIONS_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.SECTIONS_KEY = value; }

// public java.lang.String BLOCK_LIGHT_KEY() { return wrapperContained.BLOCK_LIGHT_KEY; }
// public void BLOCK_LIGHT_KEY(java.lang.String value) { wrapperContained.BLOCK_LIGHT_KEY = value; }
public static java.lang.String BLOCK_LIGHT_KEY() { return net.minecraft.world.ChunkSerializer.BLOCK_LIGHT_KEY; }
// public static void BLOCK_LIGHT_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.BLOCK_LIGHT_KEY = value; }

// public java.lang.String SKY_LIGHT_KEY() { return wrapperContained.SKY_LIGHT_KEY; }
// public void SKY_LIGHT_KEY(java.lang.String value) { wrapperContained.SKY_LIGHT_KEY = value; }
public static java.lang.String SKY_LIGHT_KEY() { return net.minecraft.world.ChunkSerializer.SKY_LIGHT_KEY; }
// public static void SKY_LIGHT_KEY(java.lang.String value, ) { net.minecraft.world.ChunkSerializer.SKY_LIGHT_KEY = value; }

// public yarnwrap.world.chunk.ChunkType getChunkType(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.ChunkType(wrapperContained.getChunkType(nbt.wrapperContained)); }
// public static yarnwrap.world.chunk.ChunkType getChunkType(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.world.chunk.ChunkType(net.minecraft.world.ChunkSerializer.getChunkType(nbt.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound writeStructures(yarnwrap.structure.StructureContext context,yarnwrap.util.math.ChunkPos pos,java.util.Map starts,java.util.Map references) { return new yarnwrap.nbt.NbtCompound(wrapperContained.writeStructures(context.wrapperContained,pos.wrapperContained,starts,references)); }
// public static yarnwrap.nbt.NbtCompound writeStructures(yarnwrap.structure.StructureContext context,yarnwrap.util.math.ChunkPos pos,java.util.Map starts,java.util.Map references, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.ChunkSerializer.writeStructures(context.wrapperContained,pos.wrapperContained,starts,references)); }
// public Object getEntityLoadingCallback(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.getEntityLoadingCallback(world.wrapperContained,nbt.wrapperContained); }
// public static Object getEntityLoadingCallback(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.ChunkSerializer.getEntityLoadingCallback(world.wrapperContained,nbt.wrapperContained); }
// public java.util.Map readStructureReferences(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readStructureReferences(registryManager.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public static java.util.Map readStructureReferences(yarnwrap.registry.DynamicRegistryManager registryManager,yarnwrap.util.math.ChunkPos pos,yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.world.ChunkSerializer.readStructureReferences(registryManager.wrapperContained,pos.wrapperContained,nbt.wrapperContained); }
// public java.util.Map readStructureStarts(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt,long worldSeed) { return wrapperContained.readStructureStarts(context.wrapperContained,nbt.wrapperContained,worldSeed); }
// public static java.util.Map readStructureStarts(yarnwrap.structure.StructureContext context,yarnwrap.nbt.NbtCompound nbt,long worldSeed, ) { return net.minecraft.world.ChunkSerializer.readStructureStarts(context.wrapperContained,nbt.wrapperContained,worldSeed); }
// public yarnwrap.nbt.NbtList toNbt(it.unimi.dsi.fastutil.shorts.ShortList[] lists) { return new yarnwrap.nbt.NbtList(wrapperContained.toNbt(lists)); }
// public static yarnwrap.nbt.NbtList toNbt(it.unimi.dsi.fastutil.shorts.ShortList[] lists, ) { return new yarnwrap.nbt.NbtList(net.minecraft.world.ChunkSerializer.toNbt(lists)); }
// public yarnwrap.world.chunk.ProtoChunk deserialize(yarnwrap.server.world.ServerWorld world,yarnwrap.world.poi.PointOfInterestStorage poiStorage,yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.world.chunk.ProtoChunk(wrapperContained.deserialize(world.wrapperContained,poiStorage.wrapperContained,key.wrapperContained,chunkPos.wrapperContained,nbt.wrapperContained)); }
// public static yarnwrap.world.chunk.ProtoChunk deserialize(yarnwrap.server.world.ServerWorld world,yarnwrap.world.poi.PointOfInterestStorage poiStorage,yarnwrap.world.storage.StorageKey key,yarnwrap.util.math.ChunkPos chunkPos,yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.world.chunk.ProtoChunk(net.minecraft.world.ChunkSerializer.deserialize(world.wrapperContained,poiStorage.wrapperContained,key.wrapperContained,chunkPos.wrapperContained,nbt.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound serialize(yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.Chunk chunk) { return new yarnwrap.nbt.NbtCompound(wrapperContained.serialize(world.wrapperContained,chunk.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound serialize(yarnwrap.server.world.ServerWorld world,yarnwrap.world.chunk.Chunk chunk, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.ChunkSerializer.serialize(world.wrapperContained,chunk.wrapperContained)); }
// public boolean method_24029(yarnwrap.util.math.ChunkPos packedPos) { return wrapperContained.method_24029(packedPos.wrapperContained); }
// public static boolean method_24029(yarnwrap.util.math.ChunkPos packedPos, ) { return net.minecraft.world.ChunkSerializer.method_24029(packedPos.wrapperContained); }
// public void logRecoverableError(yarnwrap.util.math.ChunkPos chunkPos,int y,java.lang.String message) { wrapperContained.logRecoverableError(chunkPos.wrapperContained,y,message); }
// public static void logRecoverableError(yarnwrap.util.math.ChunkPos chunkPos,int y,java.lang.String message, ) { net.minecraft.world.ChunkSerializer.logRecoverableError(chunkPos.wrapperContained,y,message); }
// public com.mojang.serialization.Codec createCodec(yarnwrap.registry.Registry biomeRegistry) { return wrapperContained.createCodec(biomeRegistry.wrapperContained); }
// public static com.mojang.serialization.Codec createCodec(yarnwrap.registry.Registry biomeRegistry, ) { return net.minecraft.world.ChunkSerializer.createCodec(biomeRegistry.wrapperContained); }
// public void method_39037(yarnwrap.util.math.ChunkPos errorMessage) { wrapperContained.method_39037(errorMessage.wrapperContained); }
// public static void method_39037(yarnwrap.util.math.ChunkPos errorMessage, ) { net.minecraft.world.ChunkSerializer.method_39037(errorMessage.wrapperContained); }
// public void method_39038(yarnwrap.util.math.ChunkPos errorMessage) { wrapperContained.method_39038(errorMessage.wrapperContained); }
// public static void method_39038(yarnwrap.util.math.ChunkPos errorMessage, ) { net.minecraft.world.ChunkSerializer.method_39038(errorMessage.wrapperContained); }
// public void serializeTicks(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt,Object tickSchedulers) { wrapperContained.serializeTicks(world.wrapperContained,nbt.wrapperContained,tickSchedulers); }
// public static void serializeTicks(yarnwrap.server.world.ServerWorld world,yarnwrap.nbt.NbtCompound nbt,Object tickSchedulers, ) { net.minecraft.world.ChunkSerializer.serializeTicks(world.wrapperContained,nbt.wrapperContained,tickSchedulers); }
// public java.lang.String method_39312(yarnwrap.block.Block block) { return wrapperContained.method_39312(block.wrapperContained); }
// public static java.lang.String method_39312(yarnwrap.block.Block block, ) { return net.minecraft.world.ChunkSerializer.method_39312(block.wrapperContained); }
// public java.lang.String method_39313(yarnwrap.fluid.Fluid fluid) { return wrapperContained.method_39313(fluid.wrapperContained); }
// public static java.lang.String method_39313(yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.world.ChunkSerializer.method_39313(fluid.wrapperContained); }
// public java.util.Optional method_39314(java.lang.String id) { return wrapperContained.method_39314(id); }
// public static java.util.Optional method_39314(java.lang.String id, ) { return net.minecraft.world.ChunkSerializer.method_39314(id); }
// public java.util.Optional method_39316(java.lang.String id) { return wrapperContained.method_39316(id); }
// public static java.util.Optional method_39316(java.lang.String id, ) { return net.minecraft.world.ChunkSerializer.method_39316(id); }
// public java.util.Optional method_39317(java.lang.String id) { return wrapperContained.method_39317(id); }
// public static java.util.Optional method_39317(java.lang.String id, ) { return net.minecraft.world.ChunkSerializer.method_39317(id); }
// public java.util.Optional method_39318(java.lang.String id) { return wrapperContained.method_39318(id); }
// public static java.util.Optional method_39318(java.lang.String id, ) { return net.minecraft.world.ChunkSerializer.method_39318(id); }
// public yarnwrap.nbt.NbtList getList(yarnwrap.nbt.NbtCompound nbt,java.lang.String key) { return new yarnwrap.nbt.NbtList(wrapperContained.getList(nbt.wrapperContained,key)); }
// public static yarnwrap.nbt.NbtList getList(yarnwrap.nbt.NbtCompound nbt,java.lang.String key, ) { return new yarnwrap.nbt.NbtList(net.minecraft.world.ChunkSerializer.getList(nbt.wrapperContained,key)); }
// public void method_39797(yarnwrap.nbt.NbtList chunk) { wrapperContained.method_39797(chunk.wrapperContained); }
// public static void method_39797(yarnwrap.nbt.NbtList chunk, ) { net.minecraft.world.ChunkSerializer.method_39797(chunk.wrapperContained); }

}