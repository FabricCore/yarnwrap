package yarnwrap.world.explosion;
public class ExplosionBehavior { public net.minecraft.world.explosion.ExplosionBehavior wrapperContained; public ExplosionBehavior(net.minecraft.world.explosion.ExplosionBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canDestroyBlock(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float power) { return wrapperContained.canDestroyBlock(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,state.wrapperContained,power); }
public java.util.Optional getBlastResistance(yarnwrap.world.explosion.Explosion explosion,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { return wrapperContained.getBlastResistance(explosion.wrapperContained,world.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
public float calculateDamage(yarnwrap.world.explosion.Explosion explosion,yarnwrap.entity.Entity entity) { return wrapperContained.calculateDamage(explosion.wrapperContained,entity.wrapperContained); }
public boolean shouldDamage(yarnwrap.world.explosion.Explosion explosion,yarnwrap.entity.Entity entity) { return wrapperContained.shouldDamage(explosion.wrapperContained,entity.wrapperContained); }
public float getKnockbackModifier(yarnwrap.entity.Entity entity) { return wrapperContained.getKnockbackModifier(entity.wrapperContained); }

}