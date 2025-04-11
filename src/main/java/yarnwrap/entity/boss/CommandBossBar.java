package yarnwrap.entity.boss;
public class CommandBossBar { public net.minecraft.entity.boss.CommandBossBar wrapperContained; public CommandBossBar(net.minecraft.entity.boss.CommandBossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set playerUuids() { return wrapperContained.playerUuids; }
// public void playerUuids(java.util.Set value) { wrapperContained.playerUuids = value; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public int maxValue() { return wrapperContained.maxValue; }
// public void maxValue(int value) { wrapperContained.maxValue = value; }
// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
public void setValue(int value) { wrapperContained.setValue(value); }
public int getValue() { return wrapperContained.getValue(); }
public void setMaxValue(int maxValue) { wrapperContained.setMaxValue(maxValue); }
public void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnect(player.wrapperContained); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public int getMaxValue() { return wrapperContained.getMaxValue(); }
public void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerDisconnect(player.wrapperContained); }
public boolean addPlayers(java.util.Collection players) { return wrapperContained.addPlayers(players); }
// public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public void addPlayer(java.util.UUID uuid) { wrapperContained.addPlayer(uuid); }
public yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(wrapperContained.toHoverableText()); }
// public yarnwrap.entity.boss.CommandBossBar fromNbt(yarnwrap.nbt.NbtCompound nbt,yarnwrap.util.Identifier id) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.fromNbt(nbt.wrapperContained,id.wrapperContained)); }

}