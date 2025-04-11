package yarnwrap.world;
public class ChunkUpdateState { public net.minecraft.world.ChunkUpdateState wrapperContained; public ChunkUpdateState(net.minecraft.world.ChunkUpdateState wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet all() { return wrapperContained.all; }
// public void all(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.all = value; }
// public it.unimi.dsi.fastutil.longs.LongSet remaining() { return wrapperContained.remaining; }
// public void remaining(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.remaining = value; }
// public java.lang.String REMAINING_KEY() { return wrapperContained.REMAINING_KEY; }
// public void REMAINING_KEY(java.lang.String value) { wrapperContained.REMAINING_KEY = value; }
// public java.lang.String ALL_KEY() { return wrapperContained.ALL_KEY; }
// public void ALL_KEY(java.lang.String value) { wrapperContained.ALL_KEY = value; }
public boolean isRemaining(long pos) { return wrapperContained.isRemaining(pos); }
public void markResolved(long pos) { wrapperContained.markResolved(pos); }
public void add(long pos) { wrapperContained.add(pos); }
public boolean contains(long pos) { return wrapperContained.contains(pos); }
public it.unimi.dsi.fastutil.longs.LongSet getAll() { return wrapperContained.getAll(); }
// public yarnwrap.world.ChunkUpdateState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.world.ChunkUpdateState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }

}