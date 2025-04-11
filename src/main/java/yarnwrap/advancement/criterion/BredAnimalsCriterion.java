package yarnwrap.advancement.criterion;
public class BredAnimalsCriterion { public net.minecraft.advancement.criterion.BredAnimalsCriterion wrapperContained; public BredAnimalsCriterion(net.minecraft.advancement.criterion.BredAnimalsCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22455(yarnwrap.loot.context.LootContext conditions) { return wrapperContained.method_22455(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.AnimalEntity parent,yarnwrap.entity.passive.AnimalEntity partner,yarnwrap.entity.passive.PassiveEntity child) { wrapperContained.trigger(player.wrapperContained,parent.wrapperContained,partner.wrapperContained,child.wrapperContained); }

}