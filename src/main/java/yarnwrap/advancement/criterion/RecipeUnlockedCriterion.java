package yarnwrap.advancement.criterion;
public class RecipeUnlockedCriterion { public net.minecraft.advancement.criterion.RecipeUnlockedCriterion wrapperContained; public RecipeUnlockedCriterion(net.minecraft.advancement.criterion.RecipeUnlockedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean method_22508(yarnwrap.recipe.RecipeEntry conditions) { return wrapperContained.method_22508(conditions.wrapperContained); }
// public static boolean method_22508(yarnwrap.recipe.RecipeEntry conditions, ) { return net.minecraft.advancement.criterion.RecipeUnlockedCriterion.method_22508(conditions.wrapperContained); }
// public yarnwrap.advancement.AdvancementCriterion create(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.create(id.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementCriterion create(yarnwrap.util.Identifier id, ) { return new yarnwrap.advancement.AdvancementCriterion(net.minecraft.advancement.criterion.RecipeUnlockedCriterion.create(id.wrapperContained)); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.trigger(player.wrapperContained,recipe.wrapperContained); }
// public static void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.advancement.criterion.RecipeUnlockedCriterion.trigger(player.wrapperContained,recipe.wrapperContained); }

}