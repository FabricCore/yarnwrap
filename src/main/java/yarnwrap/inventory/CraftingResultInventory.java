package yarnwrap.inventory;
public class CraftingResultInventory { public net.minecraft.inventory.CraftingResultInventory wrapperContained; public CraftingResultInventory(net.minecraft.inventory.CraftingResultInventory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeEntry lastRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.lastRecipe); }
// public void lastRecipe(yarnwrap.recipe.RecipeEntry value) { wrapperContained.lastRecipe = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList stacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.stacks); }
// public void stacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.stacks = value.wrapperContained; }

}