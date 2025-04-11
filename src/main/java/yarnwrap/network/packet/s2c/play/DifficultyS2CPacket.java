package yarnwrap.network.packet.s2c.play;
public class DifficultyS2CPacket { public net.minecraft.network.packet.s2c.play.DifficultyS2CPacket wrapperContained; public DifficultyS2CPacket(net.minecraft.network.packet.s2c.play.DifficultyS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
// public boolean difficultyLocked() { return wrapperContained.difficultyLocked; }
// public void difficultyLocked(boolean value) { wrapperContained.difficultyLocked = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}