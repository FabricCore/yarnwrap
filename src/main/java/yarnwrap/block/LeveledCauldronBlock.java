package yarnwrap.block;
public class LeveledCauldronBlock { public net.minecraft.block.LeveledCauldronBlock wrapperContained; public LeveledCauldronBlock(net.minecraft.block.LeveledCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
// public void LEVEL(yarnwrap.state.property.IntProperty value) { wrapperContained.LEVEL = value.wrapperContained; }
public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
// public void MIN_LEVEL(int value) { wrapperContained.MIN_LEVEL = value; }
public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
// public int BASE_FLUID_HEIGHT() { return wrapperContained.BASE_FLUID_HEIGHT; }
// public void BASE_FLUID_HEIGHT(int value) { wrapperContained.BASE_FLUID_HEIGHT = value; }
// public double FLUID_HEIGHT_PER_LEVEL() { return wrapperContained.FLUID_HEIGHT_PER_LEVEL; }
// public void FLUID_HEIGHT_PER_LEVEL(double value) { wrapperContained.FLUID_HEIGHT_PER_LEVEL = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object precipitation() { return wrapperContained.precipitation; }
// // public void precipitation(Object value) { wrapperContained.precipitation = value; }
// public LeveledCauldronBlock(Object precipitation,Object behaviorMap,Object settings) { this.wrapperContained = new net.minecraft.block.LeveledCauldronBlock(precipitation,behaviorMap,settings); }
public void decrementFluidLevel(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.decrementFluidLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void onFireCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onFireCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54024(Object instance) { return wrapperContained.method_54024(instance); }
// public Object method_54025(yarnwrap.block.LeveledCauldronBlock block) { return wrapperContained.method_54025(block.wrapperContained); }
// public Object method_54026(yarnwrap.block.LeveledCauldronBlock block) { return wrapperContained.method_54026(block.wrapperContained); }

}