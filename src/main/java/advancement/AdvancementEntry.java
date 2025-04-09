package yarnwrap.advancement;
public class AdvancementEntry { public net.minecraft.advancement.AdvancementEntry wrapperContained; public AdvancementEntry(net.minecraft.advancement.AdvancementEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public yarnwrap.advancement.Advancement value() { return new yarnwrap.advancement.Advancement(wrapperContained.value); }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec LIST_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LIST_PACKET_CODEC); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// public yarnwrap.advancement.Advancement value() { return new yarnwrap.advancement.Advancement(wrapperContained.value()); }

}