package yarnwrap.advancement.criterion;
public class RecipeCraftedCriterion { public net.minecraft.advancement.criterion.RecipeCraftedCriterion wrapperContained; public RecipeCraftedCriterion(net.minecraft.advancement.criterion.RecipeCraftedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_51349(yarnwrap.util.Identifier conditions) { return wrapperContained.method_51349(conditions.wrapperContained); }
// public static boolean method_51349(yarnwrap.util.Identifier conditions, ) { return net.minecraft.advancement.criterion.RecipeCraftedCriterion.method_51349(conditions.wrapperContained); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.Identifier recipeId,java.util.List ingredients) { wrapperContained.trigger(player.wrapperContained,recipeId.wrapperContained,ingredients); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.Identifier recipeId,java.util.List ingredients, ) { net.minecraft.advancement.criterion.RecipeCraftedCriterion.trigger(player.wrapperContained,recipeId.wrapperContained,ingredients); }

}