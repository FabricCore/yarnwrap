package yarnwrap.fluid;
public class Fluid { public net.minecraft.fluid.Fluid wrapperContained; public Fluid(net.minecraft.fluid.Fluid wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.fluid.FluidState defaultState() { return new yarnwrap.fluid.FluidState(wrapperContained.defaultState); }
// public void defaultState(yarnwrap.fluid.FluidState value) { wrapperContained.defaultState = value.wrapperContained; }
// public static yarnwrap.fluid.FluidState defaultState() { return new yarnwrap.fluid.FluidState(net.minecraft.fluid.Fluid.defaultState); }
// public static void defaultState(yarnwrap.fluid.FluidState value, ) { net.minecraft.fluid.Fluid.defaultState = value.wrapperContained; }

// public yarnwrap.util.collection.IdList STATE_IDS() { return new yarnwrap.util.collection.IdList(wrapperContained.STATE_IDS); }
// public void STATE_IDS(yarnwrap.util.collection.IdList value) { wrapperContained.STATE_IDS = value.wrapperContained; }
public static yarnwrap.util.collection.IdList STATE_IDS() { return new yarnwrap.util.collection.IdList(net.minecraft.fluid.Fluid.STATE_IDS); }
// public static void STATE_IDS(yarnwrap.util.collection.IdList value, ) { net.minecraft.fluid.Fluid.STATE_IDS = value.wrapperContained; }

// public yarnwrap.state.StateManager stateManager() { return new yarnwrap.state.StateManager(wrapperContained.stateManager); }
// public void stateManager(yarnwrap.state.StateManager value) { wrapperContained.stateManager = value.wrapperContained; }
// public static yarnwrap.state.StateManager stateManager() { return new yarnwrap.state.StateManager(net.minecraft.fluid.Fluid.stateManager); }
// public static void stateManager(yarnwrap.state.StateManager value, ) { net.minecraft.fluid.Fluid.stateManager = value.wrapperContained; }

// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
// // public static Object registryEntry() { return net.minecraft.fluid.Fluid.registryEntry; }
// // public static void registryEntry(Object value, ) { net.minecraft.fluid.Fluid.registryEntry = value; }

public yarnwrap.item.Item getBucketItem() { return new yarnwrap.item.Item(wrapperContained.getBucketItem()); }
// public static yarnwrap.item.Item getBucketItem() { return new yarnwrap.item.Item(net.minecraft.fluid.Fluid.getBucketItem()); }
// public void appendProperties(Object builder) { wrapperContained.appendProperties(builder); }
// public static void appendProperties(Object builder, ) { net.minecraft.fluid.Fluid.appendProperties(builder); }
// public void randomDisplayTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state,yarnwrap.util.math.random.Random random) { wrapperContained.randomDisplayTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public static void randomDisplayTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state,yarnwrap.util.math.random.Random random, ) { net.minecraft.fluid.Fluid.randomDisplayTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public boolean canBeReplacedWith(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.Direction direction) { return wrapperContained.canBeReplacedWith(state.wrapperContained,world.wrapperContained,pos.wrapperContained,fluid.wrapperContained,direction.wrapperContained); }
// public static boolean canBeReplacedWith(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.Direction direction, ) { return net.minecraft.fluid.Fluid.canBeReplacedWith(state.wrapperContained,world.wrapperContained,pos.wrapperContained,fluid.wrapperContained,direction.wrapperContained); }
// public void onScheduledTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state) { wrapperContained.onScheduledTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void onScheduledTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state, ) { net.minecraft.fluid.Fluid.onScheduledTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public int getLevel(yarnwrap.fluid.FluidState state) { return wrapperContained.getLevel(state.wrapperContained); }
// public static int getLevel(yarnwrap.fluid.FluidState state, ) { return net.minecraft.fluid.Fluid.getLevel(state.wrapperContained); }
public boolean matchesType(yarnwrap.fluid.Fluid fluid) { return wrapperContained.matchesType(fluid.wrapperContained); }
// public static boolean matchesType(yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.fluid.Fluid.matchesType(fluid.wrapperContained); }
// public void setDefaultState(yarnwrap.fluid.FluidState state) { wrapperContained.setDefaultState(state.wrapperContained); }
// public static void setDefaultState(yarnwrap.fluid.FluidState state, ) { net.minecraft.fluid.Fluid.setDefaultState(state.wrapperContained); }
// public yarnwrap.util.math.Vec3d getVelocity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getVelocity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.fluid.Fluid.getVelocity(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
public yarnwrap.state.StateManager getStateManager() { return new yarnwrap.state.StateManager(wrapperContained.getStateManager()); }
// public static yarnwrap.state.StateManager getStateManager() { return new yarnwrap.state.StateManager(net.minecraft.fluid.Fluid.getStateManager()); }
// public float getBlastResistance() { return wrapperContained.getBlastResistance(); }
// public static float getBlastResistance() { return net.minecraft.fluid.Fluid.getBlastResistance(); }
public yarnwrap.fluid.FluidState getDefaultState() { return new yarnwrap.fluid.FluidState(wrapperContained.getDefaultState()); }
// public static yarnwrap.fluid.FluidState getDefaultState() { return new yarnwrap.fluid.FluidState(net.minecraft.fluid.Fluid.getDefaultState()); }
// public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
// public static yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(net.minecraft.fluid.Fluid.getParticle()); }
public float getHeight(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getHeight(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static float getHeight(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.fluid.Fluid.getHeight(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public int getTickRate(yarnwrap.world.WorldView world) { return wrapperContained.getTickRate(world.wrapperContained); }
// public static int getTickRate(yarnwrap.world.WorldView world, ) { return net.minecraft.fluid.Fluid.getTickRate(world.wrapperContained); }
// public yarnwrap.block.BlockState toBlockState(yarnwrap.fluid.FluidState state) { return new yarnwrap.block.BlockState(wrapperContained.toBlockState(state.wrapperContained)); }
// public static yarnwrap.block.BlockState toBlockState(yarnwrap.fluid.FluidState state, ) { return new yarnwrap.block.BlockState(net.minecraft.fluid.Fluid.toBlockState(state.wrapperContained)); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.fluid.Fluid.isIn(tag.wrapperContained); }
// public void onRandomTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state,yarnwrap.util.math.random.Random random) { wrapperContained.onRandomTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public static void onRandomTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState state,yarnwrap.util.math.random.Random random, ) { net.minecraft.fluid.Fluid.onRandomTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
public boolean isStill(yarnwrap.fluid.FluidState state) { return wrapperContained.isStill(state.wrapperContained); }
// public static boolean isStill(yarnwrap.fluid.FluidState state, ) { return net.minecraft.fluid.Fluid.isStill(state.wrapperContained); }
// public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.fluid.Fluid.isEmpty(); }
// public boolean hasRandomTicks() { return wrapperContained.hasRandomTicks(); }
// public static boolean hasRandomTicks() { return net.minecraft.fluid.Fluid.hasRandomTicks(); }
public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getShape(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.fluid.Fluid.getShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public float getHeight(yarnwrap.fluid.FluidState state) { return wrapperContained.getHeight(state.wrapperContained); }
// public static float getHeight(yarnwrap.fluid.FluidState state, ) { return net.minecraft.fluid.Fluid.getHeight(state.wrapperContained); }
public java.util.Optional getBucketFillSound() { return wrapperContained.getBucketFillSound(); }
// public static java.util.Optional getBucketFillSound() { return net.minecraft.fluid.Fluid.getBucketFillSound(); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
// public static Object getRegistryEntry() { return net.minecraft.fluid.Fluid.getRegistryEntry(); }

}