package yarnwrap.entity;
public class FallingBlockEntity { public net.minecraft.entity.FallingBlockEntity wrapperContained; public FallingBlockEntity(net.minecraft.entity.FallingBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public boolean shouldDupe() { return wrapperContained.shouldDupe; }
public void shouldDupe(boolean value) { wrapperContained.shouldDupe = value; }
// public float fallHurtAmount() { return wrapperContained.fallHurtAmount; }
// public void fallHurtAmount(float value) { wrapperContained.fallHurtAmount = value; }
// public yarnwrap.block.BlockState block() { return new yarnwrap.block.BlockState(wrapperContained.block); }
// public void block(yarnwrap.block.BlockState value) { wrapperContained.block = value.wrapperContained; }
// public boolean destroyedOnLanding() { return wrapperContained.destroyedOnLanding; }
// public void destroyedOnLanding(boolean value) { wrapperContained.destroyedOnLanding = value; }
// public int fallHurtMax() { return wrapperContained.fallHurtMax; }
// public void fallHurtMax(int value) { wrapperContained.fallHurtMax = value; }
// public boolean hurtEntities() { return wrapperContained.hurtEntities; }
// public void hurtEntities(boolean value) { wrapperContained.hurtEntities = value; }
public int timeFalling() { return wrapperContained.timeFalling; }
public void timeFalling(int value) { wrapperContained.timeFalling = value; }
public boolean dropItem() { return wrapperContained.dropItem; }
public void dropItem(boolean value) { wrapperContained.dropItem = value; }
public yarnwrap.nbt.NbtCompound blockEntityData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.blockEntityData); }
public void blockEntityData(yarnwrap.nbt.NbtCompound value) { wrapperContained.blockEntityData = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData BLOCK_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLOCK_POS); }
// public void BLOCK_POS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BLOCK_POS = value.wrapperContained; }
// public FallingBlockEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.block.BlockState block) { this.wrapperContained = new net.minecraft.entity.FallingBlockEntity(world.wrapperContained,x,y,z,block.wrapperContained); }
public void onDestroyedOnLanding(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos) { wrapperContained.onDestroyedOnLanding(block.wrapperContained,pos.wrapperContained); }
// public void method_32879(yarnwrap.entity.damage.DamageSource entity) { wrapperContained.method_32879(entity.wrapperContained); }
public yarnwrap.entity.FallingBlockEntity spawnFromBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.entity.FallingBlockEntity(wrapperContained.spawnFromBlock(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public void setDestroyedOnLanding() { wrapperContained.setDestroyedOnLanding(); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public void setFallingBlockPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setFallingBlockPos(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getFallingBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getFallingBlockPos()); }
public void setHurtEntities(float fallHurtAmount,int fallHurtMax) { wrapperContained.setHurtEntities(fallHurtAmount,fallHurtMax); }

}