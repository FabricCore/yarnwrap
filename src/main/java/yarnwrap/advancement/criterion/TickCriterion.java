package yarnwrap.advancement.criterion;
public class TickCriterion { public net.minecraft.advancement.criterion.TickCriterion wrapperContained; public TickCriterion(net.minecraft.advancement.criterion.TickCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_29964(Object conditions) { return wrapperContained.method_29964(conditions); }
// public static boolean method_29964(Object conditions, ) { return net.minecraft.advancement.criterion.TickCriterion.method_29964(conditions); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.trigger(player.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.advancement.criterion.TickCriterion.trigger(player.wrapperContained); }

}