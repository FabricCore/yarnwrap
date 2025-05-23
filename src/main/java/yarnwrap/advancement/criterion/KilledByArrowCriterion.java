package yarnwrap.advancement.criterion;
public class KilledByArrowCriterion { public net.minecraft.advancement.criterion.KilledByArrowCriterion wrapperContained; public KilledByArrowCriterion(net.minecraft.advancement.criterion.KilledByArrowCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection piercingKilledEntities,yarnwrap.item.ItemStack weapon) { wrapperContained.trigger(player.wrapperContained,piercingKilledEntities,weapon.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection piercingKilledEntities,yarnwrap.item.ItemStack weapon, ) { net.minecraft.advancement.criterion.KilledByArrowCriterion.trigger(player.wrapperContained,piercingKilledEntities,weapon.wrapperContained); }
// public boolean method_22478(java.util.List conditions) { return wrapperContained.method_22478(conditions); }
// public static boolean method_22478(java.util.List conditions, ) { return net.minecraft.advancement.criterion.KilledByArrowCriterion.method_22478(conditions); }

}