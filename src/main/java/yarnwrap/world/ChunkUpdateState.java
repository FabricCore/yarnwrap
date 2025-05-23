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

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.ChunkUpdateState.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.ChunkUpdateState.CODEC = value; }

// public com.mojang.serialization.Codec LONG_SET_CODEC() { return wrapperContained.LONG_SET_CODEC; }
// public void LONG_SET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LONG_SET_CODEC = value; }
// public static com.mojang.serialization.Codec LONG_SET_CODEC() { return net.minecraft.world.ChunkUpdateState.LONG_SET_CODEC; }
// public static void LONG_SET_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.ChunkUpdateState.LONG_SET_CODEC = value; }

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
// public com.mojang.datafixers.kinds.App method_67410(Object instance) { return wrapperContained.method_67410(instance); }
// public static com.mojang.datafixers.kinds.App method_67410(Object instance, ) { return net.minecraft.world.ChunkUpdateState.method_67410(instance); }
// public it.unimi.dsi.fastutil.longs.LongSet method_67411(yarnwrap.world.ChunkUpdateState state) { return wrapperContained.method_67411(state.wrapperContained); }
// public static it.unimi.dsi.fastutil.longs.LongSet method_67411(yarnwrap.world.ChunkUpdateState state, ) { return net.minecraft.world.ChunkUpdateState.method_67411(state.wrapperContained); }
// public yarnwrap.world.PersistentStateType createStateType(java.lang.String id) { return new yarnwrap.world.PersistentStateType(wrapperContained.createStateType(id)); }
// public static yarnwrap.world.PersistentStateType createStateType(java.lang.String id, ) { return new yarnwrap.world.PersistentStateType(net.minecraft.world.ChunkUpdateState.createStateType(id)); }
// public it.unimi.dsi.fastutil.longs.LongSet method_67413(yarnwrap.world.ChunkUpdateState state) { return wrapperContained.method_67413(state.wrapperContained); }
// public static it.unimi.dsi.fastutil.longs.LongSet method_67413(yarnwrap.world.ChunkUpdateState state, ) { return net.minecraft.world.ChunkUpdateState.method_67413(state.wrapperContained); }

}