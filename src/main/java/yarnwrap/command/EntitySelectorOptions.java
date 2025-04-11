package yarnwrap.command;
public class EntitySelectorOptions { public net.minecraft.command.EntitySelectorOptions wrapperContained; public EntitySelectorOptions(net.minecraft.command.EntitySelectorOptions wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_OPTION_EXCEPTION() { return wrapperContained.UNKNOWN_OPTION_EXCEPTION; }
// public void UNKNOWN_OPTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_OPTION_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_SMALL_LEVEL_EXCEPTION() { return wrapperContained.TOO_SMALL_LEVEL_EXCEPTION; }
// public void TOO_SMALL_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TOO_SMALL_LEVEL_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INAPPLICABLE_OPTION_EXCEPTION() { return wrapperContained.INAPPLICABLE_OPTION_EXCEPTION; }
// public void INAPPLICABLE_OPTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INAPPLICABLE_OPTION_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType IRREVERSIBLE_SORT_EXCEPTION() { return wrapperContained.IRREVERSIBLE_SORT_EXCEPTION; }
// public void IRREVERSIBLE_SORT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.IRREVERSIBLE_SORT_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_MODE_EXCEPTION() { return wrapperContained.INVALID_MODE_EXCEPTION; }
// public void INVALID_MODE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_MODE_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_DISTANCE_EXCEPTION() { return wrapperContained.NEGATIVE_DISTANCE_EXCEPTION; }
// public void NEGATIVE_DISTANCE_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NEGATIVE_DISTANCE_EXCEPTION = value; }
// public java.util.Map OPTIONS() { return wrapperContained.OPTIONS; }
// public void OPTIONS(java.util.Map value) { wrapperContained.OPTIONS = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_TYPE_EXCEPTION() { return wrapperContained.INVALID_TYPE_EXCEPTION; }
// public void INVALID_TYPE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_TYPE_EXCEPTION = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_LEVEL_EXCEPTION() { return wrapperContained.NEGATIVE_LEVEL_EXCEPTION; }
// public void NEGATIVE_LEVEL_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.NEGATIVE_LEVEL_EXCEPTION = value; }
public void suggestOptions(yarnwrap.command.EntitySelectorReader reader,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionBuilder) { wrapperContained.suggestOptions(reader.wrapperContained,suggestionBuilder); }
public void register() { wrapperContained.register(); }
// public void putOption(java.lang.String id,Object handler,java.util.function.Predicate condition,yarnwrap.text.Text description) { wrapperContained.putOption(id,handler,condition,description.wrapperContained); }
// public Object getHandler(yarnwrap.command.EntitySelectorReader reader,java.lang.String option,int restoreCursor) { return wrapperContained.getHandler(reader.wrapperContained,option,restoreCursor); }

}