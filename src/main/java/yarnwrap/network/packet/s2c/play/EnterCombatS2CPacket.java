package yarnwrap.network.packet.s2c.play;
public class EnterCombatS2CPacket { public net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket wrapperContained; public EnterCombatS2CPacket(net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket INSTANCE() { return new yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket(net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket.INSTANCE); }
// public static void INSTANCE(yarnwrap.network.packet.s2c.play.EnterCombatS2CPacket value, ) { net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket.INSTANCE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EnterCombatS2CPacket.CODEC = value.wrapperContained; }


}