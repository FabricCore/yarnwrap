package yarnwrap.network.packet.c2s.play;
public class UpdateDifficultyC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket wrapperContained; public UpdateDifficultyC2SPacket(net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
// public static yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket.difficulty); }
// public static void difficulty(yarnwrap.world.Difficulty value, ) { net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket.difficulty = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket.CODEC = value.wrapperContained; }

public UpdateDifficultyC2SPacket(yarnwrap.world.Difficulty difficulty) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket(difficulty.wrapperContained); }
// public UpdateDifficultyC2SPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket(buf.wrapperContained); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public static yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket.getDifficulty()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket.write(buf.wrapperContained); }

}