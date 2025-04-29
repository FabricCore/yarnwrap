package yarnwrap.block;
public class RailPlacementHelper { public net.minecraft.block.RailPlacementHelper wrapperContained; public RailPlacementHelper(net.minecraft.block.RailPlacementHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(net.minecraft.block.RailPlacementHelper.state); }
// public static void state(yarnwrap.block.BlockState value, ) { net.minecraft.block.RailPlacementHelper.state = value.wrapperContained; }

// public java.util.List neighbors() { return wrapperContained.neighbors; }
// public void neighbors(java.util.List value) { wrapperContained.neighbors = value; }
// public static java.util.List neighbors() { return net.minecraft.block.RailPlacementHelper.neighbors; }
// public static void neighbors(java.util.List value, ) { net.minecraft.block.RailPlacementHelper.neighbors = value; }

// public boolean forbidCurves() { return wrapperContained.forbidCurves; }
// public void forbidCurves(boolean value) { wrapperContained.forbidCurves = value; }
// public static boolean forbidCurves() { return net.minecraft.block.RailPlacementHelper.forbidCurves; }
// public static void forbidCurves(boolean value, ) { net.minecraft.block.RailPlacementHelper.forbidCurves = value; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.block.RailPlacementHelper.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.block.RailPlacementHelper.world = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.block.RailPlacementHelper.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.block.RailPlacementHelper.pos = value.wrapperContained; }

// public yarnwrap.block.AbstractRailBlock block() { return new yarnwrap.block.AbstractRailBlock(wrapperContained.block); }
// public void block(yarnwrap.block.AbstractRailBlock value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.AbstractRailBlock block() { return new yarnwrap.block.AbstractRailBlock(net.minecraft.block.RailPlacementHelper.block); }
// public static void block(yarnwrap.block.AbstractRailBlock value, ) { net.minecraft.block.RailPlacementHelper.block = value.wrapperContained; }

public RailPlacementHelper(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.RailPlacementHelper(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean canConnect(yarnwrap.block.RailPlacementHelper placementHelper) { return wrapperContained.canConnect(placementHelper.wrapperContained); }
// public static boolean canConnect(yarnwrap.block.RailPlacementHelper placementHelper, ) { return net.minecraft.block.RailPlacementHelper.canConnect(placementHelper.wrapperContained); }
// public boolean isVerticallyNearRail(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isVerticallyNearRail(pos.wrapperContained); }
// public static boolean isVerticallyNearRail(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.RailPlacementHelper.isVerticallyNearRail(pos.wrapperContained); }
public java.util.List getNeighbors() { return wrapperContained.getNeighbors(); }
// public static java.util.List getNeighbors() { return net.minecraft.block.RailPlacementHelper.getNeighbors(); }
// public yarnwrap.block.RailPlacementHelper getNeighboringRail(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.RailPlacementHelper(wrapperContained.getNeighboringRail(pos.wrapperContained)); }
// public static yarnwrap.block.RailPlacementHelper getNeighboringRail(yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.RailPlacementHelper(net.minecraft.block.RailPlacementHelper.getNeighboringRail(pos.wrapperContained)); }
public yarnwrap.block.RailPlacementHelper updateBlockState(boolean powered,boolean forceUpdate,yarnwrap.block.enums.RailShape railShape) { return new yarnwrap.block.RailPlacementHelper(wrapperContained.updateBlockState(powered,forceUpdate,railShape.wrapperContained)); }
// public static yarnwrap.block.RailPlacementHelper updateBlockState(boolean powered,boolean forceUpdate,yarnwrap.block.enums.RailShape railShape, ) { return new yarnwrap.block.RailPlacementHelper(net.minecraft.block.RailPlacementHelper.updateBlockState(powered,forceUpdate,railShape.wrapperContained)); }
// public int getNeighborCount() { return wrapperContained.getNeighborCount(); }
// public static int getNeighborCount() { return net.minecraft.block.RailPlacementHelper.getNeighborCount(); }
// public void computeRailShape(yarnwrap.block.RailPlacementHelper placementHelper) { wrapperContained.computeRailShape(placementHelper.wrapperContained); }
// public static void computeRailShape(yarnwrap.block.RailPlacementHelper placementHelper, ) { net.minecraft.block.RailPlacementHelper.computeRailShape(placementHelper.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.block.RailPlacementHelper.getBlockState()); }
// public boolean isNeighbor(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isNeighbor(pos.wrapperContained); }
// public static boolean isNeighbor(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.RailPlacementHelper.isNeighbor(pos.wrapperContained); }
// public boolean isNeighbor(yarnwrap.block.RailPlacementHelper other) { return wrapperContained.isNeighbor(other.wrapperContained); }
// public static boolean isNeighbor(yarnwrap.block.RailPlacementHelper other, ) { return net.minecraft.block.RailPlacementHelper.isNeighbor(other.wrapperContained); }
// public boolean canConnect(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canConnect(pos.wrapperContained); }
// public static boolean canConnect(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.RailPlacementHelper.canConnect(pos.wrapperContained); }
// public void computeNeighbors(yarnwrap.block.enums.RailShape shape) { wrapperContained.computeNeighbors(shape.wrapperContained); }
// public static void computeNeighbors(yarnwrap.block.enums.RailShape shape, ) { net.minecraft.block.RailPlacementHelper.computeNeighbors(shape.wrapperContained); }
// public void updateNeighborPositions() { wrapperContained.updateNeighborPositions(); }
// public static void updateNeighborPositions() { net.minecraft.block.RailPlacementHelper.updateNeighborPositions(); }

}