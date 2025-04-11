package yarnwrap.world;
public class FeatureUpdater { public net.minecraft.world.FeatureUpdater wrapperContained; public FeatureUpdater(net.minecraft.world.FeatureUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map featureIdToChunkNbt() { return wrapperContained.featureIdToChunkNbt; }
// public void featureIdToChunkNbt(java.util.Map value) { wrapperContained.featureIdToChunkNbt = value; }
// public java.util.Map updateStates() { return wrapperContained.updateStates; }
// public void updateStates(java.util.Map value) { wrapperContained.updateStates = value; }
// public boolean needsUpdate() { return wrapperContained.needsUpdate; }
// public void needsUpdate(boolean value) { wrapperContained.needsUpdate = value; }
// public java.util.Map OLD_TO_NEW() { return wrapperContained.OLD_TO_NEW; }
// public void OLD_TO_NEW(java.util.Map value) { wrapperContained.OLD_TO_NEW = value; }
// public java.util.Map ANCIENT_TO_OLD() { return wrapperContained.ANCIENT_TO_OLD; }
// public void ANCIENT_TO_OLD(java.util.Map value) { wrapperContained.ANCIENT_TO_OLD = value; }
// public java.util.List oldNames() { return wrapperContained.oldNames; }
// public void oldNames(java.util.List value) { wrapperContained.oldNames = value; }
// public java.util.List newNames() { return wrapperContained.newNames; }
// public void newNames(java.util.List value) { wrapperContained.newNames = value; }
// public java.util.Set NEW_STRUCTURE_NAMES() { return wrapperContained.NEW_STRUCTURE_NAMES; }
// public void NEW_STRUCTURE_NAMES(java.util.Set value) { wrapperContained.NEW_STRUCTURE_NAMES = value; }
public FeatureUpdater(yarnwrap.world.PersistentStateManager persistentStateManager,java.util.List oldNames,java.util.List newNames) { this.wrapperContained = new net.minecraft.world.FeatureUpdater(persistentStateManager.wrapperContained,oldNames,newNames); }
// public void init(yarnwrap.world.PersistentStateManager persistentStateManager) { wrapperContained.init(persistentStateManager.wrapperContained); }
public yarnwrap.nbt.NbtCompound getUpdatedReferences(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUpdatedReferences(nbt.wrapperContained)); }
// public boolean needsUpdate(int chunkX,int chunkZ) { return wrapperContained.needsUpdate(chunkX,chunkZ); }
// public boolean needsUpdate(int chunkX,int chunkZ,java.lang.String id) { return wrapperContained.needsUpdate(chunkX,chunkZ,id); }
// public void method_14739(java.util.HashMap map) { wrapperContained.method_14739(map); }
// public yarnwrap.nbt.NbtCompound getUpdatedStarts(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUpdatedStarts(nbt.wrapperContained,pos.wrapperContained)); }
// public void method_14742(java.util.HashMap map) { wrapperContained.method_14742(map); }
public void markResolved(long chunkPos) { wrapperContained.markResolved(chunkPos); }
public yarnwrap.world.FeatureUpdater create(yarnwrap.registry.RegistryKey world,yarnwrap.world.PersistentStateManager persistentStateManager) { return new yarnwrap.world.FeatureUpdater(wrapperContained.create(world.wrapperContained,persistentStateManager.wrapperContained)); }

}