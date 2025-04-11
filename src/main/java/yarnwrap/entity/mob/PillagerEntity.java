package yarnwrap.entity.mob;
public class PillagerEntity { public net.minecraft.entity.mob.PillagerEntity wrapperContained; public PillagerEntity(net.minecraft.entity.mob.PillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGING); }
// public void CHARGING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHARGING = value.wrapperContained; }
// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.SimpleInventory value) { wrapperContained.inventory = value.wrapperContained; }
public Object createPillagerAttributes() { return wrapperContained.createPillagerAttributes(); }
public boolean isCharging() { return wrapperContained.isCharging(); }
// public boolean isRaidCaptain(yarnwrap.item.ItemStack stack) { return wrapperContained.isRaidCaptain(stack.wrapperContained); }

}