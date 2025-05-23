package yarnwrap.advancement.criterion;
public class ShotCrossbowCriterion { public net.minecraft.advancement.criterion.ShotCrossbowCriterion wrapperContained; public ShotCrossbowCriterion(net.minecraft.advancement.criterion.ShotCrossbowCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.ShotCrossbowCriterion.trigger(player.wrapperContained,stack.wrapperContained); }
// public boolean method_22509(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22509(conditions.wrapperContained); }
// public static boolean method_22509(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.ShotCrossbowCriterion.method_22509(conditions.wrapperContained); }

}