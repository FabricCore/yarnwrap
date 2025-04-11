package yarnwrap.advancement.criterion;
public class CuredZombieVillagerCriterion { public net.minecraft.advancement.criterion.CuredZombieVillagerCriterion wrapperContained; public CuredZombieVillagerCriterion(net.minecraft.advancement.criterion.CuredZombieVillagerCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22461(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_22461(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.mob.ZombieEntity zombie,yarnwrap.entity.passive.VillagerEntity villager) { wrapperContained.trigger(player.wrapperContained,zombie.wrapperContained,villager.wrapperContained); }

}