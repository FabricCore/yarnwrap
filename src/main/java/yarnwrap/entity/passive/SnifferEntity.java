package yarnwrap.entity.passive;
public class SnifferEntity { public net.minecraft.entity.passive.SnifferEntity wrapperContained; public SnifferEntity(net.minecraft.entity.passive.SnifferEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState feelingHappyAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.feelingHappyAnimationState); }
// public void feelingHappyAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.feelingHappyAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState feelingHappyAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.SnifferEntity.feelingHappyAnimationState); }
// public static void feelingHappyAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.SnifferEntity.feelingHappyAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState scentingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scentingAnimationState); }
// public void scentingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.scentingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState scentingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.SnifferEntity.scentingAnimationState); }
// public static void scentingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.SnifferEntity.scentingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
// public void sniffingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sniffingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.SnifferEntity.sniffingAnimationState); }
// public static void sniffingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.SnifferEntity.sniffingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
// public void diggingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.diggingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.SnifferEntity.diggingAnimationState); }
// public static void diggingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.SnifferEntity.diggingAnimationState = value.wrapperContained; }

public yarnwrap.entity.AnimationState risingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.risingAnimationState); }
// public void risingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.risingAnimationState = value.wrapperContained; }
// public static yarnwrap.entity.AnimationState risingAnimationState() { return new yarnwrap.entity.AnimationState(net.minecraft.entity.passive.SnifferEntity.risingAnimationState); }
// public static void risingAnimationState(yarnwrap.entity.AnimationState value, ) { net.minecraft.entity.passive.SnifferEntity.risingAnimationState = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STATE); }
// public void STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.STATE = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SnifferEntity.STATE); }
// public static void STATE(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SnifferEntity.STATE = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData FINISH_DIG_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FINISH_DIG_TIME); }
// public void FINISH_DIG_TIME(yarnwrap.entity.data.TrackedData value) { wrapperContained.FINISH_DIG_TIME = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData FINISH_DIG_TIME() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SnifferEntity.FINISH_DIG_TIME); }
// public static void FINISH_DIG_TIME(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SnifferEntity.FINISH_DIG_TIME = value.wrapperContained; }

// public yarnwrap.entity.EntityDimensions DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.DIMENSIONS); }
// public void DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.SnifferEntity.DIMENSIONS); }
// public static void DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.SnifferEntity.DIMENSIONS = value.wrapperContained; }

// public yarnwrap.entity.passive.SnifferEntity spawnDiggingParticles(yarnwrap.entity.AnimationState diggingAnimationState) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.spawnDiggingParticles(diggingAnimationState.wrapperContained)); }
// public static yarnwrap.entity.passive.SnifferEntity spawnDiggingParticles(yarnwrap.entity.AnimationState diggingAnimationState, ) { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.spawnDiggingParticles(diggingAnimationState.wrapperContained)); }
// public yarnwrap.entity.passive.SnifferEntity startState(Object state) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.startState(state)); }
// public static yarnwrap.entity.passive.SnifferEntity startState(Object state, ) { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.startState(state)); }
// public yarnwrap.entity.passive.SnifferEntity setState(Object state) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.setState(state)); }
// public static yarnwrap.entity.passive.SnifferEntity setState(Object state, ) { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.setState(state)); }
// public java.util.Optional findSniffingTargetPos() { return wrapperContained.findSniffingTargetPos(); }
// public static java.util.Optional findSniffingTargetPos() { return net.minecraft.entity.passive.SnifferEntity.findSniffingTargetPos(); }
// public boolean canDig() { return wrapperContained.canDig(); }
// public static boolean canDig() { return net.minecraft.entity.passive.SnifferEntity.canDig(); }
// public yarnwrap.util.math.Vec3d getDigLocation() { return new yarnwrap.util.math.Vec3d(wrapperContained.getDigLocation()); }
// public static yarnwrap.util.math.Vec3d getDigLocation() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.passive.SnifferEntity.getDigLocation()); }
// public Object getState() { return wrapperContained.getState(); }
// public static Object getState() { return net.minecraft.entity.passive.SnifferEntity.getState(); }
// public void stopAnimations() { wrapperContained.stopAnimations(); }
// public static void stopAnimations() { net.minecraft.entity.passive.SnifferEntity.stopAnimations(); }
// public boolean isDiggable(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isDiggable(pos.wrapperContained); }
// public static boolean isDiggable(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.passive.SnifferEntity.isDiggable(pos.wrapperContained); }
// public yarnwrap.entity.passive.SnifferEntity setDigging() { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.setDigging()); }
// public static yarnwrap.entity.passive.SnifferEntity setDigging() { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.setDigging()); }
// public void dropSeeds() { wrapperContained.dropSeeds(); }
// public static void dropSeeds() { net.minecraft.entity.passive.SnifferEntity.dropSeeds(); }
// public java.util.stream.Stream getExploredPositions() { return wrapperContained.getExploredPositions(); }
// public static java.util.stream.Stream getExploredPositions() { return net.minecraft.entity.passive.SnifferEntity.getExploredPositions(); }
// public void playSearchingSound() { wrapperContained.playSearchingSound(); }
// public static void playSearchingSound() { net.minecraft.entity.passive.SnifferEntity.playSearchingSound(); }
// public yarnwrap.entity.passive.SnifferEntity addExploredPosition(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.addExploredPosition(pos.wrapperContained)); }
// public static yarnwrap.entity.passive.SnifferEntity addExploredPosition(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.addExploredPosition(pos.wrapperContained)); }
// public Object createSnifferAttributes() { return wrapperContained.createSnifferAttributes(); }
public static Object createSnifferAttributes() { return net.minecraft.entity.passive.SnifferEntity.createSnifferAttributes(); }
public yarnwrap.entity.passive.SnifferEntity finishDigging(boolean explored) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.finishDigging(explored)); }
// public static yarnwrap.entity.passive.SnifferEntity finishDigging(boolean explored, ) { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.finishDigging(explored)); }
public boolean isDiggingOrSearching() { return wrapperContained.isDiggingOrSearching(); }
// public static boolean isDiggingOrSearching() { return net.minecraft.entity.passive.SnifferEntity.isDiggingOrSearching(); }
public boolean canTryToDig() { return wrapperContained.canTryToDig(); }
// public static boolean canTryToDig() { return net.minecraft.entity.passive.SnifferEntity.canTryToDig(); }
// public yarnwrap.entity.passive.SnifferEntity playScentingSound() { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.playScentingSound()); }
// public static yarnwrap.entity.passive.SnifferEntity playScentingSound() { return new yarnwrap.entity.passive.SnifferEntity(net.minecraft.entity.passive.SnifferEntity.playScentingSound()); }
// public boolean method_51157(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_51157(pos.wrapperContained); }
// public static boolean method_51157(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.passive.SnifferEntity.method_51157(pos.wrapperContained); }
public boolean isTempted() { return wrapperContained.isTempted(); }
// public static boolean isTempted() { return net.minecraft.entity.passive.SnifferEntity.isTempted(); }
public boolean isSearching() { return wrapperContained.isSearching(); }
// public static boolean isSearching() { return net.minecraft.entity.passive.SnifferEntity.isSearching(); }
// public yarnwrap.util.math.BlockPos getDigPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getDigPos()); }
// public static yarnwrap.util.math.BlockPos getDigPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.passive.SnifferEntity.getDigPos()); }

}