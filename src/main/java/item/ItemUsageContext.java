package yarnwrap.item;
public class ItemUsageContext { public net.minecraft.item.ItemUsageContext wrapperContained; public ItemUsageContext(net.minecraft.item.ItemUsageContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.hit.BlockHitResult hit() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.hit); }
// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
public yarnwrap.util.math.Vec3d getHitPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.getHitPos()); }
public boolean hitsInsideBlock() { return wrapperContained.hitsInsideBlock(); }
public yarnwrap.util.Hand getHand() { return new yarnwrap.util.Hand(wrapperContained.getHand()); }
// public yarnwrap.util.hit.BlockHitResult getHitResult() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.getHitResult()); }
public yarnwrap.entity.player.PlayerEntity getPlayer() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.getPlayer()); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
public yarnwrap.util.math.Direction getSide() { return new yarnwrap.util.math.Direction(wrapperContained.getSide()); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
public yarnwrap.util.math.Direction getHorizontalPlayerFacing() { return new yarnwrap.util.math.Direction(wrapperContained.getHorizontalPlayerFacing()); }
public float getPlayerYaw() { return wrapperContained.getPlayerYaw(); }
public yarnwrap.world.World getWorld() { return new yarnwrap.world.World(wrapperContained.getWorld()); }
public boolean shouldCancelInteraction() { return wrapperContained.shouldCancelInteraction(); }

}