package yarnwrap.entity.passive;
public class DolphinEntity { public net.minecraft.entity.passive.DolphinEntity wrapperContained; public DolphinEntity(net.minecraft.entity.passive.DolphinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
// public void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }
public int MAX_AIR() { return wrapperContained.MAX_AIR; }
// public void MAX_AIR(int value) { wrapperContained.MAX_AIR = value; }
// public int MAX_MOISTNESS() { return wrapperContained.MAX_MOISTNESS; }
// public void MAX_MOISTNESS(int value) { wrapperContained.MAX_MOISTNESS = value; }
// public yarnwrap.entity.data.TrackedData TREASURE_POS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TREASURE_POS); }
// public void TREASURE_POS(yarnwrap.entity.data.TrackedData value) { wrapperContained.TREASURE_POS = value.wrapperContained; }
public java.util.function.Predicate CAN_TAKE() { return wrapperContained.CAN_TAKE; }
// public void CAN_TAKE(java.util.function.Predicate value) { wrapperContained.CAN_TAKE = value; }
// public yarnwrap.entity.data.TrackedData MOISTNESS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MOISTNESS); }
// public void MOISTNESS(yarnwrap.entity.data.TrackedData value) { wrapperContained.MOISTNESS = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData HAS_FISH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HAS_FISH); }
// public void HAS_FISH(yarnwrap.entity.data.TrackedData value) { wrapperContained.HAS_FISH = value.wrapperContained; }
public Object createDolphinAttributes() { return wrapperContained.createDolphinAttributes(); }
// public boolean isNearTarget() { return wrapperContained.isNearTarget(); }
// public boolean method_6485(yarnwrap.entity.ItemEntity item) { return wrapperContained.method_6485(item.wrapperContained); }
public void setHasFish(boolean hasFish) { wrapperContained.setHasFish(hasFish); }
public boolean hasFish() { return wrapperContained.hasFish(); }
public void setMoistness(int moistness) { wrapperContained.setMoistness(moistness); }
public int getMoistness() { return wrapperContained.getMoistness(); }
// public void spawnParticlesAround(yarnwrap.particle.ParticleEffect parameters) { wrapperContained.spawnParticlesAround(parameters.wrapperContained); }
public void setTreasurePos(yarnwrap.util.math.BlockPos treasurePos) { wrapperContained.setTreasurePos(treasurePos.wrapperContained); }
public yarnwrap.util.math.BlockPos getTreasurePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getTreasurePos()); }

}