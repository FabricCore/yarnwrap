package yarnwrap.inventory;
public class RecipeInputInventory { public net.minecraft.inventory.RecipeInputInventory wrapperContained; public RecipeInputInventory(net.minecraft.inventory.RecipeInputInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public int getHeight() { return wrapperContained.getHeight(); }
public int getWidth() { return wrapperContained.getWidth(); }
public java.util.List getHeldStacks() { return wrapperContained.getHeldStacks(); }
public yarnwrap.recipe.input.CraftingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.createRecipeInput()); }
public Object createPositionedRecipeInput() { return wrapperContained.createPositionedRecipeInput(); }

}