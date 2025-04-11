package yarnwrap.entity.passive;
public class BatEntity { public net.minecraft.entity.passive.BatEntity wrapperContained; public BatEntity(net.minecraft.entity.passive.BatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
// public void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }
// public int ROOSTING_FLAG() { return wrapperContained.ROOSTING_FLAG; }
// public void ROOSTING_FLAG(int value) { wrapperContained.ROOSTING_FLAG = value; }
public yarnwrap.entity.AnimationState flyingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.flyingAnimationState); }
// public void flyingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.flyingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState roostingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roostingAnimationState); }
// public void roostingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.roostingAnimationState = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData BAT_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BAT_FLAGS); }
// public void BAT_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BAT_FLAGS = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos hangingPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.hangingPosition); }
// public void hangingPosition(yarnwrap.util.math.BlockPos value) { wrapperContained.hangingPosition = value.wrapperContained; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createBatAttributes() { return wrapperContained.createBatAttributes(); }
// public void updateAnimations() { wrapperContained.updateAnimations(); }
public void setRoosting(boolean roosting) { wrapperContained.setRoosting(roosting); }
public boolean isRoosting() { return wrapperContained.isRoosting(); }
// public boolean isTodayAroundHalloween() { return wrapperContained.isTodayAroundHalloween(); }

}