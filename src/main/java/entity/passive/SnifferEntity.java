package yarnwrap.entity.passive;
public class SnifferEntity { public net.minecraft.entity.passive.SnifferEntity wrapperContained; public SnifferEntity(net.minecraft.entity.passive.SnifferEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.AnimationState feelingHappyAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.feelingHappyAnimationState); }
public yarnwrap.entity.AnimationState scentingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.scentingAnimationState); }
public yarnwrap.entity.AnimationState sniffingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.sniffingAnimationState); }
public yarnwrap.entity.AnimationState diggingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.diggingAnimationState); }
public yarnwrap.entity.AnimationState risingAnimationState() { return new yarnwrap.entity.AnimationState(wrapperContained.risingAnimationState); }
// public yarnwrap.entity.data.TrackedData STATE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STATE); }
// public yarnwrap.entity.data.TrackedData FINISH_DIG_TIME() { return new yarnwrap.entity.data.TrackedData(wrapperContained.FINISH_DIG_TIME); }
// public yarnwrap.entity.EntityDimensions DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.DIMENSIONS); }
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
public boolean isTempted() { return wrapperContained.isTempted(); }
public boolean isSearching() { return wrapperContained.isSearching(); }
// public yarnwrap.util.math.BlockPos getDigPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getDigPos()); }

}