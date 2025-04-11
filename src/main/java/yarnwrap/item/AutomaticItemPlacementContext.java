package yarnwrap.item;
public class AutomaticItemPlacementContext { public net.minecraft.item.AutomaticItemPlacementContext wrapperContained; public AutomaticItemPlacementContext(net.minecraft.item.AutomaticItemPlacementContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction facing() { return new yarnwrap.util.math.Direction(wrapperContained.facing); }
// public void facing(yarnwrap.util.math.Direction value) { wrapperContained.facing = value.wrapperContained; }
public AutomaticItemPlacementContext(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing,yarnwrap.item.ItemStack stack,yarnwrap.util.math.Direction side) { this.wrapperContained = new net.minecraft.item.AutomaticItemPlacementContext(world.wrapperContained,pos.wrapperContained,facing.wrapperContained,stack.wrapperContained,side.wrapperContained); }

}