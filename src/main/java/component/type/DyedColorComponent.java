package yarnwrap.component.type;
public class DyedColorComponent { public net.minecraft.component.type.DyedColorComponent wrapperContained; public DyedColorComponent(net.minecraft.component.type.DyedColorComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public int DEFAULT_COLOR() { return wrapperContained.DEFAULT_COLOR; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
public int getColor(yarnwrap.item.ItemStack stack,int defaultColor) { return wrapperContained.getColor(stack.wrapperContained,defaultColor); }
public yarnwrap.item.ItemStack setColor(yarnwrap.item.ItemStack stack,java.util.List dyes) { return new yarnwrap.item.ItemStack(wrapperContained.setColor(stack.wrapperContained,dyes)); }
public yarnwrap.component.type.DyedColorComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.DyedColorComponent(wrapperContained.withShowInTooltip(showInTooltip)); }

}