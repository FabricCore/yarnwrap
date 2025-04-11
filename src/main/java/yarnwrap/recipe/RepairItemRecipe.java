package yarnwrap.recipe;
public class RepairItemRecipe { public net.minecraft.recipe.RepairItemRecipe wrapperContained; public RepairItemRecipe(net.minecraft.recipe.RepairItemRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.util.Pair findPair(yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.findPair(input.wrapperContained); }
// public boolean canCombineStacks(yarnwrap.item.ItemStack first,yarnwrap.item.ItemStack second) { return wrapperContained.canCombineStacks(first.wrapperContained,second.wrapperContained); }

}