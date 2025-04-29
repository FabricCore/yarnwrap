package yarnwrap.network.packet.c2s.play;
public class UpdateDifficultyLockC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket wrapperContained; public UpdateDifficultyLockC2SPacket(net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean difficultyLocked() { return wrapperContained.difficultyLocked; }
// public void difficultyLocked(boolean value) { wrapperContained.difficultyLocked = value; }
// public static boolean difficultyLocked() { return net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket.difficultyLocked; }
// public static void difficultyLocked(boolean value, ) { net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket.difficultyLocked = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket.CODEC = value.wrapperContained; }

// public UpdateDifficultyLockC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket(buf.wrapperContained); }
public UpdateDifficultyLockC2SPacket(boolean difficultyLocked) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket(difficultyLocked); }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
// public static boolean isDifficultyLocked() { return net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket.isDifficultyLocked(); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.UpdateDifficultyLockC2SPacket.write(buf.wrapperContained); }

}