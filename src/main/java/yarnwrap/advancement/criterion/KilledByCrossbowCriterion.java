package yarnwrap.advancement.criterion;
public class KilledByCrossbowCriterion { public net.minecraft.advancement.criterion.KilledByCrossbowCriterion wrapperContained; public KilledByCrossbowCriterion(net.minecraft.advancement.criterion.KilledByCrossbowCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection piercingKilledEntities) { wrapperContained.trigger(player.wrapperContained,piercingKilledEntities); }

}