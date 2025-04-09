package yarnwrap.block;
public class CampfireBlock { public net.minecraft.block.CampfireBlock wrapperContained; public CampfireBlock(net.minecraft.block.CampfireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
public yarnwrap.state.property.BooleanProperty SIGNAL_FIRE() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SIGNAL_FIRE); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape SMOKEY_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SMOKEY_SHAPE); }
// public boolean emitsParticles() { return wrapperContained.emitsParticles; }
// public int fireDamage() { return wrapperContained.fireDamage; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public void spawnSmokeParticle(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean isSignal,boolean lotsOfSmoke) { wrapperContained.spawnSmokeParticle(world.wrapperContained,pos.wrapperContained,isSignal,lotsOfSmoke); }
// public boolean isSignalFireBaseBlock(yarnwrap.block.BlockState state) { return wrapperContained.isSignalFireBaseBlock(state.wrapperContained); }
public boolean isLitCampfireInRange(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isLitCampfireInRange(world.wrapperContained,pos.wrapperContained); }
public boolean isLitCampfire(yarnwrap.block.BlockState state) { return wrapperContained.isLitCampfire(state.wrapperContained); }
public void extinguish(yarnwrap.entity.Entity entity,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.extinguish(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
public boolean canBeLit(yarnwrap.block.BlockState state) { return wrapperContained.canBeLit(state.wrapperContained); }

}