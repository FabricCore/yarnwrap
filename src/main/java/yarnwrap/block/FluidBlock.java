package yarnwrap.block;
public class FluidBlock { public net.minecraft.block.FluidBlock wrapperContained; public FluidBlock(net.minecraft.block.FluidBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List statesByLevel() { return wrapperContained.statesByLevel; }
// public void statesByLevel(java.util.List value) { wrapperContained.statesByLevel = value; }
// public static java.util.List statesByLevel() { return net.minecraft.block.FluidBlock.statesByLevel; }
// public static void statesByLevel(java.util.List value, ) { net.minecraft.block.FluidBlock.statesByLevel = value; }

// public yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(wrapperContained.LEVEL); }
// public void LEVEL(yarnwrap.state.property.IntProperty value) { wrapperContained.LEVEL = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty LEVEL() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.FluidBlock.LEVEL); }
// public static void LEVEL(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.FluidBlock.LEVEL = value.wrapperContained; }

// public yarnwrap.fluid.FlowableFluid fluid() { return new yarnwrap.fluid.FlowableFluid(wrapperContained.fluid); }
// public void fluid(yarnwrap.fluid.FlowableFluid value) { wrapperContained.fluid = value.wrapperContained; }
// public static yarnwrap.fluid.FlowableFluid fluid() { return new yarnwrap.fluid.FlowableFluid(net.minecraft.block.FluidBlock.fluid); }
// public static void fluid(yarnwrap.fluid.FlowableFluid value, ) { net.minecraft.block.FluidBlock.fluid = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
// public void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.COLLISION_SHAPE = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FluidBlock.COLLISION_SHAPE); }
// public static void COLLISION_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.FluidBlock.COLLISION_SHAPE = value.wrapperContained; }

// public com.google.common.collect.ImmutableList FLOW_DIRECTIONS() { return wrapperContained.FLOW_DIRECTIONS; }
// public void FLOW_DIRECTIONS(com.google.common.collect.ImmutableList value) { wrapperContained.FLOW_DIRECTIONS = value; }
public static com.google.common.collect.ImmutableList FLOW_DIRECTIONS() { return net.minecraft.block.FluidBlock.FLOW_DIRECTIONS; }
// public static void FLOW_DIRECTIONS(com.google.common.collect.ImmutableList value, ) { net.minecraft.block.FluidBlock.FLOW_DIRECTIONS = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FluidBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FluidBlock.CODEC = value; }

// public com.mojang.serialization.Codec FLUID_CODEC() { return wrapperContained.FLUID_CODEC; }
// public void FLUID_CODEC(com.mojang.serialization.Codec value) { wrapperContained.FLUID_CODEC = value; }
// public static com.mojang.serialization.Codec FLUID_CODEC() { return net.minecraft.block.FluidBlock.FLUID_CODEC; }
// public static void FLUID_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.FluidBlock.FLUID_CODEC = value; }

// public FluidBlock(yarnwrap.fluid.FlowableFluid fluid,Object settings) { this.wrapperContained = new net.minecraft.block.FluidBlock(fluid.wrapperContained,settings); }
// public boolean receiveNeighborFluids(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.receiveNeighborFluids(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static boolean receiveNeighborFluids(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return net.minecraft.block.FluidBlock.receiveNeighborFluids(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void playExtinguishSound(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playExtinguishSound(world.wrapperContained,pos.wrapperContained); }
// public static void playExtinguishSound(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.FluidBlock.playExtinguishSound(world.wrapperContained,pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54027(Object instance) { return wrapperContained.method_54027(instance); }
// public static com.mojang.datafixers.kinds.App method_54027(Object instance, ) { return net.minecraft.block.FluidBlock.method_54027(instance); }
// public yarnwrap.fluid.FlowableFluid method_54028(yarnwrap.block.FluidBlock block) { return new yarnwrap.fluid.FlowableFluid(wrapperContained.method_54028(block.wrapperContained)); }
// public static yarnwrap.fluid.FlowableFluid method_54028(yarnwrap.block.FluidBlock block, ) { return new yarnwrap.fluid.FlowableFluid(net.minecraft.block.FluidBlock.method_54028(block.wrapperContained)); }
// public yarnwrap.fluid.Fluid method_54029(yarnwrap.fluid.FlowableFluid fluid) { return new yarnwrap.fluid.Fluid(wrapperContained.method_54029(fluid.wrapperContained)); }
// public static yarnwrap.fluid.Fluid method_54029(yarnwrap.fluid.FlowableFluid fluid, ) { return new yarnwrap.fluid.Fluid(net.minecraft.block.FluidBlock.method_54029(fluid.wrapperContained)); }
// public com.mojang.serialization.DataResult method_54030(yarnwrap.fluid.Fluid fluid) { return wrapperContained.method_54030(fluid.wrapperContained); }
// public static com.mojang.serialization.DataResult method_54030(yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.block.FluidBlock.method_54030(fluid.wrapperContained); }

}