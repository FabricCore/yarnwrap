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

// public int foodTickTimer() { return wrapperContained.foodTickTimer; }
// public void foodTickTimer(int value) { wrapperContained.foodTickTimer = value; }
// public static int foodTickTimer() { return net.minecraft.entity.player.HungerManager.foodTickTimer; }
// public static void foodTickTimer(int value, ) { net.minecraft.entity.player.HungerManager.foodTickTimer = value; }

// public int foodLevel() { return wrapperContained.foodLevel; }
// public void foodLevel(int value) { wrapperContained.foodLevel = value; }
// public static int foodLevel() { return net.minecraft.entity.player.HungerManager.foodLevel; }
// public static void foodLevel(int value, ) { net.minecraft.entity.player.HungerManager.foodLevel = value; }

// public int DEFAULT_FOOD_TICK_TIMER() { return wrapperContained.DEFAULT_FOOD_TICK_TIMER; }
// public void DEFAULT_FOOD_TICK_TIMER(int value) { wrapperContained.DEFAULT_FOOD_TICK_TIMER = value; }
// public static int DEFAULT_FOOD_TICK_TIMER() { return net.minecraft.entity.player.HungerManager.DEFAULT_FOOD_TICK_TIMER; }
// public static void DEFAULT_FOOD_TICK_TIMER(int value, ) { net.minecraft.entity.player.HungerManager.DEFAULT_FOOD_TICK_TIMER = value; }

// public float DEFAULT_EXHAUSTION() { return wrapperContained.DEFAULT_EXHAUSTION; }
// public void DEFAULT_EXHAUSTION(float value) { wrapperContained.DEFAULT_EXHAUSTION = value; }
// public static float DEFAULT_EXHAUSTION() { return net.minecraft.entity.player.HungerManager.DEFAULT_EXHAUSTION; }
// public static void DEFAULT_EXHAUSTION(float value, ) { net.minecraft.entity.player.HungerManager.DEFAULT_EXHAUSTION = value; }

public void eat(yarnwrap.component.type.FoodComponent foodComponent) { wrapperContained.eat(foodComponent.wrapperContained); }
// public static void eat(yarnwrap.component.type.FoodComponent foodComponent, ) { net.minecraft.entity.player.HungerManager.eat(foodComponent.wrapperContained); }
public void setFoodLevel(int foodLevel) { wrapperContained.setFoodLevel(foodLevel); }
// public static void setFoodLevel(int foodLevel, ) { net.minecraft.entity.player.HungerManager.setFoodLevel(foodLevel); }
public void setSaturationLevel(float saturationLevel) { wrapperContained.setSaturationLevel(saturationLevel); }
// public static void setSaturationLevel(float saturationLevel, ) { net.minecraft.entity.player.HungerManager.setSaturationLevel(saturationLevel); }
// public void writeData(yarnwrap.storage.WriteView view) { wrapperContained.writeData(view.wrapperContained); }
// public static void writeData(yarnwrap.storage.WriteView view, ) { net.minecraft.entity.player.HungerManager.writeData(view.wrapperContained); }
public void addExhaustion(float exhaustion) { wrapperContained.addExhaustion(exhaustion); }
// public static void addExhaustion(float exhaustion, ) { net.minecraft.entity.player.HungerManager.addExhaustion(exhaustion); }
// public void readData(yarnwrap.storage.ReadView view) { wrapperContained.readData(view.wrapperContained); }
// public static void readData(yarnwrap.storage.ReadView view, ) { net.minecraft.entity.player.HungerManager.readData(view.wrapperContained); }
public void add(int food,float saturationModifier) { wrapperContained.add(food,saturationModifier); }
// public static void add(int food,float saturationModifier, ) { net.minecraft.entity.player.HungerManager.add(food,saturationModifier); }
public int getFoodLevel() { return wrapperContained.getFoodLevel(); }
// public static int getFoodLevel() { return net.minecraft.entity.player.HungerManager.getFoodLevel(); }
public boolean isNotFull() { return wrapperContained.isNotFull(); }
// public static boolean isNotFull() { return net.minecraft.entity.player.HungerManager.isNotFull(); }
public void update(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.update(player.wrapperContained); }
// public static void update(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.player.HungerManager.update(player.wrapperContained); }
public float getSaturationLevel() { return wrapperContained.getSaturationLevel(); }
// public static float getSaturationLevel() { return net.minecraft.entity.player.HungerManager.getSaturationLevel(); }
// public void addInternal(int nutrition,float saturation) { wrapperContained.addInternal(nutrition,saturation); }
// public static void addInternal(int nutrition,float saturation, ) { net.minecraft.entity.player.HungerManager.addInternal(nutrition,saturation); }

}