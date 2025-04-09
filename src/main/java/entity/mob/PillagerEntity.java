package yarnwrap.entity.mob;
public class PillagerEntity { public net.minecraft.entity.mob.PillagerEntity wrapperContained; public PillagerEntity(net.minecraft.entity.mob.PillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGING); }
// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
public Object createPillagerAttributes() { return wrapperContained.createPillagerAttributes(); }
public boolean isCharging() { return wrapperContained.isCharging(); }
// public boolean isRaidCaptain(yarnwrap.item.ItemStack stack) { return wrapperContained.isRaidCaptain(stack.wrapperContained); }

}