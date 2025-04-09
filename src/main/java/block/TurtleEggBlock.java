package yarnwrap.block;
public class TurtleEggBlock { public net.minecraft.block.TurtleEggBlock wrapperContained; public TurtleEggBlock(net.minecraft.block.TurtleEggBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape LARGE_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.LARGE_SHAPE); }
public yarnwrap.state.property.IntProperty EGGS() { return new yarnwrap.state.property.IntProperty(wrapperContained.EGGS); }
public yarnwrap.state.property.IntProperty HATCH() { return new yarnwrap.state.property.IntProperty(wrapperContained.HATCH); }
// public yarnwrap.util.shape.VoxelShape SMALL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMALL_SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean isSandBelow(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSandBelow(world.wrapperContained,pos.wrapperContained); }
// public boolean shouldHatchProgress(yarnwrap.world.World world) { return wrapperContained.shouldHatchProgress(world.wrapperContained); }
// public void breakEgg(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.breakEgg(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void tryBreakEgg(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,int inverseChance) { wrapperContained.tryBreakEgg(world.wrapperContained,state.wrapperContained,pos.wrapperContained,entity.wrapperContained,inverseChance); }
// public boolean breaksEgg(yarnwrap.world.World world,yarnwrap.entity.Entity entity) { return wrapperContained.breaksEgg(world.wrapperContained,entity.wrapperContained); }
public boolean isSand(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSand(world.wrapperContained,pos.wrapperContained); }

}