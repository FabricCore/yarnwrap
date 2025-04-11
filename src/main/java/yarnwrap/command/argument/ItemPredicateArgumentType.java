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
public yarnwrap.command.argument.ItemPredicateArgumentType itemPredicate(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.ItemPredicateArgumentType(wrapperContained.itemPredicate(commandRegistryAccess.wrapperContained)); }
public Object getItemStackPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getItemStackPredicate(context,name); }

}