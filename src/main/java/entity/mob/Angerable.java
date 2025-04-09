package yarnwrap.entity.mob;
public class Angerable { public net.minecraft.entity.mob.Angerable wrapperContained; public Angerable(net.minecraft.entity.mob.Angerable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String ANGER_TIME_KEY() { return wrapperContained.ANGER_TIME_KEY; }
public java.lang.String ANGRY_AT_KEY() { return wrapperContained.ANGRY_AT_KEY; }
public boolean canTarget(yarnwrap.entity.LivingEntity target) { return wrapperContained.canTarget(target.wrapperContained); }
public void setAttacking(yarnwrap.entity.player.PlayerEntity attacking) { wrapperContained.setAttacking(attacking.wrapperContained); }
public int getAngerTime() { return wrapperContained.getAngerTime(); }
public java.util.UUID getAngryAt() { return wrapperContained.getAngryAt(); }
public void chooseRandomAngerTime() { wrapperContained.chooseRandomAngerTime(); }
public void tickAngerLogic(yarnwrap.server.world.ServerWorld world,boolean angerPersistent) { wrapperContained.tickAngerLogic(world.wrapperContained,angerPersistent); }
public boolean hasAngerTime() { return wrapperContained.hasAngerTime(); }
public void readAngerFromNbt(yarnwrap.world.World world,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readAngerFromNbt(world.wrapperContained,nbt.wrapperContained); }
public void setAngryAt(java.util.UUID angryAt) { wrapperContained.setAngryAt(angryAt); }
public void setAngerTime(int angerTime) { wrapperContained.setAngerTime(angerTime); }
public boolean shouldAngerAt(yarnwrap.entity.LivingEntity entity) { return wrapperContained.shouldAngerAt(entity.wrapperContained); }
public void forgive(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.forgive(player.wrapperContained); }
public void writeAngerToNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeAngerToNbt(nbt.wrapperContained); }
public void universallyAnger() { wrapperContained.universallyAnger(); }
public void stopAnger() { wrapperContained.stopAnger(); }
public boolean isUniversallyAngry(yarnwrap.world.World world) { return wrapperContained.isUniversallyAngry(world.wrapperContained); }
public yarnwrap.entity.LivingEntity getTarget() { return new yarnwrap.entity.LivingEntity(wrapperContained.getTarget()); }
public void setTarget(yarnwrap.entity.LivingEntity target) { wrapperContained.setTarget(target.wrapperContained); }
public void setAttacker(yarnwrap.entity.LivingEntity attacker) { wrapperContained.setAttacker(attacker.wrapperContained); }
public yarnwrap.entity.LivingEntity getAttacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.getAttacker()); }

}