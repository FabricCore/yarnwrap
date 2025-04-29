package yarnwrap.component.type;
public class DyedColorComponent { public net.minecraft.component.type.DyedColorComponent wrapperContained; public DyedColorComponent(net.minecraft.component.type.DyedColorComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.DyedColorComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.DyedColorComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.DyedColorComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.DyedColorComponent.PACKET_CODEC = value.wrapperContained; }

// public int DEFAULT_COLOR() { return wrapperContained.DEFAULT_COLOR; }
// public void DEFAULT_COLOR(int value) { wrapperContained.DEFAULT_COLOR = value; }
public static int DEFAULT_COLOR() { return net.minecraft.component.type.DyedColorComponent.DEFAULT_COLOR; }
// public static void DEFAULT_COLOR(int value, ) { net.minecraft.component.type.DyedColorComponent.DEFAULT_COLOR = value; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.component.type.DyedColorComponent.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.DyedColorComponent.BASE_CODEC = value; }

// public com.mojang.datafixers.kinds.App method_57469(Object instance) { return wrapperContained.method_57469(instance); }
// public static com.mojang.datafixers.kinds.App method_57469(Object instance, ) { return net.minecraft.component.type.DyedColorComponent.method_57469(instance); }
// public int getColor(yarnwrap.item.ItemStack stack,int defaultColor) { return wrapperContained.getColor(stack.wrapperContained,defaultColor); }
// public static int getColor(yarnwrap.item.ItemStack stack,int defaultColor, ) { return net.minecraft.component.type.DyedColorComponent.getColor(stack.wrapperContained,defaultColor); }
// public yarnwrap.item.ItemStack setColor(yarnwrap.item.ItemStack stack,java.util.List dyes) { return new yarnwrap.item.ItemStack(wrapperContained.setColor(stack.wrapperContained,dyes)); }
// public static yarnwrap.item.ItemStack setColor(yarnwrap.item.ItemStack stack,java.util.List dyes, ) { return new yarnwrap.item.ItemStack(net.minecraft.component.type.DyedColorComponent.setColor(stack.wrapperContained,dyes)); }
// public yarnwrap.component.type.DyedColorComponent method_58112(java.lang.Integer rgb) { return new yarnwrap.component.type.DyedColorComponent(wrapperContained.method_58112(rgb)); }
// public static yarnwrap.component.type.DyedColorComponent method_58112(java.lang.Integer rgb, ) { return new yarnwrap.component.type.DyedColorComponent(net.minecraft.component.type.DyedColorComponent.method_58112(rgb)); }
public yarnwrap.component.type.DyedColorComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.DyedColorComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
// public static yarnwrap.component.type.DyedColorComponent withShowInTooltip(boolean showInTooltip, ) { return new yarnwrap.component.type.DyedColorComponent(net.minecraft.component.type.DyedColorComponent.withShowInTooltip(showInTooltip)); }

}