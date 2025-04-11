package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookGhostSlots { public net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots wrapperContained; public RecipeBookGhostSlots(net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeEntry recipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.recipe); }
// public void recipe(yarnwrap.recipe.RecipeEntry value) { wrapperContained.recipe = value.wrapperContained; }
// public float time() { return wrapperContained.time; }
// public void time(float value) { wrapperContained.time = value; }
// public java.util.List slots() { return wrapperContained.slots; }
// public void slots(java.util.List value) { wrapperContained.slots = value; }
public void setRecipe(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.setRecipe(recipe.wrapperContained); }
public yarnwrap.recipe.RecipeEntry getRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getRecipe()); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,int x,int y,boolean notInventory,float tickDelta) { wrapperContained.draw(context.wrapperContained,client.wrapperContained,x,y,notInventory,tickDelta); }
public void addSlot(yarnwrap.recipe.Ingredient ingredient,int x,int y) { wrapperContained.addSlot(ingredient.wrapperContained,x,y); }
public Object getSlot(int index) { return wrapperContained.getSlot(index); }
public void reset() { wrapperContained.reset(); }
public int getSlotCount() { return wrapperContained.getSlotCount(); }

}