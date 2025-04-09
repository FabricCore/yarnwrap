package yarnwrap.network.packet.s2c.play;
public class CommonPlayerSpawnInfo { public net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo wrapperContained; public CommonPlayerSpawnInfo(net.minecraft.network.packet.s2c.play.CommonPlayerSpawnInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public yarnwrap.world.GameMode prevGameMode() { return new yarnwrap.world.GameMode(wrapperContained.prevGameMode); }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode()); }
// public yarnwrap.world.GameMode prevGameMode() { return new yarnwrap.world.GameMode(wrapperContained.prevGameMode()); }
public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}