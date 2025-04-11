package yarnwrap.entity.passive;
public class LlamaEntity { public net.minecraft.entity.passive.LlamaEntity wrapperContained; public LlamaEntity(net.minecraft.entity.passive.LlamaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_STRENGTH() { return wrapperContained.MAX_STRENGTH; }
// public void MAX_STRENGTH(int value) { wrapperContained.MAX_STRENGTH = value; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public yarnwrap.entity.passive.LlamaEntity follower() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.follower); }
// public void follower(yarnwrap.entity.passive.LlamaEntity value) { wrapperContained.follower = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData STRENGTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STRENGTH); }
// public void STRENGTH(yarnwrap.entity.data.TrackedData value) { wrapperContained.STRENGTH = value.wrapperContained; }
// public boolean spit() { return wrapperContained.spit; }
// public void spit(boolean value) { wrapperContained.spit = value; }
// public yarnwrap.entity.passive.LlamaEntity following() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.following); }
// public void following(yarnwrap.entity.passive.LlamaEntity value) { wrapperContained.following = value.wrapperContained; }
// public yarnwrap.entity.passive.LlamaEntity createChild() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.createChild()); }
public Object createLlamaAttributes() { return wrapperContained.createLlamaAttributes(); }
// public boolean method_58393(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58393(stack.wrapperContained); }
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