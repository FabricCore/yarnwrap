package yarnwrap.item;
public class BucketItem { public net.minecraft.item.BucketItem wrapperContained; public BucketItem(net.minecraft.item.BucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.fluid.Fluid fluid() { return new yarnwrap.fluid.Fluid(wrapperContained.fluid); }
// public void fluid(yarnwrap.fluid.Fluid value) { wrapperContained.fluid = value.wrapperContained; }
// public BucketItem(yarnwrap.fluid.Fluid fluid,Object settings) { this.wrapperContained = new net.minecraft.item.BucketItem(fluid.wrapperContained,settings); }
// public void method_32342(yarnwrap.entity.player.PlayerEntity sound) { wrapperContained.method_32342(sound.wrapperContained); }
// public void playEmptyingSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playEmptyingSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public yarnwrap.item.ItemStack getEmptiedStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.getEmptiedStack(stack.wrapperContained,player.wrapperContained)); }

}