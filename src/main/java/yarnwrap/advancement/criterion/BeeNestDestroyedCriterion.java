package yarnwrap.advancement.criterion;
public class BeeNestDestroyedCriterion { public net.minecraft.advancement.criterion.BeeNestDestroyedCriterion wrapperContained; public BeeNestDestroyedCriterion(net.minecraft.advancement.criterion.BeeNestDestroyedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state,yarnwrap.item.ItemStack stack,int beeCount) { wrapperContained.trigger(player.wrapperContained,state.wrapperContained,stack.wrapperContained,beeCount); }

}