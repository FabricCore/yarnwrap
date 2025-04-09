package yarnwrap.advancement.criterion;
public class FilledBucketCriterion { public net.minecraft.advancement.criterion.FilledBucketCriterion wrapperContained; public FilledBucketCriterion(net.minecraft.advancement.criterion.FilledBucketCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,stack.wrapperContained); }

}