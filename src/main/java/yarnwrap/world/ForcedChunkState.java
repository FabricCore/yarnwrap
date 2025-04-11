package yarnwrap.world;
public class ForcedChunkState { public net.minecraft.world.ForcedChunkState wrapperContained; public ForcedChunkState(net.minecraft.world.ForcedChunkState wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String CHUNKS_KEY() { return wrapperContained.CHUNKS_KEY; }
// public void CHUNKS_KEY(java.lang.String value) { wrapperContained.CHUNKS_KEY = value; }
// public java.lang.String FORCED_KEY() { return wrapperContained.FORCED_KEY; }
// public void FORCED_KEY(java.lang.String value) { wrapperContained.FORCED_KEY = value; }
// public it.unimi.dsi.fastutil.longs.LongSet chunks() { return wrapperContained.chunks; }
// public void chunks(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.chunks = value; }
// public ForcedChunkState(it.unimi.dsi.fastutil.longs.LongSet chunks) { this.wrapperContained = new net.minecraft.world.ForcedChunkState(chunks); }
// public yarnwrap.world.ForcedChunkState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.world.ForcedChunkState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
public it.unimi.dsi.fastutil.longs.LongSet getChunks() { return wrapperContained.getChunks(); }

}