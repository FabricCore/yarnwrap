package yarnwrap.recipe;
public class RecipeGridAligner { public net.minecraft.recipe.RecipeGridAligner wrapperContained; public RecipeGridAligner(net.minecraft.recipe.RecipeGridAligner wrapperContained) { this.wrapperContained = wrapperContained; }

// public void alignRecipeToGrid(int width,int height,int recipeWidth,int recipeHeight,java.lang.Iterable slots,Object filter) { wrapperContained.alignRecipeToGrid(width,height,recipeWidth,recipeHeight,slots,filter); }
// public static void alignRecipeToGrid(int width,int height,int recipeWidth,int recipeHeight,java.lang.Iterable slots,Object filter, ) { net.minecraft.recipe.RecipeGridAligner.alignRecipeToGrid(width,height,recipeWidth,recipeHeight,slots,filter); }
// public void alignRecipeToGrid(int width,int height,yarnwrap.recipe.Recipe recipe,java.lang.Iterable slots,Object filter) { wrapperContained.alignRecipeToGrid(width,height,recipe.wrapperContained,slots,filter); }
// public static void alignRecipeToGrid(int width,int height,yarnwrap.recipe.Recipe recipe,java.lang.Iterable slots,Object filter, ) { net.minecraft.recipe.RecipeGridAligner.alignRecipeToGrid(width,height,recipe.wrapperContained,slots,filter); }

}