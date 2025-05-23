package yarnwrap.network.packet.s2c.play;
public class CooldownUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket wrapperContained; public CooldownUpdateS2CPacket(net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
// public static int cooldown() { return net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket.cooldown; }
// public static void cooldown(int value, ) { net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket.cooldown = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket.CODEC = value.wrapperContained; }

// public int cooldown() { return wrapperContained.cooldown(); }
// // public static int cooldown() { return net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket.cooldown(); }

}