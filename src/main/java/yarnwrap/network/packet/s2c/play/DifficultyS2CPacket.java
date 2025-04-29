package yarnwrap.network.packet.s2c.play;
public class DifficultyS2CPacket { public net.minecraft.network.packet.s2c.play.DifficultyS2CPacket wrapperContained; public DifficultyS2CPacket(net.minecraft.network.packet.s2c.play.DifficultyS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
// public static yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.difficulty); }
// public static void difficulty(yarnwrap.world.Difficulty value, ) { net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.difficulty = value.wrapperContained; }

// public boolean difficultyLocked() { return wrapperContained.difficultyLocked; }
// public void difficultyLocked(boolean value) { wrapperContained.difficultyLocked = value; }
// public static boolean difficultyLocked() { return net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.difficultyLocked; }
// public static void difficultyLocked(boolean value, ) { net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.difficultyLocked = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.CODEC = value.wrapperContained; }

public DifficultyS2CPacket(yarnwrap.world.Difficulty difficulty,boolean difficultyLocked) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.DifficultyS2CPacket(difficulty.wrapperContained,difficultyLocked); }
// public DifficultyS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.DifficultyS2CPacket(buf.wrapperContained); }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
// public static boolean isDifficultyLocked() { return net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.isDifficultyLocked(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public static yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.getDifficulty()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.write(buf.wrapperContained); }

}