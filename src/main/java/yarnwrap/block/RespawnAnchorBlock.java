package yarnwrap.block;
public class RespawnAnchorBlock { public net.minecraft.block.RespawnAnchorBlock wrapperContained; public RespawnAnchorBlock(net.minecraft.block.RespawnAnchorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty CHARGES() { return new yarnwrap.state.property.IntProperty(wrapperContained.CHARGES); }
// public void CHARGES(yarnwrap.state.property.IntProperty value) { wrapperContained.CHARGES = value.wrapperContained; }
// public com.google.common.collect.ImmutableList VALID_HORIZONTAL_SPAWN_OFFSETS() { return wrapperContained.VALID_HORIZONTAL_SPAWN_OFFSETS; }
// public void VALID_HORIZONTAL_SPAWN_OFFSETS(com.google.common.collect.ImmutableList value) { wrapperContained.VALID_HORIZONTAL_SPAWN_OFFSETS = value; }
// public com.google.common.collect.ImmutableList VALID_SPAWN_OFFSETS() { return wrapperContained.VALID_SPAWN_OFFSETS; }
// public void VALID_SPAWN_OFFSETS(com.google.common.collect.ImmutableList value) { wrapperContained.VALID_SPAWN_OFFSETS = value; }
public int NO_CHARGES() { return wrapperContained.NO_CHARGES; }
// public void NO_CHARGES(int value) { wrapperContained.NO_CHARGES = value; }
public int MAX_CHARGES() { return wrapperContained.MAX_CHARGES; }
// public void MAX_CHARGES(int value) { wrapperContained.MAX_CHARGES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public java.util.Optional findRespawnPosition(yarnwrap.entity.EntityType entity,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.findRespawnPosition(entity.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public int getLightLevel(yarnwrap.block.BlockState state,int maxLevel) { return wrapperContained.getLightLevel(state.wrapperContained,maxLevel); }
public void charge(yarnwrap.entity.Entity charger,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.charge(charger.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isNether(yarnwrap.world.World world) { return wrapperContained.isNether(world.wrapperContained); }
// public boolean isChargeItem(yarnwrap.item.ItemStack stack) { return wrapperContained.isChargeItem(stack.wrapperContained); }
// public boolean canCharge(yarnwrap.block.BlockState state) { return wrapperContained.canCharge(state.wrapperContained); }
// public boolean hasStillWater(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world) { return wrapperContained.hasStillWater(pos.wrapperContained,world.wrapperContained); }
// public void explode(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos explodedPos) { wrapperContained.explode(state.wrapperContained,world.wrapperContained,explodedPos.wrapperContained); }
// public java.util.Optional findRespawnPosition(yarnwrap.entity.EntityType entity,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos,boolean ignoreInvalidPos) { return wrapperContained.findRespawnPosition(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,ignoreInvalidPos); }

}