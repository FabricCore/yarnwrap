package yarnwrap.network.packet.s2c.play;
public class OpenScreenS2CPacket { public net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket wrapperContained; public OpenScreenS2CPacket(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.syncId = value; }

// public yarnwrap.screen.ScreenHandlerType screenHandlerId() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.screenHandlerId); }
// public void screenHandlerId(yarnwrap.screen.ScreenHandlerType value) { wrapperContained.screenHandlerId = value.wrapperContained; }
// public static yarnwrap.screen.ScreenHandlerType screenHandlerId() { return new yarnwrap.screen.ScreenHandlerType(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.screenHandlerId); }
// public static void screenHandlerId(yarnwrap.screen.ScreenHandlerType value, ) { net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.screenHandlerId = value.wrapperContained; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.name = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.CODEC = value.wrapperContained; }

public OpenScreenS2CPacket(int syncId,yarnwrap.screen.ScreenHandlerType screenHandlerId,yarnwrap.text.Text name) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket(syncId,screenHandlerId.wrapperContained,name.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.getSyncId(); }
public yarnwrap.screen.ScreenHandlerType getScreenHandlerType() { return new yarnwrap.screen.ScreenHandlerType(wrapperContained.getScreenHandlerType()); }
// public static yarnwrap.screen.ScreenHandlerType getScreenHandlerType() { return new yarnwrap.screen.ScreenHandlerType(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.getScreenHandlerType()); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket.getName()); }

}