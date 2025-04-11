package yarnwrap.command.argument;
public class IdentifierArgumentType { public net.minecraft.command.argument.IdentifierArgumentType wrapperContained; public IdentifierArgumentType(net.minecraft.command.argument.IdentifierArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_ADVANCEMENT_EXCEPTION() { return wrapperContained.UNKNOWN_ADVANCEMENT_EXCEPTION; }
// public void UNKNOWN_ADVANCEMENT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_ADVANCEMENT_EXCEPTION = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_RECIPE_EXCEPTION() { return wrapperContained.UNKNOWN_RECIPE_EXCEPTION; }
// public void UNKNOWN_RECIPE_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_RECIPE_EXCEPTION = value; }
// public yarnwrap.advancement.AdvancementEntry getAdvancementArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argumentName) { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.getAdvancementArgument(context,argumentName)); }
// public com.mojang.brigadier.Message method_9440(java.lang.Object id) { return wrapperContained.method_9440(id); }
public yarnwrap.command.argument.IdentifierArgumentType identifier() { return new yarnwrap.command.argument.IdentifierArgumentType(wrapperContained.identifier()); }
// public yarnwrap.recipe.RecipeEntry getRecipeArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String argumentName) { return new yarnwrap.recipe.RecipeEntry(wrapperContained.getRecipeArgument(context,argumentName)); }
public yarnwrap.util.Identifier getIdentifier(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.Identifier(wrapperContained.getIdentifier(context,name)); }
// public com.mojang.brigadier.Message method_9444(java.lang.Object id) { return wrapperContained.method_9444(id); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }

}