package yarnwrap.world;
public class FeatureUpdater { public net.minecraft.world.FeatureUpdater wrapperContained; public FeatureUpdater(net.minecraft.world.FeatureUpdater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map featureIdToChunkNbt() { return wrapperContained.featureIdToChunkNbt; }
// public java.util.Map updateStates() { return wrapperContained.updateStates; }
// public boolean needsUpdate() { return wrapperContained.needsUpdate; }
// public java.util.Map OLD_TO_NEW() { return wrapperContained.OLD_TO_NEW; }
// public java.util.Map ANCIENT_TO_OLD() { return wrapperContained.ANCIENT_TO_OLD; }
// public java.util.List oldNames() { return wrapperContained.oldNames; }
// public java.util.List newNames() { return wrapperContained.newNames; }
// public java.util.Set NEW_STRUCTURE_NAMES() { return wrapperContained.NEW_STRUCTURE_NAMES; }
// public void init(yarnwrap.world.PersistentStateManager persistentStateManager) { wrapperContained.init(persistentStateManager.wrapperContained); }
public yarnwrap.nbt.NbtCompound getUpdatedReferences(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUpdatedReferences(nbt.wrapperContained)); }
// public boolean needsUpdate(int chunkX,int chunkZ) { return wrapperContained.needsUpdate(chunkX,chunkZ); }
// public boolean needsUpdate(int chunkX,int chunkZ,java.lang.String id) { return wrapperContained.needsUpdate(chunkX,chunkZ,id); }
// public yarnwrap.nbt.NbtCompound getUpdatedStarts(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.math.ChunkPos pos) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getUpdatedStarts(nbt.wrapperContained,pos.wrapperContained)); }
public void markResolved(long chunkPos) { wrapperContained.markResolved(chunkPos); }
public yarnwrap.world.FeatureUpdater create(yarnwrap.registry.RegistryKey world,yarnwrap.world.PersistentStateManager persistentStateManager) { return new yarnwrap.world.FeatureUpdater(wrapperContained.create(world.wrapperContained,persistentStateManager.wrapperContained)); }

}