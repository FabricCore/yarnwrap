package yarnwrap.item;
public class FireChargeItem { public net.minecraft.item.FireChargeItem wrapperContained; public FireChargeItem(net.minecraft.item.FireChargeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public void playUseSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playUseSound(world.wrapperContained,pos.wrapperContained); }
// public static void playUseSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.item.FireChargeItem.playUseSound(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.math.Position method_58655(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing) { return new yarnwrap.util.math.Position(wrapperContained.method_58655(pointer.wrapperContained,facing.wrapperContained)); }
// public static yarnwrap.util.math.Position method_58655(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction facing, ) { return new yarnwrap.util.math.Position(net.minecraft.item.FireChargeItem.method_58655(pointer.wrapperContained,facing.wrapperContained)); }

}