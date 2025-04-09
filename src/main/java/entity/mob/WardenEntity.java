package yarnwrap.entity.mob;
public class WardenEntity { public net.minecraft.entity.mob.WardenEntity wrapperContained; public WardenEntity(net.minecraft.entity.mob.WardenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState emergingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.emergingAnimationState); }
public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
public yarnwrap.entity.AnimationState attackingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.attackingAnimationState); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.ai.WardenAngerManager angerManager() { return new yarnwrap.entity.ai.WardenAngerManager(wrapperContained.angerManager); }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public float KNOCKBACK_RESISTANCE() { return wrapperContained.KNOCKBACK_RESISTANCE; }
// public float ATTACK_KNOCKBACK() { return wrapperContained.ATTACK_KNOCKBACK; }
// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public yarnwrap.entity.data.TrackedData ANGER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER); }
// public int DARKNESS_EFFECT_DURATION() { return wrapperContained.DARKNESS_EFFECT_DURATION; }
// public int ANGRINESS_AMOUNT() { return wrapperContained.ANGRINESS_AMOUNT; }
// public int tendrilPitch() { return wrapperContained.tendrilPitch; }
// public int lastTendrilPitch() { return wrapperContained.lastTendrilPitch; }
// public int heartbeatCooldown() { return wrapperContained.heartbeatCooldown; }
// public int lastHeartbeatCooldown() { return wrapperContained.lastHeartbeatCooldown; }
// public yarnwrap.world.event.listener.EntityGameEventHandler gameEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.gameEventHandler); }
public yarnwrap.entity.AnimationState roaringAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roaringAnimationState); }
public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
public yarnwrap.entity.AnimationState chargingSonicBoomAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.chargingSonicBoomAnimationState); }
// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
public float getHeartPitch(float tickDelta) { return wrapperContained.getHeartPitch(tickDelta); }
public void addDarknessToClosePlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity,int range) { wrapperContained.addDarknessToClosePlayers(world.wrapperContained,pos.wrapperContained,entity.wrapperContained,range); }
// public void addDigParticles(yarnwrap.entity.AnimationState animationState) { wrapperContained.addDigParticles(animationState.wrapperContained); }
public boolean isValidTarget(yarnwrap.entity.Entity entity) { return wrapperContained.isValidTarget(entity.wrapperContained); }
public void removeSuspect(yarnwrap.entity.Entity entity) { wrapperContained.removeSuspect(entity.wrapperContained); }
public void increaseAngerAt(yarnwrap.entity.Entity entity,int amount,boolean listening) { wrapperContained.increaseAngerAt(entity.wrapperContained,amount,listening); }
public void increaseAngerAt(yarnwrap.entity.Entity entity) { wrapperContained.increaseAngerAt(entity.wrapperContained); }
public yarnwrap.entity.mob.Angriness getAngriness() { return new yarnwrap.entity.mob.Angriness(wrapperContained.getAngriness()); }
public java.util.Optional getPrimeSuspect() { return wrapperContained.getPrimeSuspect(); }
public yarnwrap.entity.ai.WardenAngerManager getAngerManager() { return new yarnwrap.entity.ai.WardenAngerManager(wrapperContained.getAngerManager()); }
// public void updateAnger() { wrapperContained.updateAnger(); }
// public int getHeartRate() { return wrapperContained.getHeartRate(); }
// public void playListeningSound() { wrapperContained.playListeningSound(); }
public Object addAttributes() { return wrapperContained.addAttributes(); }
public int getAnger() { return wrapperContained.getAnger(); }
public float getTendrilPitch(float tickDelta) { return wrapperContained.getTendrilPitch(tickDelta); }
// public boolean isDiggingOrEmerging() { return wrapperContained.isDiggingOrEmerging(); }
public void updateAttackTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.updateAttackTarget(target.wrapperContained); }
// public int getAngerAtTarget() { return wrapperContained.getAngerAtTarget(); }

}