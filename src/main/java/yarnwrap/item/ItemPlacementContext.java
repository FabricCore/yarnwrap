package yarnwrap.item;
public class ItemPlacementContext { public net.minecraft.item.ItemPlacementContext wrapperContained; public ItemPlacementContext(net.minecraft.item.ItemPlacementContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos placementPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.placementPos); }
// public void placementPos(yarnwrap.util.math.BlockPos value) { wrapperContained.placementPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos placementPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.item.ItemPlacementContext.placementPos); }
// public static void placementPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.item.ItemPlacementContext.placementPos = value.wrapperContained; }

// public boolean canReplaceExisting() { return wrapperContained.canReplaceExisting; }
// public void canReplaceExisting(boolean value) { wrapperContained.canReplaceExisting = value; }
// public static boolean canReplaceExisting() { return net.minecraft.item.ItemPlacementContext.canReplaceExisting; }
// public static void canReplaceExisting(boolean value, ) { net.minecraft.item.ItemPlacementContext.canReplaceExisting = value; }

public ItemPlacementContext(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,yarnwrap.util.hit.BlockHitResult hitResult) { this.wrapperContained = new net.minecraft.item.ItemPlacementContext(player.wrapperContained,hand.wrapperContained,stack.wrapperContained,hitResult.wrapperContained); }
public ItemPlacementContext(yarnwrap.item.ItemUsageContext context) { this.wrapperContained = new net.minecraft.item.ItemPlacementContext(context.wrapperContained); }
// public yarnwrap.item.ItemPlacementContext offset(yarnwrap.item.ItemPlacementContext context,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return new yarnwrap.item.ItemPlacementContext(wrapperContained.offset(context.wrapperContained,pos.wrapperContained,side.wrapperContained)); }
// public static yarnwrap.item.ItemPlacementContext offset(yarnwrap.item.ItemPlacementContext context,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side, ) { return new yarnwrap.item.ItemPlacementContext(net.minecraft.item.ItemPlacementContext.offset(context.wrapperContained,pos.wrapperContained,side.wrapperContained)); }
public yarnwrap.util.math.Direction getVerticalPlayerLookDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getVerticalPlayerLookDirection()); }
// public static yarnwrap.util.math.Direction getVerticalPlayerLookDirection() { return new yarnwrap.util.math.Direction(net.minecraft.item.ItemPlacementContext.getVerticalPlayerLookDirection()); }
public yarnwrap.util.math.Direction getPlayerLookDirection() { return new yarnwrap.util.math.Direction(wrapperContained.getPlayerLookDirection()); }
// public static yarnwrap.util.math.Direction getPlayerLookDirection() { return new yarnwrap.util.math.Direction(net.minecraft.item.ItemPlacementContext.getPlayerLookDirection()); }
public boolean canPlace() { return wrapperContained.canPlace(); }
// public static boolean canPlace() { return net.minecraft.item.ItemPlacementContext.canPlace(); }
// public boolean canReplaceExisting() { return wrapperContained.canReplaceExisting(); }
// // public static boolean canReplaceExisting() { return net.minecraft.item.ItemPlacementContext.canReplaceExisting(); }
public net.minecraft.util.math.Direction[] getPlacementDirections() { return wrapperContained.getPlacementDirections(); }
// public static net.minecraft.util.math.Direction[] getPlacementDirections() { return net.minecraft.item.ItemPlacementContext.getPlacementDirections(); }

}