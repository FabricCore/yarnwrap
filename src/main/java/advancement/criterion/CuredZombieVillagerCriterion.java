package yarnwrap.advancement.criterion;
public class CuredZombieVillagerCriterion { public net.minecraft.advancement.criterion.CuredZombieVillagerCriterion wrapperContained; public CuredZombieVillagerCriterion(net.minecraft.advancement.criterion.CuredZombieVillagerCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.mob.ZombieEntity zombie,yarnwrap.entity.passive.VillagerEntity villager) { wrapperContained.trigger(player.wrapperContained,zombie.wrapperContained,villager.wrapperContained); }

}