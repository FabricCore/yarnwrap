package yarnwrap.item;
public class FireChargeItem { public net.minecraft.item.FireChargeItem wrapperContained; public FireChargeItem(net.minecraft.item.FireChargeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public void playUseSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playUseSound(world.wrapperContained,pos.wrapperContained); }

}