package yarnwrap.recipe;
public class RecipeGridAligner { public net.minecraft.recipe.RecipeGridAligner wrapperContained; public RecipeGridAligner(net.minecraft.recipe.RecipeGridAligner wrapperContained) { this.wrapperContained = wrapperContained; }

public void acceptAlignedInput(java.lang.Object input,int slot,int amount,int gridX,int gridY) { wrapperContained.acceptAlignedInput(input,slot,amount,gridX,gridY); }
// public static void acceptAlignedInput(java.lang.Object input,int slot,int amount,int gridX,int gridY, ) { net.minecraft.recipe.RecipeGridAligner.acceptAlignedInput(input,slot,amount,gridX,gridY); }
public void alignRecipeToGrid(int gridWidth,int gridHeight,int gridOutputSlot,yarnwrap.recipe.RecipeEntry recipe,java.util.Iterator inputs,int amount) { wrapperContained.alignRecipeToGrid(gridWidth,gridHeight,gridOutputSlot,recipe.wrapperContained,inputs,amount); }
// public static void alignRecipeToGrid(int gridWidth,int gridHeight,int gridOutputSlot,yarnwrap.recipe.RecipeEntry recipe,java.util.Iterator inputs,int amount, ) { net.minecraft.recipe.RecipeGridAligner.alignRecipeToGrid(gridWidth,gridHeight,gridOutputSlot,recipe.wrapperContained,inputs,amount); }

}