package yarnwrap.block.piston;
public class PistonHandler { public net.minecraft.block.piston.PistonHandler wrapperContained; public PistonHandler(net.minecraft.block.piston.PistonHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction motionDirection() { return new yarnwrap.util.math.Direction(wrapperContained.motionDirection); }
// public void motionDirection(yarnwrap.util.math.Direction value) { wrapperContained.motionDirection = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos posTo() { return new yarnwrap.util.math.BlockPos(wrapperContained.posTo); }
// public void posTo(yarnwrap.util.math.BlockPos value) { wrapperContained.posTo = value.wrapperContained; }
// public java.util.List movedBlocks() { return wrapperContained.movedBlocks; }
// public void movedBlocks(java.util.List value) { wrapperContained.movedBlocks = value; }
// public java.util.List brokenBlocks() { return wrapperContained.brokenBlocks; }
// public void brokenBlocks(java.util.List value) { wrapperContained.brokenBlocks = value; }
// public boolean retracted() { return wrapperContained.retracted; }
// public void retracted(boolean value) { wrapperContained.retracted = value; }
// public yarnwrap.util.math.Direction pistonDirection() { return new yarnwrap.util.math.Direction(wrapperContained.pistonDirection); }
// public void pistonDirection(yarnwrap.util.math.Direction value) { wrapperContained.pistonDirection = value.wrapperContained; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos posFrom() { return new yarnwrap.util.math.BlockPos(wrapperContained.posFrom); }
// public void posFrom(yarnwrap.util.math.BlockPos value) { wrapperContained.posFrom = value.wrapperContained; }
public int MAX_MOVABLE_BLOCKS() { return wrapperContained.MAX_MOVABLE_BLOCKS; }
// public void MAX_MOVABLE_BLOCKS(int value) { wrapperContained.MAX_MOVABLE_BLOCKS = value; }
public PistonHandler(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir,boolean retracted) { this.wrapperContained = new net.minecraft.block.piston.PistonHandler(world.wrapperContained,pos.wrapperContained,dir.wrapperContained,retracted); }
public java.util.List getBrokenBlocks() { return wrapperContained.getBrokenBlocks(); }
public boolean calculatePush() { return wrapperContained.calculatePush(); }
// public boolean tryMoveAdjacentBlock(yarnwrap.util.math.BlockPos pos) { return wrapperContained.tryMoveAdjacentBlock(pos.wrapperContained); }
// public void setMovedBlocks(int from,int to) { wrapperContained.setMovedBlocks(from,to); }
// public boolean tryMove(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction dir) { return wrapperContained.tryMove(pos.wrapperContained,dir.wrapperContained); }
public java.util.List getMovedBlocks() { return wrapperContained.getMovedBlocks(); }
// public boolean isBlockSticky(yarnwrap.block.BlockState state) { return wrapperContained.isBlockSticky(state.wrapperContained); }
// public boolean isAdjacentBlockStuck(yarnwrap.block.BlockState state,yarnwrap.block.BlockState adjacentState) { return wrapperContained.isAdjacentBlockStuck(state.wrapperContained,adjacentState.wrapperContained); }
public yarnwrap.util.math.Direction getMotionDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getMotionDirection()); }

}