package yarnwrap.entity.boss;
public class CommandBossBar { public net.minecraft.entity.boss.CommandBossBar wrapperContained; public CommandBossBar(net.minecraft.entity.boss.CommandBossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set playerUuids() { return wrapperContained.playerUuids; }
// public void playerUuids(java.util.Set value) { wrapperContained.playerUuids = value; }
// public static java.util.Set playerUuids() { return net.minecraft.entity.boss.CommandBossBar.playerUuids; }
// public static void playerUuids(java.util.Set value, ) { net.minecraft.entity.boss.CommandBossBar.playerUuids = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.entity.boss.CommandBossBar.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.entity.boss.CommandBossBar.id = value.wrapperContained; }

// public int maxValue() { return wrapperContained.maxValue; }
// public void maxValue(int value) { wrapperContained.maxValue = value; }
// public static int maxValue() { return net.minecraft.entity.boss.CommandBossBar.maxValue; }
// public static void maxValue(int value, ) { net.minecraft.entity.boss.CommandBossBar.maxValue = value; }

// public int value() { return wrapperContained.value; }
// public void value(int value) { wrapperContained.value = value; }
// public static int value() { return net.minecraft.entity.boss.CommandBossBar.value; }
// public static void value(int value, ) { net.minecraft.entity.boss.CommandBossBar.value = value; }

// public int DEFAULT_MAX_VALUE() { return wrapperContained.DEFAULT_MAX_VALUE; }
// public void DEFAULT_MAX_VALUE(int value) { wrapperContained.DEFAULT_MAX_VALUE = value; }
// public static int DEFAULT_MAX_VALUE() { return net.minecraft.entity.boss.CommandBossBar.DEFAULT_MAX_VALUE; }
// public static void DEFAULT_MAX_VALUE(int value, ) { net.minecraft.entity.boss.CommandBossBar.DEFAULT_MAX_VALUE = value; }

public CommandBossBar(yarnwrap.util.Identifier id,yarnwrap.text.Text displayName) { this.wrapperContained = new net.minecraft.entity.boss.CommandBossBar(id.wrapperContained,displayName.wrapperContained); }
public void setValue(int value) { wrapperContained.setValue(value); }
// public static void setValue(int value, ) { net.minecraft.entity.boss.CommandBossBar.setValue(value); }
public int getValue() { return wrapperContained.getValue(); }
// public static int getValue() { return net.minecraft.entity.boss.CommandBossBar.getValue(); }
public void setMaxValue(int maxValue) { wrapperContained.setMaxValue(maxValue); }
// public static void setMaxValue(int maxValue, ) { net.minecraft.entity.boss.CommandBossBar.setMaxValue(maxValue); }
public void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerConnect(player.wrapperContained); }
// public static void onPlayerConnect(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.CommandBossBar.onPlayerConnect(player.wrapperContained); }
// public yarnwrap.text.Style method_12958(yarnwrap.text.Style style) { return new yarnwrap.text.Style(wrapperContained.method_12958(style.wrapperContained)); }
// public static yarnwrap.text.Style method_12958(yarnwrap.text.Style style, ) { return new yarnwrap.text.Style(net.minecraft.entity.boss.CommandBossBar.method_12958(style.wrapperContained)); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.entity.boss.CommandBossBar.getId()); }
public int getMaxValue() { return wrapperContained.getMaxValue(); }
// public static int getMaxValue() { return net.minecraft.entity.boss.CommandBossBar.getMaxValue(); }
public void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player) { wrapperContained.onPlayerDisconnect(player.wrapperContained); }
// public static void onPlayerDisconnect(yarnwrap.server.network.ServerPlayerEntity player, ) { net.minecraft.entity.boss.CommandBossBar.onPlayerDisconnect(player.wrapperContained); }
public boolean addPlayers(java.util.Collection players) { return wrapperContained.addPlayers(players); }
// public static boolean addPlayers(java.util.Collection players, ) { return net.minecraft.entity.boss.CommandBossBar.addPlayers(players); }
public void addPlayer(java.util.UUID uuid) { wrapperContained.addPlayer(uuid); }
// public static void addPlayer(java.util.UUID uuid, ) { net.minecraft.entity.boss.CommandBossBar.addPlayer(uuid); }
public yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(wrapperContained.toHoverableText()); }
// public static yarnwrap.text.Text toHoverableText() { return new yarnwrap.text.Text(net.minecraft.entity.boss.CommandBossBar.toHoverableText()); }
// public yarnwrap.entity.boss.CommandBossBar fromSerialized(yarnwrap.util.Identifier id,Object serialized) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.fromSerialized(id.wrapperContained,serialized)); }
// public static yarnwrap.entity.boss.CommandBossBar fromSerialized(yarnwrap.util.Identifier id,Object serialized, ) { return new yarnwrap.entity.boss.CommandBossBar(net.minecraft.entity.boss.CommandBossBar.fromSerialized(id.wrapperContained,serialized)); }
public Object toSerialized() { return wrapperContained.toSerialized(); }
// public static Object toSerialized() { return net.minecraft.entity.boss.CommandBossBar.toSerialized(); }

}