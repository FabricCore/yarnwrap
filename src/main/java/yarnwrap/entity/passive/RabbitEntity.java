package yarnwrap.entity.passive;
public class RabbitEntity { public net.minecraft.entity.passive.RabbitEntity wrapperContained; public RabbitEntity(net.minecraft.entity.passive.RabbitEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public double ESCAPE_DANGER_SPEED() { return wrapperContained.ESCAPE_DANGER_SPEED; }
// public void ESCAPE_DANGER_SPEED(double value) { wrapperContained.ESCAPE_DANGER_SPEED = value; }
public double MELEE_ATTACK_SPEED() { return wrapperContained.MELEE_ATTACK_SPEED; }
// public void MELEE_ATTACK_SPEED(double value) { wrapperContained.MELEE_ATTACK_SPEED = value; }
// public yarnwrap.util.Identifier KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID); }
// public void KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.KILLER_BUNNY_ATTACK_DAMAGE_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.util.Identifier KILLER_BUNNY() { return new yarnwrap.util.Identifier(wrapperContained.KILLER_BUNNY); }
// public void KILLER_BUNNY(yarnwrap.util.Identifier value) { wrapperContained.KILLER_BUNNY = value.wrapperContained; }
// public int moreCarrotTicks() { return wrapperContained.moreCarrotTicks; }
// public void moreCarrotTicks(int value) { wrapperContained.moreCarrotTicks = value; }
// public int ticksUntilJump() { return wrapperContained.ticksUntilJump; }
// public void ticksUntilJump(int value) { wrapperContained.ticksUntilJump = value; }
// public int jumpDuration() { return wrapperContained.jumpDuration; }
// public void jumpDuration(int value) { wrapperContained.jumpDuration = value; }
// public boolean lastOnGround() { return wrapperContained.lastOnGround; }
// public void lastOnGround(boolean value) { wrapperContained.lastOnGround = value; }
// public int jumpTicks() { return wrapperContained.jumpTicks; }
// public void jumpTicks(int value) { wrapperContained.jumpTicks = value; }
// public yarnwrap.entity.data.TrackedData RABBIT_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RABBIT_TYPE); }
// public void RABBIT_TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.RABBIT_TYPE = value.wrapperContained; }
public boolean canSpawn(yarnwrap.entity.EntityType entity,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(entity.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createRabbitAttributes() { return wrapperContained.createRabbitAttributes(); }
// public Object getTypeFromPos(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getTypeFromPos(world.wrapperContained,pos.wrapperContained); }
// public boolean method_58374(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58374(stack.wrapperContained); }
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