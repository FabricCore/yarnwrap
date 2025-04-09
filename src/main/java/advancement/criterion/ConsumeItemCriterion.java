package yarnwrap.advancement.criterion;
public class ConsumeItemCriterion { public net.minecraft.advancement.criterion.ConsumeItemCriterion wrapperContained; public ConsumeItemCriterion(net.minecraft.advancement.criterion.ConsumeItemCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }

}