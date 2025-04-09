package yarnwrap.advancement.criterion;
public class ThrownItemPickedUpByEntityCriterion { public net.minecraft.advancement.criterion.ThrownItemPickedUpByEntityCriterion wrapperContained; public ThrownItemPickedUpByEntityCriterion(net.minecraft.advancement.criterion.ThrownItemPickedUpByEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.entity.Entity entity) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,entity.wrapperContained); }

}