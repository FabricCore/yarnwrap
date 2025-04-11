package yarnwrap.command.suggestion;
public class SuggestionProviders { public net.minecraft.command.suggestion.SuggestionProviders wrapperContained; public SuggestionProviders(net.minecraft.command.suggestion.SuggestionProviders wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier ASK_SERVER_NAME() { return new yarnwrap.util.Identifier(wrapperContained.ASK_SERVER_NAME); }
// public void ASK_SERVER_NAME(yarnwrap.util.Identifier value) { wrapperContained.ASK_SERVER_NAME = value.wrapperContained; }
// public java.util.Map REGISTRY() { return wrapperContained.REGISTRY; }
// public void REGISTRY(java.util.Map value) { wrapperContained.REGISTRY = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider ALL_RECIPES() { return wrapperContained.ALL_RECIPES; }
// public void ALL_RECIPES(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.ALL_RECIPES = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider ASK_SERVER() { return wrapperContained.ASK_SERVER; }
// public void ASK_SERVER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.ASK_SERVER = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider AVAILABLE_SOUNDS() { return wrapperContained.AVAILABLE_SOUNDS; }
// public void AVAILABLE_SOUNDS(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.AVAILABLE_SOUNDS = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider SUMMONABLE_ENTITIES() { return wrapperContained.SUMMONABLE_ENTITIES; }
// public void SUMMONABLE_ENTITIES(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUMMONABLE_ENTITIES = value; }
public com.mojang.brigadier.suggestion.SuggestionProvider register(yarnwrap.util.Identifier id,com.mojang.brigadier.suggestion.SuggestionProvider provider) { return wrapperContained.register(id.wrapperContained,provider); }
public com.mojang.brigadier.suggestion.SuggestionProvider byId(yarnwrap.util.Identifier id) { return wrapperContained.byId(id.wrapperContained); }
public com.mojang.brigadier.suggestion.SuggestionProvider getLocalProvider(com.mojang.brigadier.suggestion.SuggestionProvider provider) { return wrapperContained.getLocalProvider(provider); }
public yarnwrap.util.Identifier computeId(com.mojang.brigadier.suggestion.SuggestionProvider provider) { return new yarnwrap.util.Identifier(wrapperContained.computeId(provider)); }

}