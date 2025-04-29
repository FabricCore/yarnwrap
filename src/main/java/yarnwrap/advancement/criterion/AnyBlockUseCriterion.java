package yarnwrap.advancement.criterion;
public class AnyBlockUseCriterion { public net.minecraft.advancement.criterion.AnyBlockUseCriterion wrapperContained; public AnyBlockUseCriterion(net.minecraft.advancement.criterion.AnyBlockUseCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.trigger(player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack, ) { net.minecraft.advancement.criterion.AnyBlockUseCriterion.trigger(player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public boolean method_56050(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_56050(conditions.wrapperContained); }
// public static boolean method_56050(yarnwrap.loot.context.LootContext conditions, ) { return net.minecraft.advancement.criterion.AnyBlockUseCriterion.method_56050(conditions.wrapperContained); }

}