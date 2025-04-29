package yarnwrap.recipe;
public class SmithingRecipe { public net.minecraft.recipe.SmithingRecipe wrapperContained; public SmithingRecipe(net.minecraft.recipe.SmithingRecipe wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean testAddition(yarnwrap.item.ItemStack stack) { return wrapperContained.testAddition(stack.wrapperContained); }
// public static boolean testAddition(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.SmithingRecipe.testAddition(stack.wrapperContained); }
public boolean testTemplate(yarnwrap.item.ItemStack stack) { return wrapperContained.testTemplate(stack.wrapperContained); }
// public static boolean testTemplate(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.SmithingRecipe.testTemplate(stack.wrapperContained); }
public boolean testBase(yarnwrap.item.ItemStack stack) { return wrapperContained.testBase(stack.wrapperContained); }
// public static boolean testBase(yarnwrap.item.ItemStack stack, ) { return net.minecraft.recipe.SmithingRecipe.testBase(stack.wrapperContained); }

}