package yarnwrap.entity.passive;
public class DolphinEntity { public net.minecraft.entity.passive.DolphinEntity wrapperContained; public DolphinEntity(net.minecraft.entity.passive.DolphinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
public int MAX_AIR() { return wrapperContained.MAX_AIR; }
// public int MAX_MOISTNESS() { return wrapperContained.MAX_MOISTNESS; }
// public yarnwrap.entity.data.TrackedData TREASURE_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TREASURE_POS); }
public java.util.function.Predicate CAN_TAKE() { return wrapperContained.CAN_TAKE; }
// public yarnwrap.entity.data.TrackedData MOISTNESS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MOISTNESS); }
// public yarnwrap.entity.data.TrackedData HAS_FISH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HAS_FISH); }
public Object createDolphinAttributes() { return wrapperContained.createDolphinAttributes(); }
// public boolean isNearTarget() { return wrapperContained.isNearTarget(); }
public void setHasFish(boolean hasFish) { wrapperContained.setHasFish(hasFish); }
public boolean hasFish() { return wrapperContained.hasFish(); }
public void setMoistness(int moistness) { wrapperContained.setMoistness(moistness); }
public int getMoistness() { return wrapperContained.getMoistness(); }
// public void spawnParticlesAround(yarnwrap.particle.ParticleEffect parameters) { wrapperContained.spawnParticlesAround(parameters.wrapperContained); }
public void setTreasurePos(yarnwrap.util.math.BlockPos treasurePos) { wrapperContained.setTreasurePos(treasurePos.wrapperContained); }
public yarnwrap.util.math.BlockPos getTreasurePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTreasurePos()); }

}