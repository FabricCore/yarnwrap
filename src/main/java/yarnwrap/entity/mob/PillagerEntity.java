package yarnwrap.entity.mob;
public class PillagerEntity { public net.minecraft.entity.mob.PillagerEntity wrapperContained; public PillagerEntity(net.minecraft.entity.mob.PillagerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CHARGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGING); }
// public void CHARGING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHARGING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CHARGING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.PillagerEntity.CHARGING); }
// public static void CHARGING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.PillagerEntity.CHARGING = value.wrapperContained; }

// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.SimpleInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public static yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(net.minecraft.entity.mob.PillagerEntity.inventory); }
// public static void inventory(yarnwrap.inventory.SimpleInventory value, ) { net.minecraft.entity.mob.PillagerEntity.inventory = value.wrapperContained; }

public boolean isCharging() { return wrapperContained.isCharging(); }
// public static boolean isCharging() { return net.minecraft.entity.mob.PillagerEntity.isCharging(); }
// public boolean isRaidCaptain(yarnwrap.item.ItemStack stack) { return wrapperContained.isRaidCaptain(stack.wrapperContained); }
// public static boolean isRaidCaptain(yarnwrap.item.ItemStack stack, ) { return net.minecraft.entity.mob.PillagerEntity.isRaidCaptain(stack.wrapperContained); }
// public Object createPillagerAttributes() { return wrapperContained.createPillagerAttributes(); }
public static Object createPillagerAttributes() { return net.minecraft.entity.mob.PillagerEntity.createPillagerAttributes(); }

}