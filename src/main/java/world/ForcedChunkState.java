package yarnwrap.world;
public class ForcedChunkState { public net.minecraft.world.ForcedChunkState wrapperContained; public ForcedChunkState(net.minecraft.world.ForcedChunkState wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String CHUNKS_KEY() { return wrapperContained.CHUNKS_KEY; }
// public java.lang.String FORCED_KEY() { return wrapperContained.FORCED_KEY; }
// public it.unimi.dsi.fastutil.longs.LongSet chunks() { return wrapperContained.chunks; }
// public yarnwrap.world.ForcedChunkState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.world.ForcedChunkState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
public it.unimi.dsi.fastutil.longs.LongSet getChunks() { return wrapperContained.getChunks(); }

}