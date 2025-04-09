package yarnwrap.entity.passive;
public class LlamaEntity { public net.minecraft.entity.passive.LlamaEntity wrapperContained; public LlamaEntity(net.minecraft.entity.passive.LlamaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_STRENGTH() { return wrapperContained.MAX_STRENGTH; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public yarnwrap.entity.passive.LlamaEntity follower() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.follower); }
// public yarnwrap.entity.data.TrackedData STRENGTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STRENGTH); }
// public boolean spit() { return wrapperContained.spit; }
// public yarnwrap.entity.passive.LlamaEntity following() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.following); }
// public yarnwrap.entity.passive.LlamaEntity createChild() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.createChild()); }
public Object createLlamaAttributes() { return wrapperContained.createLlamaAttributes(); }
public void follow(yarnwrap.entity.passive.LlamaEntity llama) { wrapperContained.follow(llama.wrapperContained); }
// public void spitAt(yarnwrap.entity.LivingEntity target) { wrapperContained.spitAt(target.wrapperContained); }
public boolean hasFollower() { return wrapperContained.hasFollower(); }
// public yarnwrap.util.DyeColor getColorFromCarpet(yarnwrap.item.ItemStack color) { return new yarnwrap.util.DyeColor(wrapperContained.getColorFromCarpet(color.wrapperContained)); }
// public void initializeStrength(yarnwrap.util.math.random.Random random) { wrapperContained.initializeStrength(random.wrapperContained); }
public void stopFollowing() { wrapperContained.stopFollowing(); }
public yarnwrap.util.DyeColor getCarpetColor() { return new yarnwrap.util.DyeColor(wrapperContained.getCarpetColor()); }
// public void setStrength(int strength) { wrapperContained.setStrength(strength); }
public int getStrength() { return wrapperContained.getStrength(); }
public boolean isFollowing() { return wrapperContained.isFollowing(); }
public yarnwrap.entity.passive.LlamaEntity getFollowing() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.getFollowing()); }
public boolean isTrader() { return wrapperContained.isTrader(); }
// public void setSpit(boolean spit) { wrapperContained.setSpit(spit); }

}