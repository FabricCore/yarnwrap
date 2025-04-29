package yarnwrap.entity;
public class FallingBlockEntity { public net.minecraft.entity.FallingBlockEntity wrapperContained; public FallingBlockEntity(net.minecraft.entity.FallingBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.FallingBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.FallingBlockEntity.LOGGER = value; }

public boolean shouldDupe() { return wrapperContained.shouldDupe; }
public void shouldDupe(boolean value) { wrapperContained.shouldDupe = value; }
// public static boolean shouldDupe() { return net.minecraft.entity.FallingBlockEntity.shouldDupe; }
// public static void shouldDupe(boolean value, ) { net.minecraft.entity.FallingBlockEntity.shouldDupe = value; }

// public float fallHurtAmount() { return wrapperContained.fallHurtAmount; }
// public void fallHurtAmount(float value) { wrapperContained.fallHurtAmount = value; }
// public static float fallHurtAmount() { return net.minecraft.entity.FallingBlockEntity.fallHurtAmount; }
// public static void fallHurtAmount(float value, ) { net.minecraft.entity.FallingBlockEntity.fallHurtAmount = value; }

// public yarnwrap.block.BlockState block() { return new yarnwrap.block.BlockState(wrapperContained.block); }
// public void block(yarnwrap.block.BlockState value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.BlockState block() { return new yarnwrap.block.BlockState(net.minecraft.entity.FallingBlockEntity.block); }
// public static void block(yarnwrap.block.BlockState value, ) { net.minecraft.entity.FallingBlockEntity.block = value.wrapperContained; }

// public boolean destroyedOnLanding() { return wrapperContained.destroyedOnLanding; }
// public void destroyedOnLanding(boolean value) { wrapperContained.destroyedOnLanding = value; }
// public static boolean destroyedOnLanding() { return net.minecraft.entity.FallingBlockEntity.destroyedOnLanding; }
// public static void destroyedOnLanding(boolean value, ) { net.minecraft.entity.FallingBlockEntity.destroyedOnLanding = value; }

// public int fallHurtMax() { return wrapperContained.fallHurtMax; }
// public void fallHurtMax(int value) { wrapperContained.fallHurtMax = value; }
// public static int fallHurtMax() { return net.minecraft.entity.FallingBlockEntity.fallHurtMax; }
// public static void fallHurtMax(int value, ) { net.minecraft.entity.FallingBlockEntity.fallHurtMax = value; }

// public boolean hurtEntities() { return wrapperContained.hurtEntities; }
// public void hurtEntities(boolean value) { wrapperContained.hurtEntities = value; }
// public static boolean hurtEntities() { return net.minecraft.entity.FallingBlockEntity.hurtEntities; }
// public static void hurtEntities(boolean value, ) { net.minecraft.entity.FallingBlockEntity.hurtEntities = value; }

public int timeFalling() { return wrapperContained.timeFalling; }
public void timeFalling(int value) { wrapperContained.timeFalling = value; }
// public static int timeFalling() { return net.minecraft.entity.FallingBlockEntity.timeFalling; }
// public static void timeFalling(int value, ) { net.minecraft.entity.FallingBlockEntity.timeFalling = value; }

public boolean dropItem() { return wrapperContained.dropItem; }
public void dropItem(boolean value) { wrapperContained.dropItem = value; }
// public static boolean dropItem() { return net.minecraft.entity.FallingBlockEntity.dropItem; }
// public static void dropItem(boolean value, ) { net.minecraft.entity.FallingBlockEntity.dropItem = value; }

public yarnwrap.nbt.NbtCompound blockEntityData() { return new yarnwrap.nbt.NbtCompound(wrapperContained.blockEntityData); }
public void blockEntityData(yarnwrap.nbt.NbtCompound value) { wrapperContained.blockEntityData = value.wrapperContained; }
// public static yarnwrap.nbt.NbtCompound blockEntityData() { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.FallingBlockEntity.blockEntityData); }
// public static void blockEntityData(yarnwrap.nbt.NbtCompound value, ) { net.minecraft.entity.FallingBlockEntity.blockEntityData = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData BLOCK_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BLOCK_POS); }
// public void BLOCK_POS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BLOCK_POS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BLOCK_POS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.FallingBlockEntity.BLOCK_POS); }
// public static void BLOCK_POS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.FallingBlockEntity.BLOCK_POS = value.wrapperContained; }

// public FallingBlockEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.block.BlockState block) { this.wrapperContained = new net.minecraft.entity.FallingBlockEntity(world.wrapperContained,x,y,z,block.wrapperContained); }
public void onDestroyedOnLanding(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos) { wrapperContained.onDestroyedOnLanding(block.wrapperContained,pos.wrapperContained); }
// public static void onDestroyedOnLanding(yarnwrap.block.Block block,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.FallingBlockEntity.onDestroyedOnLanding(block.wrapperContained,pos.wrapperContained); }
// public void method_32879(yarnwrap.entity.damage.DamageSource entity) { wrapperContained.method_32879(entity.wrapperContained); }
// public static void method_32879(yarnwrap.entity.damage.DamageSource entity, ) { net.minecraft.entity.FallingBlockEntity.method_32879(entity.wrapperContained); }
// public yarnwrap.entity.FallingBlockEntity spawnFromBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.entity.FallingBlockEntity(wrapperContained.spawnFromBlock(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.entity.FallingBlockEntity spawnFromBlock(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.entity.FallingBlockEntity(net.minecraft.entity.FallingBlockEntity.spawnFromBlock(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public void setDestroyedOnLanding() { wrapperContained.setDestroyedOnLanding(); }
// public static void setDestroyedOnLanding() { net.minecraft.entity.FallingBlockEntity.setDestroyedOnLanding(); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.entity.FallingBlockEntity.getBlockState()); }
public void setFallingBlockPos(yarnwrap.util.math.BlockPos pos) { wrapperContained.setFallingBlockPos(pos.wrapperContained); }
// public static void setFallingBlockPos(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.FallingBlockEntity.setFallingBlockPos(pos.wrapperContained); }
public yarnwrap.util.math.BlockPos getFallingBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getFallingBlockPos()); }
// public static yarnwrap.util.math.BlockPos getFallingBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.FallingBlockEntity.getFallingBlockPos()); }
public void setHurtEntities(float fallHurtAmount,int fallHurtMax) { wrapperContained.setHurtEntities(fallHurtAmount,fallHurtMax); }
// public static void setHurtEntities(float fallHurtAmount,int fallHurtMax, ) { net.minecraft.entity.FallingBlockEntity.setHurtEntities(fallHurtAmount,fallHurtMax); }

}