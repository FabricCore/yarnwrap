package yarnwrap.advancement.criterion;
public class LevitationCriterion { public net.minecraft.advancement.criterion.LevitationCriterion wrapperContained; public LevitationCriterion(net.minecraft.advancement.criterion.LevitationCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22480(yarnwrap.server.network.ServerPlayerEntity conditions) { return wrapperContained.method_22480(conditions.wrapperContained); }
// public static boolean method_22480(yarnwrap.server.network.ServerPlayerEntity conditions, ) { return net.minecraft.advancement.criterion.LevitationCriterion.method_22480(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.Vec3d startPos,int duration) { wrapperContained.trigger(player.wrapperContained,startPos.wrapperContained,duration); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.math.Vec3d startPos,int duration, ) { net.minecraft.advancement.criterion.LevitationCriterion.trigger(player.wrapperContained,startPos.wrapperContained,duration); }

}