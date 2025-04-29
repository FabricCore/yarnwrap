package yarnwrap.entity.player;
public class ItemCooldownManager { public net.minecraft.entity.player.ItemCooldownManager wrapperContained; public ItemCooldownManager(net.minecraft.entity.player.ItemCooldownManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entries() { return wrapperContained.entries; }
// public void entries(java.util.Map value) { wrapperContained.entries = value; }
// public static java.util.Map entries() { return net.minecraft.entity.player.ItemCooldownManager.entries; }
// public static void entries(java.util.Map value, ) { net.minecraft.entity.player.ItemCooldownManager.entries = value; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public static int tick() { return net.minecraft.entity.player.ItemCooldownManager.tick; }
// public static void tick(int value, ) { net.minecraft.entity.player.ItemCooldownManager.tick = value; }

public void remove(yarnwrap.item.Item item) { wrapperContained.remove(item.wrapperContained); }
// public static void remove(yarnwrap.item.Item item, ) { net.minecraft.entity.player.ItemCooldownManager.remove(item.wrapperContained); }
// public void onCooldownUpdate(yarnwrap.item.Item item) { wrapperContained.onCooldownUpdate(item.wrapperContained); }
// public static void onCooldownUpdate(yarnwrap.item.Item item, ) { net.minecraft.entity.player.ItemCooldownManager.onCooldownUpdate(item.wrapperContained); }
// public void onCooldownUpdate(yarnwrap.item.Item item,int duration) { wrapperContained.onCooldownUpdate(item.wrapperContained,duration); }
// public static void onCooldownUpdate(yarnwrap.item.Item item,int duration, ) { net.minecraft.entity.player.ItemCooldownManager.onCooldownUpdate(item.wrapperContained,duration); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.entity.player.ItemCooldownManager.update(); }
public boolean isCoolingDown(yarnwrap.item.Item item) { return wrapperContained.isCoolingDown(item.wrapperContained); }
// public static boolean isCoolingDown(yarnwrap.item.Item item, ) { return net.minecraft.entity.player.ItemCooldownManager.isCoolingDown(item.wrapperContained); }
public float getCooldownProgress(yarnwrap.item.Item item,float tickDelta) { return wrapperContained.getCooldownProgress(item.wrapperContained,tickDelta); }
// public static float getCooldownProgress(yarnwrap.item.Item item,float tickDelta, ) { return net.minecraft.entity.player.ItemCooldownManager.getCooldownProgress(item.wrapperContained,tickDelta); }
public void set(yarnwrap.item.Item item,int duration) { wrapperContained.set(item.wrapperContained,duration); }
// public static void set(yarnwrap.item.Item item,int duration, ) { net.minecraft.entity.player.ItemCooldownManager.set(item.wrapperContained,duration); }

}