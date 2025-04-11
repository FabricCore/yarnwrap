package yarnwrap.entity.boss.dragon.phase;
public class StrafePlayerPhase { public net.minecraft.entity.boss.dragon.phase.StrafePlayerPhase wrapperContained; public StrafePlayerPhase(net.minecraft.entity.boss.dragon.phase.StrafePlayerPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MINIMUM_TARGET_SPOT_AMOUNT() { return wrapperContained.MINIMUM_TARGET_SPOT_AMOUNT; }
// public void MINIMUM_TARGET_SPOT_AMOUNT(int value) { wrapperContained.MINIMUM_TARGET_SPOT_AMOUNT = value; }
// public yarnwrap.util.math.Vec3d pathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.pathTarget); }
// public void pathTarget(yarnwrap.util.math.Vec3d value) { wrapperContained.pathTarget = value.wrapperContained; }
// public boolean shouldFindNewPath() { return wrapperContained.shouldFindNewPath; }
// public void shouldFindNewPath(boolean value) { wrapperContained.shouldFindNewPath = value; }
// public yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.path); }
// public void path(yarnwrap.entity.ai.pathing.Path value) { wrapperContained.path = value.wrapperContained; }
// public int seenTargetTimes() { return wrapperContained.seenTargetTimes; }
// public void seenTargetTimes(int value) { wrapperContained.seenTargetTimes = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
// public void updatePath() { wrapperContained.updatePath(); }
// public void followPath() { wrapperContained.followPath(); }
public void setTargetEntity(yarnwrap.entity.LivingEntity targetEntity) { wrapperContained.setTargetEntity(targetEntity.wrapperContained); }

}