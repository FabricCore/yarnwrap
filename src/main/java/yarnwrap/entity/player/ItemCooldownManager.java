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

public void remove(yarnwrap.util.Identifier groupId) { wrapperContained.remove(groupId.wrapperContained); }
// public static void remove(yarnwrap.util.Identifier groupId, ) { net.minecraft.entity.player.ItemCooldownManager.remove(groupId.wrapperContained); }
// public void onCooldownUpdate(yarnwrap.util.Identifier groupId) { wrapperContained.onCooldownUpdate(groupId.wrapperContained); }
// public static void onCooldownUpdate(yarnwrap.util.Identifier groupId, ) { net.minecraft.entity.player.ItemCooldownManager.onCooldownUpdate(groupId.wrapperContained); }
// public void onCooldownUpdate(yarnwrap.util.Identifier groupId,int duration) { wrapperContained.onCooldownUpdate(groupId.wrapperContained,duration); }
// public static void onCooldownUpdate(yarnwrap.util.Identifier groupId,int duration, ) { net.minecraft.entity.player.ItemCooldownManager.onCooldownUpdate(groupId.wrapperContained,duration); }
public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.entity.player.ItemCooldownManager.update(); }
public boolean isCoolingDown(yarnwrap.item.ItemStack stack) { return wrapperContained.isCoolingDown(stack.wrapperContained); }
// public static boolean isCoolingDown(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.player.ItemCooldownManager.isCoolingDown(stack.wrapperContained); }
public float getCooldownProgress(yarnwrap.item.ItemStack stack,float tickProgress) { return wrapperContained.getCooldownProgress(stack.wrapperContained,tickProgress); }
// public static float getCooldownProgress(yarnwrap.item.ItemStack stack,float tickProgress, ) { return net.minecraft.entity.player.ItemCooldownManager.getCooldownProgress(stack.wrapperContained,tickProgress); }
public void set(yarnwrap.util.Identifier groupId,int duration) { wrapperContained.set(groupId.wrapperContained,duration); }
// public static void set(yarnwrap.util.Identifier groupId,int duration, ) { net.minecraft.entity.player.ItemCooldownManager.set(groupId.wrapperContained,duration); }
public void set(yarnwrap.item.ItemStack stack,int duration) { wrapperContained.set(stack.wrapperContained,duration); }
// public static void set(yarnwrap.item.ItemStack stack,int duration, ) { net.minecraft.entity.player.ItemCooldownManager.set(stack.wrapperContained,duration); }
public yarnwrap.util.Identifier getGroup(yarnwrap.item.ItemStack stack) { return new yarnwrap.util.Identifier(wrapperContained.getGroup(stack.wrapperContained)); }
// public static yarnwrap.util.Identifier getGroup(yarnwrap.item.ItemStack stack, ) { return new yarnwrap.util.Identifier(net.minecraft.entity.player.ItemCooldownManager.getGroup(stack.wrapperContained)); }

}