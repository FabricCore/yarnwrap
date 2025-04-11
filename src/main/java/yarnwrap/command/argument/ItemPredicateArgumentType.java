package yarnwrap.command.argument;
public class ItemPredicateArgumentType { public net.minecraft.command.argument.ItemPredicateArgumentType wrapperContained; public ItemPredicateArgumentType(net.minecraft.command.argument.ItemPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ITEM_ID_EXCEPTION() { return wrapperContained.INVALID_ITEM_ID_EXCEPTION; }
// public void INVALID_ITEM_ID_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_ITEM_ID_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ITEM_TAG_EXCEPTION() { return wrapperContained.UNKNOWN_ITEM_TAG_EXCEPTION; }
// public void UNKNOWN_ITEM_TAG_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_ITEM_TAG_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ITEM_COMPONENT_EXCEPTION() { return wrapperContained.UNKNOWN_ITEM_COMPONENT_EXCEPTION; }
// public void UNKNOWN_ITEM_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_ITEM_COMPONENT_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_ITEM_COMPONENT_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_COMPONENT_EXCEPTION; }
// public void MALFORMED_ITEM_COMPONENT_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.MALFORMED_ITEM_COMPONENT_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ITEM_PREDICATE_EXCEPTION() { return wrapperContained.UNKNOWN_ITEM_PREDICATE_EXCEPTION; }
// public void UNKNOWN_ITEM_PREDICATE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_ITEM_PREDICATE_EXCEPTION = value; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_ITEM_PREDICATE_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_PREDICATE_EXCEPTION; }
// public void MALFORMED_ITEM_PREDICATE_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.MALFORMED_ITEM_PREDICATE_EXCEPTION = value; }
// public yarnwrap.util.Identifier COUNT_ID() { return new yarnwrap.util.Identifier(wrapperContained.COUNT_ID); }
// public void COUNT_ID(yarnwrap.util.Identifier value) { wrapperContained.COUNT_ID = value.wrapperContained; }
// public java.util.Map SPECIAL_COMPONENT_CHECKS() { return wrapperContained.SPECIAL_COMPONENT_CHECKS; }
// public void SPECIAL_COMPONENT_CHECKS(java.util.Map value) { wrapperContained.SPECIAL_COMPONENT_CHECKS = value; }
// public java.util.Map SPECIAL_SUB_PREDICATE_CHECKS() { return wrapperContained.SPECIAL_SUB_PREDICATE_CHECKS; }
// public void SPECIAL_SUB_PREDICATE_CHECKS(java.util.Map value) { wrapperContained.SPECIAL_SUB_PREDICATE_CHECKS = value; }
// public yarnwrap.command.argument.packrat.ArgumentParser parser() { return new yarnwrap.command.argument.packrat.ArgumentParser(wrapperContained.parser); }
// public void parser(yarnwrap.command.argument.packrat.ArgumentParser value) { wrapperContained.parser = value.wrapperContained; }
public ItemPredicateArgumentType(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { this.wrapperContained = new net.minecraft.command.argument.ItemPredicateArgumentType(commandRegistryAccess.wrapperContained); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public boolean method_58522(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58522(stack.wrapperContained); }
// public java.util.function.Predicate method_58523(Object range) { return wrapperContained.method_58523(range); }
// public boolean method_58524(Object stack) { return wrapperContained.method_58524(stack); }
// public Object method_58525(Object check) { return wrapperContained.method_58525(check); }
// public Object method_58526(Object check) { return wrapperContained.method_58526(check); }
// public com.mojang.brigadier.Message method_58527(java.lang.Object predicate) { return wrapperContained.method_58527(predicate); }
// public java.util.function.Predicate method_58529(Object range) { return wrapperContained.method_58529(range); }
// public boolean method_58530(Object stack) { return wrapperContained.method_58530(stack); }
// public com.mojang.brigadier.Message method_58531(java.lang.Object component) { return wrapperContained.method_58531(component); }
// public com.mojang.brigadier.Message method_58533(java.lang.Object tag) { return wrapperContained.method_58533(tag); }
// public com.mojang.brigadier.Message method_58534(java.lang.Object id) { return wrapperContained.method_58534(id); }
public yarnwrap.command.argument.ItemPredicateArgumentType itemPredicate(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.ItemPredicateArgumentType(wrapperContained.itemPredicate(commandRegistryAccess.wrapperContained)); }
public Object getItemStackPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getItemStackPredicate(context,name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}