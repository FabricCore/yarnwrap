package yarnwrap.advancement.criterion;
public class SlideDownBlockCriterion { public net.minecraft.advancement.criterion.SlideDownBlockCriterion wrapperContained; public SlideDownBlockCriterion(net.minecraft.advancement.criterion.SlideDownBlockCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state) { wrapperContained.trigger(player.wrapperContained,state.wrapperContained); }

}