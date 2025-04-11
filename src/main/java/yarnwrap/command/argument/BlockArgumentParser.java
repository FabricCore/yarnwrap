package yarnwrap.command.argument;
public class BlockArgumentParser { public net.minecraft.command.argument.BlockArgumentParser wrapperContained; public BlockArgumentParser(net.minecraft.command.argument.BlockArgumentParser wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntryList tagId() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.tagId); }
// public void tagId(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.tagId = value.wrapperContained; }
// public java.util.function.Function SUGGEST_DEFAULT() { return wrapperContained.SUGGEST_DEFAULT; }
// public void SUGGEST_DEFAULT(java.util.function.Function value) { wrapperContained.SUGGEST_DEFAULT = value; }
public com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType INVALID_PROPERTY_EXCEPTION() { return wrapperContained.INVALID_PROPERTY_EXCEPTION; }
// public void INVALID_PROPERTY_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType value) { wrapperContained.INVALID_PROPERTY_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType UNCLOSED_PROPERTIES_EXCEPTION() { return wrapperContained.UNCLOSED_PROPERTIES_EXCEPTION; }
// public void UNCLOSED_PROPERTIES_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.UNCLOSED_PROPERTIES_EXCEPTION = value; }
// public java.util.Map tagProperties() { return wrapperContained.tagProperties; }
// public void tagProperties(java.util.Map value) { wrapperContained.tagProperties = value; }
// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
// public boolean allowTag() { return wrapperContained.allowTag; }
// public void allowTag(boolean value) { wrapperContained.allowTag = value; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType EMPTY_PROPERTY_EXCEPTION() { return wrapperContained.EMPTY_PROPERTY_EXCEPTION; }
// public void EMPTY_PROPERTY_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.EMPTY_PROPERTY_EXCEPTION = value; }
// public yarnwrap.state.StateManager stateFactory() { return new yarnwrap.state.StateManager(wrapperContained.stateFactory); }
// public void stateFactory(yarnwrap.state.StateManager value) { wrapperContained.stateFactory = value.wrapperContained; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_BLOCK_ID_EXCEPTION() { return wrapperContained.INVALID_BLOCK_ID_EXCEPTION; }
// public void INVALID_BLOCK_ID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_BLOCK_ID_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType DISALLOWED_TAG_EXCEPTION() { return wrapperContained.DISALLOWED_TAG_EXCEPTION; }
// public void DISALLOWED_TAG_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.DISALLOWED_TAG_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType DUPLICATE_PROPERTY_EXCEPTION() { return wrapperContained.DUPLICATE_PROPERTY_EXCEPTION; }
// public void DUPLICATE_PROPERTY_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.DUPLICATE_PROPERTY_EXCEPTION = value; }
// public yarnwrap.nbt.NbtCompound data() { return new yarnwrap.nbt.NbtCompound(wrapperContained.data); }
// public void data(yarnwrap.nbt.NbtCompound value) { wrapperContained.data = value.wrapperContained; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType UNKNOWN_PROPERTY_EXCEPTION() { return wrapperContained.UNKNOWN_PROPERTY_EXCEPTION; }
// public void UNKNOWN_PROPERTY_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.UNKNOWN_PROPERTY_EXCEPTION = value; }
// public java.util.function.Function suggestions() { return wrapperContained.suggestions; }
// public void suggestions(java.util.function.Function value) { wrapperContained.suggestions = value; }
// public yarnwrap.util.Identifier blockId() { return new yarnwrap.util.Identifier(wrapperContained.blockId); }
// public void blockId(yarnwrap.util.Identifier value) { wrapperContained.blockId = value.wrapperContained; }
// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public void reader(com.mojang.brigadier.StringReader value) { wrapperContained.reader = value; }
// public java.util.Map blockProperties() { return wrapperContained.blockProperties; }
// public void blockProperties(java.util.Map value) { wrapperContained.blockProperties = value; }
// public char PROPERTIES_OPENING() { return wrapperContained.PROPERTIES_OPENING; }
// public void PROPERTIES_OPENING(char value) { wrapperContained.PROPERTIES_OPENING = value; }
// public char NBT_OPENING() { return wrapperContained.NBT_OPENING; }
// public void NBT_OPENING(char value) { wrapperContained.NBT_OPENING = value; }
// public char PROPERTIES_CLOSING() { return wrapperContained.PROPERTIES_CLOSING; }
// public void PROPERTIES_CLOSING(char value) { wrapperContained.PROPERTIES_CLOSING = value; }
// public char PROPERTY_DEFINER() { return wrapperContained.PROPERTY_DEFINER; }
// public void PROPERTY_DEFINER(char value) { wrapperContained.PROPERTY_DEFINER = value; }
// public char PROPERTY_SEPARATOR() { return wrapperContained.PROPERTY_SEPARATOR; }
// public void PROPERTY_SEPARATOR(char value) { wrapperContained.PROPERTY_SEPARATOR = value; }
// public char TAG_PREFIX() { return wrapperContained.TAG_PREFIX; }
// public void TAG_PREFIX(char value) { wrapperContained.TAG_PREFIX = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_BLOCK_TAG_EXCEPTION() { return wrapperContained.UNKNOWN_BLOCK_TAG_EXCEPTION; }
// public void UNKNOWN_BLOCK_TAG_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_BLOCK_TAG_EXCEPTION = value; }
// public yarnwrap.registry.RegistryWrapper registryWrapper() { return new yarnwrap.registry.RegistryWrapper(wrapperContained.registryWrapper); }
// public void registryWrapper(yarnwrap.registry.RegistryWrapper value) { wrapperContained.registryWrapper = value.wrapperContained; }
// public boolean allowSnbt() { return wrapperContained.allowSnbt; }
// public void allowSnbt(boolean value) { wrapperContained.allowSnbt = value; }
// public BlockArgumentParser(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader,boolean allowTag,boolean allowSnbt) { this.wrapperContained = new net.minecraft.command.argument.BlockArgumentParser(registryWrapper.wrapperContained,reader,allowTag,allowSnbt); }
// public Object block(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader,boolean allowSnbt) { return wrapperContained.block(registryWrapper.wrapperContained,reader,allowSnbt); }
// public Object block(yarnwrap.registry.RegistryWrapper registryWrapper,java.lang.String string,boolean allowSnbt) { return wrapperContained.block(registryWrapper.wrapperContained,string,allowSnbt); }
// public com.mojang.brigadier.Message method_41958(java.lang.Object tag) { return wrapperContained.method_41958(tag); }
// public java.lang.String method_41959(yarnwrap.registry.RegistryKey key) { return wrapperContained.method_41959(key.wrapperContained); }
// public com.mojang.datafixers.util.Either blockOrTag(yarnwrap.registry.RegistryWrapper registryWrapper,com.mojang.brigadier.StringReader reader,boolean allowSnbt) { return wrapperContained.blockOrTag(registryWrapper.wrapperContained,reader,allowSnbt); }
// public com.mojang.datafixers.util.Either blockOrTag(yarnwrap.registry.RegistryWrapper registryWrapper,java.lang.String string,boolean allowSnbt) { return wrapperContained.blockOrTag(registryWrapper.wrapperContained,string,allowSnbt); }
// public java.util.concurrent.CompletableFuture suggestBlockId(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestBlockId(builder); }
// public void parseBlockProperties() { wrapperContained.parseBlockProperties(); }
// public com.mojang.brigadier.Message method_9660(java.lang.Object block,java.lang.Object property,java.lang.Object value) { return wrapperContained.method_9660(block,property,value); }
// public com.mojang.brigadier.Message method_9661(java.lang.Object block,java.lang.Object property) { return wrapperContained.method_9661(block,property); }
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
// public com.mojang.brigadier.Message method_9682(java.lang.Object block) { return wrapperContained.method_9682(block); }
// public java.util.concurrent.CompletableFuture method_9683(java.lang.String builder) { return wrapperContained.method_9683(builder); }
// public java.util.concurrent.CompletableFuture method_9684(yarnwrap.state.property.Property builder) { return wrapperContained.method_9684(builder.wrapperContained); }
public java.lang.String stringifyBlockState(yarnwrap.block.BlockState state) { return wrapperContained.stringifyBlockState(state.wrapperContained); }
// public com.mojang.brigadier.Message method_9686(java.lang.Object block,java.lang.Object property) { return wrapperContained.method_9686(block,property); }
// public java.util.concurrent.CompletableFuture suggestSnbt(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestSnbt(builder); }
// public java.util.concurrent.CompletableFuture suggestCommaOrEnd(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestCommaOrEnd(builder); }
// public java.util.concurrent.CompletableFuture suggestTagPropertyValues(com.mojang.brigadier.suggestion.SuggestionsBuilder builder,java.lang.String name) { return wrapperContained.suggestTagPropertyValues(builder,name); }
// public com.mojang.brigadier.Message method_9691(java.lang.Object block,java.lang.Object property) { return wrapperContained.method_9691(block,property); }
// public java.util.concurrent.CompletableFuture suggestEqualsCharacter(com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.suggestEqualsCharacter(builder); }

}