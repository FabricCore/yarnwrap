package yarnwrap.item;
public class Equipment { public net.minecraft.item.Equipment wrapperContained; public Equipment(net.minecraft.item.Equipment wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry getEquipSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEquipSound()); }
public yarnwrap.util.TypedActionResult equipAndSwap(yarnwrap.item.Item item,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity user,yarnwrap.util.Hand hand) { return new yarnwrap.util.TypedActionResult(wrapperContained.equipAndSwap(item.wrapperContained,world.wrapperContained,user.wrapperContained,hand.wrapperContained)); }
// public yarnwrap.item.Equipment fromStack(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.Equipment(wrapperContained.fromStack(stack.wrapperContained)); }
public yarnwrap.entity.EquipmentSlot getSlotType() { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getSlotType()); }

}