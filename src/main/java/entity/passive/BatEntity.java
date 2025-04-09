package yarnwrap.entity.passive;
public class BatEntity { public net.minecraft.entity.passive.BatEntity wrapperContained; public BatEntity(net.minecraft.entity.passive.BatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
// public int ROOSTING_FLAG() { return wrapperContained.ROOSTING_FLAG; }
public yarnwrap.entity.AnimationState flyingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.flyingAnimationState); }
public yarnwrap.entity.AnimationState roostingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roostingAnimationState); }
// public yarnwrap.entity.data.TrackedData BAT_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BAT_FLAGS); }
// public yarnwrap.util.math.BlockPos hangingPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.hangingPosition); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createBatAttributes() { return wrapperContained.createBatAttributes(); }
// public void updateAnimations() { wrapperContained.updateAnimations(); }
public void setRoosting(boolean roosting) { wrapperContained.setRoosting(roosting); }
public boolean isRoosting() { return wrapperContained.isRoosting(); }
// public boolean isTodayAroundHalloween() { return wrapperContained.isTodayAroundHalloween(); }

}