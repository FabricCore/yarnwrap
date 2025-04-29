package yarnwrap.advancement.criterion;
public class LightningStrikeCriterion { public net.minecraft.advancement.criterion.LightningStrikeCriterion wrapperContained; public LightningStrikeCriterion(net.minecraft.advancement.criterion.LightningStrikeCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.context.LootContext method_37239(yarnwrap.server.network.ServerPlayerEntity bystander) { return new yarnwrap.loot.context.LootContext(wrapperContained.method_37239(bystander.wrapperContained)); }
// public static yarnwrap.loot.context.LootContext method_37239(yarnwrap.server.network.ServerPlayerEntity bystander, ) { return new yarnwrap.loot.context.LootContext(net.minecraft.advancement.criterion.LightningStrikeCriterion.method_37239(bystander.wrapperContained)); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.LightningEntity lightning,java.util.List bystanders) { wrapperContained.trigger(player.wrapperContained,lightning.wrapperContained,bystanders); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.LightningEntity lightning,java.util.List bystanders, ) { net.minecraft.advancement.criterion.LightningStrikeCriterion.trigger(player.wrapperContained,lightning.wrapperContained,bystanders); }
// public boolean method_37242(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_37242(conditions.wrapperContained); }
// public static boolean method_37242(yarnwrap.loot.context.LootContext conditions, ) { return net.minecraft.advancement.criterion.LightningStrikeCriterion.method_37242(conditions.wrapperContained); }

}