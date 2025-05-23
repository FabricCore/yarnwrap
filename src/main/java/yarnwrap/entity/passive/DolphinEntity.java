package yarnwrap.entity.passive;
public class DolphinEntity { public net.minecraft.entity.passive.DolphinEntity wrapperContained; public DolphinEntity(net.minecraft.entity.passive.DolphinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate CAN_TAKE() { return wrapperContained.CAN_TAKE; }
// public void CAN_TAKE(java.util.function.Predicate value) { wrapperContained.CAN_TAKE = value; }
public static java.util.function.Predicate CAN_TAKE() { return net.minecraft.entity.passive.DolphinEntity.CAN_TAKE; }
// public static void CAN_TAKE(java.util.function.Predicate value, ) { net.minecraft.entity.passive.DolphinEntity.CAN_TAKE = value; }

// public yarnwrap.entity.data.TrackedData MOISTNESS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MOISTNESS); }
// public void MOISTNESS(yarnwrap.entity.data.TrackedData value) { wrapperContained.MOISTNESS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData MOISTNESS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.DolphinEntity.MOISTNESS); }
// public static void MOISTNESS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.DolphinEntity.MOISTNESS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData HAS_FISH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HAS_FISH); }
// public void HAS_FISH(yarnwrap.entity.data.TrackedData value) { wrapperContained.HAS_FISH = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData HAS_FISH() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.DolphinEntity.HAS_FISH); }
// public static void HAS_FISH(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.DolphinEntity.HAS_FISH = value.wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
// public void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.passive.DolphinEntity.CLOSE_PLAYER_PREDICATE); }
// public static void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.passive.DolphinEntity.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }

// public int MAX_AIR() { return wrapperContained.MAX_AIR; }
// public void MAX_AIR(int value) { wrapperContained.MAX_AIR = value; }
public static int MAX_AIR() { return net.minecraft.entity.passive.DolphinEntity.MAX_AIR; }
// public static void MAX_AIR(int value, ) { net.minecraft.entity.passive.DolphinEntity.MAX_AIR = value; }

// public int MAX_MOISTNESS() { return wrapperContained.MAX_MOISTNESS; }
// public void MAX_MOISTNESS(int value) { wrapperContained.MAX_MOISTNESS = value; }
// public static int MAX_MOISTNESS() { return net.minecraft.entity.passive.DolphinEntity.MAX_MOISTNESS; }
// public static void MAX_MOISTNESS(int value, ) { net.minecraft.entity.passive.DolphinEntity.MAX_MOISTNESS = value; }

// public float BABY_SCALE_FACTOR() { return wrapperContained.BABY_SCALE_FACTOR; }
// public void BABY_SCALE_FACTOR(float value) { wrapperContained.BABY_SCALE_FACTOR = value; }
public static float BABY_SCALE_FACTOR() { return net.minecraft.entity.passive.DolphinEntity.BABY_SCALE_FACTOR; }
// public static void BABY_SCALE_FACTOR(float value, ) { net.minecraft.entity.passive.DolphinEntity.BABY_SCALE_FACTOR = value; }

// public yarnwrap.util.math.BlockPos treasurePos() { return new yarnwrap.util.math.BlockPos(wrapperContained.treasurePos); }
// public void treasurePos(yarnwrap.util.math.BlockPos value) { wrapperContained.treasurePos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos treasurePos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.DolphinEntity.treasurePos); }
// public static void treasurePos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.passive.DolphinEntity.treasurePos = value.wrapperContained; }

// public boolean DEFAULT_HAS_FISH() { return wrapperContained.DEFAULT_HAS_FISH; }
// public void DEFAULT_HAS_FISH(boolean value) { wrapperContained.DEFAULT_HAS_FISH = value; }
// public static boolean DEFAULT_HAS_FISH() { return net.minecraft.entity.passive.DolphinEntity.DEFAULT_HAS_FISH; }
// public static void DEFAULT_HAS_FISH(boolean value, ) { net.minecraft.entity.passive.DolphinEntity.DEFAULT_HAS_FISH = value; }

// public boolean isNearTarget() { return wrapperContained.isNearTarget(); }
// public static boolean isNearTarget() { return net.minecraft.entity.passive.DolphinEntity.isNearTarget(); }
// public boolean method_6485(yarnwrap.entity.ItemEntity item) { return wrapperContained.method_6485(item.wrapperContained); }
// public static boolean method_6485(yarnwrap.entity.ItemEntity item, ) { return net.minecraft.entity.passive.DolphinEntity.method_6485(item.wrapperContained); }
public void setHasFish(boolean hasFish) { wrapperContained.setHasFish(hasFish); }
// public static void setHasFish(boolean hasFish, ) { net.minecraft.entity.passive.DolphinEntity.setHasFish(hasFish); }
public boolean hasFish() { return wrapperContained.hasFish(); }
// public static boolean hasFish() { return net.minecraft.entity.passive.DolphinEntity.hasFish(); }
public void setMoistness(int moistness) { wrapperContained.setMoistness(moistness); }
// public static void setMoistness(int moistness, ) { net.minecraft.entity.passive.DolphinEntity.setMoistness(moistness); }
public int getMoistness() { return wrapperContained.getMoistness(); }
// public static int getMoistness() { return net.minecraft.entity.passive.DolphinEntity.getMoistness(); }
// public void spawnParticlesAround(yarnwrap.particle.ParticleEffect parameters) { wrapperContained.spawnParticlesAround(parameters.wrapperContained); }
// public static void spawnParticlesAround(yarnwrap.particle.ParticleEffect parameters, ) { net.minecraft.entity.passive.DolphinEntity.spawnParticlesAround(parameters.wrapperContained); }
// public Object createDolphinAttributes() { return wrapperContained.createDolphinAttributes(); }
public static Object createDolphinAttributes() { return net.minecraft.entity.passive.DolphinEntity.createDolphinAttributes(); }

}