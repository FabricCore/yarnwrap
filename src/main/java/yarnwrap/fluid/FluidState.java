package yarnwrap.fluid;
public class FluidState { public net.minecraft.fluid.FluidState wrapperContained; public FluidState(net.minecraft.fluid.FluidState wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public boolean canFlowTo(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.canFlowTo(world.wrapperContained,pos.wrapperContained); }
public void onRandomTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.onRandomTick(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public yarnwrap.util.math.Vec3d getVelocity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Vec3d(wrapperContained.getVelocity(world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public float getBlastResistance() { return wrapperContained.getBlastResistance(); }
public int getLevel() { return wrapperContained.getLevel(); }
public float getHeight(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getHeight(world.wrapperContained,pos.wrapperContained); }
public boolean canBeReplacedWith(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.Direction direction) { return wrapperContained.canBeReplacedWith(world.wrapperContained,pos.wrapperContained,fluid.wrapperContained,direction.wrapperContained); }
public yarnwrap.particle.ParticleEffect getParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.getParticle()); }
public boolean isIn(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.isIn(tag.wrapperContained); }
public void randomDisplayTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.randomDisplayTick(world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public void onScheduledTick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.onScheduledTick(world.wrapperContained,pos.wrapperContained); }
public boolean isStill() { return wrapperContained.isStill(); }
public yarnwrap.fluid.Fluid getFluid() { return new yarnwrap.fluid.Fluid(wrapperContained.getFluid()); }
public boolean hasRandomTicks() { return wrapperContained.hasRandomTicks(); }
public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(world.wrapperContained,pos.wrapperContained)); }
public float getHeight() { return wrapperContained.getHeight(); }
public boolean isEqualAndStill(yarnwrap.fluid.Fluid fluid) { return wrapperContained.isEqualAndStill(fluid.wrapperContained); }
public boolean isOf(yarnwrap.fluid.Fluid fluid) { return wrapperContained.isOf(fluid.wrapperContained); }
public boolean isIn(yarnwrap.registry.entry.RegistryEntryList fluids) { return wrapperContained.isIn(fluids.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getRegistryEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getRegistryEntry()); }
public java.util.stream.Stream streamTags() { return wrapperContained.streamTags(); }

}