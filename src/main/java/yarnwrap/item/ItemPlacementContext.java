package yarnwrap.item;
public class ItemPlacementContext { public net.minecraft.item.ItemPlacementContext wrapperContained; public ItemPlacementContext(net.minecraft.item.ItemPlacementContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos placementPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.placementPos); }
// public void placementPos(yarnwrap.util.math.BlockPos value) { wrapperContained.placementPos = value.wrapperContained; }
// public boolean canReplaceExisting() { return wrapperContained.canReplaceExisting; }
// public void canReplaceExisting(boolean value) { wrapperContained.canReplaceExisting = value; }
public yarnwrap.item.ItemPlacementContext offset(yarnwrap.item.ItemPlacementContext context,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return new yarnwrap.item.ItemPlacementContext(wrapperContained.offset(context.wrapperContained,pos.wrapperContained,side.wrapperContained)); }
public yarnwrap.util.math.Direction getVerticalPlayerLookDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getVerticalPlayerLookDirection()); }
public yarnwrap.util.math.Direction getPlayerLookDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getPlayerLookDirection()); }
public boolean canPlace() { return wrapperContained.canPlace(); }
// public boolean canReplaceExisting() { return wrapperContained.canReplaceExisting(); }
public net.minecraft.util.math.Direction[] getPlacementDirections() { return wrapperContained.getPlacementDirections(); }

}