package yarnwrap.network.packet.s2c.play;
public class CooldownUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket wrapperContained; public CooldownUpdateS2CPacket(net.minecraft.network.packet.s2c.play.CooldownUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.Item item() { return new yarnwrap.item.Item(wrapperContained.item); }
// public void item(yarnwrap.item.Item value) { wrapperContained.item = value.wrapperContained; }
// public int cooldown() { return wrapperContained.cooldown; }
// public void cooldown(int value) { wrapperContained.cooldown = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public yarnwrap.item.Item item() { return new yarnwrap.item.Item(wrapperContained.item()); }
// public int cooldown() { return wrapperContained.cooldown(); }

}