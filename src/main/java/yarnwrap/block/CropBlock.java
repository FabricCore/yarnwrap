package yarnwrap.block;
public class CropBlock { public net.minecraft.block.CropBlock wrapperContained; public CropBlock(net.minecraft.block.CropBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty AGE() { return new yarnwrap.state.property.IntProperty(wrapperContained.AGE); }
// public void AGE(yarnwrap.state.property.IntProperty value) { wrapperContained.AGE = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] AGE_TO_SHAPE() { return wrapperContained.AGE_TO_SHAPE; }
// public void AGE_TO_SHAPE(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.AGE_TO_SHAPE = value; }
public int MAX_AGE() { return wrapperContained.MAX_AGE; }
// public void MAX_AGE(int value) { wrapperContained.MAX_AGE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean hasEnoughLightAt(yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.hasEnoughLightAt(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.state.property.IntProperty getAgeProperty() { return new yarnwrap.state.property.IntProperty(wrapperContained.getAgeProperty()); }
public boolean isMature(yarnwrap.block.BlockState state) { return wrapperContained.isMature(state.wrapperContained); }
public void applyGrowth(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.applyGrowth(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public int getMaxAge() { return wrapperContained.getMaxAge(); }
public yarnwrap.block.BlockState withAge(int age) { return new yarnwrap.block.BlockState(wrapperContained.withAge(age)); }
public int getAge(yarnwrap.block.BlockState state) { return wrapperContained.getAge(state.wrapperContained); }
// public float getAvailableMoisture(yarnwrap.block.Block block,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getAvailableMoisture(block.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int getGrowthAmount(yarnwrap.world.World world) { return wrapperContained.getGrowthAmount(world.wrapperContained); }
// public yarnwrap.item.ItemConvertible getSeedsItem() { return new yarnwrap.item.ItemConvertible(wrapperContained.getSeedsItem()); }

}