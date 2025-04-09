package yarnwrap.block;
public class LeveledCauldronBlock { public net.minecraft.block.LeveledCauldronBlock wrapperContained; public LeveledCauldronBlock(net.minecraft.block.LeveledCauldronBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public int BASE_FLUID_HEIGHT() { return wrapperContained.BASE_FLUID_HEIGHT; }
// public double FLUID_HEIGHT_PER_LEVEL() { return wrapperContained.FLUID_HEIGHT_PER_LEVEL; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object precipitation() { return wrapperContained.precipitation; }
public void decrementFluidLevel(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.decrementFluidLevel(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public void onFireCollision(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onFireCollision(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}