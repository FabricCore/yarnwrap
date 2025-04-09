package yarnwrap.advancement.criterion;
public class EnterBlockCriterion { public net.minecraft.advancement.criterion.EnterBlockCriterion wrapperContained; public EnterBlockCriterion(net.minecraft.advancement.criterion.EnterBlockCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state) { wrapperContained.trigger(player.wrapperContained,state.wrapperContained); }

}