package yarnwrap.recipe;
public class SmithingRecipe { public net.minecraft.recipe.SmithingRecipe wrapperContained; public SmithingRecipe(net.minecraft.recipe.SmithingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Optional template() { return wrapperContained.template(); }
// public static java.util.Optional template() { return net.minecraft.recipe.SmithingRecipe.template(); }
public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base()); }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingRecipe.base()); }
public java.util.Optional addition() { return wrapperContained.addition(); }
// public static java.util.Optional addition() { return net.minecraft.recipe.SmithingRecipe.addition(); }

}