package yarnwrap.advancement.criterion;
public class ConstructBeaconCriterion { public net.minecraft.advancement.criterion.ConstructBeaconCriterion wrapperContained; public ConstructBeaconCriterion(net.minecraft.advancement.criterion.ConstructBeaconCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22459(int conditions) { return wrapperContained.method_22459(conditions); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,int level) { wrapperContained.trigger(player.wrapperContained,level); }

}