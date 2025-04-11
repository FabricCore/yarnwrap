package yarnwrap.item;
public class LeadItem { public net.minecraft.item.LeadItem wrapperContained; public LeadItem(net.minecraft.item.LeadItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_55761(yarnwrap.entity.player.PlayerEntity entity) { return wrapperContained.method_55761(entity.wrapperContained); }
public java.util.List collectLeashablesAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.collectLeashablesAround(world.wrapperContained,pos.wrapperContained,predicate); }
// public boolean method_61167(java.util.function.Predicate entity) { return wrapperContained.method_61167(entity); }
public yarnwrap.util.ActionResult attachHeldMobsToBlock(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.ActionResult(wrapperContained.attachHeldMobsToBlock(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }

}