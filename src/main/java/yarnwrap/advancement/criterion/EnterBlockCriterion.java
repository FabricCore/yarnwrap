package yarnwrap.advancement.criterion;
public class EnterBlockCriterion { public net.minecraft.advancement.criterion.EnterBlockCriterion wrapperContained; public EnterBlockCriterion(net.minecraft.advancement.criterion.EnterBlockCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state) { wrapperContained.trigger(player.wrapperContained,state.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.block.BlockState state, ) { net.minecraft.advancement.criterion.EnterBlockCriterion.trigger(player.wrapperContained,state.wrapperContained); }
// public boolean method_22465(yarnwrap.block.BlockState conditions) { return wrapperContained.method_22465(conditions.wrapperContained); }
// public static boolean method_22465(yarnwrap.block.BlockState conditions, ) { return net.minecraft.advancement.criterion.EnterBlockCriterion.method_22465(conditions.wrapperContained); }

}