package yarnwrap.network.packet.s2c.play;
public class AdvancementUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket wrapperContained; public AdvancementUpdateS2CPacket(net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set toRemove() { return wrapperContained.toRemove; }
// public void toRemove(java.util.Set value) { wrapperContained.toRemove = value; }
// public java.util.Map toSetProgress() { return wrapperContained.toSetProgress; }
// public void toSetProgress(java.util.Map value) { wrapperContained.toSetProgress = value; }
// public java.util.List toEarn() { return wrapperContained.toEarn; }
// public void toEarn(java.util.List value) { wrapperContained.toEarn = value; }
// public boolean clearCurrent() { return wrapperContained.clearCurrent; }
// public void clearCurrent(boolean value) { wrapperContained.clearCurrent = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public boolean shouldClearCurrent() { return wrapperContained.shouldClearCurrent(); }
public java.util.Set getAdvancementIdsToRemove() { return wrapperContained.getAdvancementIdsToRemove(); }
public java.util.Map getAdvancementsToProgress() { return wrapperContained.getAdvancementsToProgress(); }
public java.util.List getAdvancementsToEarn() { return wrapperContained.getAdvancementsToEarn(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}