package yarnwrap.fluid;
public class FluidState { public net.minecraft.fluid.FluidState wrapperContained; public FluidState(net.minecraft.fluid.FluidState wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.fluid.FluidState.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.fluid.FluidState.CODEC = value; }

public FluidState(yarnwrap.fluid.Fluid fluid,it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap propertyMap,com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.fluid.FluidState(fluid.wrapperContained,propertyMap,codec); }
public boolean canFlowTo(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canFlowTo(world.wrapperContained,pos.wrapperContained); }
// public static boolean canFlowTo(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.fluid.FluidState.canFlowTo(world.wrapperContained,pos.wrapperContained); }
public void onRandomTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.onRandomTick(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void onRandomTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.fluid.FluidState.onRandomTick(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public yarnwrap.util.math.Vec3d getVelocity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getVelocity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.fluid.FluidState.getVelocity(world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.fluid.FluidState.getBlockState()); }
public float getBlastResistance() { return wrapperContained.getBlastResistance(); }
// public static float getBlastResistance() { return net.minecraft.fluid.FluidState.getBlastResistance(); }
public int getLevel() { return wrapperContained.getLevel(); }
// public static int getLevel() { return net.minecraft.fluid.FluidState.getLevel(); }
public float getHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getHeight(world.wrapperContained,pos.wrapperContained); }
// public static float getHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.fluid.FluidState.getHeight(world.wrapperContained,pos.wrapperContained); }
public boolean canBeReplacedWith(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.Direction direction) { return wrapperContained.canBeReplacedWith(world.wrapperContained,pos.wrapperContained,fluid.wrapperContained,direction.wrapperContained); }
// public static boolean canBeReplacedWith(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.Direction direction, ) { return net.minecraft.fluid.FluidState.canBeReplacedWith(world.wrapperContained,pos.wrapperContained,fluid.wrapperContained,direction.wrapperContained); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
// public static yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(net.minecraft.fluid.FluidState.getParticle()); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.fluid.FluidState.isIn(tag.wrapperContained); }
public void randomDisplayTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.randomDisplayTick(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void randomDisplayTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.fluid.FluidState.randomDisplayTick(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.fluid.FluidState.isEmpty(); }
public void onScheduledTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.onScheduledTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void onScheduledTick(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.fluid.FluidState.onScheduledTick(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean isStill() { return wrapperContained.isStill(); }
// public static boolean isStill() { return net.minecraft.fluid.FluidState.isStill(); }
public yarnwrap.fluid.Fluid getFluid() { return new yarnwrap.fluid.Fluid(wrapperContained.getFluid()); }
// public static yarnwrap.fluid.Fluid getFluid() { return new yarnwrap.fluid.Fluid(net.minecraft.fluid.FluidState.getFluid()); }
public boolean hasRandomTicks() { return wrapperContained.hasRandomTicks(); }
// public static boolean hasRandomTicks() { return net.minecraft.fluid.FluidState.hasRandomTicks(); }
public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.fluid.FluidState.getShape(world.wrapperContained,pos.wrapperContained)); }
public float getHeight() { return wrapperContained.getHeight(); }
// public static float getHeight() { return net.minecraft.fluid.FluidState.getHeight(); }
public boolean isEqualAndStill(yarnwrap.fluid.Fluid fluid) { return wrapperContained.isEqualAndStill(fluid.wrapperContained); }
// public static boolean isEqualAndStill(yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.fluid.FluidState.isEqualAndStill(fluid.wrapperContained); }
public boolean isOf(yarnwrap.fluid.Fluid fluid) { return wrapperContained.isOf(fluid.wrapperContained); }
// public static boolean isOf(yarnwrap.fluid.Fluid fluid, ) { return net.minecraft.fluid.FluidState.isOf(fluid.wrapperContained); }
public boolean isIn(yarnwrap.registry.entry.RegistryEntryList fluids) { return wrapperContained.isIn(fluids.wrapperContained); }
// public static boolean isIn(yarnwrap.registry.entry.RegistryEntryList fluids, ) { return net.minecraft.fluid.FluidState.isIn(fluids.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getRegistryEntry()); }
// public static yarnwrap.registry.entry.RegistryEntry getRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.fluid.FluidState.getRegistryEntry()); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }
// public static java.util.stream.Stream streamTags() { return net.minecraft.fluid.FluidState.streamTags(); }
public yarnwrap.util.math.Box getCollisionBox(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Box(wrapperContained.getCollisionBox(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.Box getCollisionBox(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.Box(net.minecraft.fluid.FluidState.getCollisionBox(world.wrapperContained,pos.wrapperContained)); }
public void onEntityCollision(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityCollisionHandler handler) { wrapperContained.onEntityCollision(world.wrapperContained,pos.wrapperContained,entity.wrapperContained,handler.wrapperContained); }
// public static void onEntityCollision(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.Entity entity,yarnwrap.entity.EntityCollisionHandler handler, ) { net.minecraft.fluid.FluidState.onEntityCollision(world.wrapperContained,pos.wrapperContained,entity.wrapperContained,handler.wrapperContained); }

}