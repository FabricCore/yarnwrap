package yarnwrap.entity.passive;
public class TadpoleEntity { public net.minecraft.entity.passive.TadpoleEntity wrapperContained; public TadpoleEntity(net.minecraft.entity.passive.TadpoleEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_TADPOLE_AGE() { return wrapperContained.MAX_TADPOLE_AGE; }
// public com.google.common.collect.ImmutableList SENSORS() { return wrapperContained.SENSORS; }
// public com.google.common.collect.ImmutableList MEMORY_MODULES() { return wrapperContained.MEMORY_MODULES; }
// public int tadpoleAge() { return wrapperContained.tadpoleAge; }
public float WIDTH() { return wrapperContained.WIDTH; }
public float HEIGHT() { return wrapperContained.HEIGHT; }
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