package yarnwrap.entity.mob;
public class WardenEntity { public net.minecraft.entity.mob.WardenEntity wrapperContained; public WardenEntity(net.minecraft.entity.mob.WardenEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState emergingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.emergingAnimationState); }
public void emergingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.emergingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState emergingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.WardenEntity.emergingAnimationState); }
// public static void emergingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.WardenEntity.emergingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
public void diggingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.diggingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.WardenEntity.diggingAnimationState); }
// public static void diggingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.WardenEntity.diggingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState attackingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.attackingAnimationState); }
public void attackingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.attackingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState attackingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.WardenEntity.attackingAnimationState); }
// public static void attackingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.WardenEntity.attackingAnimationState = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.mob.WardenEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.mob.WardenEntity.LOGGER = value; }

// public yarnwrap.entity.ai.WardenAngerManager angerManager() { return new yarnwrap.entity.ai.WardenAngerManager(wrapperContained.angerManager); }
// public void angerManager(yarnwrap.entity.ai.WardenAngerManager value) { wrapperContained.angerManager = value.wrapperContained; }
// public static yarnwrap.entity.ai.WardenAngerManager angerManager() { return new yarnwrap.entity.ai.WardenAngerManager(net.minecraft.entity.mob.WardenEntity.angerManager); }
// public static void angerManager(yarnwrap.entity.ai.WardenAngerManager value, ) { net.minecraft.entity.mob.WardenEntity.angerManager = value.wrapperContained; }

// public int MAX_HEALTH() { return wrapperContained.MAX_HEALTH; }
// public void MAX_HEALTH(int value) { wrapperContained.MAX_HEALTH = value; }
// public static int MAX_HEALTH() { return net.minecraft.entity.mob.WardenEntity.MAX_HEALTH; }
// public static void MAX_HEALTH(int value, ) { net.minecraft.entity.mob.WardenEntity.MAX_HEALTH = value; }

// public float MOVEMENT_SPEED() { return wrapperContained.MOVEMENT_SPEED; }
// public void MOVEMENT_SPEED(float value) { wrapperContained.MOVEMENT_SPEED = value; }
// public static float MOVEMENT_SPEED() { return net.minecraft.entity.mob.WardenEntity.MOVEMENT_SPEED; }
// public static void MOVEMENT_SPEED(float value, ) { net.minecraft.entity.mob.WardenEntity.MOVEMENT_SPEED = value; }

// public float KNOCKBACK_RESISTANCE() { return wrapperContained.KNOCKBACK_RESISTANCE; }
// public void KNOCKBACK_RESISTANCE(float value) { wrapperContained.KNOCKBACK_RESISTANCE = value; }
// public static float KNOCKBACK_RESISTANCE() { return net.minecraft.entity.mob.WardenEntity.KNOCKBACK_RESISTANCE; }
// public static void KNOCKBACK_RESISTANCE(float value, ) { net.minecraft.entity.mob.WardenEntity.KNOCKBACK_RESISTANCE = value; }

// public float ATTACK_KNOCKBACK() { return wrapperContained.ATTACK_KNOCKBACK; }
// public void ATTACK_KNOCKBACK(float value) { wrapperContained.ATTACK_KNOCKBACK = value; }
// public static float ATTACK_KNOCKBACK() { return net.minecraft.entity.mob.WardenEntity.ATTACK_KNOCKBACK; }
// public static void ATTACK_KNOCKBACK(float value, ) { net.minecraft.entity.mob.WardenEntity.ATTACK_KNOCKBACK = value; }

// public int ATTACK_DAMAGE() { return wrapperContained.ATTACK_DAMAGE; }
// public void ATTACK_DAMAGE(int value) { wrapperContained.ATTACK_DAMAGE = value; }
// public static int ATTACK_DAMAGE() { return net.minecraft.entity.mob.WardenEntity.ATTACK_DAMAGE; }
// public static void ATTACK_DAMAGE(int value, ) { net.minecraft.entity.mob.WardenEntity.ATTACK_DAMAGE = value; }

// public yarnwrap.entity.data.TrackedData ANGER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGER); }
// public void ANGER(yarnwrap.entity.data.TrackedData value) { wrapperContained.ANGER = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ANGER() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.WardenEntity.ANGER); }
// public static void ANGER(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.WardenEntity.ANGER = value.wrapperContained; }

// public int DARKNESS_EFFECT_DURATION() { return wrapperContained.DARKNESS_EFFECT_DURATION; }
// public void DARKNESS_EFFECT_DURATION(int value) { wrapperContained.DARKNESS_EFFECT_DURATION = value; }
// public static int DARKNESS_EFFECT_DURATION() { return net.minecraft.entity.mob.WardenEntity.DARKNESS_EFFECT_DURATION; }
// public static void DARKNESS_EFFECT_DURATION(int value, ) { net.minecraft.entity.mob.WardenEntity.DARKNESS_EFFECT_DURATION = value; }

// public int ANGRINESS_AMOUNT() { return wrapperContained.ANGRINESS_AMOUNT; }
// public void ANGRINESS_AMOUNT(int value) { wrapperContained.ANGRINESS_AMOUNT = value; }
// public static int ANGRINESS_AMOUNT() { return net.minecraft.entity.mob.WardenEntity.ANGRINESS_AMOUNT; }
// public static void ANGRINESS_AMOUNT(int value, ) { net.minecraft.entity.mob.WardenEntity.ANGRINESS_AMOUNT = value; }

// public int tendrilPitch() { return wrapperContained.tendrilPitch; }
// public void tendrilPitch(int value) { wrapperContained.tendrilPitch = value; }
// public static int tendrilPitch() { return net.minecraft.entity.mob.WardenEntity.tendrilPitch; }
// public static void tendrilPitch(int value, ) { net.minecraft.entity.mob.WardenEntity.tendrilPitch = value; }

// public int lastTendrilPitch() { return wrapperContained.lastTendrilPitch; }
// public void lastTendrilPitch(int value) { wrapperContained.lastTendrilPitch = value; }
// public static int lastTendrilPitch() { return net.minecraft.entity.mob.WardenEntity.lastTendrilPitch; }
// public static void lastTendrilPitch(int value, ) { net.minecraft.entity.mob.WardenEntity.lastTendrilPitch = value; }

// public int heartbeatCooldown() { return wrapperContained.heartbeatCooldown; }
// public void heartbeatCooldown(int value) { wrapperContained.heartbeatCooldown = value; }
// public static int heartbeatCooldown() { return net.minecraft.entity.mob.WardenEntity.heartbeatCooldown; }
// public static void heartbeatCooldown(int value, ) { net.minecraft.entity.mob.WardenEntity.heartbeatCooldown = value; }

// public int lastHeartbeatCooldown() { return wrapperContained.lastHeartbeatCooldown; }
// public void lastHeartbeatCooldown(int value) { wrapperContained.lastHeartbeatCooldown = value; }
// public static int lastHeartbeatCooldown() { return net.minecraft.entity.mob.WardenEntity.lastHeartbeatCooldown; }
// public static void lastHeartbeatCooldown(int value, ) { net.minecraft.entity.mob.WardenEntity.lastHeartbeatCooldown = value; }

// public yarnwrap.world.event.listener.EntityGameEventHandler gameEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(wrapperContained.gameEventHandler); }
// public void gameEventHandler(yarnwrap.world.event.listener.EntityGameEventHandler value) { wrapperContained.gameEventHandler = value.wrapperContained; }
// public static yarnwrap.world.event.listener.EntityGameEventHandler gameEventHandler() { return new yarnwrap.world.event.listener.EntityGameEventHandler(net.minecraft.entity.mob.WardenEntity.gameEventHandler); }
// public static void gameEventHandler(yarnwrap.world.event.listener.EntityGameEventHandler value, ) { net.minecraft.entity.mob.WardenEntity.gameEventHandler = value.wrapperContained; }

public yarnwrap.entity.AnimationState roaringAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roaringAnimationState); }
public void roaringAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.roaringAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState roaringAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.WardenEntity.roaringAnimationState); }
// public static void roaringAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.WardenEntity.roaringAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
public void sniffingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sniffingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.WardenEntity.sniffingAnimationState); }
// public static void sniffingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.WardenEntity.sniffingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState chargingSonicBoomAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.chargingSonicBoomAnimationState); }
public void chargingSonicBoomAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.chargingSonicBoomAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState chargingSonicBoomAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.mob.WardenEntity.chargingSonicBoomAnimationState); }
// public static void chargingSonicBoomAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.mob.WardenEntity.chargingSonicBoomAnimationState = value.wrapperContained; }

// public Object vibrationCallback() { return wrapperContained.vibrationCallback; }
// // public void vibrationCallback(Object value) { wrapperContained.vibrationCallback = value; }
// // public static Object vibrationCallback() { return net.minecraft.entity.mob.WardenEntity.vibrationCallback; }
// // public static void vibrationCallback(Object value, ) { net.minecraft.entity.mob.WardenEntity.vibrationCallback = value; }

// public Object vibrationListenerData() { return wrapperContained.vibrationListenerData; }
// // public void vibrationListenerData(Object value) { wrapperContained.vibrationListenerData = value; }
// // public static Object vibrationListenerData() { return net.minecraft.entity.mob.WardenEntity.vibrationListenerData; }
// // public static void vibrationListenerData(Object value, ) { net.minecraft.entity.mob.WardenEntity.vibrationListenerData = value; }

public float getHeartPitch(float tickDelta) { return wrapperContained.getHeartPitch(tickDelta); }
// public static float getHeartPitch(float tickDelta, ) { return net.minecraft.entity.mob.WardenEntity.getHeartPitch(tickDelta); }
// public void addDarknessToClosePlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity,int range) { wrapperContained.addDarknessToClosePlayers(world.wrapperContained,pos.wrapperContained,entity.wrapperContained,range); }
// public static void addDarknessToClosePlayers(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.Vec3d pos,yarnwrap.entity.Entity entity,int range, ) { net.minecraft.entity.mob.WardenEntity.addDarknessToClosePlayers(world.wrapperContained,pos.wrapperContained,entity.wrapperContained,range); }
// public void addDigParticles(yarnwrap.entity.AnimationState animationState) { wrapperContained.addDigParticles(animationState.wrapperContained); }
// public static void addDigParticles(yarnwrap.entity.AnimationState animationState, ) { net.minecraft.entity.mob.WardenEntity.addDigParticles(animationState.wrapperContained); }
public boolean isValidTarget(yarnwrap.entity.Entity entity) { return wrapperContained.isValidTarget(entity.wrapperContained); }
// public static boolean isValidTarget(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.mob.WardenEntity.isValidTarget(entity.wrapperContained); }
// public void method_42208(yarnwrap.entity.ai.WardenAngerManager angerManager) { wrapperContained.method_42208(angerManager.wrapperContained); }
// public static void method_42208(yarnwrap.entity.ai.WardenAngerManager angerManager, ) { net.minecraft.entity.mob.WardenEntity.method_42208(angerManager.wrapperContained); }
// public void method_42209(yarnwrap.nbt.NbtCompound angerNbt) { wrapperContained.method_42209(angerNbt.wrapperContained); }
// public static void method_42209(yarnwrap.nbt.NbtCompound angerNbt, ) { net.minecraft.entity.mob.WardenEntity.method_42209(angerNbt.wrapperContained); }
public void removeSuspect(yarnwrap.entity.Entity entity) { wrapperContained.removeSuspect(entity.wrapperContained); }
// public static void removeSuspect(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.mob.WardenEntity.removeSuspect(entity.wrapperContained); }
public void increaseAngerAt(yarnwrap.entity.Entity entity,int amount,boolean listening) { wrapperContained.increaseAngerAt(entity.wrapperContained,amount,listening); }
// public static void increaseAngerAt(yarnwrap.entity.Entity entity,int amount,boolean listening, ) { net.minecraft.entity.mob.WardenEntity.increaseAngerAt(entity.wrapperContained,amount,listening); }
public void increaseAngerAt(yarnwrap.entity.Entity entity) { wrapperContained.increaseAngerAt(entity.wrapperContained); }
// public static void increaseAngerAt(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.mob.WardenEntity.increaseAngerAt(entity.wrapperContained); }
public yarnwrap.entity.mob.Angriness getAngriness() { return new yarnwrap.entity.mob.Angriness(wrapperContained.getAngriness()); }
// public static yarnwrap.entity.mob.Angriness getAngriness() { return new yarnwrap.entity.mob.Angriness(net.minecraft.entity.mob.WardenEntity.getAngriness()); }
public java.util.Optional getPrimeSuspect() { return wrapperContained.getPrimeSuspect(); }
// public static java.util.Optional getPrimeSuspect() { return net.minecraft.entity.mob.WardenEntity.getPrimeSuspect(); }
public yarnwrap.entity.ai.WardenAngerManager getAngerManager() { return new yarnwrap.entity.ai.WardenAngerManager(wrapperContained.getAngerManager()); }
// public static yarnwrap.entity.ai.WardenAngerManager getAngerManager() { return new yarnwrap.entity.ai.WardenAngerManager(net.minecraft.entity.mob.WardenEntity.getAngerManager()); }
// public void updateAnger() { wrapperContained.updateAnger(); }
// public static void updateAnger() { net.minecraft.entity.mob.WardenEntity.updateAnger(); }
// public int getHeartRate() { return wrapperContained.getHeartRate(); }
// public static int getHeartRate() { return net.minecraft.entity.mob.WardenEntity.getHeartRate(); }
// public void playListeningSound() { wrapperContained.playListeningSound(); }
// public static void playListeningSound() { net.minecraft.entity.mob.WardenEntity.playListeningSound(); }
// public Object addAttributes() { return wrapperContained.addAttributes(); }
public static Object addAttributes() { return net.minecraft.entity.mob.WardenEntity.addAttributes(); }
public int getAnger() { return wrapperContained.getAnger(); }
// public static int getAnger() { return net.minecraft.entity.mob.WardenEntity.getAnger(); }
public float getTendrilPitch(float tickDelta) { return wrapperContained.getTendrilPitch(tickDelta); }
// public static float getTendrilPitch(float tickDelta, ) { return net.minecraft.entity.mob.WardenEntity.getTendrilPitch(tickDelta); }
// public void method_42669(yarnwrap.nbt.NbtCompound listenerData) { wrapperContained.method_42669(listenerData.wrapperContained); }
// public static void method_42669(yarnwrap.nbt.NbtCompound listenerData, ) { net.minecraft.entity.mob.WardenEntity.method_42669(listenerData.wrapperContained); }
// public boolean isDiggingOrEmerging() { return wrapperContained.isDiggingOrEmerging(); }
// public static boolean isDiggingOrEmerging() { return net.minecraft.entity.mob.WardenEntity.isDiggingOrEmerging(); }
public void updateAttackTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.updateAttackTarget(target.wrapperContained); }
// public static void updateAttackTarget(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.WardenEntity.updateAttackTarget(target.wrapperContained); }
// public int getAngerAtTarget() { return wrapperContained.getAngerAtTarget(); }
// public static int getAngerAtTarget() { return net.minecraft.entity.mob.WardenEntity.getAngerAtTarget(); }
// public void method_51303(Object listenerData) { wrapperContained.method_51303(listenerData); }
// public static void method_51303(Object listenerData, ) { net.minecraft.entity.mob.WardenEntity.method_51303(listenerData); }

}