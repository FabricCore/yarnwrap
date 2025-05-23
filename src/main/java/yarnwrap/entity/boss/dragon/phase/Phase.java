package yarnwrap.entity.boss.dragon.phase;
public class Phase { public net.minecraft.entity.boss.dragon.phase.Phase wrapperContained; public Phase(net.minecraft.entity.boss.dragon.phase.Phase wrapperContained) { this.wrapperContained = wrapperContained; }

public float getMaxYAcceleration() { return wrapperContained.getMaxYAcceleration(); }
// public static float getMaxYAcceleration() { return net.minecraft.entity.boss.dragon.phase.Phase.getMaxYAcceleration(); }
public float getYawAcceleration() { return wrapperContained.getYawAcceleration(); }
// public static float getYawAcceleration() { return net.minecraft.entity.boss.dragon.phase.Phase.getYawAcceleration(); }
public boolean isSittingOrHovering() { return wrapperContained.isSittingOrHovering(); }
// public static boolean isSittingOrHovering() { return net.minecraft.entity.boss.dragon.phase.Phase.isSittingOrHovering(); }
public yarnwrap.entity.boss.dragon.phase.PhaseType getType() { return new yarnwrap.entity.boss.dragon.phase.PhaseType(wrapperContained.getType()); }
// public static yarnwrap.entity.boss.dragon.phase.PhaseType getType() { return new yarnwrap.entity.boss.dragon.phase.PhaseType(net.minecraft.entity.boss.dragon.phase.Phase.getType()); }
public void crystalDestroyed(yarnwrap.entity.decoration.EndCrystalEntity crystal,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.damage.DamageSource source,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.crystalDestroyed(crystal.wrapperContained,pos.wrapperContained,source.wrapperContained,player.wrapperContained); }
// public static void crystalDestroyed(yarnwrap.entity.decoration.EndCrystalEntity crystal,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.damage.DamageSource source,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.boss.dragon.phase.Phase.crystalDestroyed(crystal.wrapperContained,pos.wrapperContained,source.wrapperContained,player.wrapperContained); }
public yarnwrap.util.math.Vec3d getPathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.getPathTarget()); }
// public static yarnwrap.util.math.Vec3d getPathTarget() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.boss.dragon.phase.Phase.getPathTarget()); }
public float modifyDamageTaken(yarnwrap.entity.damage.DamageSource damageSource,float damage) { return wrapperContained.modifyDamageTaken(damageSource.wrapperContained,damage); }
// public static float modifyDamageTaken(yarnwrap.entity.damage.DamageSource damageSource,float damage, ) { return net.minecraft.entity.boss.dragon.phase.Phase.modifyDamageTaken(damageSource.wrapperContained,damage); }
public void clientTick() { wrapperContained.clientTick(); }
// public static void clientTick() { net.minecraft.entity.boss.dragon.phase.Phase.clientTick(); }
public void endPhase() { wrapperContained.endPhase(); }
// public static void endPhase() { net.minecraft.entity.boss.dragon.phase.Phase.endPhase(); }
public void serverTick(yarnwrap.server.world.ServerWorld world) { wrapperContained.serverTick(world.wrapperContained); }
// public static void serverTick(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.entity.boss.dragon.phase.Phase.serverTick(world.wrapperContained); }
public void beginPhase() { wrapperContained.beginPhase(); }
// public static void beginPhase() { net.minecraft.entity.boss.dragon.phase.Phase.beginPhase(); }

}