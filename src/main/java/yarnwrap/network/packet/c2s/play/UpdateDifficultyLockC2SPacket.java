package yarnwrap.network.packet.c2s.play;
public class UpdateDifficultyLockC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket wrapperContained; public UpdateDifficultyLockC2SPacket(net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean difficultyLocked() { return wrapperContained.difficultyLocked; }
// public void difficultyLocked(boolean value) { wrapperContained.difficultyLocked = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}