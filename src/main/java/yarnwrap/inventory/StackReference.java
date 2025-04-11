package yarnwrap.inventory;
public class StackReference { public net.minecraft.inventory.StackReference wrapperContained; public StackReference(net.minecraft.inventory.StackReference wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.StackReference EMPTY() { return new yarnwrap.inventory.StackReference(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.inventory.StackReference value) { wrapperContained.EMPTY = value.wrapperContained; }
public yarnwrap.item.ItemStack get() { return new yarnwrap.item.ItemStack(wrapperContained.get()); }
// public yarnwrap.inventory.StackReference of(yarnwrap.inventory.Inventory inventory,int index) { return new yarnwrap.inventory.StackReference(wrapperContained.of(inventory.wrapperContained,index)); }
// public yarnwrap.inventory.StackReference of(yarnwrap.inventory.Inventory inventory,int index,java.util.function.Predicate stackFilter) { return new yarnwrap.inventory.StackReference(wrapperContained.of(inventory.wrapperContained,index,stackFilter)); }
// public yarnwrap.inventory.StackReference of(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot) { return new yarnwrap.inventory.StackReference(wrapperContained.of(entity.wrapperContained,slot.wrapperContained)); }
// public yarnwrap.inventory.StackReference of(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.EquipmentSlot slot,java.util.function.Predicate filter) { return new yarnwrap.inventory.StackReference(wrapperContained.of(entity.wrapperContained,slot.wrapperContained,filter)); }
public boolean set(yarnwrap.item.ItemStack stack) { return wrapperContained.set(stack.wrapperContained); }
// public boolean method_32333(yarnwrap.item.ItemStack stack) { return wrapperContained.method_32333(stack.wrapperContained); }
// public boolean method_32334(yarnwrap.item.ItemStack stack) { return wrapperContained.method_32334(stack.wrapperContained); }
// public yarnwrap.inventory.StackReference of(java.util.function.Supplier getter,java.util.function.Consumer setter) { return new yarnwrap.inventory.StackReference(wrapperContained.of(getter,setter)); }

}