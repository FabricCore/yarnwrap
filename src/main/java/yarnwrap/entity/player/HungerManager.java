package yarnwrap.entity.player;
public class HungerManager { public net.minecraft.entity.player.HungerManager wrapperContained; public HungerManager(net.minecraft.entity.player.HungerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public float exhaustion() { return wrapperContained.exhaustion; }
// public void exhaustion(float value) { wrapperContained.exhaustion = value; }
// public static float exhaustion() { return net.minecraft.entity.player.HungerManager.exhaustion; }
// public static void exhaustion(float value, ) { net.minecraft.entity.player.HungerManager.exhaustion = value; }

// public float saturationLevel() { return wrapperContained.saturationLevel; }
// public void saturationLevel(float value) { wrapperContained.saturationLevel = value; }
// public static float saturationLevel() { return net.minecraft.entity.player.HungerManager.saturationLevel; }
// public static void saturationLevel(float value, ) { net.minecraft.entity.player.HungerManager.saturationLevel = value; }

// public int prevFoodLevel() { return wrapperContained.prevFoodLevel; }
// public void prevFoodLevel(int value) { wrapperContained.prevFoodLevel = value; }
// public static int prevFoodLevel() { return net.minecraft.entity.player.HungerManager.prevFoodLevel; }
// public static void prevFoodLevel(int value, ) { net.minecraft.entity.player.HungerManager.prevFoodLevel = value; }

// public int foodTickTimer() { return wrapperContained.foodTickTimer; }
// public void foodTickTimer(int value) { wrapperContained.foodTickTimer = value; }
// public static int foodTickTimer() { return net.minecraft.entity.player.HungerManager.foodTickTimer; }
// public static void foodTickTimer(int value, ) { net.minecraft.entity.player.HungerManager.foodTickTimer = value; }

// public int foodLevel() { return wrapperContained.foodLevel; }
// public void foodLevel(int value) { wrapperContained.foodLevel = value; }
// public static int foodLevel() { return net.minecraft.entity.player.HungerManager.foodLevel; }
// public static void foodLevel(int value, ) { net.minecraft.entity.player.HungerManager.foodLevel = value; }

public int getPrevFoodLevel() { return wrapperContained.getPrevFoodLevel(); }
// public static int getPrevFoodLevel() { return net.minecraft.entity.player.HungerManager.getPrevFoodLevel(); }
public void setExhaustion(float exhaustion) { wrapperContained.setExhaustion(exhaustion); }
// public static void setExhaustion(float exhaustion, ) { net.minecraft.entity.player.HungerManager.setExhaustion(exhaustion); }
public float getExhaustion() { return wrapperContained.getExhaustion(); }
// public static float getExhaustion() { return net.minecraft.entity.player.HungerManager.getExhaustion(); }
// public void addInternal(int nutrition,float saturation) { wrapperContained.addInternal(nutrition,saturation); }
// public static void addInternal(int nutrition,float saturation, ) { net.minecraft.entity.player.HungerManager.addInternal(nutrition,saturation); }
public void eat(yarnwrap.component.type.FoodComponent foodComponent) { wrapperContained.eat(foodComponent.wrapperContained); }
// public static void eat(yarnwrap.component.type.FoodComponent foodComponent, ) { net.minecraft.entity.player.HungerManager.eat(foodComponent.wrapperContained); }
public void setFoodLevel(int foodLevel) { wrapperContained.setFoodLevel(foodLevel); }
// public static void setFoodLevel(int foodLevel, ) { net.minecraft.entity.player.HungerManager.setFoodLevel(foodLevel); }
public void setSaturationLevel(float saturationLevel) { wrapperContained.setSaturationLevel(saturationLevel); }
// public static void setSaturationLevel(float saturationLevel, ) { net.minecraft.entity.player.HungerManager.setSaturationLevel(saturationLevel); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
// public static void writeNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.player.HungerManager.writeNbt(nbt.wrapperContained); }
public void addExhaustion(float exhaustion) { wrapperContained.addExhaustion(exhaustion); }
// public static void addExhaustion(float exhaustion, ) { net.minecraft.entity.player.HungerManager.addExhaustion(exhaustion); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.player.HungerManager.readNbt(nbt.wrapperContained); }
public void add(int food,float saturationModifier) { wrapperContained.add(food,saturationModifier); }
// public static void add(int food,float saturationModifier, ) { net.minecraft.entity.player.HungerManager.add(food,saturationModifier); }
public int getFoodLevel() { return wrapperContained.getFoodLevel(); }
// public static int getFoodLevel() { return net.minecraft.entity.player.HungerManager.getFoodLevel(); }
public boolean isNotFull() { return wrapperContained.isNotFull(); }
// public static boolean isNotFull() { return net.minecraft.entity.player.HungerManager.isNotFull(); }
public void update(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.update(player.wrapperContained); }
// public static void update(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.player.HungerManager.update(player.wrapperContained); }
public float getSaturationLevel() { return wrapperContained.getSaturationLevel(); }
// public static float getSaturationLevel() { return net.minecraft.entity.player.HungerManager.getSaturationLevel(); }

}