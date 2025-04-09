package yarnwrap.entity.passive;
public class RabbitEntity { public net.minecraft.entity.passive.RabbitEntity wrapperContained; public RabbitEntity(net.minecraft.entity.passive.RabbitEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public double ESCAPE_DANGER_SPEED() { return wrapperContained.ESCAPE_DANGER_SPEED; }
public double MELEE_ATTACK_SPEED() { return wrapperContained.MELEE_ATTACK_SPEED; }
// public yarnwrap.util.Identifier KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID); }
// public yarnwrap.util.Identifier KILLER_BUNNY() { return new yarnwrap.util.Identifier(wrapperContained.KILLER_BUNNY); }
// public int moreCarrotTicks() { return wrapperContained.moreCarrotTicks; }
// public int ticksUntilJump() { return wrapperContained.ticksUntilJump; }
// public int jumpDuration() { return wrapperContained.jumpDuration; }
// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public int jumpTicks() { return wrapperContained.jumpTicks; }
// public yarnwrap.entity.data.TrackedData RABBIT_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RABBIT_TYPE); }
public boolean canSpawn(yarnwrap.entity.EntityType entity,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entity.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createRabbitAttributes() { return wrapperContained.createRabbitAttributes(); }
// public Object getTypeFromPos(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getTypeFromPos(world.wrapperContained,pos.wrapperContained); }
public float getJumpProgress(float delta) { return wrapperContained.getJumpProgress(delta); }
public void setSpeed(double speed) { wrapperContained.setSpeed(speed); }
// public boolean wantsCarrots() { return wrapperContained.wantsCarrots(); }
// public void doScheduleJump() { wrapperContained.doScheduleJump(); }
// public void enableJump() { wrapperContained.enableJump(); }
// public yarnwrap.sound.SoundEvent getJumpSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getJumpSound()); }
// public void lookTowards(double x,double z) { wrapperContained.lookTowards(x,z); }
public void startJump() { wrapperContained.startJump(); }
// public void scheduleJump() { wrapperContained.scheduleJump(); }
// public void disableJump() { wrapperContained.disableJump(); }

}