package yarnwrap.entity.boss.dragon.phase;
public class ChargingPlayerPhase { public net.minecraft.entity.boss.dragon.phase.ChargingPlayerPhase wrapperContained; public ChargingPlayerPhase(net.minecraft.entity.boss.dragon.phase.ChargingPlayerPhase wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DURATION() { return wrapperContained.DURATION; }
// public int chargingTicks() { return wrapperContained.chargingTicks; }
// public yarnwrap.util.math.Vec3d pathTarget() { return new yarnwrap.util.math.Vec3d(wrapperContained.pathTarget); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public void setPathTarget(yarnwrap.util.math.Vec3d pathTarget) { wrapperContained.setPathTarget(pathTarget.wrapperContained); }

}