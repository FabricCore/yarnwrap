package yarnwrap.fluid;
public class Fluid { public net.minecraft.fluid.Fluid wrapperContained; public Fluid(net.minecraft.fluid.Fluid wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.fluid.FluidState defaultState() { return new yarnwrap.fluid.FluidState(wrapperContained.defaultState); }
public yarnwrap.util.collection.IdList STATE_IDS() { return new yarnwrap.util.collection.IdList(wrapperContained.STATE_IDS); }
// public yarnwrap.state.StateManager stateManager() { return new yarnwrap.state.StateManager(wrapperContained.stateManager); }
// public Object registryEntry() { return wrapperContained.registryEntry; }
public yarnwrap.item.Item getBucketItem() { return new yarnwrap.item.Item(wrapperContained.getBucketItem()); }
// public void appendProperties(Object builder) { wrapperContained.appendProperties(builder); }
// public void randomDisplayTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state,yarnwrap.util.math.random.Random random) { wrapperContained.randomDisplayTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public boolean canBeReplacedWith(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.Direction direction) { return wrapperContained.canBeReplacedWith(state.wrapperContained,world.wrapperContained,pos.wrapperContained,fluid.wrapperContained,direction.wrapperContained); }
// public void onScheduledTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state) { wrapperContained.onScheduledTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public int getLevel(yarnwrap.fluid.FluidState state) { return wrapperContained.getLevel(state.wrapperContained); }
public boolean matchesType(yarnwrap.fluid.Fluid fluid) { return wrapperContained.matchesType(fluid.wrapperContained); }
// public void setDefaultState(yarnwrap.fluid.FluidState state) { wrapperContained.setDefaultState(state.wrapperContained); }
// public yarnwrap.util.math.Vec3d getVelocity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public yarnwrap.state.StateManager getStateManager() { return new yarnwrap.state.StateManager(wrapperContained.getStateManager()); }
// public float getBlastResistance() { return wrapperContained.getBlastResistance(); }
public yarnwrap.fluid.FluidState getDefaultState() { return new yarnwrap.fluid.FluidState(wrapperContained.getDefaultState()); }
// public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public float getHeight(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getHeight(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public int getTickRate(yarnwrap.world.WorldView world) { return wrapperContained.getTickRate(world.wrapperContained); }
// public yarnwrap.block.BlockState toBlockState(yarnwrap.fluid.FluidState state) { return new yarnwrap.block.BlockState(wrapperContained.toBlockState(state.wrapperContained)); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public void onRandomTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state,yarnwrap.util.math.random.Random random) { wrapperContained.onRandomTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
public boolean isStill(yarnwrap.fluid.FluidState state) { return wrapperContained.isStill(state.wrapperContained); }
// public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public boolean hasRandomTicks() { return wrapperContained.hasRandomTicks(); }
public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public float getHeight(yarnwrap.fluid.FluidState state) { return wrapperContained.getHeight(state.wrapperContained); }
public java.util.Optional getBucketFillSound() { return wrapperContained.getBucketFillSound(); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }

}