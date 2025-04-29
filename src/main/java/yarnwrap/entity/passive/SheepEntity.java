package yarnwrap.entity.passive;
public class SheepEntity { public net.minecraft.entity.passive.SheepEntity wrapperContained; public SheepEntity(net.minecraft.entity.passive.SheepEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_GRASS_TIMER() { return wrapperContained.MAX_GRASS_TIMER; }
// public void MAX_GRASS_TIMER(int value) { wrapperContained.MAX_GRASS_TIMER = value; }
// public static int MAX_GRASS_TIMER() { return net.minecraft.entity.passive.SheepEntity.MAX_GRASS_TIMER; }
// public static void MAX_GRASS_TIMER(int value, ) { net.minecraft.entity.passive.SheepEntity.MAX_GRASS_TIMER = value; }

// public int eatGrassTimer() { return wrapperContained.eatGrassTimer; }
// public void eatGrassTimer(int value) { wrapperContained.eatGrassTimer = value; }
// public static int eatGrassTimer() { return net.minecraft.entity.passive.SheepEntity.eatGrassTimer; }
// public static void eatGrassTimer(int value, ) { net.minecraft.entity.passive.SheepEntity.eatGrassTimer = value; }

// public java.util.Map COLORS() { return wrapperContained.COLORS; }
// public void COLORS(java.util.Map value) { wrapperContained.COLORS = value; }
// public static java.util.Map COLORS() { return net.minecraft.entity.passive.SheepEntity.COLORS; }
// public static void COLORS(java.util.Map value, ) { net.minecraft.entity.passive.SheepEntity.COLORS = value; }

// public java.util.Map DROPS() { return wrapperContained.DROPS; }
// public void DROPS(java.util.Map value) { wrapperContained.DROPS = value; }
// public static java.util.Map DROPS() { return net.minecraft.entity.passive.SheepEntity.DROPS; }
// public static void DROPS(java.util.Map value, ) { net.minecraft.entity.passive.SheepEntity.DROPS = value; }

// public yarnwrap.entity.ai.goal.EatGrassGoal eatGrassGoal() { return new yarnwrap.entity.ai.goal.EatGrassGoal(wrapperContained.eatGrassGoal); }
// public void eatGrassGoal(yarnwrap.entity.ai.goal.EatGrassGoal value) { wrapperContained.eatGrassGoal = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.EatGrassGoal eatGrassGoal() { return new yarnwrap.entity.ai.goal.EatGrassGoal(net.minecraft.entity.passive.SheepEntity.eatGrassGoal); }
// public static void eatGrassGoal(yarnwrap.entity.ai.goal.EatGrassGoal value, ) { net.minecraft.entity.passive.SheepEntity.eatGrassGoal = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public void COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLOR = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SheepEntity.COLOR); }
// public static void COLOR(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SheepEntity.COLOR = value.wrapperContained; }

// public yarnwrap.item.ItemStack method_17689(yarnwrap.recipe.input.CraftingRecipeInput recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_17689(recipe.wrapperContained)); }
// public static yarnwrap.item.ItemStack method_17689(yarnwrap.recipe.input.CraftingRecipeInput recipe, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.passive.SheepEntity.method_17689(recipe.wrapperContained)); }
// public Object createSheepAttributes() { return wrapperContained.createSheepAttributes(); }
public static Object createSheepAttributes() { return net.minecraft.entity.passive.SheepEntity.createSheepAttributes(); }
// public boolean method_58375(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58375(stack.wrapperContained); }
// public static boolean method_58375(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.SheepEntity.method_58375(stack.wrapperContained); }
// public yarnwrap.recipe.input.CraftingRecipeInput createChildColorRecipeInput(yarnwrap.util.DyeColor firstColor,yarnwrap.util.DyeColor secondColor) { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.createChildColorRecipeInput(firstColor.wrapperContained,secondColor.wrapperContained)); }
// public static yarnwrap.recipe.input.CraftingRecipeInput createChildColorRecipeInput(yarnwrap.util.DyeColor firstColor,yarnwrap.util.DyeColor secondColor, ) { return new yarnwrap.recipe.input.CraftingRecipeInput(net.minecraft.entity.passive.SheepEntity.createChildColorRecipeInput(firstColor.wrapperContained,secondColor.wrapperContained)); }
public float getNeckAngle(float delta) { return wrapperContained.getNeckAngle(delta); }
// public static float getNeckAngle(float delta, ) { return net.minecraft.entity.passive.SheepEntity.getNeckAngle(delta); }
public boolean isSheared() { return wrapperContained.isSheared(); }
// public static boolean isSheared() { return net.minecraft.entity.passive.SheepEntity.isSheared(); }
// public int getDyedColor(yarnwrap.util.DyeColor color) { return wrapperContained.getDyedColor(color.wrapperContained); }
// public static int getDyedColor(yarnwrap.util.DyeColor color, ) { return net.minecraft.entity.passive.SheepEntity.getDyedColor(color.wrapperContained); }
public void setColor(yarnwrap.util.DyeColor color) { wrapperContained.setColor(color.wrapperContained); }
// public static void setColor(yarnwrap.util.DyeColor color, ) { net.minecraft.entity.passive.SheepEntity.setColor(color.wrapperContained); }
// public yarnwrap.util.DyeColor generateDefaultColor(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.DyeColor(wrapperContained.generateDefaultColor(random.wrapperContained)); }
// public static yarnwrap.util.DyeColor generateDefaultColor(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.generateDefaultColor(random.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.getColor()); }
// public int getRgbColor(yarnwrap.util.DyeColor dyeColor) { return wrapperContained.getRgbColor(dyeColor.wrapperContained); }
// public static int getRgbColor(yarnwrap.util.DyeColor dyeColor, ) { return net.minecraft.entity.passive.SheepEntity.getRgbColor(dyeColor.wrapperContained); }
public void setSheared(boolean sheared) { wrapperContained.setSheared(sheared); }
// public static void setSheared(boolean sheared, ) { net.minecraft.entity.passive.SheepEntity.setSheared(sheared); }
// public void method_6637(java.util.EnumMap map) { wrapperContained.method_6637(map); }
// public static void method_6637(java.util.EnumMap map, ) { net.minecraft.entity.passive.SheepEntity.method_6637(map); }
// public yarnwrap.util.DyeColor method_6638(yarnwrap.util.DyeColor color) { return new yarnwrap.util.DyeColor(wrapperContained.method_6638(color.wrapperContained)); }
// public static yarnwrap.util.DyeColor method_6638(yarnwrap.util.DyeColor color, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.method_6638(color.wrapperContained)); }
// public yarnwrap.util.DyeColor getChildColor(yarnwrap.entity.passive.AnimalEntity firstParent,yarnwrap.entity.passive.AnimalEntity secondParent) { return new yarnwrap.util.DyeColor(wrapperContained.getChildColor(firstParent.wrapperContained,secondParent.wrapperContained)); }
// public static yarnwrap.util.DyeColor getChildColor(yarnwrap.entity.passive.AnimalEntity firstParent,yarnwrap.entity.passive.AnimalEntity secondParent, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.getChildColor(firstParent.wrapperContained,secondParent.wrapperContained)); }
public float getHeadAngle(float delta) { return wrapperContained.getHeadAngle(delta); }
// public static float getHeadAngle(float delta, ) { return net.minecraft.entity.passive.SheepEntity.getHeadAngle(delta); }

}