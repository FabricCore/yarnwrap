package yarnwrap.entity.passive;
public class SheepEntity { public net.minecraft.entity.passive.SheepEntity wrapperContained; public SheepEntity(net.minecraft.entity.passive.SheepEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_GRASS_TIMER() { return wrapperContained.MAX_GRASS_TIMER; }
// public int eatGrassTimer() { return wrapperContained.eatGrassTimer; }
// public java.util.Map COLORS() { return wrapperContained.COLORS; }
// public java.util.Map DROPS() { return wrapperContained.DROPS; }
// public yarnwrap.entity.ai.goal.EatGrassGoal eatGrassGoal() { return new yarnwrap.entity.ai.goal.EatGrassGoal(wrapperContained.eatGrassGoal); }
// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
public Object createSheepAttributes() { return wrapperContained.createSheepAttributes(); }
// public yarnwrap.recipe.input.CraftingRecipeInput createChildColorRecipeInput(yarnwrap.util.DyeColor firstColor,yarnwrap.util.DyeColor secondColor) { return new yarnwrap.recipe.input.CraftingRecipeInput(wrapperContained.createChildColorRecipeInput(firstColor.wrapperContained,secondColor.wrapperContained)); }
public float getNeckAngle(float delta) { return wrapperContained.getNeckAngle(delta); }
public boolean isSheared() { return wrapperContained.isSheared(); }
// public int getDyedColor(yarnwrap.util.DyeColor color) { return wrapperContained.getDyedColor(color.wrapperContained); }
public void setColor(yarnwrap.util.DyeColor color) { wrapperContained.setColor(color.wrapperContained); }
public yarnwrap.util.DyeColor generateDefaultColor(yarnwrap.util.math.random.Random random) { return new yarnwrap.util.DyeColor(wrapperContained.generateDefaultColor(random.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public int getRgbColor(yarnwrap.util.DyeColor dyeColor) { return wrapperContained.getRgbColor(dyeColor.wrapperContained); }
public void setSheared(boolean sheared) { wrapperContained.setSheared(sheared); }
// public yarnwrap.util.DyeColor getChildColor(yarnwrap.entity.passive.AnimalEntity firstParent,yarnwrap.entity.passive.AnimalEntity secondParent) { return new yarnwrap.util.DyeColor(wrapperContained.getChildColor(firstParent.wrapperContained,secondParent.wrapperContained)); }
public float getHeadAngle(float delta) { return wrapperContained.getHeadAngle(delta); }

}