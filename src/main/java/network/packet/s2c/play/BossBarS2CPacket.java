package yarnwrap.network.packet.s2c.play;
public class BossBarS2CPacket { public net.minecraft.network.packet.s2c.play.BossBarS2CPacket wrapperContained; public BossBarS2CPacket(net.minecraft.network.packet.s2c.play.BossBarS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public Object action() { return wrapperContained.action; }
// public Object REMOVE_ACTION() { return wrapperContained.REMOVE_ACTION; }
// public int DARKEN_SKY_MASK() { return wrapperContained.DARKEN_SKY_MASK; }
// public int DRAGON_MUSIC_MASK() { return wrapperContained.DRAGON_MUSIC_MASK; }
// public int THICKEN_FOG_MASK() { return wrapperContained.THICKEN_FOG_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.network.packet.s2c.play.BossBarS2CPacket add(yarnwrap.entity.boss.BossBar bar) { return new yarnwrap.network.packet.s2c.play.BossBarS2CPacket(wrapperContained.add(bar.wrapperContained)); }
public yarnwrap.network.packet.s2c.play.BossBarS2CPacket remove(java.util.UUID uuid) { return new yarnwrap.network.packet.s2c.play.BossBarS2CPacket(wrapperContained.remove(uuid)); }
// public void accept(Object consumer) { wrapperContained.accept(consumer); }
public yarnwrap.network.packet.s2c.play.BossBarS2CPacket updateProgress(yarnwrap.entity.boss.BossBar bar) { return new yarnwrap.network.packet.s2c.play.BossBarS2CPacket(wrapperContained.updateProgress(bar.wrapperContained)); }
// public int maskProperties(boolean darkenSky,boolean dragonMusic,boolean thickenFog) { return wrapperContained.maskProperties(darkenSky,dragonMusic,thickenFog); }
public yarnwrap.network.packet.s2c.play.BossBarS2CPacket updateName(yarnwrap.entity.boss.BossBar bar) { return new yarnwrap.network.packet.s2c.play.BossBarS2CPacket(wrapperContained.updateName(bar.wrapperContained)); }
public yarnwrap.network.packet.s2c.play.BossBarS2CPacket updateStyle(yarnwrap.entity.boss.BossBar bar) { return new yarnwrap.network.packet.s2c.play.BossBarS2CPacket(wrapperContained.updateStyle(bar.wrapperContained)); }
public yarnwrap.network.packet.s2c.play.BossBarS2CPacket updateProperties(yarnwrap.entity.boss.BossBar bar) { return new yarnwrap.network.packet.s2c.play.BossBarS2CPacket(wrapperContained.updateProperties(bar.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}