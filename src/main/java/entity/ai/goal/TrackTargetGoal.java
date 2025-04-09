package yarnwrap.entity.ai.goal;
public class TrackTargetGoal { public net.minecraft.entity.ai.goal.TrackTargetGoal wrapperContained; public TrackTargetGoal(net.minecraft.entity.ai.goal.TrackTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UNSET() { return wrapperContained.UNSET; }
// public int CAN_TRACK() { return wrapperContained.CAN_TRACK; }
// public int CANNOT_TRACK() { return wrapperContained.CANNOT_TRACK; }
// public int maxTimeWithoutVisibility() { return wrapperContained.maxTimeWithoutVisibility; }
// public boolean checkVisibility() { return wrapperContained.checkVisibility; }
// public int timeWithoutVisibility() { return wrapperContained.timeWithoutVisibility; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public int checkCanNavigateCooldown() { return wrapperContained.checkCanNavigateCooldown; }
// public int canNavigateFlag() { return wrapperContained.canNavigateFlag; }
// public boolean checkCanNavigate() { return wrapperContained.checkCanNavigate; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public double getFollowRange() { return wrapperContained.getFollowRange(); }
// public boolean canTrack(yarnwrap.entity.LivingEntity target,yarnwrap.entity.ai.TargetPredicate targetPredicate) { return wrapperContained.canTrack(target.wrapperContained,targetPredicate.wrapperContained); }
// public boolean canNavigateToEntity(yarnwrap.entity.LivingEntity entity) { return wrapperContained.canNavigateToEntity(entity.wrapperContained); }
public yarnwrap.entity.ai.goal.TrackTargetGoal setMaxTimeWithoutVisibility(int time) { return new yarnwrap.entity.ai.goal.TrackTargetGoal(wrapperContained.setMaxTimeWithoutVisibility(time)); }

}