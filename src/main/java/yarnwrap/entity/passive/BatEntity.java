package yarnwrap.entity.passive;
public class BatEntity { public net.minecraft.entity.passive.BatEntity wrapperContained; public BatEntity(net.minecraft.entity.passive.BatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData BAT_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BAT_FLAGS); }
// public void BAT_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BAT_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData BAT_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.BatEntity.BAT_FLAGS); }
// public static void BAT_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.BatEntity.BAT_FLAGS = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos hangingPosition() { return new yarnwrap.util.math.BlockPos(wrapperContained.hangingPosition); }
// public void hangingPosition(yarnwrap.util.math.BlockPos value) { wrapperContained.hangingPosition = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos hangingPosition() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.BatEntity.hangingPosition); }
// public static void hangingPosition(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.passive.BatEntity.hangingPosition = value.wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.CLOSE_PLAYER_PREDICATE); }
// public void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }
// public static yarnwrap.entity.ai.TargetPredicate CLOSE_PLAYER_PREDICATE() { return new yarnwrap.entity.ai.TargetPredicate(net.minecraft.entity.passive.BatEntity.CLOSE_PLAYER_PREDICATE); }
// public static void CLOSE_PLAYER_PREDICATE(yarnwrap.entity.ai.TargetPredicate value, ) { net.minecraft.entity.passive.BatEntity.CLOSE_PLAYER_PREDICATE = value.wrapperContained; }

// public int ROOSTING_FLAG() { return wrapperContained.ROOSTING_FLAG; }
// public void ROOSTING_FLAG(int value) { wrapperContained.ROOSTING_FLAG = value; }
// public static int ROOSTING_FLAG() { return net.minecraft.entity.passive.BatEntity.ROOSTING_FLAG; }
// public static void ROOSTING_FLAG(int value, ) { net.minecraft.entity.passive.BatEntity.ROOSTING_FLAG = value; }

public yarnwrap.entity.AnimationState flyingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.flyingAnimationState); }
// public void flyingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.flyingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState flyingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.BatEntity.flyingAnimationState); }
// public static void flyingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.BatEntity.flyingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState roostingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.roostingAnimationState); }
// public void roostingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.roostingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState roostingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.BatEntity.roostingAnimationState); }
// public static void roostingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.BatEntity.roostingAnimationState = value.wrapperContained; }

// public byte DEFAULT_BAT_FLAGS() { return wrapperContained.DEFAULT_BAT_FLAGS; }
// public void DEFAULT_BAT_FLAGS(byte value) { wrapperContained.DEFAULT_BAT_FLAGS = value; }
// public static byte DEFAULT_BAT_FLAGS() { return net.minecraft.entity.passive.BatEntity.DEFAULT_BAT_FLAGS; }
// public static void DEFAULT_BAT_FLAGS(byte value, ) { net.minecraft.entity.passive.BatEntity.DEFAULT_BAT_FLAGS = value; }

public void setRoosting(boolean roosting) { wrapperContained.setRoosting(roosting); }
// public static void setRoosting(boolean roosting, ) { net.minecraft.entity.passive.BatEntity.setRoosting(roosting); }
public boolean isRoosting() { return wrapperContained.isRoosting(); }
// public static boolean isRoosting() { return net.minecraft.entity.passive.BatEntity.isRoosting(); }
// public boolean isTodayAroundHalloween() { return wrapperContained.isTodayAroundHalloween(); }
// public static boolean isTodayAroundHalloween() { return net.minecraft.entity.passive.BatEntity.isTodayAroundHalloween(); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.BatEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createBatAttributes() { return wrapperContained.createBatAttributes(); }
public static Object createBatAttributes() { return net.minecraft.entity.passive.BatEntity.createBatAttributes(); }
// public void updateAnimations() { wrapperContained.updateAnimations(); }
// public static void updateAnimations() { net.minecraft.entity.passive.BatEntity.updateAnimations(); }

}