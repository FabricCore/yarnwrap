package yarnwrap.advancement.criterion;
public class EffectsChangedCriterion { public net.minecraft.advancement.criterion.EffectsChangedCriterion wrapperContained; public EffectsChangedCriterion(net.minecraft.advancement.criterion.EffectsChangedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity source) { wrapperContained.trigger(player.wrapperContained,source.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity source, ) { net.minecraft.advancement.criterion.EffectsChangedCriterion.trigger(player.wrapperContained,source.wrapperContained); }
// public boolean method_22462(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22462(conditions.wrapperContained); }
// public static boolean method_22462(yarnwrap.server.network.ServerPlayerEntity conditions, ) { return net.minecraft.advancement.criterion.EffectsChangedCriterion.method_22462(conditions.wrapperContained); }

}