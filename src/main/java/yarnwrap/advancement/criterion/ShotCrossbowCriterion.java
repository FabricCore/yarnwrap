package yarnwrap.advancement.criterion;
public class ShotCrossbowCriterion { public net.minecraft.advancement.criterion.ShotCrossbowCriterion wrapperContained; public ShotCrossbowCriterion(net.minecraft.advancement.criterion.ShotCrossbowCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }

}