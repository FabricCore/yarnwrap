package yarnwrap.command.argument;
public class ItemPredicateArgumentType { public net.minecraft.command.argument.ItemPredicateArgumentType wrapperContained; public ItemPredicateArgumentType(net.minecraft.command.argument.ItemPredicateArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ITEM_ID_EXCEPTION() { return wrapperContained.INVALID_ITEM_ID_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ITEM_TAG_EXCEPTION() { return wrapperContained.UNKNOWN_ITEM_TAG_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ITEM_COMPONENT_EXCEPTION() { return wrapperContained.UNKNOWN_ITEM_COMPONENT_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_ITEM_COMPONENT_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_COMPONENT_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ITEM_PREDICATE_EXCEPTION() { return wrapperContained.UNKNOWN_ITEM_PREDICATE_EXCEPTION; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType MALFORMED_ITEM_PREDICATE_EXCEPTION() { return wrapperContained.MALFORMED_ITEM_PREDICATE_EXCEPTION; }
// public yarnwrap.util.Identifier COUNT_ID() { return new yarnwrap.util.Identifier(wrapperContained.COUNT_ID); }
// public java.util.Map SPECIAL_COMPONENT_CHECKS() { return wrapperContained.SPECIAL_COMPONENT_CHECKS; }
// public java.util.Map SPECIAL_SUB_PREDICATE_CHECKS() { return wrapperContained.SPECIAL_SUB_PREDICATE_CHECKS; }
// public yarnwrap.command.argument.packrat.ArgumentParser parser() { return new yarnwrap.command.argument.packrat.ArgumentParser(wrapperContained.parser); }
public yarnwrap.command.argument.ItemPredicateArgumentType itemPredicate(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.ItemPredicateArgumentType(wrapperContained.itemPredicate(commandRegistryAccess.wrapperContained)); }
public Object getItemStackPredicate(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getItemStackPredicate(context,name); }

}