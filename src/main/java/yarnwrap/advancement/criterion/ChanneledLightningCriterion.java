package yarnwrap.advancement.criterion;
public class ChanneledLightningCriterion { public net.minecraft.advancement.criterion.ChanneledLightningCriterion wrapperContained; public ChanneledLightningCriterion(net.minecraft.advancement.criterion.ChanneledLightningCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection victims) { wrapperContained.trigger(player.wrapperContained,victims); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,java.util.Collection victims, ) { net.minecraft.advancement.criterion.ChanneledLightningCriterion.trigger(player.wrapperContained,victims); }
// public boolean method_22458(java.util.List conditions) { return wrapperContained.method_22458(conditions); }
// public static boolean method_22458(java.util.List conditions, ) { return net.minecraft.advancement.criterion.ChanneledLightningCriterion.method_22458(conditions); }
// public yarnwrap.loot.context.LootContext method_27791(yarnwrap.server.network.ServerPlayerEntity entity) { return new yarnwrap.loot.context.LootContext(wrapperContained.method_27791(entity.wrapperContained)); }
// public static yarnwrap.loot.context.LootContext method_27791(yarnwrap.server.network.ServerPlayerEntity entity, ) { return new yarnwrap.loot.context.LootContext(net.minecraft.advancement.criterion.ChanneledLightningCriterion.method_27791(entity.wrapperContained)); }

}