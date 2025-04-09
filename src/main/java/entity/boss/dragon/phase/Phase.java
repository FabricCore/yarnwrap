package yarnwrap.entity.boss.dragon.phase;
public class Phase { public net.minecraft.entity.boss.dragon.phase.Phase wrapperContained; public Phase(net.minecraft.entity.boss.dragon.phase.Phase wrapperContained) { this.wrapperContained = wrapperContained; }

public float getMaxYAcceleration() { return wrapperContained.getMaxYAcceleration(); }
public float getYawAcceleration() { return wrapperContained.getYawAcceleration(); }
public boolean isSittingOrHovering() { return wrapperContained.isSittingOrHovering(); }
public yarnwrap.entity.boss.dragon.phase.PhaseType getType() { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.getType()); }
public void crystalDestroyed(yarnwrap.entity.decoration.EndCrystalEntity crystal,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.damage.DamageSource source,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.crystalDestroyed(crystal.wrapperContained,pos.wrapperContained,source.wrapperContained,player.wrapperContained); }
public yarnwrap.util.math.Vec3d getPathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPathTarget()); }
public float modifyDamageTaken(yarnwrap.entity.damage.DamageSource damageSource,float damage) { return wrapperContained.modifyDamageTaken(damageSource.wrapperContained,damage); }
public void clientTick() { wrapperContained.clientTick(); }
public void endPhase() { wrapperContained.endPhase(); }
public void serverTick() { wrapperContained.serverTick(); }
public void beginPhase() { wrapperContained.beginPhase(); }

}