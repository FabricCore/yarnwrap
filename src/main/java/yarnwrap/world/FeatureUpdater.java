package yarnwrap.world;
public class FeatureUpdater { public net.minecraft.world.FeatureUpdater wrapperContained; public FeatureUpdater(net.minecraft.world.FeatureUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map featureIdToChunkNbt() { return wrapperContained.featureIdToChunkNbt; }
// public void featureIdToChunkNbt(java.util.Map value) { wrapperContained.featureIdToChunkNbt = value; }
// public static java.util.Map featureIdToChunkNbt() { return net.minecraft.world.FeatureUpdater.featureIdToChunkNbt; }
// public static void featureIdToChunkNbt(java.util.Map value, ) { net.minecraft.world.FeatureUpdater.featureIdToChunkNbt = value; }

// public java.util.Map updateStates() { return wrapperContained.updateStates; }
// public void updateStates(java.util.Map value) { wrapperContained.updateStates = value; }
// public static java.util.Map updateStates() { return net.minecraft.world.FeatureUpdater.updateStates; }
// public static void updateStates(java.util.Map value, ) { net.minecraft.world.FeatureUpdater.updateStates = value; }

// public boolean needsUpdate() { return wrapperContained.needsUpdate; }
// public void needsUpdate(boolean value) { wrapperContained.needsUpdate = value; }
// public static boolean needsUpdate() { return net.minecraft.world.FeatureUpdater.needsUpdate; }
// public static void needsUpdate(boolean value, ) { net.minecraft.world.FeatureUpdater.needsUpdate = value; }

// public java.util.Map OLD_TO_NEW() { return wrapperContained.OLD_TO_NEW; }
// public void OLD_TO_NEW(java.util.Map value) { wrapperContained.OLD_TO_NEW = value; }
// public static java.util.Map OLD_TO_NEW() { return net.minecraft.world.FeatureUpdater.OLD_TO_NEW; }
// public static void OLD_TO_NEW(java.util.Map value, ) { net.minecraft.world.FeatureUpdater.OLD_TO_NEW = value; }

// public java.util.Map ANCIENT_TO_OLD() { return wrapperContained.ANCIENT_TO_OLD; }
// public void ANCIENT_TO_OLD(java.util.Map value) { wrapperContained.ANCIENT_TO_OLD = value; }
// public static java.util.Map ANCIENT_TO_OLD() { return net.minecraft.world.FeatureUpdater.ANCIENT_TO_OLD; }
// public static void ANCIENT_TO_OLD(java.util.Map value, ) { net.minecraft.world.FeatureUpdater.ANCIENT_TO_OLD = value; }

// public java.util.List oldNames() { return wrapperContained.oldNames; }
// public void oldNames(java.util.List value) { wrapperContained.oldNames = value; }
// public static java.util.List oldNames() { return net.minecraft.world.FeatureUpdater.oldNames; }
// public static void oldNames(java.util.List value, ) { net.minecraft.world.FeatureUpdater.oldNames = value; }

// public java.util.List newNames() { return wrapperContained.newNames; }
// public void newNames(java.util.List value) { wrapperContained.newNames = value; }
// public static java.util.List newNames() { return net.minecraft.world.FeatureUpdater.newNames; }
// public static void newNames(java.util.List value, ) { net.minecraft.world.FeatureUpdater.newNames = value; }

// public java.util.Set NEW_STRUCTURE_NAMES() { return wrapperContained.NEW_STRUCTURE_NAMES; }
// public void NEW_STRUCTURE_NAMES(java.util.Set value) { wrapperContained.NEW_STRUCTURE_NAMES = value; }
// public static java.util.Set NEW_STRUCTURE_NAMES() { return net.minecraft.world.FeatureUpdater.NEW_STRUCTURE_NAMES; }
// public static void NEW_STRUCTURE_NAMES(java.util.Set value, ) { net.minecraft.world.FeatureUpdater.NEW_STRUCTURE_NAMES = value; }

public FeatureUpdater(yarnwrap.world.PersistentStateManager persistentStateManager,java.util.List oldNames,java.util.List newNames) { this.wrapperContained = new net.minecraft.world.FeatureUpdater(persistentStateManager.wrapperContained,oldNames,newNames); }
// public void init(yarnwrap.world.PersistentStateManager persistentStateManager) { wrapperContained.init(persistentStateManager.wrapperContained); }
// public static void init(yarnwrap.world.PersistentStateManager persistentStateManager, ) { net.minecraft.world.FeatureUpdater.init(persistentStateManager.wrapperContained); }
public yarnwrap.nbt.NbtCompound getUpdatedReferences(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUpdatedReferences(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound getUpdatedReferences(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.FeatureUpdater.getUpdatedReferences(nbt.wrapperContained)); }
// public it.unimi.dsi.fastutil.longs.Long2ObjectMap method_14736(java.lang.String featureId) { return wrapperContained.method_14736(featureId); }
// public static it.unimi.dsi.fastutil.longs.Long2ObjectMap method_14736(java.lang.String featureId, ) { return net.minecraft.world.FeatureUpdater.method_14736(featureId); }
// public boolean needsUpdate(int chunkX,int chunkZ) { return wrapperContained.needsUpdate(chunkX,chunkZ); }
// public static boolean needsUpdate(int chunkX,int chunkZ, ) { return net.minecraft.world.FeatureUpdater.needsUpdate(chunkX,chunkZ); }
// public boolean needsUpdate(int chunkX,int chunkZ,java.lang.String id) { return wrapperContained.needsUpdate(chunkX,chunkZ,id); }
// public static boolean needsUpdate(int chunkX,int chunkZ,java.lang.String id, ) { return net.minecraft.world.FeatureUpdater.needsUpdate(chunkX,chunkZ,id); }
// public void method_14739(java.util.HashMap map) { wrapperContained.method_14739(map); }
// public static void method_14739(java.util.HashMap map, ) { net.minecraft.world.FeatureUpdater.method_14739(map); }
// public yarnwrap.nbt.NbtCompound getUpdatedStarts(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUpdatedStarts(nbt.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound getUpdatedStarts(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.math.ChunkPos pos, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.world.FeatureUpdater.getUpdatedStarts(nbt.wrapperContained,pos.wrapperContained)); }
// public void method_14742(java.util.HashMap map) { wrapperContained.method_14742(map); }
// public static void method_14742(java.util.HashMap map, ) { net.minecraft.world.FeatureUpdater.method_14742(map); }
public void markResolved(long chunkPos) { wrapperContained.markResolved(chunkPos); }
// public static void markResolved(long chunkPos, ) { net.minecraft.world.FeatureUpdater.markResolved(chunkPos); }
// public yarnwrap.world.FeatureUpdater create(yarnwrap.registry.RegistryKey world,yarnwrap.world.PersistentStateManager persistentStateManager) { return new yarnwrap.world.FeatureUpdater(wrapperContained.create(world.wrapperContained,persistentStateManager.wrapperContained)); }
// public static yarnwrap.world.FeatureUpdater create(yarnwrap.registry.RegistryKey world,yarnwrap.world.PersistentStateManager persistentStateManager, ) { return new yarnwrap.world.FeatureUpdater(net.minecraft.world.FeatureUpdater.create(world.wrapperContained,persistentStateManager.wrapperContained)); }
// public void method_68326(long id) { wrapperContained.method_68326(id); }
// public static void method_68326(long id, ) { net.minecraft.world.FeatureUpdater.method_68326(id); }
// public void method_68327(yarnwrap.world.ChunkUpdateState key,java.lang.String nbt) { wrapperContained.method_68327(key.wrapperContained,nbt); }
// public static void method_68327(yarnwrap.world.ChunkUpdateState key,java.lang.String nbt, ) { net.minecraft.world.FeatureUpdater.method_68327(key.wrapperContained,nbt); }
// public void method_68328(java.lang.String key,yarnwrap.nbt.NbtElement nbt) { wrapperContained.method_68328(key,nbt.wrapperContained); }
// public static void method_68328(java.lang.String key,yarnwrap.nbt.NbtElement nbt, ) { net.minecraft.world.FeatureUpdater.method_68328(key,nbt.wrapperContained); }
// public void method_68329(yarnwrap.nbt.NbtCompound id) { wrapperContained.method_68329(id.wrapperContained); }
// public static void method_68329(yarnwrap.nbt.NbtCompound id, ) { net.minecraft.world.FeatureUpdater.method_68329(id.wrapperContained); }
// public java.util.Optional method_68330(yarnwrap.nbt.NbtCompound child) { return wrapperContained.method_68330(child.wrapperContained); }
// public static java.util.Optional method_68330(yarnwrap.nbt.NbtCompound child, ) { return net.minecraft.world.FeatureUpdater.method_68330(child.wrapperContained); }

}