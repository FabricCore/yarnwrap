package yarnwrap.entity.ai.goal;
public class TrackTargetGoal { public net.minecraft.entity.ai.goal.TrackTargetGoal wrapperContained; public TrackTargetGoal(net.minecraft.entity.ai.goal.TrackTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int UNSET() { return wrapperContained.UNSET; }
// public void UNSET(int value) { wrapperContained.UNSET = value; }
// public int CAN_TRACK() { return wrapperContained.CAN_TRACK; }
// public void CAN_TRACK(int value) { wrapperContained.CAN_TRACK = value; }
// public int CANNOT_TRACK() { return wrapperContained.CANNOT_TRACK; }
// public void CANNOT_TRACK(int value) { wrapperContained.CANNOT_TRACK = value; }
// public int maxTimeWithoutVisibility() { return wrapperContained.maxTimeWithoutVisibility; }
// public void maxTimeWithoutVisibility(int value) { wrapperContained.maxTimeWithoutVisibility = value; }
// public boolean checkVisibility() { return wrapperContained.checkVisibility; }
// public void checkVisibility(boolean value) { wrapperContained.checkVisibility = value; }
// public int timeWithoutVisibility() { return wrapperContained.timeWithoutVisibility; }
// public void timeWithoutVisibility(int value) { wrapperContained.timeWithoutVisibility = value; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public int checkCanNavigateCooldown() { return wrapperContained.checkCanNavigateCooldown; }
// public void checkCanNavigateCooldown(int value) { wrapperContained.checkCanNavigateCooldown = value; }
// public int canNavigateFlag() { return wrapperContained.canNavigateFlag; }
// public void canNavigateFlag(int value) { wrapperContained.canNavigateFlag = value; }
// public boolean checkCanNavigate() { return wrapperContained.checkCanNavigate; }
// public void checkCanNavigate(boolean value) { wrapperContained.checkCanNavigate = value; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public TrackTargetGoal(yarnwrap.entity.mob.MobEntity mob,boolean checkVisibility) { this.wrapperContained = new net.minecraft.entity.ai.goal.TrackTargetGoal(mob.wrapperContained,checkVisibility); }
// public TrackTargetGoal(yarnwrap.entity.mob.MobEntity mob,boolean checkVisibility,boolean checkNavigable) { this.wrapperContained = new net.minecraft.entity.ai.goal.TrackTargetGoal(mob.wrapperContained,checkVisibility,checkNavigable); }
// public double getFollowRange() { return wrapperContained.getFollowRange(); }
// public boolean canTrack(yarnwrap.entity.LivingEntity target,yarnwrap.entity.ai.TargetPredicate targetPredicate) { return wrapperContained.canTrack(target.wrapperContained,targetPredicate.wrapperContained); }
// public boolean canNavigateToEntity(yarnwrap.entity.LivingEntity entity) { return wrapperContained.canNavigateToEntity(entity.wrapperContained); }
public yarnwrap.entity.ai.goal.TrackTargetGoal setMaxTimeWithoutVisibility(int time) { return new yarnwrap.entity.ai.goal.TrackTargetGoal(wrapperContained.setMaxTimeWithoutVisibility(time)); }

}