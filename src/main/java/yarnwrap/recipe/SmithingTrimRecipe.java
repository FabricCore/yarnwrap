package yarnwrap.recipe;
public class SmithingTrimRecipe { public net.minecraft.recipe.SmithingTrimRecipe wrapperContained; public SmithingTrimRecipe(net.minecraft.recipe.SmithingTrimRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTrimRecipe.template); }
// public static void template(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTrimRecipe.template = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTrimRecipe.base); }
// public static void base(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTrimRecipe.base = value.wrapperContained; }

// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public static yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(net.minecraft.recipe.SmithingTrimRecipe.addition); }
// public static void addition(yarnwrap.recipe.Ingredient value, ) { net.minecraft.recipe.SmithingTrimRecipe.addition = value.wrapperContained; }

public SmithingTrimRecipe(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition) { this.wrapperContained = new net.minecraft.recipe.SmithingTrimRecipe(template.wrapperContained,base.wrapperContained,addition.wrapperContained); }

}