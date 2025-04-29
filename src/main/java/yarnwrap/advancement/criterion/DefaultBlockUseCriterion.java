package yarnwrap.advancement.criterion;
public class DefaultBlockUseCriterion { public net.minecraft.advancement.criterion.DefaultBlockUseCriterion wrapperContained; public DefaultBlockUseCriterion(net.minecraft.advancement.criterion.DefaultBlockUseCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos) { wrapperContained.trigger(player.wrapperContained,pos.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.advancement.criterion.DefaultBlockUseCriterion.trigger(player.wrapperContained,pos.wrapperContained); }
// public boolean method_56067(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_56067(conditions.wrapperContained); }
// public static boolean method_56067(yarnwrap.loot.context.LootContext conditions, ) { return net.minecraft.advancement.criterion.DefaultBlockUseCriterion.method_56067(conditions.wrapperContained); }

}