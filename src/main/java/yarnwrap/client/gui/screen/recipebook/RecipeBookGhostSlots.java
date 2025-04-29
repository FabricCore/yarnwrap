package yarnwrap.client.gui.screen.recipebook;
public class RecipeBookGhostSlots { public net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots wrapperContained; public RecipeBookGhostSlots(net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.RecipeEntry recipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.recipe); }
// public void recipe(yarnwrap.recipe.RecipeEntry value) { wrapperContained.recipe = value.wrapperContained; }
// public static yarnwrap.recipe.RecipeEntry recipe() { return new yarnwrap.recipe.RecipeEntry(net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.recipe); }
// public static void recipe(yarnwrap.recipe.RecipeEntry value, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.recipe = value.wrapperContained; }

// public float time() { return wrapperContained.time; }
// public void time(float value) { wrapperContained.time = value; }
// public static float time() { return net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.time; }
// public static void time(float value, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.time = value; }

// public java.util.List slots() { return wrapperContained.slots; }
// public void slots(java.util.List value) { wrapperContained.slots = value; }
// public static java.util.List slots() { return net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.slots; }
// public static void slots(java.util.List value, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.slots = value; }

public void setRecipe(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.setRecipe(recipe.wrapperContained); }
// public static void setRecipe(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.setRecipe(recipe.wrapperContained); }
public yarnwrap.recipe.RecipeEntry getRecipe() { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getRecipe()); }
// public static yarnwrap.recipe.RecipeEntry getRecipe() { return new yarnwrap.recipe.RecipeEntry(net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.getRecipe()); }
public void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,int x,int y,boolean notInventory,float tickDelta) { wrapperContained.draw(context.wrapperContained,client.wrapperContained,x,y,notInventory,tickDelta); }
// public static void draw(yarnwrap.client.gui.DrawContext context,yarnwrap.client.MinecraftClient client,int x,int y,boolean notInventory,float tickDelta, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.draw(context.wrapperContained,client.wrapperContained,x,y,notInventory,tickDelta); }
public void addSlot(yarnwrap.recipe.Ingredient ingredient,int x,int y) { wrapperContained.addSlot(ingredient.wrapperContained,x,y); }
// public static void addSlot(yarnwrap.recipe.Ingredient ingredient,int x,int y, ) { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.addSlot(ingredient.wrapperContained,x,y); }
public Object getSlot(int index) { return wrapperContained.getSlot(index); }
// public static Object getSlot(int index, ) { return net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.getSlot(index); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.reset(); }
public int getSlotCount() { return wrapperContained.getSlotCount(); }
// public static int getSlotCount() { return net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots.getSlotCount(); }

}