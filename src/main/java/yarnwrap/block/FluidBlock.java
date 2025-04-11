package yarnwrap.block;
public class FluidBlock { public net.minecraft.block.FluidBlock wrapperContained; public FluidBlock(net.minecraft.block.FluidBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List statesByLevel() { return wrapperContained.statesByLevel; }
// public void statesByLevel(java.util.List value) { wrapperContained.statesByLevel = value; }
public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
// public void LEVEL(yarnwrap.state.property.IntProperty value) { wrapperContained.LEVEL = value.wrapperContained; }
// public yarnwrap.fluid.FlowableFluid fluid() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.fluid); }
// public void fluid(yarnwrap.fluid.FlowableFluid value) { wrapperContained.fluid = value.wrapperContained; }
public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
// public void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.COLLISION_SHAPE = value.wrapperContained; }
public com.google.common.collect.ImmutableList FLOW_DIRECTIONS() { return wrapperContained.FLOW_DIRECTIONS; }
// public void FLOW_DIRECTIONS(com.google.common.collect.ImmutableList value) { wrapperContained.FLOW_DIRECTIONS = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec FLUID_CODEC() { return wrapperContained.FLUID_CODEC; }
// public void FLUID_CODEC(com.mojang.serialization.Codec value) { wrapperContained.FLUID_CODEC = value; }
// public boolean receiveNeighborFluids(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.receiveNeighborFluids(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void playExtinguishSound(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playExtinguishSound(world.wrapperContained,pos.wrapperContained); }

}