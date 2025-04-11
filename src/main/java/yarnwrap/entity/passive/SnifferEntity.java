package yarnwrap.entity.passive;
public class SnifferEntity { public net.minecraft.entity.passive.SnifferEntity wrapperContained; public SnifferEntity(net.minecraft.entity.passive.SnifferEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState feelingHappyAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.feelingHappyAnimationState); }
// public void feelingHappyAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.feelingHappyAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState scentingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scentingAnimationState); }
// public void scentingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.scentingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
// public void sniffingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.sniffingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
// public void diggingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.diggingAnimationState = value.wrapperContained; }
public yarnwrap.entity.AnimationState risingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.risingAnimationState); }
// public void risingAnimationState(yarnwrap.entity.AnimationState value) { wrapperContained.risingAnimationState = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STATE); }
// public void STATE(yarnwrap.entity.data.TrackedData value) { wrapperContained.STATE = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData FINISH_DIG_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FINISH_DIG_TIME); }
// public void FINISH_DIG_TIME(yarnwrap.entity.data.TrackedData value) { wrapperContained.FINISH_DIG_TIME = value.wrapperContained; }
// public yarnwrap.entity.EntityDimensions DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.DIMENSIONS); }
// public void DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.passive.SnifferEntity spawnDiggingParticles(yarnwrap.entity.AnimationState diggingAnimationState) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.spawnDiggingParticles(diggingAnimationState.wrapperContained)); }
// public yarnwrap.entity.passive.SnifferEntity startState(Object state) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.startState(state)); }
// public yarnwrap.entity.passive.SnifferEntity setState(Object state) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.setState(state)); }
// public java.util.Optional findSniffingTargetPos() { return wrapperContained.findSniffingTargetPos(); }
// public boolean canDig() { return wrapperContained.canDig(); }
// public yarnwrap.util.math.Vec3d getDigLocation() { return new yarnwrap.util.math.Vec3d(wrapperContained.getDigLocation()); }
// public Object getState() { return wrapperContained.getState(); }
// public void stopAnimations() { wrapperContained.stopAnimations(); }
// public boolean isDiggable(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isDiggable(pos.wrapperContained); }
// public yarnwrap.entity.passive.SnifferEntity setDigging() { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.setDigging()); }
// public void dropSeeds() { wrapperContained.dropSeeds(); }
// public java.util.stream.Stream getExploredPositions() { return wrapperContained.getExploredPositions(); }
// public void playSearchingSound() { wrapperContained.playSearchingSound(); }
// public yarnwrap.entity.passive.SnifferEntity addExploredPosition(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.addExploredPosition(pos.wrapperContained)); }
public Object createSnifferAttributes() { return wrapperContained.createSnifferAttributes(); }
public yarnwrap.entity.passive.SnifferEntity finishDigging(boolean explored) { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.finishDigging(explored)); }
public boolean isDiggingOrSearching() { return wrapperContained.isDiggingOrSearching(); }
public boolean canTryToDig() { return wrapperContained.canTryToDig(); }
// public yarnwrap.entity.passive.SnifferEntity playScentingSound() { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.playScentingSound()); }
// public boolean method_51157(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_51157(pos.wrapperContained); }
public boolean isTempted() { return wrapperContained.isTempted(); }
public boolean isSearching() { return wrapperContained.isSearching(); }
// public yarnwrap.util.math.BlockPos getDigPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getDigPos()); }

}