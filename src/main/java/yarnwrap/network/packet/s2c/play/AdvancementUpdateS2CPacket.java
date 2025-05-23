package yarnwrap.network.packet.s2c.play;
public class AdvancementUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket wrapperContained; public AdvancementUpdateS2CPacket(net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set toRemove() { return wrapperContained.toRemove; }
// public void toRemove(java.util.Set value) { wrapperContained.toRemove = value; }
// public static java.util.Set toRemove() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.toRemove; }
// public static void toRemove(java.util.Set value, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.toRemove = value; }

// public java.util.Map toSetProgress() { return wrapperContained.toSetProgress; }
// public void toSetProgress(java.util.Map value) { wrapperContained.toSetProgress = value; }
// public static java.util.Map toSetProgress() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.toSetProgress; }
// public static void toSetProgress(java.util.Map value, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.toSetProgress = value; }

// public java.util.List toEarn() { return wrapperContained.toEarn; }
// public void toEarn(java.util.List value) { wrapperContained.toEarn = value; }
// public static java.util.List toEarn() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.toEarn; }
// public static void toEarn(java.util.List value, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.toEarn = value; }

// public boolean clearCurrent() { return wrapperContained.clearCurrent; }
// public void clearCurrent(boolean value) { wrapperContained.clearCurrent = value; }
// public static boolean clearCurrent() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.clearCurrent; }
// public static void clearCurrent(boolean value, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.clearCurrent = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.CODEC = value.wrapperContained; }

// public boolean showToast() { return wrapperContained.showToast; }
// public void showToast(boolean value) { wrapperContained.showToast = value; }
// public static boolean showToast() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.showToast; }
// public static void showToast(boolean value, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.showToast = value; }

// public AdvancementUpdateS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket(buf.wrapperContained); }
public AdvancementUpdateS2CPacket(boolean clearCurrent,java.util.Collection toEarn,java.util.Set toRemove,java.util.Map toSetProgress,boolean showToast) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket(clearCurrent,toEarn,toRemove,toSetProgress,showToast); }
public boolean shouldClearCurrent() { return wrapperContained.shouldClearCurrent(); }
// public static boolean shouldClearCurrent() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.shouldClearCurrent(); }
public java.util.Set getAdvancementIdsToRemove() { return wrapperContained.getAdvancementIdsToRemove(); }
// public static java.util.Set getAdvancementIdsToRemove() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.getAdvancementIdsToRemove(); }
public java.util.Map getAdvancementsToProgress() { return wrapperContained.getAdvancementsToProgress(); }
// public static java.util.Map getAdvancementsToProgress() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.getAdvancementsToProgress(); }
public java.util.List getAdvancementsToEarn() { return wrapperContained.getAdvancementsToEarn(); }
// public static java.util.List getAdvancementsToEarn() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.getAdvancementsToEarn(); }
// public void method_34197(yarnwrap.network.PacketByteBuf buf2,yarnwrap.advancement.AdvancementProgress progress) { wrapperContained.method_34197(buf2.wrapperContained,progress.wrapperContained); }
// public static void method_34197(yarnwrap.network.PacketByteBuf buf2,yarnwrap.advancement.AdvancementProgress progress, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.method_34197(buf2.wrapperContained,progress.wrapperContained); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.write(buf.wrapperContained); }
public boolean shouldShowToast() { return wrapperContained.shouldShowToast(); }
// public static boolean shouldShowToast() { return net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket.shouldShowToast(); }

}