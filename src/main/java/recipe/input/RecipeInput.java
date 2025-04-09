package yarnwrap.recipe.input;
public class RecipeInput { public net.minecraft.recipe.input.RecipeInput wrapperContained; public RecipeInput(net.minecraft.recipe.input.RecipeInput wrapperContained) { this.wrapperContained = wrapperContained; }

public int getSize() { return wrapperContained.getSize(); }
public yarnwrap.item.ItemStack getStackInSlot(int slot) { return new yarnwrap.item.ItemStack(wrapperContained.getStackInSlot(slot)); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }

}