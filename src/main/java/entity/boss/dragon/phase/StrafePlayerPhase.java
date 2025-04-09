package yarnwrap.entity.boss.dragon.phase;
public class StrafePlayerPhase { public net.minecraft.entity.boss.dragon.phase.StrafePlayerPhase wrapperContained; public StrafePlayerPhase(net.minecraft.entity.boss.dragon.phase.StrafePlayerPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MINIMUM_TARGET_SPOT_AMOUNT() { return wrapperContained.MINIMUM_TARGET_SPOT_AMOUNT; }
// public yarnwrap.util.math.Vec3d pathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.pathTarget); }
// public boolean shouldFindNewPath() { return wrapperContained.shouldFindNewPath; }
// public yarnwrap.entity.ai.pathing.Path path() { return new yarnwrap.entity.ai.pathing.Path(wrapperContained.path); }
// public int seenTargetTimes() { return wrapperContained.seenTargetTimes; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void updatePath() { wrapperContained.updatePath(); }
// public void followPath() { wrapperContained.followPath(); }
public void setTargetEntity(yarnwrap.entity.LivingEntity targetEntity) { wrapperContained.setTargetEntity(targetEntity.wrapperContained); }

}