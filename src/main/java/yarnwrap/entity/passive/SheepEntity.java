package yarnwrap.entity.passive;
public class SheepEntity { public net.minecraft.entity.passive.SheepEntity wrapperContained; public SheepEntity(net.minecraft.entity.passive.SheepEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_GRASS_TIMER() { return wrapperContained.MAX_GRASS_TIMER; }
// public void MAX_GRASS_TIMER(int value) { wrapperContained.MAX_GRASS_TIMER = value; }
// public int eatGrassTimer() { return wrapperContained.eatGrassTimer; }
// public void eatGrassTimer(int value) { wrapperContained.eatGrassTimer = value; }
// public java.util.Map COLORS() { return wrapperContained.COLORS; }
// public void COLORS(java.util.Map value) { wrapperContained.COLORS = value; }
// public java.util.Map DROPS() { return wrapperContained.DROPS; }
// public void DROPS(java.util.Map value) { wrapperContained.DROPS = value; }
// public yarnwrap.entity.ai.goal.EatGrassGoal eatGrassGoal() { return new yarnwrap.entity.ai.goal.EatGrassGoal(wrapperContained.eatGrassGoal); }
// public void eatGrassGoal(yarnwrap.entity.ai.goal.EatGrassGoal value) { wrapperContained.eatGrassGoal = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public void COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLOR = value.wrapperContained; }
// public yarnwrap.item.ItemStack method_17689(yarnwrap.recipe.input.CraftingRecipeInput recipe) { return new yarnwrap.item.ItemStack(wrapperContained.method_17689(recipe.wrapperContained)); }
public Object createSheepAttributes() { return wrapperContained.createSheepAttributes(); }
// public boolean method_58375(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58375(stack.wrapperContained); }
// public yarnwrap.recipe.input.CraftingRecipeInput createChildColorRecipeInput(yarnwrap.util.DyeColor firstColor,yarnwrap.util.DyeColor secondColor) { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.createChildColorRecipeInput(firstColor.wrapperContained,secondColor.wrapperContained)); }
public float getNeckAngle(float delta) { return wrapperContained.getNeckAngle(delta); }
public boolean isSheared() { return wrapperContained.isSheared(); }
// public int getDyedColor(yarnwrap.util.DyeColor color) { return wrapperContained.getDyedColor(color.wrapperContained); }
public void setColor(yarnwrap.util.DyeColor color) { wrapperContained.setColor(color.wrapperContained); }
public yarnwrap.util.DyeColor generateDefaultColor(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.DyeColor(wrapperContained.generateDefaultColor(random.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public int getRgbColor(yarnwrap.util.DyeColor dyeColor) { return wrapperContained.getRgbColor(dyeColor.wrapperContained); }
public void setSheared(boolean sheared) { wrapperContained.setSheared(sheared); }
// public void method_6637(java.util.EnumMap map) { wrapperContained.method_6637(map); }
// public yarnwrap.util.DyeColor method_6638(yarnwrap.util.DyeColor color) { return new yarnwrap.util.DyeColor(wrapperContained.method_6638(color.wrapperContained)); }
// public yarnwrap.util.DyeColor getChildColor(yarnwrap.entity.passive.AnimalEntity firstParent,yarnwrap.entity.passive.AnimalEntity secondParent) { return new yarnwrap.util.DyeColor(wrapperContained.getChildColor(firstParent.wrapperContained,secondParent.wrapperContained)); }
public float getHeadAngle(float delta) { return wrapperContained.getHeadAngle(delta); }

}