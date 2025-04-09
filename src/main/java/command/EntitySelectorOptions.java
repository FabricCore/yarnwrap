package yarnwrap.command;
public class EntitySelectorOptions { public net.minecraft.command.EntitySelectorOptions wrapperContained; public EntitySelectorOptions(net.minecraft.command.EntitySelectorOptions wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_OPTION_EXCEPTION() { return wrapperContained.UNKNOWN_OPTION_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_SMALL_LEVEL_EXCEPTION() { return wrapperContained.TOO_SMALL_LEVEL_EXCEPTION; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INAPPLICABLE_OPTION_EXCEPTION() { return wrapperContained.INAPPLICABLE_OPTION_EXCEPTION; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType IRREVERSIBLE_SORT_EXCEPTION() { return wrapperContained.IRREVERSIBLE_SORT_EXCEPTION; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_MODE_EXCEPTION() { return wrapperContained.INVALID_MODE_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_DISTANCE_EXCEPTION() { return wrapperContained.NEGATIVE_DISTANCE_EXCEPTION; }
// public java.util.Map OPTIONS() { return wrapperContained.OPTIONS; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_TYPE_EXCEPTION() { return wrapperContained.INVALID_TYPE_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType NEGATIVE_LEVEL_EXCEPTION() { return wrapperContained.NEGATIVE_LEVEL_EXCEPTION; }
public void suggestOptions(yarnwrap.command.EntitySelectorReader reader,com.mojang.brigadier.suggestion.SuggestionsBuilder suggestionBuilder) { wrapperContained.suggestOptions(reader.wrapperContained,suggestionBuilder); }
public void register() { wrapperContained.register(); }
// public void putOption(java.lang.String id,Object handler,java.util.function.Predicate condition,yarnwrap.text.Text description) { wrapperContained.putOption(id,handler,condition,description.wrapperContained); }
// public Object getHandler(yarnwrap.command.EntitySelectorReader reader,java.lang.String option,int restoreCursor) { return wrapperContained.getHandler(reader.wrapperContained,option,restoreCursor); }

}