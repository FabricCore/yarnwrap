package yarnwrap.item;
public class ItemUsageContext { public net.minecraft.item.ItemUsageContext wrapperContained; public ItemUsageContext(net.minecraft.item.ItemUsageContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.hit.BlockHitResult hit() { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.hit); }
// public void hit(yarnwrap.util.hit.BlockHitResult value) { wrapperContained.hit = value.wrapperContained; }
// public yarnwrap.util.Hand hand() { return new yarnwrap.util.Hand(wrapperContained.hand); }
// public void hand(yarnwrap.util.Hand value) { wrapperContained.hand = value.wrapperContained; }
// public yarnwrap.item.ItemStack stack() { return new yarnwrap.item.ItemStack(wrapperContained.stack); }
// public void stack(yarnwrap.item.ItemStack value) { wrapperContained.stack = value.wrapperContained; }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
public ItemUsageContext(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.util.hit.BlockHitResult hit) { this.wrapperContained = new net.minecraft.item.ItemUsageContext(player.wrapperContained,hand.wrapperContained,hit.wrapperContained); }
// public ItemUsageContext(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.item.ItemStack stack,yarnwrap.util.hit.BlockHitResult hit) { this.wrapperContained = new net.minecraft.item.ItemUsageContext(world.wrapperContained,player.wrapperContained,hand.wrapperContained,stack.wrapperContained,hit.wrapperContained); }
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