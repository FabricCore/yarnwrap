package yarnwrap.network.packet.s2c.custom;
public class DebugGoalSelectorCustomPayload { public net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload wrapperContained; public DebugGoalSelectorCustomPayload(net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload.CODEC = value.wrapperContained; }

// public Object ID() { return wrapperContained.ID; }
// // public void ID(Object value) { wrapperContained.ID = value; }
// public static Object ID() { return net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload.ID; }
// // public static void ID(Object value, ) { net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload.ID = value; }

// public DebugGoalSelectorCustomPayload(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload(buf.wrapperContained); }
// public void method_53034(yarnwrap.network.PacketByteBuf buf,Object goal) { wrapperContained.method_53034(buf.wrapperContained,goal); }
// public static void method_53034(yarnwrap.network.PacketByteBuf buf,Object goal, ) { net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload.method_53034(buf.wrapperContained,goal); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.custom.DebugGoalSelectorCustomPayload.write(buf.wrapperContained); }

}