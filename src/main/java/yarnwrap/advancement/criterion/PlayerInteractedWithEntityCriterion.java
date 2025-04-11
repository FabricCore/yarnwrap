package yarnwrap.advancement.criterion;
public class PlayerInteractedWithEntityCriterion { public net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion wrapperContained; public PlayerInteractedWithEntityCriterion(net.minecraft.advancement.criterion.PlayerInteractedWithEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.entity.Entity entity) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained,entity.wrapperContained); }

}