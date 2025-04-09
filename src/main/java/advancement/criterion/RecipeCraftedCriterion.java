package yarnwrap.advancement.criterion;
public class RecipeCraftedCriterion { public net.minecraft.advancement.criterion.RecipeCraftedCriterion wrapperContained; public RecipeCraftedCriterion(net.minecraft.advancement.criterion.RecipeCraftedCriterion wrapperContained) { this.wrapperContained = wrapperContained; }

public void trigger(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.util.Identifier recipeId,java.util.List ingredients) { wrapperContained.trigger(player.wrapperContained,recipeId.wrapperContained,ingredients); }

}