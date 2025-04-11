package yarnwrap.advancement;
public class Advancement { public net.minecraft.advancement.Advancement wrapperContained; public Advancement(net.minecraft.advancement.Advancement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec CRITERIA_CODEC() { return wrapperContained.CRITERIA_CODEC; }
// public void CRITERIA_CODEC(com.mojang.serialization.Codec value) { wrapperContained.CRITERIA_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.text.Text getNameFromIdentity(yarnwrap.advancement.AdvancementEntry identifiedAdvancement) { return new yarnwrap.text.Text(wrapperContained.getNameFromIdentity(identifiedAdvancement.wrapperContained)); }
// public yarnwrap.text.Text createNameFromDisplay(yarnwrap.advancement.AdvancementDisplay display) { return new yarnwrap.text.Text(wrapperContained.createNameFromDisplay(display.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public boolean isRoot() { return wrapperContained.isRoot(); }
// public yarnwrap.advancement.Advancement read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.advancement.Advancement(wrapperContained.read(buf.wrapperContained)); }
// public com.mojang.serialization.DataResult validate(yarnwrap.advancement.Advancement advancement) { return wrapperContained.validate(advancement.wrapperContained); }
// public void validate(yarnwrap.util.ErrorReporter errorReporter,Object lookup) { wrapperContained.validate(errorReporter.wrapperContained,lookup); }

}