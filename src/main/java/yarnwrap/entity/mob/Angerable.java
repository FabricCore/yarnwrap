package yarnwrap.entity.mob;
public class Angerable { public net.minecraft.entity.mob.Angerable wrapperContained; public Angerable(net.minecraft.entity.mob.Angerable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String ANGER_TIME_KEY() { return wrapperContained.ANGER_TIME_KEY; }
// public void ANGER_TIME_KEY(java.lang.String value) { wrapperContained.ANGER_TIME_KEY = value; }
public static java.lang.String ANGER_TIME_KEY() { return net.minecraft.entity.mob.Angerable.ANGER_TIME_KEY; }
// public static void ANGER_TIME_KEY(java.lang.String value, ) { net.minecraft.entity.mob.Angerable.ANGER_TIME_KEY = value; }

// public java.lang.String ANGRY_AT_KEY() { return wrapperContained.ANGRY_AT_KEY; }
// public void ANGRY_AT_KEY(java.lang.String value) { wrapperContained.ANGRY_AT_KEY = value; }
public static java.lang.String ANGRY_AT_KEY() { return net.minecraft.entity.mob.Angerable.ANGRY_AT_KEY; }
// public static void ANGRY_AT_KEY(java.lang.String value, ) { net.minecraft.entity.mob.Angerable.ANGRY_AT_KEY = value; }

public yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTarget()); }
// public static yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.Angerable.getTarget()); }
public void setTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.setTarget(target.wrapperContained); }
// public static void setTarget(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.mob.Angerable.setTarget(target.wrapperContained); }
public void setAttacker(yarnwrap.entity.LivingEntity attacker) { wrapperContained.setAttacker(attacker.wrapperContained); }
// public static void setAttacker(yarnwrap.entity.LivingEntity attacker, ) { net.minecraft.entity.mob.Angerable.setAttacker(attacker.wrapperContained); }
public yarnwrap.entity.LivingEntity getAttacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.getAttacker()); }
// public static yarnwrap.entity.LivingEntity getAttacker() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.mob.Angerable.getAttacker()); }
public boolean canTarget(yarnwrap.entity.LivingEntity target) { return wrapperContained.canTarget(target.wrapperContained); }
// public static boolean canTarget(yarnwrap.entity.LivingEntity target, ) { return net.minecraft.entity.mob.Angerable.canTarget(target.wrapperContained); }
public int getAngerTime() { return wrapperContained.getAngerTime(); }
// public static int getAngerTime() { return net.minecraft.entity.mob.Angerable.getAngerTime(); }
public java.util.UUID getAngryAt() { return wrapperContained.getAngryAt(); }
// public static java.util.UUID getAngryAt() { return net.minecraft.entity.mob.Angerable.getAngryAt(); }
public void chooseRandomAngerTime() { wrapperContained.chooseRandomAngerTime(); }
// public static void chooseRandomAngerTime() { net.minecraft.entity.mob.Angerable.chooseRandomAngerTime(); }
public void tickAngerLogic(yarnwrap.server.world.ServerWorld world,boolean angerPersistent) { wrapperContained.tickAngerLogic(world.wrapperContained,angerPersistent); }
// public static void tickAngerLogic(yarnwrap.server.world.ServerWorld world,boolean angerPersistent, ) { net.minecraft.entity.mob.Angerable.tickAngerLogic(world.wrapperContained,angerPersistent); }
public boolean hasAngerTime() { return wrapperContained.hasAngerTime(); }
// public static boolean hasAngerTime() { return net.minecraft.entity.mob.Angerable.hasAngerTime(); }
// public void readAngerFromData(yarnwrap.world.World world,yarnwrap.storage.ReadView view) { wrapperContained.readAngerFromData(world.wrapperContained,view.wrapperContained); }
// public static void readAngerFromData(yarnwrap.world.World world,yarnwrap.storage.ReadView view, ) { net.minecraft.entity.mob.Angerable.readAngerFromData(world.wrapperContained,view.wrapperContained); }
public void setAngryAt(java.util.UUID angryAt) { wrapperContained.setAngryAt(angryAt); }
// public static void setAngryAt(java.util.UUID angryAt, ) { net.minecraft.entity.mob.Angerable.setAngryAt(angryAt); }
public void setAngerTime(int angerTime) { wrapperContained.setAngerTime(angerTime); }
// public static void setAngerTime(int angerTime, ) { net.minecraft.entity.mob.Angerable.setAngerTime(angerTime); }
public boolean shouldAngerAt(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world) { return wrapperContained.shouldAngerAt(entity.wrapperContained,world.wrapperContained); }
// public static boolean shouldAngerAt(yarnwrap.entity.LivingEntity entity,yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.mob.Angerable.shouldAngerAt(entity.wrapperContained,world.wrapperContained); }
public void forgive(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.forgive(world.wrapperContained,player.wrapperContained); }
// public static void forgive(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.mob.Angerable.forgive(world.wrapperContained,player.wrapperContained); }
// public void writeAngerToData(yarnwrap.storage.WriteView view) { wrapperContained.writeAngerToData(view.wrapperContained); }
// public static void writeAngerToData(yarnwrap.storage.WriteView view, ) { net.minecraft.entity.mob.Angerable.writeAngerToData(view.wrapperContained); }
public void universallyAnger() { wrapperContained.universallyAnger(); }
// public static void universallyAnger() { net.minecraft.entity.mob.Angerable.universallyAnger(); }
public void stopAnger() { wrapperContained.stopAnger(); }
// public static void stopAnger() { net.minecraft.entity.mob.Angerable.stopAnger(); }
public boolean isUniversallyAngry(yarnwrap.server.world.ServerWorld world) { return wrapperContained.isUniversallyAngry(world.wrapperContained); }
// public static boolean isUniversallyAngry(yarnwrap.server.world.ServerWorld world, ) { return net.minecraft.entity.mob.Angerable.isUniversallyAngry(world.wrapperContained); }

}