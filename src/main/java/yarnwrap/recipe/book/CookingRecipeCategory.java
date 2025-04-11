package yarnwrap.recipe.book;
public class CookingRecipeCategory { public net.minecraft.recipe.book.CookingRecipeCategory wrapperContained; public CookingRecipeCategory(net.minecraft.recipe.book.CookingRecipeCategory wrapperContained) { this.wrapperContained = wrapperContained; }

public Object CODEC() { return wrapperContained.CODEC; }
// // public void CODEC(Object value) { wrapperContained.CODEC = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }

}