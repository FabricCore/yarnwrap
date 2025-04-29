package yarnwrap.world;
public class ChunkUpdateState { public net.minecraft.world.ChunkUpdateState wrapperContained; public ChunkUpdateState(net.minecraft.world.ChunkUpdateState wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.longs.LongSet all() { return wrapperContained.all; }
// public void all(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.all = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet all() { return net.minecraft.world.ChunkUpdateState.all; }
// public static void all(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.ChunkUpdateState.all = value; }

// public it.unimi.dsi.fastutil.longs.LongSet remaining() { return wrapperContained.remaining; }
// public void remaining(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.remaining = value; }
// public static it.unimi.dsi.fastutil.longs.LongSet remaining() { return net.minecraft.world.ChunkUpdateState.remaining; }
// public static void remaining(it.unimi.dsi.fastutil.longs.LongSet value, ) { net.minecraft.world.ChunkUpdateState.remaining = value; }

// public java.lang.String REMAINING_KEY() { return wrapperContained.REMAINING_KEY; }
// public void REMAINING_KEY(java.lang.String value) { wrapperContained.REMAINING_KEY = value; }
// public static java.lang.String REMAINING_KEY() { return net.minecraft.world.ChunkUpdateState.REMAINING_KEY; }
// public static void REMAINING_KEY(java.lang.String value, ) { net.minecraft.world.ChunkUpdateState.REMAINING_KEY = value; }

// public java.lang.String ALL_KEY() { return wrapperContained.ALL_KEY; }
// public void ALL_KEY(java.lang.String value) { wrapperContained.ALL_KEY = value; }
// public static java.lang.String ALL_KEY() { return net.minecraft.world.ChunkUpdateState.ALL_KEY; }
// public static void ALL_KEY(java.lang.String value, ) { net.minecraft.world.ChunkUpdateState.ALL_KEY = value; }

// public ChunkUpdateState(it.unimi.dsi.fastutil.longs.LongSet all,it.unimi.dsi.fastutil.longs.LongSet remaining) { this.wrapperContained = new net.minecraft.world.ChunkUpdateState(all,remaining); }
public boolean isRemaining(long pos) { return wrapperContained.isRemaining(pos); }
// public static boolean isRemaining(long pos, ) { return net.minecraft.world.ChunkUpdateState.isRemaining(pos); }
public void markResolved(long pos) { wrapperContained.markResolved(pos); }
// public static void markResolved(long pos, ) { net.minecraft.world.ChunkUpdateState.markResolved(pos); }
public void add(long pos) { wrapperContained.add(pos); }
// public static void add(long pos, ) { net.minecraft.world.ChunkUpdateState.add(pos); }
public boolean contains(long pos) { return wrapperContained.contains(pos); }
// public static boolean contains(long pos, ) { return net.minecraft.world.ChunkUpdateState.contains(pos); }
public it.unimi.dsi.fastutil.longs.LongSet getAll() { return wrapperContained.getAll(); }
// public static it.unimi.dsi.fastutil.longs.LongSet getAll() { return net.minecraft.world.ChunkUpdateState.getAll(); }
// public yarnwrap.world.ChunkUpdateState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.world.ChunkUpdateState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
// public static yarnwrap.world.ChunkUpdateState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { return new yarnwrap.world.ChunkUpdateState(net.minecraft.world.ChunkUpdateState.fromNbt(nbt.wrapperContained,registryLookup)); }
// public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
public static Object getPersistentStateType() { return net.minecraft.world.ChunkUpdateState.getPersistentStateType(); }

}