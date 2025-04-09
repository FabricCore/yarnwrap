package yarnwrap.item;
public class BucketItem { public net.minecraft.item.BucketItem wrapperContained; public BucketItem(net.minecraft.item.BucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.fluid.Fluid fluid() { return new yarnwrap.fluid.Fluid(wrapperContained.fluid); }
// public void playEmptyingSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playEmptyingSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public yarnwrap.item.ItemStack getEmptiedStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.getEmptiedStack(stack.wrapperContained,player.wrapperContained)); }

}