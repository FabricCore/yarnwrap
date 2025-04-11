package yarnwrap.advancement.criterion;
public class TickCriterion { public net.minecraft.advancement.criterion.TickCriterion wrapperContained; public TickCriterion(net.minecraft.advancement.criterion.TickCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.trigger(player.wrapperContained); }

}