package yarnwrap.advancement.criterion;
public class FishingRodHookedCriterion { public net.minecraft.advancement.criterion.FishingRodHookedCriterion wrapperContained; public FishingRodHookedCriterion(net.minecraft.advancement.criterion.FishingRodHookedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack rod,yarnwrap.entity.projectile.FishingBobberEntity bobber,java.util.Collection fishingLoots) { wrapperContained.trigger(player.wrapperContained,rod.wrapperContained,bobber.wrapperContained,fishingLoots); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.item.ItemStack rod,yarnwrap.entity.projectile.FishingBobberEntity bobber,java.util.Collection fishingLoots, ) { net.minecraft.advancement.criterion.FishingRodHookedCriterion.trigger(player.wrapperContained,rod.wrapperContained,bobber.wrapperContained,fishingLoots); }
// public boolean method_22472(yarnwrap.item.ItemStack conditions) { return wrapperContained.method_22472(conditions.wrapperContained); }
// public static boolean method_22472(yarnwrap.item.ItemStack conditions, ) { return net.minecraft.advancement.criterion.FishingRodHookedCriterion.method_22472(conditions.wrapperContained); }

}