package yarnwrap.recipe;
public class IngredientPlacement { public net.minecraft.recipe.IngredientPlacement wrapperContained; public IngredientPlacement(net.minecraft.recipe.IngredientPlacement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.recipe.IngredientPlacement NONE() { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.NONE); }
// public void NONE(yarnwrap.recipe.IngredientPlacement value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.recipe.IngredientPlacement NONE() { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.IngredientPlacement.NONE); }
// public static void NONE(yarnwrap.recipe.IngredientPlacement value, ) { net.minecraft.recipe.IngredientPlacement.NONE = value.wrapperContained; }

// public java.util.List ingredients() { return wrapperContained.ingredients; }
// public void ingredients(java.util.List value) { wrapperContained.ingredients = value; }
// public static java.util.List ingredients() { return net.minecraft.recipe.IngredientPlacement.ingredients; }
// public static void ingredients(java.util.List value, ) { net.minecraft.recipe.IngredientPlacement.ingredients = value; }

// public it.unimi.dsi.fastutil.ints.IntList placementSlots() { return wrapperContained.placementSlots; }
// public void placementSlots(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.placementSlots = value; }
// public static it.unimi.dsi.fastutil.ints.IntList placementSlots() { return net.minecraft.recipe.IngredientPlacement.placementSlots; }
// public static void placementSlots(it.unimi.dsi.fastutil.ints.IntList value, ) { net.minecraft.recipe.IngredientPlacement.placementSlots = value; }

// public IngredientPlacement(java.util.List ingredients,it.unimi.dsi.fastutil.ints.IntList placementSlots) { this.wrapperContained = new net.minecraft.recipe.IngredientPlacement(ingredients,placementSlots); }
// public yarnwrap.recipe.IngredientPlacement forSingleSlot(yarnwrap.recipe.Ingredient ingredient) { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.forSingleSlot(ingredient.wrapperContained)); }
// public static yarnwrap.recipe.IngredientPlacement forSingleSlot(yarnwrap.recipe.Ingredient ingredient, ) { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.IngredientPlacement.forSingleSlot(ingredient.wrapperContained)); }
// public yarnwrap.recipe.IngredientPlacement forMultipleSlots(java.util.List ingredients) { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.forMultipleSlots(ingredients)); }
// public static yarnwrap.recipe.IngredientPlacement forMultipleSlots(java.util.List ingredients, ) { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.IngredientPlacement.forMultipleSlots(ingredients)); }
// public yarnwrap.recipe.IngredientPlacement forShapeless(java.util.List ingredients) { return new yarnwrap.recipe.IngredientPlacement(wrapperContained.forShapeless(ingredients)); }
// public static yarnwrap.recipe.IngredientPlacement forShapeless(java.util.List ingredients, ) { return new yarnwrap.recipe.IngredientPlacement(net.minecraft.recipe.IngredientPlacement.forShapeless(ingredients)); }
public boolean hasNoPlacement() { return wrapperContained.hasNoPlacement(); }
// public static boolean hasNoPlacement() { return net.minecraft.recipe.IngredientPlacement.hasNoPlacement(); }
public java.util.List getIngredients() { return wrapperContained.getIngredients(); }
// public static java.util.List getIngredients() { return net.minecraft.recipe.IngredientPlacement.getIngredients(); }
public it.unimi.dsi.fastutil.ints.IntList getPlacementSlots() { return wrapperContained.getPlacementSlots(); }
// public static it.unimi.dsi.fastutil.ints.IntList getPlacementSlots() { return net.minecraft.recipe.IngredientPlacement.getPlacementSlots(); }

}