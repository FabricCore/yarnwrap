package yarnwrap.advancement.criterion;
public class StartedRidingCriterion { public net.minecraft.advancement.criterion.StartedRidingCriterion wrapperContained; public StartedRidingCriterion(net.minecraft.advancement.criterion.StartedRidingCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.trigger(player.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.advancement.criterion.StartedRidingCriterion.trigger(player.wrapperContained); }
// public boolean method_37259(Object conditions) { return wrapperContained.method_37259(conditions); }
// public static boolean method_37259(Object conditions, ) { return net.minecraft.advancement.criterion.StartedRidingCriterion.method_37259(conditions); }

}