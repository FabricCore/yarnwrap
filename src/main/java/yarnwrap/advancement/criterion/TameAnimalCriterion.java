package yarnwrap.advancement.criterion;
public class TameAnimalCriterion { public net.minecraft.advancement.criterion.TameAnimalCriterion wrapperContained; public TameAnimalCriterion(net.minecraft.advancement.criterion.TameAnimalCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.passive.AnimalEntity entity) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained); }

}