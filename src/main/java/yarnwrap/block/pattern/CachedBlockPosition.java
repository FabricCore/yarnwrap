package yarnwrap.block.pattern;
public class CachedBlockPosition { public net.minecraft.block.pattern.CachedBlockPosition wrapperContained; public CachedBlockPosition(net.minecraft.block.pattern.CachedBlockPosition wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public yarnwrap.block.entity.BlockEntity blockEntity() { return new yarnwrap.block.entity.BlockEntity(wrapperContained.blockEntity); }
// public void blockEntity(yarnwrap.block.entity.BlockEntity value) { wrapperContained.blockEntity = value.wrapperContained; }
// public boolean cachedEntity() { return wrapperContained.cachedEntity; }
// public void cachedEntity(boolean value) { wrapperContained.cachedEntity = value; }
// public boolean forceLoad() { return wrapperContained.forceLoad; }
// public void forceLoad(boolean value) { wrapperContained.forceLoad = value; }
// public yarnwrap.world.WorldView world() { return new yarnwrap.world.WorldView(wrapperContained.world); }
// public void world(yarnwrap.world.WorldView value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public java.util.function.Predicate matchesBlockState(java.util.function.Predicate state) { return wrapperContained.matchesBlockState(state); }
public yarnwrap.world.WorldView getWorld() { return new yarnwrap.world.WorldView(wrapperContained.getWorld()); }
public yarnwrap.block.entity.BlockEntity getBlockEntity() { return new yarnwrap.block.entity.BlockEntity(wrapperContained.getBlockEntity()); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }

}