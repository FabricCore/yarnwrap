package yarnwrap.advancement.criterion;
public class SummonedEntityCriterion { public net.minecraft.advancement.criterion.SummonedEntityCriterion wrapperContained; public SummonedEntityCriterion(net.minecraft.advancement.criterion.SummonedEntityCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.Entity entity) { wrapperContained.trigger(player.wrapperContained,entity.wrapperContained); }

}