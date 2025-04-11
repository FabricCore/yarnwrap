package yarnwrap.entity.boss.dragon.phase;
public class ChargingPlayerPhase { public net.minecraft.entity.boss.dragon.phase.ChargingPlayerPhase wrapperContained; public ChargingPlayerPhase(net.minecraft.entity.boss.dragon.phase.ChargingPlayerPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DURATION() { return wrapperContained.DURATION; }
// public void DURATION(int value) { wrapperContained.DURATION = value; }
// public int chargingTicks() { return wrapperContained.chargingTicks; }
// public void chargingTicks(int value) { wrapperContained.chargingTicks = value; }
// public yarnwrap.util.math.Vec3d pathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.pathTarget); }
// public void pathTarget(yarnwrap.util.math.Vec3d value) { wrapperContained.pathTarget = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void setPathTarget(yarnwrap.util.math.Vec3d pathTarget) { wrapperContained.setPathTarget(pathTarget.wrapperContained); }

}