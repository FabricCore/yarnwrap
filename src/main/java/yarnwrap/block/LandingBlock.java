package yarnwrap.block;
public class LandingBlock { public net.minecraft.block.LandingBlock wrapperContained; public LandingBlock(net.minecraft.block.LandingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public void onLanding(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState fallingBlockState,yarnwrap.block.BlockState currentStateInPos,yarnwrap.entity.FallingBlockEntity fallingBlockEntity) { wrapperContained.onLanding(world.wrapperContained,pos.wrapperContained,fallingBlockState.wrapperContained,currentStateInPos.wrapperContained,fallingBlockEntity.wrapperContained); }
public void onDestroyedOnLanding(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.FallingBlockEntity fallingBlockEntity) { wrapperContained.onDestroyedOnLanding(world.wrapperContained,pos.wrapperContained,fallingBlockEntity.wrapperContained); }
public yarnwrap.entity.damage.DamageSource getDamageSource(yarnwrap.entity.Entity attacker) { return new yarnwrap.entity.damage.DamageSource(wrapperContained.getDamageSource(attacker.wrapperContained)); }

}