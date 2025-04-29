package yarnwrap.inventory;
public class RecipeInputInventory { public net.minecraft.inventory.RecipeInputInventory wrapperContained; public RecipeInputInventory(net.minecraft.inventory.RecipeInputInventory wrapperContained) { this.wrapperContained = wrapperContained; }

public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.inventory.RecipeInputInventory.getHeight(); }
public int getWidth() { return wrapperContained.getWidth(); }
// public static int getWidth() { return net.minecraft.inventory.RecipeInputInventory.getWidth(); }
public java.util.List getHeldStacks() { return wrapperContained.getHeldStacks(); }
// public static java.util.List getHeldStacks() { return net.minecraft.inventory.RecipeInputInventory.getHeldStacks(); }
public yarnwrap.recipe.input.CraftingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.createRecipeInput()); }
// public static yarnwrap.recipe.input.CraftingRecipeInput createRecipeInput() { return new yarnwrap.recipe.input.CraftingRecipeInput(net.minecraft.inventory.RecipeInputInventory.createRecipeInput()); }
public Object createPositionedRecipeInput() { return wrapperContained.createPositionedRecipeInput(); }
// public static Object createPositionedRecipeInput() { return net.minecraft.inventory.RecipeInputInventory.createPositionedRecipeInput(); }

}