package yarnwrap.advancement.criterion;
public class PlayerGeneratesContainerLootCriterion { public net.minecraft.advancement.criterion.PlayerGeneratesContainerLootCriterion wrapperContained; public PlayerGeneratesContainerLootCriterion(net.minecraft.advancement.criterion.PlayerGeneratesContainerLootCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_27992(yarnwrap.registry.RegistryKey conditions) { return wrapperContained.method_27992(conditions.wrapperContained); }
// public static boolean method_27992(yarnwrap.registry.RegistryKey conditions, ) { return net.minecraft.advancement.criterion.PlayerGeneratesContainerLootCriterion.method_27992(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.registry.RegistryKey lootTable) { wrapperContained.trigger(player.wrapperContained,lootTable.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.registry.RegistryKey lootTable, ) { net.minecraft.advancement.criterion.PlayerGeneratesContainerLootCriterion.trigger(player.wrapperContained,lootTable.wrapperContained); }

}