package yarnwrap.entity.boss;
public class BossBarManager { public net.minecraft.entity.boss.BossBarManager wrapperContained; public BossBarManager(net.minecraft.entity.boss.BossBarManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map commandBossBars() { return wrapperContained.commandBossBars; }
public java.util.Collection getIds() { return wrapperContained.getIds(); }
public java.util.Collection getAll() { return wrapperContained.getAll(); }
public yarnwrap.entity.boss.CommandBossBar add(yarnwrap.util.Identifier id,yarnwrap.text.Text displayName) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.add(id.wrapperContained,displayName.wrapperContained)); }
public yarnwrap.entity.boss.CommandBossBar get(yarnwrap.util.Identifier id) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.get(id.wrapperContained)); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
public void remove(yarnwrap.entity.boss.CommandBossBar bossBar) { wrapperContained.remove(bossBar.wrapperContained); }
// public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnect(player.wrapperContained); }
public void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerDisconnect(player.wrapperContained); }

}