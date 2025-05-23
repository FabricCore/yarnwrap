package yarnwrap.entity.passive;
public class SheepEntity { public net.minecraft.entity.passive.SheepEntity wrapperContained; public SheepEntity(net.minecraft.entity.passive.SheepEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int eatGrassTimer() { return wrapperContained.eatGrassTimer; }
// public void eatGrassTimer(int value) { wrapperContained.eatGrassTimer = value; }
// public static int eatGrassTimer() { return net.minecraft.entity.passive.SheepEntity.eatGrassTimer; }
// public static void eatGrassTimer(int value, ) { net.minecraft.entity.passive.SheepEntity.eatGrassTimer = value; }

// public yarnwrap.entity.ai.goal.EatGrassGoal eatGrassGoal() { return new yarnwrap.entity.ai.goal.EatGrassGoal(wrapperContained.eatGrassGoal); }
// public void eatGrassGoal(yarnwrap.entity.ai.goal.EatGrassGoal value) { wrapperContained.eatGrassGoal = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.EatGrassGoal eatGrassGoal() { return new yarnwrap.entity.ai.goal.EatGrassGoal(net.minecraft.entity.passive.SheepEntity.eatGrassGoal); }
// public static void eatGrassGoal(yarnwrap.entity.ai.goal.EatGrassGoal value, ) { net.minecraft.entity.passive.SheepEntity.eatGrassGoal = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public void COLOR(yarnwrap.entity.data.TrackedData value) { wrapperContained.COLOR = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SheepEntity.COLOR); }
// public static void COLOR(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SheepEntity.COLOR = value.wrapperContained; }

// public int MAX_GRASS_TIMER() { return wrapperContained.MAX_GRASS_TIMER; }
// public void MAX_GRASS_TIMER(int value) { wrapperContained.MAX_GRASS_TIMER = value; }
// public static int MAX_GRASS_TIMER() { return net.minecraft.entity.passive.SheepEntity.MAX_GRASS_TIMER; }
// public static void MAX_GRASS_TIMER(int value, ) { net.minecraft.entity.passive.SheepEntity.MAX_GRASS_TIMER = value; }

// public yarnwrap.util.DyeColor DEFAULT_COLOR() { return new yarnwrap.util.DyeColor(wrapperContained.DEFAULT_COLOR); }
// public void DEFAULT_COLOR(yarnwrap.util.DyeColor value) { wrapperContained.DEFAULT_COLOR = value.wrapperContained; }
// public static yarnwrap.util.DyeColor DEFAULT_COLOR() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.DEFAULT_COLOR); }
// public static void DEFAULT_COLOR(yarnwrap.util.DyeColor value, ) { net.minecraft.entity.passive.SheepEntity.DEFAULT_COLOR = value.wrapperContained; }

// public boolean DEFAULT_SHEARED() { return wrapperContained.DEFAULT_SHEARED; }
// public void DEFAULT_SHEARED(boolean value) { wrapperContained.DEFAULT_SHEARED = value; }
// public static boolean DEFAULT_SHEARED() { return net.minecraft.entity.passive.SheepEntity.DEFAULT_SHEARED; }
// public static void DEFAULT_SHEARED(boolean value, ) { net.minecraft.entity.passive.SheepEntity.DEFAULT_SHEARED = value; }

public float getNeckAngle(float tickProgress) { return wrapperContained.getNeckAngle(tickProgress); }
// public static float getNeckAngle(float tickProgress, ) { return net.minecraft.entity.passive.SheepEntity.getNeckAngle(tickProgress); }
public boolean isSheared() { return wrapperContained.isSheared(); }
// public static boolean isSheared() { return net.minecraft.entity.passive.SheepEntity.isSheared(); }
public void setColor(yarnwrap.util.DyeColor color) { wrapperContained.setColor(color.wrapperContained); }
// public static void setColor(yarnwrap.util.DyeColor color, ) { net.minecraft.entity.passive.SheepEntity.setColor(color.wrapperContained); }
// public yarnwrap.util.DyeColor selectSpawnColor(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.DyeColor(wrapperContained.selectSpawnColor(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.DyeColor selectSpawnColor(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.selectSpawnColor(world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.SheepEntity.getColor()); }
public void setSheared(boolean sheared) { wrapperContained.setSheared(sheared); }
// public static void setSheared(boolean sheared, ) { net.minecraft.entity.passive.SheepEntity.setSheared(sheared); }
public float getHeadAngle(float tickProgress) { return wrapperContained.getHeadAngle(tickProgress); }
// public static float getHeadAngle(float tickProgress, ) { return net.minecraft.entity.passive.SheepEntity.getHeadAngle(tickProgress); }
// public Object createSheepAttributes() { return wrapperContained.createSheepAttributes(); }
public static Object createSheepAttributes() { return net.minecraft.entity.passive.SheepEntity.createSheepAttributes(); }
// public boolean method_58375(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58375(stack.wrapperContained); }
// public static boolean method_58375(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.SheepEntity.method_58375(stack.wrapperContained); }
// public void method_61475(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack) { wrapperContained.method_61475(world.wrapperContained,stack.wrapperContained); }
// public static void method_61475(yarnwrap.server.world.ServerWorld world,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.passive.SheepEntity.method_61475(world.wrapperContained,stack.wrapperContained); }

}