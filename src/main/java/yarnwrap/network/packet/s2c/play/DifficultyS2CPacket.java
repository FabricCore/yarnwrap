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

// // public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty()); }
// // public static yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.difficulty()); }
// // public boolean difficultyLocked() { return wrapperContained.difficultyLocked(); }
// // public static boolean difficultyLocked() { return net.minecraft.network.packet.s2c.play.DifficultyS2CPacket.difficultyLocked(); }

}