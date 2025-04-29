package yarnwrap.item;
public class BucketItem { public net.minecraft.item.BucketItem wrapperContained; public BucketItem(net.minecraft.item.BucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.fluid.Fluid fluid() { return new yarnwrap.fluid.Fluid(wrapperContained.fluid); }
// public void fluid(yarnwrap.fluid.Fluid value) { wrapperContained.fluid = value.wrapperContained; }
// public static yarnwrap.fluid.Fluid fluid() { return new yarnwrap.fluid.Fluid(net.minecraft.item.BucketItem.fluid); }
// public static void fluid(yarnwrap.fluid.Fluid value, ) { net.minecraft.item.BucketItem.fluid = value.wrapperContained; }

// public BucketItem(yarnwrap.fluid.Fluid fluid,Object settings) { this.wrapperContained = new net.minecraft.item.BucketItem(fluid.wrapperContained,settings); }
// public void method_32342(yarnwrap.entity.player.PlayerEntity sound) { wrapperContained.method_32342(sound.wrapperContained); }
// public static void method_32342(yarnwrap.entity.player.PlayerEntity sound, ) { net.minecraft.item.BucketItem.method_32342(sound.wrapperContained); }
// public void playEmptyingSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playEmptyingSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void playEmptyingSound(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.item.BucketItem.playEmptyingSound(player.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.item.ItemStack getEmptiedStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.item.ItemStack(wrapperContained.getEmptiedStack(stack.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.item.ItemStack getEmptiedStack(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.item.ItemStack(net.minecraft.item.BucketItem.getEmptiedStack(stack.wrapperContained,player.wrapperContained)); }

}