package yarnwrap.server.command;
public class DatapackCommand { public net.minecraft.server.command.DatapackCommand wrapperContained; public DatapackCommand(net.minecraft.server.command.DatapackCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.suggestion.SuggestionProvider DISABLED_CONTAINERS_SUGGESTION_PROVIDER() { return wrapperContained.DISABLED_CONTAINERS_SUGGESTION_PROVIDER; }
// public void DISABLED_CONTAINERS_SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.DISABLED_CONTAINERS_SUGGESTION_PROVIDER = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_DATAPACK_EXCEPTION() { return wrapperContained.UNKNOWN_DATAPACK_EXCEPTION; }
// public void UNKNOWN_DATAPACK_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_DATAPACK_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_ENABLED_EXCEPTION() { return wrapperContained.ALREADY_ENABLED_EXCEPTION; }
// public void ALREADY_ENABLED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.ALREADY_ENABLED_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_DISABLED_EXCEPTION() { return wrapperContained.ALREADY_DISABLED_EXCEPTION; }
// public void ALREADY_DISABLED_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.ALREADY_DISABLED_EXCEPTION = value; }
// public com.mojang.brigadier.suggestion.SuggestionProvider ENABLED_CONTAINERS_SUGGESTION_PROVIDER() { return wrapperContained.ENABLED_CONTAINERS_SUGGESTION_PROVIDER; }
// public void ENABLED_CONTAINERS_SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.ENABLED_CONTAINERS_SUGGESTION_PROVIDER = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NO_FLAGS_EXCEPTION() { return wrapperContained.NO_FLAGS_EXCEPTION; }
// public void NO_FLAGS_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.NO_FLAGS_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType CANNOT_DISABLE_FEATURE_EXCEPTION() { return wrapperContained.CANNOT_DISABLE_FEATURE_EXCEPTION; }
// public void CANNOT_DISABLE_FEATURE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.CANNOT_DISABLE_FEATURE_EXCEPTION = value; }
// public int method_13111(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13111(context); }
// public void method_13112(com.mojang.brigadier.context.CommandContext profiles,java.util.List profile) { wrapperContained.method_13112(profiles,profile); }
// public int executeEnable(yarnwrap.server.command.ServerCommandSource source,yarnwrap.resource.ResourcePackProfile container,Object packAdder) { return wrapperContained.executeEnable(source.wrapperContained,container.wrapperContained,packAdder); }
// public int method_13115(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13115(context); }
// public int method_13116(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13116(context); }
// public com.mojang.brigadier.Message method_13117(java.lang.Object name) { return wrapperContained.method_13117(name); }
// public int method_13118(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13118(context); }
// public boolean method_13119(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.method_13119(source.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_13120(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13120(context,builder); }
// public int executeList(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeList(source.wrapperContained); }
// public void method_13122(java.util.List profiles,yarnwrap.resource.ResourcePackProfile profile) { wrapperContained.method_13122(profiles,profile.wrapperContained); }
// public int method_13123(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13123(context); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeListEnabled(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeListEnabled(source.wrapperContained); }
// public yarnwrap.resource.ResourcePackProfile getPackContainer(com.mojang.brigadier.context.CommandContext context,java.lang.String name,boolean enable) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.getPackContainer(context,name,enable)); }
// public int executeListAvailable(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeListAvailable(source.wrapperContained); }
// public int method_13130(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13130(context); }
// public com.mojang.brigadier.Message method_13131(java.lang.Object name) { return wrapperContained.method_13131(name); }
// public yarnwrap.text.Text method_13132(yarnwrap.resource.ResourcePackProfile profile) { return new yarnwrap.text.Text(wrapperContained.method_13132(profile.wrapperContained)); }
// public void method_13133(com.mojang.brigadier.context.CommandContext profiles,java.util.List profile) { wrapperContained.method_13133(profiles,profile); }
// public yarnwrap.text.Text method_13134(yarnwrap.resource.ResourcePackProfile profile) { return new yarnwrap.text.Text(wrapperContained.method_13134(profile.wrapperContained)); }
// public com.mojang.brigadier.Message method_13135(java.lang.Object name) { return wrapperContained.method_13135(name); }
// public java.util.concurrent.CompletableFuture method_13136(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_13136(context,builder); }
// public int method_13137(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13137(context); }
// public int method_13138(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13138(context); }
// public void method_13139(java.util.List profiles,yarnwrap.resource.ResourcePackProfile profile) { wrapperContained.method_13139(profiles,profile.wrapperContained); }
// public int executeDisable(yarnwrap.server.command.ServerCommandSource source,yarnwrap.resource.ResourcePackProfile container) { return wrapperContained.executeDisable(source.wrapperContained,container.wrapperContained); }
// public int method_13141(com.mojang.brigadier.context.CommandContext context) { return wrapperContained.method_13141(context); }
// public boolean method_29477(java.util.Collection profile) { return wrapperContained.method_29477(profile); }
// public boolean method_29776(java.util.Collection name) { return wrapperContained.method_29776(name); }
// public boolean method_45145(yarnwrap.resource.featuretoggle.FeatureSet profile) { return wrapperContained.method_45145(profile.wrapperContained); }
// public com.mojang.brigadier.Message method_45146(java.lang.Object name,java.lang.Object flags) { return wrapperContained.method_45146(name,flags); }
// public com.mojang.brigadier.Message method_58142(java.lang.Object name) { return wrapperContained.method_58142(name); }

}