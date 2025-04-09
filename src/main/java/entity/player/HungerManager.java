package yarnwrap.entity.player;
public class HungerManager { public net.minecraft.entity.player.HungerManager wrapperContained; public HungerManager(net.minecraft.entity.player.HungerManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public float exhaustion() { return wrapperContained.exhaustion; }
// public float saturationLevel() { return wrapperContained.saturationLevel; }
// public int prevFoodLevel() { return wrapperContained.prevFoodLevel; }
// public int foodTickTimer() { return wrapperContained.foodTickTimer; }
// public int foodLevel() { return wrapperContained.foodLevel; }
public int getPrevFoodLevel() { return wrapperContained.getPrevFoodLevel(); }
public void setExhaustion(float exhaustion) { wrapperContained.setExhaustion(exhaustion); }
public float getExhaustion() { return wrapperContained.getExhaustion(); }
// public void addInternal(int nutrition,float saturation) { wrapperContained.addInternal(nutrition,saturation); }
public void eat(yarnwrap.component.type.FoodComponent foodComponent) { wrapperContained.eat(foodComponent.wrapperContained); }
public void setFoodLevel(int foodLevel) { wrapperContained.setFoodLevel(foodLevel); }
public void setSaturationLevel(float saturationLevel) { wrapperContained.setSaturationLevel(saturationLevel); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
public void addExhaustion(float exhaustion) { wrapperContained.addExhaustion(exhaustion); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public void add(int food,float saturationModifier) { wrapperContained.add(food,saturationModifier); }
public int getFoodLevel() { return wrapperContained.getFoodLevel(); }
public boolean isNotFull() { return wrapperContained.isNotFull(); }
public void update(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.update(player.wrapperContained); }
public float getSaturationLevel() { return wrapperContained.getSaturationLevel(); }

}