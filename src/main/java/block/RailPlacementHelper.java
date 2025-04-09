package yarnwrap.block;
public class RailPlacementHelper { public net.minecraft.block.RailPlacementHelper wrapperContained; public RailPlacementHelper(net.minecraft.block.RailPlacementHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public java.util.List neighbors() { return wrapperContained.neighbors; }
// public boolean forbidCurves() { return wrapperContained.forbidCurves; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public yarnwrap.block.AbstractRailBlock block() { return new yarnwrap.block.AbstractRailBlock(wrapperContained.block); }
// public boolean canConnect(yarnwrap.block.RailPlacementHelper placementHelper) { return wrapperContained.canConnect(placementHelper.wrapperContained); }
// public boolean isVerticallyNearRail(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isVerticallyNearRail(pos.wrapperContained); }
public java.util.List getNeighbors() { return wrapperContained.getNeighbors(); }
// public yarnwrap.block.RailPlacementHelper getNeighboringRail(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.RailPlacementHelper(wrapperContained.getNeighboringRail(pos.wrapperContained)); }
public yarnwrap.block.RailPlacementHelper updateBlockState(boolean powered,boolean forceUpdate,yarnwrap.block.enums.RailShape railShape) { return new yarnwrap.block.RailPlacementHelper(wrapperContained.updateBlockState(powered,forceUpdate,railShape.wrapperContained)); }
// public int getNeighborCount() { return wrapperContained.getNeighborCount(); }
// public void computeRailShape(yarnwrap.block.RailPlacementHelper placementHelper) { wrapperContained.computeRailShape(placementHelper.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public boolean isNeighbor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isNeighbor(pos.wrapperContained); }
// public boolean isNeighbor(yarnwrap.block.RailPlacementHelper other) { return wrapperContained.isNeighbor(other.wrapperContained); }
// public boolean canConnect(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canConnect(pos.wrapperContained); }
// public void computeNeighbors(yarnwrap.block.enums.RailShape shape) { wrapperContained.computeNeighbors(shape.wrapperContained); }
// public void updateNeighborPositions() { wrapperContained.updateNeighborPositions(); }

}