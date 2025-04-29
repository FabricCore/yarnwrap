package yarnwrap.command.argument;
public class EnumArgumentType { public net.minecraft.command.argument.EnumArgumentType wrapperContained; public EnumArgumentType(net.minecraft.command.argument.EnumArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ENUM_EXCEPTION() { return wrapperContained.INVALID_ENUM_EXCEPTION; }
// public void INVALID_ENUM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_ENUM_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_ENUM_EXCEPTION() { return net.minecraft.command.argument.EnumArgumentType.INVALID_ENUM_EXCEPTION; }
// public static void INVALID_ENUM_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.EnumArgumentType.INVALID_ENUM_EXCEPTION = value; }

// public com.mojang.serialization.Codec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.Codec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.Codec codec() { return net.minecraft.command.argument.EnumArgumentType.codec; }
// public static void codec(com.mojang.serialization.Codec value, ) { net.minecraft.command.argument.EnumArgumentType.codec = value; }

// public java.util.function.Supplier valuesSupplier() { return wrapperContained.valuesSupplier; }
// public void valuesSupplier(java.util.function.Supplier value) { wrapperContained.valuesSupplier = value; }
// public static java.util.function.Supplier valuesSupplier() { return net.minecraft.command.argument.EnumArgumentType.valuesSupplier; }
// public static void valuesSupplier(java.util.function.Supplier value, ) { net.minecraft.command.argument.EnumArgumentType.valuesSupplier = value; }

// public EnumArgumentType(com.mojang.serialization.Codec codec,java.util.function.Supplier valuesSupplier) { this.wrapperContained = new net.minecraft.command.argument.EnumArgumentType(codec,valuesSupplier); }
public java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.listSuggestions(context,builder); }
// public static java.util.concurrent.CompletableFuture listSuggestions(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder, ) { return net.minecraft.command.argument.EnumArgumentType.listSuggestions(context,builder); }
// public java.lang.String method_44092(java.lang.Object enum_) { return wrapperContained.method_44092(enum_); }
// public static java.lang.String method_44092(java.lang.Object enum_, ) { return net.minecraft.command.argument.EnumArgumentType.method_44092(enum_); }
// public java.lang.String method_44094(java.lang.Object enum_) { return wrapperContained.method_44094(enum_); }
// public static java.lang.String method_44094(java.lang.Object enum_, ) { return net.minecraft.command.argument.EnumArgumentType.method_44094(enum_); }
// public com.mojang.brigadier.Message method_44095(java.lang.Object value) { return wrapperContained.method_44095(value); }
// public static com.mojang.brigadier.Message method_44095(java.lang.Object value, ) { return net.minecraft.command.argument.EnumArgumentType.method_44095(value); }
// public java.lang.String transformValueName(java.lang.String name) { return wrapperContained.transformValueName(name); }
// public static java.lang.String transformValueName(java.lang.String name, ) { return net.minecraft.command.argument.EnumArgumentType.transformValueName(name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.EnumArgumentType.parse(reader); }

}