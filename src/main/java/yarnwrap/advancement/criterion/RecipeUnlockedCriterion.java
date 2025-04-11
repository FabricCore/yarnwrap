package yarnwrap.advancement.criterion;
public class RecipeUnlockedCriterion { public net.minecraft.advancement.criterion.RecipeUnlockedCriterion wrapperContained; public RecipeUnlockedCriterion(net.minecraft.advancement.criterion.RecipeUnlockedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.advancement.AdvancementCriterion create(yarnwrap.util.Identifier id) { return new yarnwrap.advancement.AdvancementCriterion(wrapperContained.create(id.wrapperContained)); }
public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.trigger(player.wrapperContained,recipe.wrapperContained); }

}