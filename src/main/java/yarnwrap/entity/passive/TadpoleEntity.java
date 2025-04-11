package yarnwrap.entity.passive;
public class TadpoleEntity { public net.minecraft.entity.passive.TadpoleEntity wrapperContained; public TadpoleEntity(net.minecraft.entity.passive.TadpoleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_TADPOLE_AGE() { return wrapperContained.MAX_TADPOLE_AGE; }
public void MAX_TADPOLE_AGE(int value) { wrapperContained.MAX_TADPOLE_AGE = value; }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public void SENSORS(com.google.common.collect.ImmutableList value) { wrapperContained.SENSORS = value; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public void MEMORY_MODULES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULES = value; }
// public int tadpoleAge() { return wrapperContained.tadpoleAge; }
// public void tadpoleAge(int value) { wrapperContained.tadpoleAge = value; }
public float WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(float value) { wrapperContained.WIDTH = value; }
public float HEIGHT() { return wrapperContained.HEIGHT; }
// public void HEIGHT(float value) { wrapperContained.HEIGHT = value; }
// public void eatSlimeBall(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.eatSlimeBall(player.wrapperContained,stack.wrapperContained); }
// public void increaseAge(int seconds) { wrapperContained.increaseAge(seconds); }
// public void decrementItem(yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack) { wrapperContained.decrementItem(player.wrapperContained,stack.wrapperContained); }
// public void setTadpoleAge(int tadpoleAge) { wrapperContained.setTadpoleAge(tadpoleAge); }
public Object createTadpoleAttributes() { return wrapperContained.createTadpoleAttributes(); }
// public int getTadpoleAge() { return wrapperContained.getTadpoleAge(); }
// public void growUp() { wrapperContained.growUp(); }
// public int getTicksUntilGrowth() { return wrapperContained.getTicksUntilGrowth(); }
// public boolean isFrogFood(yarnwrap.item.ItemStack stack) { return wrapperContained.isFrogFood(stack.wrapperContained); }

}