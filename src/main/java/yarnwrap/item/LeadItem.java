package yarnwrap.item;
public class LeadItem { public net.minecraft.item.LeadItem wrapperContained; public LeadItem(net.minecraft.item.LeadItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.ActionResult attachHeldMobsToBlock(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.ActionResult(wrapperContained.attachHeldMobsToBlock(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.ActionResult attachHeldMobsToBlock(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.LeadItem.attachHeldMobsToBlock(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public boolean method_55761(yarnwrap.entity.player.PlayerEntity entity) { return wrapperContained.method_55761(entity.wrapperContained); }
// public static boolean method_55761(yarnwrap.entity.player.PlayerEntity entity, ) { return net.minecraft.item.LeadItem.method_55761(entity.wrapperContained); }

}