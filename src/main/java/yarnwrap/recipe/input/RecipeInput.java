package yarnwrap.recipe.input;
public class RecipeInput { public net.minecraft.recipe.input.RecipeInput wrapperContained; public RecipeInput(net.minecraft.recipe.input.RecipeInput wrapperContained) { this.wrapperContained = wrapperContained; }

public int getSize() { return wrapperContained.getSize(); }
// public static int getSize() { return net.minecraft.recipe.input.RecipeInput.getSize(); }
public yarnwrap.item.ItemStack getStackInSlot(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInSlot(slot)); }
// public static yarnwrap.item.ItemStack getStackInSlot(int slot, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.input.RecipeInput.getStackInSlot(slot)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.recipe.input.RecipeInput.isEmpty(); }

}