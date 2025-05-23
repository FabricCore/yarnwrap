package yarnwrap.entity.decoration;
public class BlockAttachedEntity { public net.minecraft.entity.decoration.BlockAttachedEntity wrapperContained; public BlockAttachedEntity(net.minecraft.entity.decoration.BlockAttachedEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos attachedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.attachedBlockPos); }
// public void attachedBlockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.attachedBlockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos attachedBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.decoration.BlockAttachedEntity.attachedBlockPos); }
// public static void attachedBlockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.decoration.BlockAttachedEntity.attachedBlockPos = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.decoration.BlockAttachedEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.decoration.BlockAttachedEntity.LOGGER = value; }

// public int attachCheckTimer() { return wrapperContained.attachCheckTimer; }
// public void attachCheckTimer(int value) { wrapperContained.attachCheckTimer = value; }
// public static int attachCheckTimer() { return net.minecraft.entity.decoration.BlockAttachedEntity.attachCheckTimer; }
// public static void attachCheckTimer(int value, ) { net.minecraft.entity.decoration.BlockAttachedEntity.attachCheckTimer = value; }

// public BlockAttachedEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.util.math.BlockPos attachedBlockPos) { this.wrapperContained = new net.minecraft.entity.decoration.BlockAttachedEntity(type.wrapperContained,world.wrapperContained,attachedBlockPos.wrapperContained); }
public boolean canStayAttached() { return wrapperContained.canStayAttached(); }
// public static boolean canStayAttached() { return net.minecraft.entity.decoration.BlockAttachedEntity.canStayAttached(); }
public void onBreak(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity breaker) { wrapperContained.onBreak(world.wrapperContained,breaker.wrapperContained); }
// public static void onBreak(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.Entity breaker, ) { net.minecraft.entity.decoration.BlockAttachedEntity.onBreak(world.wrapperContained,breaker.wrapperContained); }
// public void updateAttachmentPosition() { wrapperContained.updateAttachmentPosition(); }
// public static void updateAttachmentPosition() { net.minecraft.entity.decoration.BlockAttachedEntity.updateAttachmentPosition(); }
public yarnwrap.util.math.BlockPos getAttachedBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getAttachedBlockPos()); }
// public static yarnwrap.util.math.BlockPos getAttachedBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.decoration.BlockAttachedEntity.getAttachedBlockPos()); }

}