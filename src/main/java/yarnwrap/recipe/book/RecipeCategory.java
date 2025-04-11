package yarnwrap.recipe.book;
public class RecipeCategory { public net.minecraft.recipe.book.RecipeCategory wrapperContained; public RecipeCategory(net.minecraft.recipe.book.RecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public java.lang.String getName() { return wrapperContained.getName(); }

}