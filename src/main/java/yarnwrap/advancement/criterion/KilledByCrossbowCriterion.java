package yarnwrap.advancement.criterion;
public class KilledByCrossbowCriterion { public net.minecraft.advancement.criterion.KilledByCrossbowCriterion wrapperContained; public KilledByCrossbowCriterion(net.minecraft.advancement.criterion.KilledByCrossbowCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22478(java.util.List conditions) { return wrapperContained.method_22478(conditions); }
// public static boolean method_22478(java.util.List conditions, ) { return net.minecraft.advancement.criterion.KilledByCrossbowCriterion.method_22478(conditions); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection piercingKilledEntities) { wrapperContained.trigger(player.wrapperContained,piercingKilledEntities); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection piercingKilledEntities, ) { net.minecraft.advancement.criterion.KilledByCrossbowCriterion.trigger(player.wrapperContained,piercingKilledEntities); }

}