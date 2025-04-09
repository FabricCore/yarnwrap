package yarnwrap.block;
public class FluidBlock { public net.minecraft.block.FluidBlock wrapperContained; public FluidBlock(net.minecraft.block.FluidBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List statesByLevel() { return wrapperContained.statesByLevel; }
public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
// public yarnwrap.fluid.FlowableFluid fluid() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.fluid); }
public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
public com.google.common.collect.ImmutableList FLOW_DIRECTIONS() { return wrapperContained.FLOW_DIRECTIONS; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public com.mojang.serialization.Codec FLUID_CODEC() { return wrapperContained.FLUID_CODEC; }
// public boolean receiveNeighborFluids(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.receiveNeighborFluids(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void playExtinguishSound(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playExtinguishSound(world.wrapperContained,pos.wrapperContained); }

}