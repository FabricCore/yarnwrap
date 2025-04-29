package yarnwrap.entity.boss;
public class BossBarManager { public net.minecraft.entity.boss.BossBarManager wrapperContained; public BossBarManager(net.minecraft.entity.boss.BossBarManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map commandBossBars() { return wrapperContained.commandBossBars; }
// public void commandBossBars(java.util.Map value) { wrapperContained.commandBossBars = value; }
// public static java.util.Map commandBossBars() { return net.minecraft.entity.boss.BossBarManager.commandBossBars; }
// public static void commandBossBars(java.util.Map value, ) { net.minecraft.entity.boss.BossBarManager.commandBossBars = value; }

public java.util.Collection getIds() { return wrapperContained.getIds(); }
// public static java.util.Collection getIds() { return net.minecraft.entity.boss.BossBarManager.getIds(); }
public java.util.Collection getAll() { return wrapperContained.getAll(); }
// public static java.util.Collection getAll() { return net.minecraft.entity.boss.BossBarManager.getAll(); }
public yarnwrap.entity.boss.CommandBossBar add(yarnwrap.util.Identifier id,yarnwrap.text.Text displayName) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.add(id.wrapperContained,displayName.wrapperContained)); }
// public static yarnwrap.entity.boss.CommandBossBar add(yarnwrap.util.Identifier id,yarnwrap.text.Text displayName, ) { return new yarnwrap.entity.boss.CommandBossBar(net.minecraft.entity.boss.BossBarManager.add(id.wrapperContained,displayName.wrapperContained)); }
public yarnwrap.entity.boss.CommandBossBar get(yarnwrap.util.Identifier id) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.entity.boss.CommandBossBar get(yarnwrap.util.Identifier id, ) { return new yarnwrap.entity.boss.CommandBossBar(net.minecraft.entity.boss.BossBarManager.get(id.wrapperContained)); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.boss.BossBarManager.readNbt(nbt.wrapperContained); }
public void remove(yarnwrap.entity.boss.CommandBossBar bossBar) { wrapperContained.remove(bossBar.wrapperContained); }
// public static void remove(yarnwrap.entity.boss.CommandBossBar bossBar, ) { net.minecraft.entity.boss.BossBarManager.remove(bossBar.wrapperContained); }
// public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.boss.BossBarManager.toNbt()); }
public void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnect(player.wrapperContained); }
// public static void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.BossBarManager.onPlayerConnect(player.wrapperContained); }
public void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerDisconnect(player.wrapperContained); }
// public static void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.BossBarManager.onPlayerDisconnect(player.wrapperContained); }

}