package yarnwrap.component.type;
public class EquippableComponent { public net.minecraft.component.type.EquippableComponent wrapperContained; public EquippableComponent(net.minecraft.component.type.EquippableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.EquippableComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.EquippableComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.EquippableComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.EquippableComponent.PACKET_CODEC = value.wrapperContained; }

public boolean allows(yarnwrap.entity.EntityType entityType) { return wrapperContained.allows(entityType.wrapperContained); }
// public static boolean allows(yarnwrap.entity.EntityType entityType, ) { return net.minecraft.component.type.EquippableComponent.allows(entityType.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_64016(Object instance) { return wrapperContained.method_64016(instance); }
// public static com.mojang.datafixers.kinds.App method_64016(Object instance, ) { return net.minecraft.component.type.EquippableComponent.method_64016(instance); }
// public yarnwrap.component.type.EquippableComponent ofCarpet(yarnwrap.util.DyeColor color) { return new yarnwrap.component.type.EquippableComponent(wrapperContained.ofCarpet(color.wrapperContained)); }
// public static yarnwrap.component.type.EquippableComponent ofCarpet(yarnwrap.util.DyeColor color, ) { return new yarnwrap.component.type.EquippableComponent(net.minecraft.component.type.EquippableComponent.ofCarpet(color.wrapperContained)); }
public yarnwrap.util.ActionResult equip(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.util.ActionResult(wrapperContained.equip(stack.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.util.ActionResult equip(yarnwrap.item.ItemStack stack,yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.util.ActionResult(net.minecraft.component.type.EquippableComponent.equip(stack.wrapperContained,player.wrapperContained)); }
// public Object builder(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.builder(slot.wrapperContained); }
// public static Object builder(yarnwrap.entity.EquipmentSlot slot, ) { return net.minecraft.component.type.EquippableComponent.builder(slot.wrapperContained); }
// public yarnwrap.component.type.EquippableComponent ofSaddle() { return new yarnwrap.component.type.EquippableComponent(wrapperContained.ofSaddle()); }
public static yarnwrap.component.type.EquippableComponent ofSaddle() { return new yarnwrap.component.type.EquippableComponent(net.minecraft.component.type.EquippableComponent.ofSaddle()); }
public yarnwrap.util.ActionResult equipOnInteract(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack) { return new yarnwrap.util.ActionResult(wrapperContained.equipOnInteract(player.wrapperContained,entity.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.util.ActionResult equipOnInteract(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.LivingEntity entity,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.util.ActionResult(net.minecraft.component.type.EquippableComponent.equipOnInteract(player.wrapperContained,entity.wrapperContained,stack.wrapperContained)); }
// public yarnwrap.component.type.EquippableComponent ofHarness(yarnwrap.util.DyeColor color) { return new yarnwrap.component.type.EquippableComponent(wrapperContained.ofHarness(color.wrapperContained)); }
// public static yarnwrap.component.type.EquippableComponent ofHarness(yarnwrap.util.DyeColor color, ) { return new yarnwrap.component.type.EquippableComponent(net.minecraft.component.type.EquippableComponent.ofHarness(color.wrapperContained)); }

}