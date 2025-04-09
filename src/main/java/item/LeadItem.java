package yarnwrap.item;
public class LeadItem { public net.minecraft.item.LeadItem wrapperContained; public LeadItem(net.minecraft.item.LeadItem wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List collectLeashablesAround(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.collectLeashablesAround(world.wrapperContained,pos.wrapperContained,predicate); }
public yarnwrap.util.ActionResult attachHeldMobsToBlock(yarnwrap.entity.player.PlayerEntity player,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.ActionResult(wrapperContained.attachHeldMobsToBlock(player.wrapperContained,world.wrapperContained,pos.wrapperContained)); }

}