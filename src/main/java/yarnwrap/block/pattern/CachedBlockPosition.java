package yarnwrap.block.pattern;
public class CachedBlockPosition { public net.minecraft.block.pattern.CachedBlockPosition wrapperContained; public CachedBlockPosition(net.minecraft.block.pattern.CachedBlockPosition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.block.pattern.CachedBlockPosition.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.block.pattern.CachedBlockPosition.state = value.wrapperContained; }

// public yarnwrap.block.entity.BlockEntity blockEntity() { return new yarnwrap.block.entity.BlockEntity(wrapperContained.blockEntity); }
// public void blockEntity(yarnwrap.block.entity.BlockEntity value) { wrapperContained.blockEntity = value.wrapperContained; }
// public static yarnwrap.block.entity.BlockEntity blockEntity() { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.pattern.CachedBlockPosition.blockEntity); }
// public static void blockEntity(yarnwrap.block.entity.BlockEntity value, ) { net.minecraft.block.pattern.CachedBlockPosition.blockEntity = value.wrapperContained; }

// public boolean cachedEntity() { return wrapperContained.cachedEntity; }
// public void cachedEntity(boolean value) { wrapperContained.cachedEntity = value; }
// public static boolean cachedEntity() { return net.minecraft.block.pattern.CachedBlockPosition.cachedEntity; }
// public static void cachedEntity(boolean value, ) { net.minecraft.block.pattern.CachedBlockPosition.cachedEntity = value; }

// public boolean forceLoad() { return wrapperContained.forceLoad; }
// public void forceLoad(boolean value) { wrapperContained.forceLoad = value; }
// public static boolean forceLoad() { return net.minecraft.block.pattern.CachedBlockPosition.forceLoad; }
// public static void forceLoad(boolean value, ) { net.minecraft.block.pattern.CachedBlockPosition.forceLoad = value; }

// public yarnwrap.world.WorldView world() { return new yarnwrap.world.WorldView(wrapperContained.world); }
// public void world(yarnwrap.world.WorldView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.WorldView world() { return new yarnwrap.world.WorldView(net.minecraft.block.pattern.CachedBlockPosition.world); }
// public static void world(yarnwrap.world.WorldView value, ) { net.minecraft.block.pattern.CachedBlockPosition.world = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.pattern.CachedBlockPosition.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.block.pattern.CachedBlockPosition.pos = value.wrapperContained; }

public CachedBlockPosition(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos,boolean forceLoad) { this.wrapperContained = new net.minecraft.block.pattern.CachedBlockPosition(world.wrapperContained,pos.wrapperContained,forceLoad); }
// public java.util.function.Predicate matchesBlockState(java.util.function.Predicate state) { return wrapperContained.matchesBlockState(state); }
// public static java.util.function.Predicate matchesBlockState(java.util.function.Predicate state, ) { return net.minecraft.block.pattern.CachedBlockPosition.matchesBlockState(state); }
public yarnwrap.world.WorldView getWorld() { return new yarnwrap.world.WorldView(wrapperContained.getWorld()); }
// public static yarnwrap.world.WorldView getWorld() { return new yarnwrap.world.WorldView(net.minecraft.block.pattern.CachedBlockPosition.getWorld()); }
public yarnwrap.block.entity.BlockEntity getBlockEntity() { return new yarnwrap.block.entity.BlockEntity(wrapperContained.getBlockEntity()); }
// public static yarnwrap.block.entity.BlockEntity getBlockEntity() { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.pattern.CachedBlockPosition.getBlockEntity()); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.block.pattern.CachedBlockPosition.getBlockState()); }
// public boolean method_11682(java.util.function.Predicate pos) { return wrapperContained.method_11682(pos); }
// public static boolean method_11682(java.util.function.Predicate pos, ) { return net.minecraft.block.pattern.CachedBlockPosition.method_11682(pos); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
// public static yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.pattern.CachedBlockPosition.getBlockPos()); }

}