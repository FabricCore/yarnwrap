package yarnwrap.advancement.criterion;
public class FilledBucketCriterion { public net.minecraft.advancement.criterion.FilledBucketCriterion wrapperContained; public FilledBucketCriterion(net.minecraft.advancement.criterion.FilledBucketCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.FilledBucketCriterion.trigger(player.wrapperContained,stack.wrapperContained); }
// public boolean method_22471(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22471(conditions.wrapperContained); }
// public static boolean method_22471(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.FilledBucketCriterion.method_22471(conditions.wrapperContained); }

}