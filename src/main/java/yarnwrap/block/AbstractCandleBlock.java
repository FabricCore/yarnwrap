package yarnwrap.block;
public class AbstractCandleBlock { public net.minecraft.block.AbstractCandleBlock wrapperContained; public AbstractCandleBlock(net.minecraft.block.AbstractCandleBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
// public void spawnCandleParticles(yarnwrap.world.World world,yarnwrap.util.math.Vec3d vec3d,yarnwrap.util.math.random.Random random) { wrapperContained.spawnCandleParticles(world.wrapperContained,vec3d.wrapperContained,random.wrapperContained); }
// public void setLit(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,boolean lit) { wrapperContained.setLit(world.wrapperContained,state.wrapperContained,pos.wrapperContained,lit); }
// public java.lang.Iterable getParticleOffsets(yarnwrap.block.BlockState state) { return wrapperContained.getParticleOffsets(state.wrapperContained); }
public void extinguish(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.extinguish(player.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public boolean isLitCandle(yarnwrap.block.BlockState state) { return wrapperContained.isLitCandle(state.wrapperContained); }
// public boolean isNotLit(yarnwrap.block.BlockState state) { return wrapperContained.isNotLit(state.wrapperContained); }

}