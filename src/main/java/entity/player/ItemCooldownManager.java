package yarnwrap.entity.player;
public class ItemCooldownManager { public net.minecraft.entity.player.ItemCooldownManager wrapperContained; public ItemCooldownManager(net.minecraft.entity.player.ItemCooldownManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map entries() { return wrapperContained.entries; }
// public int tick() { return wrapperContained.tick; }
public void remove(yarnwrap.item.Item item) { wrapperContained.remove(item.wrapperContained); }
// public void onCooldownUpdate(yarnwrap.item.Item item) { wrapperContained.onCooldownUpdate(item.wrapperContained); }
// public void onCooldownUpdate(yarnwrap.item.Item item,int duration) { wrapperContained.onCooldownUpdate(item.wrapperContained,duration); }
public void update() { wrapperContained.update(); }
public boolean isCoolingDown(yarnwrap.item.Item item) { return wrapperContained.isCoolingDown(item.wrapperContained); }
public float getCooldownProgress(yarnwrap.item.Item item,float tickDelta) { return wrapperContained.getCooldownProgress(item.wrapperContained,tickDelta); }
public void set(yarnwrap.item.Item item,int duration) { wrapperContained.set(item.wrapperContained,duration); }

}