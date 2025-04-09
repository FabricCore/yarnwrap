package yarnwrap.entity;
public class FallingBlockEntity { public net.minecraft.entity.FallingBlockEntity wrapperContained; public FallingBlockEntity(net.minecraft.entity.FallingBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public boolean shouldDupe() { return wrapperContained.shouldDupe; }
// public float fallHurtAmount() { return wrapperContained.fallHurtAmount; }
// public yarnwrap.block.BlockState block() { return new yarnwrap.block.BlockState(wrapperContained.block); }
// public boolean destroyedOnLanding() { return wrapperContained.destroyedOnLanding; }
// public int fallHurtMax() { return wrapperContained.fallHurtMax; }
// public boolean hurtEntities() { return wrapperContained.hurtEntities; }
public int timeFalling() { return wrapperContained.timeFalling; }
public boolean dropItem() { return wrapperContained.dropItem; }
public yarnwrap.nbt.NbtCompound blockEntityData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.blockEntityData); }
// public yarnwrap.entity.data.TrackedData BLOCK_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLOCK_POS); }
public void onDestroyedOnLanding(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos) { wrapperContained.onDestroyedOnLanding(block.wrapperContained,pos.wrapperContained); }
public yarnwrap.entity.FallingBlockEntity spawnFromBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.entity.FallingBlockEntity(wrapperContained.spawnFromBlock(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public void setDestroyedOnLanding() { wrapperContained.setDestroyedOnLanding(); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public void setFallingBlockPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setFallingBlockPos(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getFallingBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getFallingBlockPos()); }
public void setHurtEntities(float fallHurtAmount,int fallHurtMax) { wrapperContained.setHurtEntities(fallHurtAmount,fallHurtMax); }

}