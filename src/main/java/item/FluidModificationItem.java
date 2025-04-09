package yarnwrap.item;
public class FluidModificationItem { public net.minecraft.item.FluidModificationItem wrapperContained; public FluidModificationItem(net.minecraft.item.FluidModificationItem wrapperContained) { this.wrapperContained = wrapperContained; }

public void onEmptied(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.util.math.BlockPos pos) { wrapperContained.onEmptied(player.wrapperContained,world.wrapperContained,stack.wrapperContained,pos.wrapperContained); }
public boolean placeFluid(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.hit.BlockHitResult hitResult) { return wrapperContained.placeFluid(player.wrapperContained,world.wrapperContained,pos.wrapperContained,hitResult.wrapperContained); }

}