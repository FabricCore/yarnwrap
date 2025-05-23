package yarnwrap.entity.boss;
public class BossBarManager { public net.minecraft.entity.boss.BossBarManager wrapperContained; public BossBarManager(net.minecraft.entity.boss.BossBarManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map commandBossBars() { return wrapperContained.commandBossBars; }
// public void commandBossBars(java.util.Map value) { wrapperContained.commandBossBars = value; }
// public static java.util.Map commandBossBars() { return net.minecraft.entity.boss.BossBarManager.commandBossBars; }
// public static void commandBossBars(java.util.Map value, ) { net.minecraft.entity.boss.BossBarManager.commandBossBars = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.boss.BossBarManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.boss.BossBarManager.LOGGER = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.boss.BossBarManager.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.boss.BossBarManager.CODEC = value; }

public java.util.Collection getIds() { return wrapperContained.getIds(); }
// public static java.util.Collection getIds() { return net.minecraft.entity.boss.BossBarManager.getIds(); }
public java.util.Collection getAll() { return wrapperContained.getAll(); }
// public static java.util.Collection getAll() { return net.minecraft.entity.boss.BossBarManager.getAll(); }
public yarnwrap.entity.boss.CommandBossBar add(yarnwrap.util.Identifier id,yarnwrap.text.Text displayName) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.add(id.wrapperContained,displayName.wrapperContained)); }
// public static yarnwrap.entity.boss.CommandBossBar add(yarnwrap.util.Identifier id,yarnwrap.text.Text displayName, ) { return new yarnwrap.entity.boss.CommandBossBar(net.minecraft.entity.boss.BossBarManager.add(id.wrapperContained,displayName.wrapperContained)); }
public yarnwrap.entity.boss.CommandBossBar get(yarnwrap.util.Identifier id) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.get(id.wrapperContained)); }
// public static yarnwrap.entity.boss.CommandBossBar get(yarnwrap.util.Identifier id, ) { return new yarnwrap.entity.boss.CommandBossBar(net.minecraft.entity.boss.BossBarManager.get(id.wrapperContained)); }
// public void readNbt(yarnwrap.nbt.NbtCompound nbt,Object registries) { wrapperContained.readNbt(nbt.wrapperContained,registries); }
// public static void readNbt(yarnwrap.nbt.NbtCompound nbt,Object registries, ) { net.minecraft.entity.boss.BossBarManager.readNbt(nbt.wrapperContained,registries); }
public void remove(yarnwrap.entity.boss.CommandBossBar bossBar) { wrapperContained.remove(bossBar.wrapperContained); }
// public static void remove(yarnwrap.entity.boss.CommandBossBar bossBar, ) { net.minecraft.entity.boss.BossBarManager.remove(bossBar.wrapperContained); }
// public yarnwrap.nbt.NbtCompound toNbt(Object registries) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(registries)); }
// public static yarnwrap.nbt.NbtCompound toNbt(Object registries, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.entity.boss.BossBarManager.toNbt(registries)); }
public void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnect(player.wrapperContained); }
// public static void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.BossBarManager.onPlayerConnect(player.wrapperContained); }
public void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerDisconnect(player.wrapperContained); }
// public static void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.BossBarManager.onPlayerDisconnect(player.wrapperContained); }
// public void method_67562(yarnwrap.util.Identifier id,Object serialized) { wrapperContained.method_67562(id.wrapperContained,serialized); }
// public static void method_67562(yarnwrap.util.Identifier id,Object serialized, ) { net.minecraft.entity.boss.BossBarManager.method_67562(id.wrapperContained,serialized); }
// public void method_67563(java.lang.String error) { wrapperContained.method_67563(error); }
// public static void method_67563(java.lang.String error, ) { net.minecraft.entity.boss.BossBarManager.method_67563(error); }

}