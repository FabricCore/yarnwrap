package yarnwrap.advancement.criterion;
public class SlideDownBlockCriterion { public net.minecraft.advancement.criterion.SlideDownBlockCriterion wrapperContained; public SlideDownBlockCriterion(net.minecraft.advancement.criterion.SlideDownBlockCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_23906(yarnwrap.block.BlockState conditions) { return wrapperContained.method_23906(conditions.wrapperContained); }
// public static boolean method_23906(yarnwrap.block.BlockState conditions, ) { return net.minecraft.advancement.criterion.SlideDownBlockCriterion.method_23906(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state) { wrapperContained.trigger(player.wrapperContained,state.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state, ) { net.minecraft.advancement.criterion.SlideDownBlockCriterion.trigger(player.wrapperContained,state.wrapperContained); }

}