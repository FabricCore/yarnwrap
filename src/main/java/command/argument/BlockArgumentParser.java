package yarnwrap.command.argument;
public class BlockArgumentParser { public net.minecraft.command.argument.BlockArgumentParser wrapperContained; public BlockArgumentParser(net.minecraft.command.argument.BlockArgumentParser wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntryList tagId() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.tagId); }
// public java.util.function.Function SUGGEST_DEFAULT() { return wrapperContained.SUGGEST_DEFAULT; }
public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType INVALID_PROPERTY_EXCEPTION() { return wrapperContained.INVALID_PROPERTY_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNCLOSED_PROPERTIES_EXCEPTION() { return wrapperContained.UNCLOSED_PROPERTIES_EXCEPTION; }
// public java.util.Map tagProperties() { return wrapperContained.tagProperties; }
// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public boolean allowTag() { return wrapperContained.allowTag; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType EMPTY_PROPERTY_EXCEPTION() { return wrapperContained.EMPTY_PROPERTY_EXCEPTION; }
// public yarnwrap.state.StateManager stateFactory() { return new yarnwrap.state.StateManager(wrapperContained.stateFactory); }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_BLOCK_ID_EXCEPTION() { return wrapperContained.INVALID_BLOCK_ID_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType DISALLOWED_TAG_EXCEPTION() { return wrapperContained.DISALLOWED_TAG_EXCEPTION; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType DUPLICATE_PROPERTY_EXCEPTION() { return wrapperContained.DUPLICATE_PROPERTY_EXCEPTION; }
// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType UNKNOWN_PROPERTY_EXCEPTION() { return wrapperContained.UNKNOWN_PROPERTY_EXCEPTION; }
// public java.util.function.Function suggestions() { return wrapperContained.suggestions; }
// public yarnwrap.util.Identifier blockId() { return new yarnwrap.util.Identifier(wrapperContained.blockId); }
// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public java.util.Map blockProperties() { return wrapperContained.blockProperties; }
// public char PROPERTIES_OPENING() { return wrapperContained.PROPERTIES_OPENING; }
// public char NBT_OPENING() { return wrapperContained.NBT_OPENING; }
// public char PROPERTIES_CLOSING() { return wrapperContained.PROPERTIES_CLOSING; }
// public char PROPERTY_DEFINER() { return wrapperContained.PROPERTY_DEFINER; }
// public char PROPERTY_SEPARATOR() { return wrapperContained.PROPERTY_SEPARATOR; }
// public char TAG_PREFIX() { return wrapperContained.TAG_PREFIX; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_BLOCK_TAG_EXCEPTION() { return wrapperContained.UNKNOWN_BLOCK_TAG_EXCEPTION; }
// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public boolean allowSnbt() { return wrapperContained.allowSnbt; }
// public Object block(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader,boolean allowSnbt) { return wrapperContained.block(registryWrapper.wrapperContained,reader,allowSnbt); }
// public Object block(yarnwrap.registry.RegistryWrapper registryWrapper,java.lang.String string,boolean allowSnbt) { return wrapperContained.block(registryWrapper.wrapperContained,string,allowSnbt); }
// public com.mojang.datafixers.util.Either blockOrTag(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader,boolean allowSnbt) { return wrapperContained.blockOrTag(registryWrapper.wrapperContained,reader,allowSnbt); }
// public com.mojang.datafixers.util.Either blockOrTag(yarnwrap.registry.RegistryWrapper registryWrapper,java.lang.String string,boolean allowSnbt) { return wrapperContained.blockOrTag(registryWrapper.wrapperContained,string,allowSnbt); }
// public java.util.concurrent.CompletableFuture suggestBlockId(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestBlockId(builder); }
// public void parseBlockProperties() { wrapperContained.parseBlockProperties(); }
// public com.mojang.brigadier.suggestion.SuggestionsBuilder suggestPropertyValues(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,yarnwrap.state.property.Property property) { return wrapperContained.suggestPropertyValues(builder,property.wrapperContained); }
// public void stringifyProperty(java.lang.StringBuilder builder,yarnwrap.state.property.Property property,java.lang.Comparable value) { wrapperContained.stringifyProperty(builder,property.wrapperContained,value); }
// public java.util.concurrent.CompletableFuture suggestBlockProperties(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestBlockProperties(builder); }
public java.util.concurrent.CompletableFuture getSuggestions(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.suggestion.SuggestionsBuilder builder,boolean allowTag,boolean allowSnbt) { return wrapperContained.getSuggestions(registryWrapper.wrapperContained,builder,allowTag,allowSnbt); }
// public java.util.concurrent.CompletableFuture suggestTagProperties(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestTagProperties(builder); }
// public void parsePropertyValue(yarnwrap.state.property.Property property,java.lang.String value,int cursor) { wrapperContained.parsePropertyValue(property.wrapperContained,value,cursor); }
// public java.util.concurrent.CompletableFuture suggestIdentifiers(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestIdentifiers(builder); }
// public java.util.concurrent.CompletableFuture suggestBlockPropertiesOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestBlockPropertiesOrEnd(builder); }
// public void parseSnbt() { wrapperContained.parseSnbt(); }
// public java.util.concurrent.CompletableFuture suggestBlockOrTagId(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestBlockOrTagId(builder); }
// public java.util.concurrent.CompletableFuture suggestTagPropertiesOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestTagPropertiesOrEnd(builder); }
// public void parseBlockId() { wrapperContained.parseBlockId(); }
// public boolean hasBlockEntity() { return wrapperContained.hasBlockEntity(); }
// public void parseTagId() { wrapperContained.parseTagId(); }
// public void parse() { wrapperContained.parse(); }
// public java.util.concurrent.CompletableFuture suggestSnbtOrTagProperties(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestSnbtOrTagProperties(builder); }
// public void parseTagProperties() { wrapperContained.parseTagProperties(); }
// public java.util.concurrent.CompletableFuture suggestSnbtOrBlockProperties(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestSnbtOrBlockProperties(builder); }
public java.lang.String stringifyBlockState(yarnwrap.block.BlockState state) { return wrapperContained.stringifyBlockState(state.wrapperContained); }
// public java.util.concurrent.CompletableFuture suggestSnbt(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestSnbt(builder); }
// public java.util.concurrent.CompletableFuture suggestCommaOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestCommaOrEnd(builder); }
// public java.util.concurrent.CompletableFuture suggestTagPropertyValues(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.lang.String name) { return wrapperContained.suggestTagPropertyValues(builder,name); }
// public java.util.concurrent.CompletableFuture suggestEqualsCharacter(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestEqualsCharacter(builder); }

}