package yarnwrap.network.packet.s2c.play;
public class CommonPlayerSpawnInfo { public net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo wrapperContained; public CommonPlayerSpawnInfo(net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.gameMode); }
// public static void gameMode(yarnwrap.world.GameMode value, ) { net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.gameMode = value.wrapperContained; }

// public yarnwrap.world.GameMode prevGameMode() { return new yarnwrap.world.GameMode(wrapperContained.prevGameMode); }
// public void prevGameMode(yarnwrap.world.GameMode value) { wrapperContained.prevGameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode prevGameMode() { return new yarnwrap.world.GameMode(net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.prevGameMode); }
// public static void prevGameMode(yarnwrap.world.GameMode value, ) { net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.prevGameMode = value.wrapperContained; }

public CommonPlayerSpawnInfo(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo(buf.wrapperContained); }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode()); }
// // public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.gameMode()); }
// public yarnwrap.world.GameMode prevGameMode() { return new yarnwrap.world.GameMode(wrapperContained.prevGameMode()); }
// // public static yarnwrap.world.GameMode prevGameMode() { return new yarnwrap.world.GameMode(net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.prevGameMode()); }
public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo.write(buf.wrapperContained); }

}