package yarnwrap.network.packet.c2s.play;
public class UpdateDifficultyC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket wrapperContained; public UpdateDifficultyC2SPacket(net.minecraft.network.packet.c2s.play.UpdateDifficultyC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}