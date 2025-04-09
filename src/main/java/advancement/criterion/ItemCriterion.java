package yarnwrap.advancement.criterion;
public class ItemCriterion { public net.minecraft.advancement.criterion.ItemCriterion wrapperContained; public ItemCriterion(net.minecraft.advancement.criterion.ItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }

}