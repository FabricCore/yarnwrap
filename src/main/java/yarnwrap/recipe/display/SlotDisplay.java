package yarnwrap.recipe.display;
public class SlotDisplay { public net.minecraft.recipe.display.SlotDisplay wrapperContained; public SlotDisplay(net.minecraft.recipe.display.SlotDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.recipe.display.SlotDisplay.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.recipe.display.SlotDisplay.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.recipe.display.SlotDisplay.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.recipe.display.SlotDisplay.PACKET_CODEC = value.wrapperContained; }

public Object serializer() { return wrapperContained.serializer(); }
// public static Object serializer() { return net.minecraft.recipe.display.SlotDisplay.serializer(); }
public boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet features) { return wrapperContained.isEnabled(features.wrapperContained); }
// public static boolean isEnabled(yarnwrap.resource.featuretoggle.FeatureSet features, ) { return net.minecraft.recipe.display.SlotDisplay.isEnabled(features.wrapperContained); }
public java.util.List getStacks(yarnwrap.util.context.ContextParameterMap parameters) { return wrapperContained.getStacks(parameters.wrapperContained); }
// public static java.util.List getStacks(yarnwrap.util.context.ContextParameterMap parameters, ) { return net.minecraft.recipe.display.SlotDisplay.getStacks(parameters.wrapperContained); }
public java.util.stream.Stream appendStacks(yarnwrap.util.context.ContextParameterMap parameters,yarnwrap.recipe.display.DisplayedItemFactory factory) { return wrapperContained.appendStacks(parameters.wrapperContained,factory.wrapperContained); }
// public static java.util.stream.Stream appendStacks(yarnwrap.util.context.ContextParameterMap parameters,yarnwrap.recipe.display.DisplayedItemFactory factory, ) { return net.minecraft.recipe.display.SlotDisplay.appendStacks(parameters.wrapperContained,factory.wrapperContained); }
public yarnwrap.item.ItemStack getFirst(yarnwrap.util.context.ContextParameterMap context) { return new yarnwrap.item.ItemStack(wrapperContained.getFirst(context.wrapperContained)); }
// public static yarnwrap.item.ItemStack getFirst(yarnwrap.util.context.ContextParameterMap context, ) { return new yarnwrap.item.ItemStack(net.minecraft.recipe.display.SlotDisplay.getFirst(context.wrapperContained)); }

}