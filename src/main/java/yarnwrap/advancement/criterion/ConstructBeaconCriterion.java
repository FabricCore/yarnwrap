package yarnwrap.advancement.criterion;
public class ConstructBeaconCriterion { public net.minecraft.advancement.criterion.ConstructBeaconCriterion wrapperContained; public ConstructBeaconCriterion(net.minecraft.advancement.criterion.ConstructBeaconCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,int level) { wrapperContained.trigger(player.wrapperContained,level); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,int level, ) { net.minecraft.advancement.criterion.ConstructBeaconCriterion.trigger(player.wrapperContained,level); }
// public boolean method_22459(int conditions) { return wrapperContained.method_22459(conditions); }
// public static boolean method_22459(int conditions, ) { return net.minecraft.advancement.criterion.ConstructBeaconCriterion.method_22459(conditions); }

}