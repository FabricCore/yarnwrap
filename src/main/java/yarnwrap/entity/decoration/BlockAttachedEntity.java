package yarnwrap.entity.decoration;
public class BlockAttachedEntity { public net.minecraft.entity.decoration.BlockAttachedEntity wrapperContained; public BlockAttachedEntity(net.minecraft.entity.decoration.BlockAttachedEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos attachedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.attachedBlockPos); }
// public void attachedBlockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.attachedBlockPos = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int attachCheckTimer() { return wrapperContained.attachCheckTimer; }
// public void attachCheckTimer(int value) { wrapperContained.attachCheckTimer = value; }
public yarnwrap.util.math.BlockPos getAttachedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getAttachedBlockPos()); }
public boolean canStayAttached() { return wrapperContained.canStayAttached(); }
public void onBreak(yarnwrap.entity.Entity breaker) { wrapperContained.onBreak(breaker.wrapperContained); }
// public void updateAttachmentPosition() { wrapperContained.updateAttachmentPosition(); }

}