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
// public int method_13029(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13029(context); }
// public int getPlayers(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.getPlayers(source.wrapperContained,bossBar.wrapperContained); }
// public int setPlayers(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,java.util.Collection players) { return wrapperContained.setPlayers(source.wrapperContained,bossBar.wrapperContained,players); }
// public int method_13032(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13032(context); }
// public int method_13033(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13033(context); }
// public int method_13034(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13034(context); }
// public boolean method_13035(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13035(source.wrapperContained); }
// public int setValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,int value) { return wrapperContained.setValue(source.wrapperContained,bossBar.wrapperContained,value); }
// public int method_13037(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13037(context); }
// public int method_13038(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13038(context); }
// public int method_13039(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13039(context); }
// public int method_13040(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13040(context); }
// public int isVisible(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.isVisible(source.wrapperContained,bossBar.wrapperContained); }
// public int method_13042(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13042(context); }
// public int method_13043(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13043(context); }
// public java.util.concurrent.CompletableFuture method_13044(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13044(context,builder); }
// public int listBossBars(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.listBossBars(source.wrapperContained); }
// public int method_13046(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13046(context); }
// public int method_13047(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13047(context); }
// public int method_13048(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13048(context); }
// public int addBossBar(yarnwrap.server.command.ServerCommandSource source,yarnwrap.util.Identifier name,yarnwrap.text.Text displayName) { return wrapperContained.addBossBar(source.wrapperContained,name.wrapperContained,displayName.wrapperContained); }
// public int setStyle(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,Object style) { return wrapperContained.setStyle(source.wrapperContained,bossBar.wrapperContained,style); }
// public int method_13051(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13051(context); }
// public int method_13052(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13052(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.command.CommandRegistryAccess registryAccess) { wrapperContained.register(dispatcher,registryAccess.wrapperContained); }
// public yarnwrap.entity.boss.CommandBossBar getBossBar(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.entity.boss.CommandBossBar(wrapperContained.getBossBar(context)); }
// public int method_13055(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13055(context); }
// public int getMaxValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.getMaxValue(source.wrapperContained,bossBar.wrapperContained); }
// public int method_13057(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13057(context); }
// public int method_13058(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13058(context); }
// public com.mojang.brigadier.Message method_13059(java.lang.Object name) { return wrapperContained.method_13059(name); }
// public int method_13060(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13060(context); }
// public int method_13061(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13061(context); }
// public int method_13062(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13062(context); }
// public com.mojang.brigadier.Message method_13063(java.lang.Object name) { return wrapperContained.method_13063(name); }
// public int method_13064(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13064(context); }
// public int getValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.getValue(source.wrapperContained,bossBar.wrapperContained); }
// public int setMaxValue(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,int value) { return wrapperContained.setMaxValue(source.wrapperContained,bossBar.wrapperContained,value); }
// public int method_13067(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13067(context); }
// public int setVisible(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,boolean visible) { return wrapperContained.setVisible(source.wrapperContained,bossBar.wrapperContained,visible); }
// public int removeBossBar(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar) { return wrapperContained.removeBossBar(source.wrapperContained,bossBar.wrapperContained); }
// public int method_13070(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13070(context); }
// public int setName(yarnwrap.server.command.ServerCommandSource source,yarnwrap.entity.boss.CommandBossBar bossBar,yarnwrap.text.Text name) { return wrapperContained.setName(source.wrapperContained,bossBar.wrapperContained,name.wrapperContained); }
// public int method_13072(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13072(context); }

}