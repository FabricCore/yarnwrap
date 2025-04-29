package yarnwrap.advancement;
public class AdvancementEntry { public net.minecraft.advancement.AdvancementEntry wrapperContained; public AdvancementEntry(net.minecraft.advancement.AdvancementEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.advancement.AdvancementEntry.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.advancement.AdvancementEntry.id = value.wrapperContained; }

// public yarnwrap.advancement.Advancement value() { return new yarnwrap.advancement.Advancement(wrapperContained.value); }
// public void value(yarnwrap.advancement.Advancement value) { wrapperContained.value = value.wrapperContained; }
// public static yarnwrap.advancement.Advancement value() { return new yarnwrap.advancement.Advancement(net.minecraft.advancement.AdvancementEntry.value); }
// public static void value(yarnwrap.advancement.Advancement value, ) { net.minecraft.advancement.AdvancementEntry.value = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.advancement.AdvancementEntry.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.advancement.AdvancementEntry.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LIST_PACKET_CODEC); }
// public void LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LIST_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.advancement.AdvancementEntry.LIST_PACKET_CODEC); }
// public static void LIST_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.advancement.AdvancementEntry.LIST_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// // public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.advancement.AdvancementEntry.id()); }
// public yarnwrap.advancement.Advancement value() { return new yarnwrap.advancement.Advancement(wrapperContained.value()); }
// // public static yarnwrap.advancement.Advancement value() { return new yarnwrap.advancement.Advancement(net.minecraft.advancement.AdvancementEntry.value()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.advancement.AdvancementEntry.equals(o); }

}