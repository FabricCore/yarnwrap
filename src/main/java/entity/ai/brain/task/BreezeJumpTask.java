package yarnwrap.entity.ai.brain.task;
public class BreezeJumpTask { public net.minecraft.entity.ai.brain.task.BreezeJumpTask wrapperContained; public BreezeJumpTask(net.minecraft.entity.ai.brain.task.BreezeJumpTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int REQUIRED_SPACE_ABOVE() { return wrapperContained.REQUIRED_SPACE_ABOVE; }
// public int JUMP_COOLDOWN_EXPIRY() { return wrapperContained.JUMP_COOLDOWN_EXPIRY; }
// public int JUMP_COOLDOWN_EXPIRY_WHEN_HURT() { return wrapperContained.JUMP_COOLDOWN_EXPIRY_WHEN_HURT; }
// public int JUMP_INHALING_EXPIRY() { return wrapperContained.JUMP_INHALING_EXPIRY; }
// public float MAX_JUMP_VELOCITY() { return wrapperContained.MAX_JUMP_VELOCITY; }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList POSSIBLE_JUMP_ANGLES() { return wrapperContained.POSSIBLE_JUMP_ANGLES; }
// public yarnwrap.util.math.BlockPos getPosToJumpTo(yarnwrap.entity.LivingEntity breeze,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.util.math.BlockPos(wrapperContained.getPosToJumpTo(breeze.wrapperContained,pos.wrapperContained)); }
// public boolean shouldStopInhalingPose(yarnwrap.entity.mob.BreezeEntity breeze) { return wrapperContained.shouldStopInhalingPose(breeze.wrapperContained); }
// public java.util.Optional getJumpingVelocity(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.util.math.random.Random random,yarnwrap.util.math.Vec3d jumpTarget) { return wrapperContained.getJumpingVelocity(breeze.wrapperContained,random.wrapperContained,jumpTarget.wrapperContained); }
// public boolean isTargetOutOfRange(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetOutOfRange(breeze.wrapperContained,target.wrapperContained); }
// public boolean hasRoomToJump(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.BreezeEntity breeze) { return wrapperContained.hasRoomToJump(world.wrapperContained,breeze.wrapperContained); }
// public boolean shouldStopLongJumpingPose(yarnwrap.entity.mob.BreezeEntity breeze) { return wrapperContained.shouldStopLongJumpingPose(breeze.wrapperContained); }
// public boolean isTargetTooClose(yarnwrap.entity.mob.BreezeEntity breeze,yarnwrap.entity.LivingEntity target) { return wrapperContained.isTargetTooClose(breeze.wrapperContained,target.wrapperContained); }
public boolean shouldJump(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.mob.BreezeEntity breeze) { return wrapperContained.shouldJump(world.wrapperContained,breeze.wrapperContained); }

}