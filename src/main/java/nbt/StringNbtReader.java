package yarnwrap.nbt;
public class StringNbtReader { public net.minecraft.nbt.StringNbtReader wrapperContained; public StringNbtReader(net.minecraft.nbt.StringNbtReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern FLOAT_PATTERN() { return wrapperContained.FLOAT_PATTERN; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType ARRAY_MIXED() { return wrapperContained.ARRAY_MIXED; }
// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public java.util.regex.Pattern INT_PATTERN() { return wrapperContained.INT_PATTERN; }
// public java.util.regex.Pattern DOUBLE_PATTERN() { return wrapperContained.DOUBLE_PATTERN; }
// public java.util.regex.Pattern SHORT_PATTERN() { return wrapperContained.SHORT_PATTERN; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TRAILING() { return wrapperContained.TRAILING; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType LIST_MIXED() { return wrapperContained.LIST_MIXED; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ARRAY_INVALID() { return wrapperContained.ARRAY_INVALID; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPECTED_VALUE() { return wrapperContained.EXPECTED_VALUE; }
// public java.util.regex.Pattern BYTE_PATTERN() { return wrapperContained.BYTE_PATTERN; }
// public java.util.regex.Pattern DOUBLE_PATTERN_IMPLICIT() { return wrapperContained.DOUBLE_PATTERN_IMPLICIT; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPECTED_KEY() { return wrapperContained.EXPECTED_KEY; }
// public java.util.regex.Pattern LONG_PATTERN() { return wrapperContained.LONG_PATTERN; }
public char COMMA() { return wrapperContained.COMMA; }
public char COLON() { return wrapperContained.COLON; }
// public char SQUARE_OPEN_BRACKET() { return wrapperContained.SQUARE_OPEN_BRACKET; }
// public char SQUARE_CLOSE_BRACKET() { return wrapperContained.SQUARE_CLOSE_BRACKET; }
// public char RIGHT_CURLY_BRACKET() { return wrapperContained.RIGHT_CURLY_BRACKET; }
// public char LEFT_CURLY_BRACKET() { return wrapperContained.LEFT_CURLY_BRACKET; }
public com.mojang.serialization.Codec STRINGIFIED_CODEC() { return wrapperContained.STRINGIFIED_CODEC; }
public com.mojang.serialization.Codec NBT_COMPOUND_CODEC() { return wrapperContained.NBT_COMPOUND_CODEC; }
// public boolean readComma() { return wrapperContained.readComma(); }
// public yarnwrap.nbt.NbtElement parseArray() { return new yarnwrap.nbt.NbtElement(wrapperContained.parseArray()); }
// public yarnwrap.nbt.NbtCompound parse(java.lang.String string) { return new yarnwrap.nbt.NbtCompound(wrapperContained.parse(string)); }
// public void expect(char c) { wrapperContained.expect(c); }
// public yarnwrap.nbt.NbtCompound readCompound() { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompound()); }
// public yarnwrap.nbt.NbtElement parseElementPrimitive() { return new yarnwrap.nbt.NbtElement(wrapperContained.parseElementPrimitive()); }
// public yarnwrap.nbt.NbtElement parseElement() { return new yarnwrap.nbt.NbtElement(wrapperContained.parseElement()); }
// public java.lang.String readString() { return wrapperContained.readString(); }
// public yarnwrap.nbt.NbtElement parseElementPrimitiveArray() { return new yarnwrap.nbt.NbtElement(wrapperContained.parseElementPrimitiveArray()); }
// public yarnwrap.nbt.NbtCompound parseCompound() { return new yarnwrap.nbt.NbtCompound(wrapperContained.parseCompound()); }
// public java.util.List readArray(yarnwrap.nbt.NbtType arrayTypeReader,yarnwrap.nbt.NbtType typeReader) { return wrapperContained.readArray(arrayTypeReader.wrapperContained,typeReader.wrapperContained); }
// public yarnwrap.nbt.NbtElement parseList() { return new yarnwrap.nbt.NbtElement(wrapperContained.parseList()); }
// public yarnwrap.nbt.NbtElement parsePrimitive(java.lang.String input) { return new yarnwrap.nbt.NbtElement(wrapperContained.parsePrimitive(input)); }

}