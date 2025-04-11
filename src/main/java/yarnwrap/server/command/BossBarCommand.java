package yarnwrap.server.command;
public class BossBarCommand { public net.minecraft.server.command.BossBarCommand wrapperContained; public BossBarCommand(net.minecraft.server.command.BossBarCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_NAME_UNCHANGED_EXCEPTION() { return wrapperContained.SET_NAME_UNCHANGED_EXCEPTION; }
// public void SET_NAME_UNCHANGED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_NAME_UNCHANGED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_VALUE_UNCHANGED_EXCEPTION() { return wrapperContained.SET_VALUE_UNCHANGED_EXCEPTION; }
// public void SET_VALUE_UNCHANGED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_VALUE_UNCHANGED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType CREATE_FAILED_EXCEPTION() { return wrapperContained.CREATE_FAILED_EXCEPTION; }
// public void CREATE_FAILED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.CREATE_FAILED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_VISIBILITY_UNCHANGED_HIDDEN_EXCEPTION() { return wrapperContained.SET_VISIBILITY_UNCHANGED_HIDDEN_EXCEPTION; }
// public void SET_VISIBILITY_UNCHANGED_HIDDEN_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_VISIBILITY_UNCHANGED_HIDDEN_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_COLOR_UNCHANGED_EXCEPTION() { return wrapperContained.SET_COLOR_UNCHANGED_EXCEPTION; }
// public void SET_COLOR_UNCHANGED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_COLOR_UNCHANGED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_STYLE_UNCHANGED_EXCEPTION() { return wrapperContained.SET_STYLE_UNCHANGED_EXCEPTION; }
// public void SET_STYLE_UNCHANGED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_STYLE_UNCHANGED_EXCEPTION = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_PLAYERS_UNCHANGED_EXCEPTION() { return wrapperContained.SET_PLAYERS_UNCHANGED_EXCEPTION; }
// public void SET_PLAYERS_UNCHANGED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_PLAYERS_UNCHANGED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_MAX_UNCHANGED_EXCEPTION() { return wrapperContained.SET_MAX_UNCHANGED_EXCEPTION; }
// public void SET_MAX_UNCHANGED_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_MAX_UNCHANGED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType SET_VISIBILITY_UNCHANGED_VISIBLE_EXCEPTION() { return wrapperContained.SET_VISIBILITY_UNCHANGED_VISIBLE_EXCEPTION; }
// public void SET_VISIBILITY_UNCHANGED_VISIBLE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.SET_VISIBILITY_UNCHANGED_VISIBLE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_EXCEPTION() { return wrapperContained.UNKNOWN_EXCEPTION; }
// public void UNKNOWN_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_EXCEPTION = value; }
// public int setColor(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,Object color) { return wrapperContained.setColor(source.wrapperContained,bossBar.wrapperContained,color); }
// public int getPlayers(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.getPlayers(source.wrapperContained,bossBar.wrapperContained); }
// public int setPlayers(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,java.util.Collection players) { return wrapperContained.setPlayers(source.wrapperContained,bossBar.wrapperContained,players); }
// public int setValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,int value) { return wrapperContained.setValue(source.wrapperContained,bossBar.wrapperContained,value); }
// public int isVisible(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.isVisible(source.wrapperContained,bossBar.wrapperContained); }
// public int listBossBars(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.listBossBars(source.wrapperContained); }
// public int addBossBar(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier name,yarnwrap.text.Text displayName) { return wrapperContained.addBossBar(source.wrapperContained,name.wrapperContained,displayName.wrapperContained); }
// public int setStyle(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,Object style) { return wrapperContained.setStyle(source.wrapperContained,bossBar.wrapperContained,style); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public yarnwrap.entity.boss.CommandBossBar getBossBar(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.getBossBar(context)); }
// public int getMaxValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.getMaxValue(source.wrapperContained,bossBar.wrapperContained); }
// public int getValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.getValue(source.wrapperContained,bossBar.wrapperContained); }
// public int setMaxValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,int value) { return wrapperContained.setMaxValue(source.wrapperContained,bossBar.wrapperContained,value); }
// public int setVisible(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,boolean visible) { return wrapperContained.setVisible(source.wrapperContained,bossBar.wrapperContained,visible); }
// public int removeBossBar(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.removeBossBar(source.wrapperContained,bossBar.wrapperContained); }
// public int setName(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,yarnwrap.text.Text name) { return wrapperContained.setName(source.wrapperContained,bossBar.wrapperContained,name.wrapperContained); }

}