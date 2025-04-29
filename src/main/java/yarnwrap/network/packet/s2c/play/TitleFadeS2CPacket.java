package yarnwrap.network.packet.s2c.play;
public class TitleFadeS2CPacket { public net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket wrapperContained; public TitleFadeS2CPacket(net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fadeInTicks() { return wrapperContained.fadeInTicks; }
// public void fadeInTicks(int value) { wrapperContained.fadeInTicks = value; }
// public static int fadeInTicks() { return net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.fadeInTicks; }
// public static void fadeInTicks(int value, ) { net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.fadeInTicks = value; }

// public int stayTicks() { return wrapperContained.stayTicks; }
// public void stayTicks(int value) { wrapperContained.stayTicks = value; }
// public static int stayTicks() { return net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.stayTicks; }
// public static void stayTicks(int value, ) { net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.stayTicks = value; }

// public int fadeOutTicks() { return wrapperContained.fadeOutTicks; }
// public void fadeOutTicks(int value) { wrapperContained.fadeOutTicks = value; }
// public static int fadeOutTicks() { return net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.fadeOutTicks; }
// public static void fadeOutTicks(int value, ) { net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.fadeOutTicks = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.CODEC = value.wrapperContained; }

public TitleFadeS2CPacket(int fadeInTicks,int stayTicks,int fadeOutTicks) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket(fadeInTicks,stayTicks,fadeOutTicks); }
// public TitleFadeS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket(buf.wrapperContained); }
public int getFadeInTicks() { return wrapperContained.getFadeInTicks(); }
// public static int getFadeInTicks() { return net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.getFadeInTicks(); }
public int getStayTicks() { return wrapperContained.getStayTicks(); }
// public static int getStayTicks() { return net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.getStayTicks(); }
public int getFadeOutTicks() { return wrapperContained.getFadeOutTicks(); }
// public static int getFadeOutTicks() { return net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.getFadeOutTicks(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.TitleFadeS2CPacket.write(buf.wrapperContained); }

}