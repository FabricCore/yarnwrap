package yarnwrap.entity.passive;
public class LlamaEntity { public net.minecraft.entity.passive.LlamaEntity wrapperContained; public LlamaEntity(net.minecraft.entity.passive.LlamaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_STRENGTH() { return wrapperContained.MAX_STRENGTH; }
// public void MAX_STRENGTH(int value) { wrapperContained.MAX_STRENGTH = value; }
// public static int MAX_STRENGTH() { return net.minecraft.entity.passive.LlamaEntity.MAX_STRENGTH; }
// public static void MAX_STRENGTH(int value, ) { net.minecraft.entity.passive.LlamaEntity.MAX_STRENGTH = value; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.LlamaEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.LlamaEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.LlamaEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.LlamaEntity.VARIANT = value.wrapperContained; }

// public yarnwrap.entity.passive.LlamaEntity follower() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.follower); }
// public void follower(yarnwrap.entity.passive.LlamaEntity value) { wrapperContained.follower = value.wrapperContained; }
// public static yarnwrap.entity.passive.LlamaEntity follower() { return new yarnwrap.entity.passive.LlamaEntity(net.minecraft.entity.passive.LlamaEntity.follower); }
// public static void follower(yarnwrap.entity.passive.LlamaEntity value, ) { net.minecraft.entity.passive.LlamaEntity.follower = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData STRENGTH() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STRENGTH); }
// public void STRENGTH(yarnwrap.entity.data.TrackedData value) { wrapperContained.STRENGTH = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData STRENGTH() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.LlamaEntity.STRENGTH); }
// public static void STRENGTH(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.LlamaEntity.STRENGTH = value.wrapperContained; }

// public boolean spit() { return wrapperContained.spit; }
// public void spit(boolean value) { wrapperContained.spit = value; }
// public static boolean spit() { return net.minecraft.entity.passive.LlamaEntity.spit; }
// public static void spit(boolean value, ) { net.minecraft.entity.passive.LlamaEntity.spit = value; }

// public yarnwrap.entity.passive.LlamaEntity following() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.following); }
// public void following(yarnwrap.entity.passive.LlamaEntity value) { wrapperContained.following = value.wrapperContained; }
// public static yarnwrap.entity.passive.LlamaEntity following() { return new yarnwrap.entity.passive.LlamaEntity(net.minecraft.entity.passive.LlamaEntity.following); }
// public static void following(yarnwrap.entity.passive.LlamaEntity value, ) { net.minecraft.entity.passive.LlamaEntity.following = value.wrapperContained; }

// public yarnwrap.entity.passive.LlamaEntity createChild() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.createChild()); }
// public static yarnwrap.entity.passive.LlamaEntity createChild() { return new yarnwrap.entity.passive.LlamaEntity(net.minecraft.entity.passive.LlamaEntity.createChild()); }
// public Object createLlamaAttributes() { return wrapperContained.createLlamaAttributes(); }
public static Object createLlamaAttributes() { return net.minecraft.entity.passive.LlamaEntity.createLlamaAttributes(); }
// public boolean method_58393(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58393(stack.wrapperContained); }
// public static boolean method_58393(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.passive.LlamaEntity.method_58393(stack.wrapperContained); }
public void follow(yarnwrap.entity.passive.LlamaEntity llama) { wrapperContained.follow(llama.wrapperContained); }
// public static void follow(yarnwrap.entity.passive.LlamaEntity llama, ) { net.minecraft.entity.passive.LlamaEntity.follow(llama.wrapperContained); }
// public void spitAt(yarnwrap.entity.LivingEntity target) { wrapperContained.spitAt(target.wrapperContained); }
// public static void spitAt(yarnwrap.entity.LivingEntity target, ) { net.minecraft.entity.passive.LlamaEntity.spitAt(target.wrapperContained); }
public boolean hasFollower() { return wrapperContained.hasFollower(); }
// public static boolean hasFollower() { return net.minecraft.entity.passive.LlamaEntity.hasFollower(); }
// public yarnwrap.util.DyeColor getColorFromCarpet(yarnwrap.item.ItemStack color) { return new yarnwrap.util.DyeColor(wrapperContained.getColorFromCarpet(color.wrapperContained)); }
// public static yarnwrap.util.DyeColor getColorFromCarpet(yarnwrap.item.ItemStack color, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.LlamaEntity.getColorFromCarpet(color.wrapperContained)); }
// public void initializeStrength(yarnwrap.util.math.random.Random random) { wrapperContained.initializeStrength(random.wrapperContained); }
// public static void initializeStrength(yarnwrap.util.math.random.Random random, ) { net.minecraft.entity.passive.LlamaEntity.initializeStrength(random.wrapperContained); }
public void stopFollowing() { wrapperContained.stopFollowing(); }
// public static void stopFollowing() { net.minecraft.entity.passive.LlamaEntity.stopFollowing(); }
public yarnwrap.util.DyeColor getCarpetColor() { return new yarnwrap.util.DyeColor(wrapperContained.getCarpetColor()); }
// public static yarnwrap.util.DyeColor getCarpetColor() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.LlamaEntity.getCarpetColor()); }
// public void setStrength(int strength) { wrapperContained.setStrength(strength); }
// public static void setStrength(int strength, ) { net.minecraft.entity.passive.LlamaEntity.setStrength(strength); }
public int getStrength() { return wrapperContained.getStrength(); }
// public static int getStrength() { return net.minecraft.entity.passive.LlamaEntity.getStrength(); }
public boolean isFollowing() { return wrapperContained.isFollowing(); }
// public static boolean isFollowing() { return net.minecraft.entity.passive.LlamaEntity.isFollowing(); }
public yarnwrap.entity.passive.LlamaEntity getFollowing() { return new yarnwrap.entity.passive.LlamaEntity(wrapperContained.getFollowing()); }
// public static yarnwrap.entity.passive.LlamaEntity getFollowing() { return new yarnwrap.entity.passive.LlamaEntity(net.minecraft.entity.passive.LlamaEntity.getFollowing()); }
public boolean isTrader() { return wrapperContained.isTrader(); }
// public static boolean isTrader() { return net.minecraft.entity.passive.LlamaEntity.isTrader(); }
// public void setSpit(boolean spit) { wrapperContained.setSpit(spit); }
// public static void setSpit(boolean spit, ) { net.minecraft.entity.passive.LlamaEntity.setSpit(spit); }

}