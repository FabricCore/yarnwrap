package yarnwrap.network.packet.s2c.play;
public class AdvancementUpdateS2CPacket { public net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket wrapperContained; public AdvancementUpdateS2CPacket(net.minecraft.network.packet.s2c.play.AdvancementUpdateS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set toRemove() { return wrapperContained.toRemove; }
// public java.util.Map toSetProgress() { return wrapperContained.toSetProgress; }
// public java.util.List toEarn() { return wrapperContained.toEarn; }
// public boolean clearCurrent() { return wrapperContained.clearCurrent; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public boolean shouldClearCurrent() { return wrapperContained.shouldClearCurrent(); }
public java.util.Set getAdvancementIdsToRemove() { return wrapperContained.getAdvancementIdsToRemove(); }
public java.util.Map getAdvancementsToProgress() { return wrapperContained.getAdvancementsToProgress(); }
public java.util.List getAdvancementsToEarn() { return wrapperContained.getAdvancementsToEarn(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}