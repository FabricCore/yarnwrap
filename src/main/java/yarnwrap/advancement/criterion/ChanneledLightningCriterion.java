package yarnwrap.advancement.criterion;
public class ChanneledLightningCriterion { public net.minecraft.advancement.criterion.ChanneledLightningCriterion wrapperContained; public ChanneledLightningCriterion(net.minecraft.advancement.criterion.ChanneledLightningCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22458(java.util.List conditions) { return wrapperContained.method_22458(conditions); }
// public yarnwrap.loot.context.LootContext method_27791(yarnwrap.server.network.ServerPlayerEntity entity) { return new yarnwrap.loot.context.LootContext(wrapperContained.method_27791(entity.wrapperContained)); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection victims) { wrapperContained.trigger(player.wrapperContained,victims); }

}