package yarnwrap.entity.mob;
public class WardenEntity { public net.minecraft.entity.mob.WardenEntity wrapperContained; public WardenEntity(net.minecraft.entity.mob.WardenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState emergingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.emergingAnimationState); }
public void emergingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.emergingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
public void diggingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.diggingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState attackingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.attackingAnimationState); }
public void attackingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.attackingAnimationState = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.ai.WardenAngerManager angerManager() { return new yarnwrap.entity.ai.WardenAngerManager(wrapperContained.angerManager); }
// public void angerManager(yarnwrap.entity.ai.WardenAngerManager value) { wrapperContained.angerManager = value.wrapperContained; }
// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public void MAX_HEALTH(int value) { wrapperContained.MAX_HEALTH = value; }
// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public void MOVEMENT_SPEED(float value) { wrapperContained.MOVEMENT_SPEED = value; }
// public float KNOCKBACK_RESISTANCE() { return wrapperContained.KNOCKBACK_RESISTANCE; }
// public void KNOCKBACK_RESISTANCE(float value) { wrapperContained.KNOCKBACK_RESISTANCE = value; }
// public float ATTACK_KNOCKBACK() { return wrapperContained.ATTACK_KNOCKBACK; }
// public void ATTACK_KNOCKBACK(float value) { wrapperContained.ATTACK_KNOCKBACK = value; }
// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(int value) { wrapperContained.ATTACK_DAMAGE = value; }
// public yarnwrap.entity.data.TrackedData ANGER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER); }
// public void ANGER(yarnwrap.entity.data.TrackedData value) { wrapperContained.ANGER = value.wrapperContained; }
// public int DARKNESS_EFFECT_DURATION() { return wrapperContained.DARKNESS_EFFECT_DURATION; }
// public void DARKNESS_EFFECT_DURATION(int value) { wrapperContained.DARKNESS_EFFECT_DURATION = value; }
// public int ANGRINESS_AMOUNT() { return wrapperContained.ANGRINESS_AMOUNT; }
// public void ANGRINESS_AMOUNT(int value) { wrapperContained.ANGRINESS_AMOUNT = value; }
// public int tendrilPitch() { return wrapperContained.tendrilPitch; }
// public void tendrilPitch(int value) { wrapperContained.tendrilPitch = value; }
// public int lastTendrilPitch() { return wrapperContained.lastTendrilPitch; }
// public void lastTendrilPitch(int value) { wrapperContained.lastTendrilPitch = value; }
// public int heartbeatCooldown() { return wrapperContained.heartbeatCooldown; }
// public void heartbeatCooldown(int value) { wrapperContained.heartbeatCooldown = value; }
// public int lastHeartbeatCooldown() { return wrapperContained.lastHeartbeatCooldown; }
// public void lastHeartbeatCooldown(int value) { wrapperContained.lastHeartbeatCooldown = value; }
// public yarnwrap.world.event.listener.EntityGameEventHandler gameEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.gameEventHandler); }
// public void gameEventHandler(yarnwrap.world.event.listener.EntityGameEventHandler value) { wrapperContained.gameEventHandler = value.wrapperContained; }
public yarnwrap.entity.AnimationState roaringAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roaringAnimationState); }
public void roaringAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.roaringAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
public void sniffingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sniffingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState chargingSonicBoomAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.chargingSonicBoomAnimationState); }
public void chargingSonicBoomAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.chargingSonicBoomAnimationState = value.wrapperContained; }
// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// // public void vibrationCallback(Object value) { wrapperContained.vibrationCallback = value; }
// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
// // public void vibrationListenerData(Object value) { wrapperContained.vibrationListenerData = value; }
public float getHeartPitch(float tickDelta) { return wrapperContained.getHeartPitch(tickDelta); }
public void addDarknessToClosePlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity,int range) { wrapperContained.addDarknessToClosePlayers(world.wrapperContained,pos.wrapperContained,entity.wrapperContained,range); }
// public void addDigParticles(yarnwrap.entity.AnimationState animationState) { wrapperContained.addDigParticles(animationState.wrapperContained); }
public boolean isValidTarget(yarnwrap.entity.Entity entity) { return wrapperContained.isValidTarget(entity.wrapperContained); }
// public void method_42208(yarnwrap.entity.ai.WardenAngerManager angerManager) { wrapperContained.method_42208(angerManager.wrapperContained); }
// public void method_42209(yarnwrap.nbt.NbtCompound angerNbt) { wrapperContained.method_42209(angerNbt.wrapperContained); }
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
// public void method_42669(yarnwrap.nbt.NbtCompound listenerData) { wrapperContained.method_42669(listenerData.wrapperContained); }
// public boolean isDiggingOrEmerging() { return wrapperContained.isDiggingOrEmerging(); }
public void updateAttackTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.updateAttackTarget(target.wrapperContained); }
// public int getAngerAtTarget() { return wrapperContained.getAngerAtTarget(); }
// public void method_51303(Object listenerData) { wrapperContained.method_51303(listenerData); }

}