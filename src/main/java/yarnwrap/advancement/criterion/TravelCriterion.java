package yarnwrap.advancement.criterion;
public class TravelCriterion { public net.minecraft.advancement.criterion.TravelCriterion wrapperContained; public TravelCriterion(net.minecraft.advancement.criterion.TravelCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22486(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22486(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.Vec3d startPos) { wrapperContained.trigger(player.wrapperContained,startPos.wrapperContained); }

}