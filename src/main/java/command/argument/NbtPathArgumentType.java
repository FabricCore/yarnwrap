package yarnwrap.command.argument;
public class NbtPathArgumentType { public net.minecraft.command.argument.NbtPathArgumentType wrapperContained; public NbtPathArgumentType(net.minecraft.command.argument.NbtPathArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public char LEFT_SQUARE_BRACKET() { return wrapperContained.LEFT_SQUARE_BRACKET; }
// public char RIGHT_SQUARE_BRACKET() { return wrapperContained.RIGHT_SQUARE_BRACKET; }
// public char LEFT_CURLY_BRACKET() { return wrapperContained.LEFT_CURLY_BRACKET; }
// public char RIGHT_CURLY_BRACKET() { return wrapperContained.RIGHT_CURLY_BRACKET; }
// public char DOUBLE_QUOTE() { return wrapperContained.DOUBLE_QUOTE; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TOO_DEEP_EXCEPTION() { return wrapperContained.TOO_DEEP_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType EXPECTED_LIST_EXCEPTION() { return wrapperContained.EXPECTED_LIST_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_INDEX_EXCEPTION() { return wrapperContained.INVALID_INDEX_EXCEPTION; }
// public char SINGLE_QUOTE() { return wrapperContained.SINGLE_QUOTE; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType NOTHING_FOUND_EXCEPTION() { return wrapperContained.NOTHING_FOUND_EXCEPTION; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_PATH_NODE_EXCEPTION() { return wrapperContained.INVALID_PATH_NODE_EXCEPTION; }
// public Object readCompoundChildNode(com.mojang.brigadier.StringReader reader,java.lang.String name) { return wrapperContained.readCompoundChildNode(reader,name); }
// public boolean isNameCharacter(char c) { return wrapperContained.isNameCharacter(c); }
// public java.lang.String readName(com.mojang.brigadier.StringReader reader) { return wrapperContained.readName(reader); }
public Object getNbtPath(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getNbtPath(context,name); }
// public java.util.function.Predicate getPredicate(yarnwrap.nbt.NbtCompound filter) { return wrapperContained.getPredicate(filter.wrapperContained); }
public yarnwrap.command.argument.NbtPathArgumentType nbtPath() { return new yarnwrap.command.argument.NbtPathArgumentType(wrapperContained.nbtPath()); }
// public Object parseNode(com.mojang.brigadier.StringReader reader,boolean root) { return wrapperContained.parseNode(reader,root); }

}