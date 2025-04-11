package yarnwrap.recipe;
public class SmithingTransformRecipe { public net.minecraft.recipe.SmithingTransformRecipe wrapperContained; public SmithingTransformRecipe(net.minecraft.recipe.SmithingTransformRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.Ingredient template() { return new yarnwrap.recipe.Ingredient(wrapperContained.template); }
// public void template(yarnwrap.recipe.Ingredient value) { wrapperContained.template = value.wrapperContained; }
// public yarnwrap.recipe.Ingredient base() { return new yarnwrap.recipe.Ingredient(wrapperContained.base); }
// public void base(yarnwrap.recipe.Ingredient value) { wrapperContained.base = value.wrapperContained; }
// public yarnwrap.recipe.Ingredient addition() { return new yarnwrap.recipe.Ingredient(wrapperContained.addition); }
// public void addition(yarnwrap.recipe.Ingredient value) { wrapperContained.addition = value.wrapperContained; }
// public yarnwrap.item.ItemStack result() { return new yarnwrap.item.ItemStack(wrapperContained.result); }
// public void result(yarnwrap.item.ItemStack value) { wrapperContained.result = value.wrapperContained; }
public SmithingTransformRecipe(yarnwrap.recipe.Ingredient template,yarnwrap.recipe.Ingredient base,yarnwrap.recipe.Ingredient addition,yarnwrap.item.ItemStack result) { this.wrapperContained = new net.minecraft.recipe.SmithingTransformRecipe(template.wrapperContained,base.wrapperContained,addition.wrapperContained,result.wrapperContained); }

}