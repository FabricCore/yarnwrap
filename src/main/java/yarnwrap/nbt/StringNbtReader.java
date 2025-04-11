package yarnwrap.nbt;
public class StringNbtReader { public net.minecraft.nbt.StringNbtReader wrapperContained; public StringNbtReader(net.minecraft.nbt.StringNbtReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern FLOAT_PATTERN() { return wrapperContained.FLOAT_PATTERN; }
// public void FLOAT_PATTERN(java.util.regex.Pattern value) { wrapperContained.FLOAT_PATTERN = value; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType ARRAY_MIXED() { return wrapperContained.ARRAY_MIXED; }
// public void ARRAY_MIXED(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.ARRAY_MIXED = value; }
// public com.mojang.brigadier.StringReader reader() { return wrapperContained.reader; }
// public void reader(com.mojang.brigadier.StringReader value) { wrapperContained.reader = value; }
// public java.util.regex.Pattern INT_PATTERN() { return wrapperContained.INT_PATTERN; }
// public void INT_PATTERN(java.util.regex.Pattern value) { wrapperContained.INT_PATTERN = value; }
// public java.util.regex.Pattern DOUBLE_PATTERN() { return wrapperContained.DOUBLE_PATTERN; }
// public void DOUBLE_PATTERN(java.util.regex.Pattern value) { wrapperContained.DOUBLE_PATTERN = value; }
// public java.util.regex.Pattern SHORT_PATTERN() { return wrapperContained.SHORT_PATTERN; }
// public void SHORT_PATTERN(java.util.regex.Pattern value) { wrapperContained.SHORT_PATTERN = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TRAILING() { return wrapperContained.TRAILING; }
// public void TRAILING(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TRAILING = value; }
public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType LIST_MIXED() { return wrapperContained.LIST_MIXED; }
// public void LIST_MIXED(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.LIST_MIXED = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ARRAY_INVALID() { return wrapperContained.ARRAY_INVALID; }
// public void ARRAY_INVALID(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.ARRAY_INVALID = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPECTED_VALUE() { return wrapperContained.EXPECTED_VALUE; }
// public void EXPECTED_VALUE(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EXPECTED_VALUE = value; }
// public java.util.regex.Pattern BYTE_PATTERN() { return wrapperContained.BYTE_PATTERN; }
// public void BYTE_PATTERN(java.util.regex.Pattern value) { wrapperContained.BYTE_PATTERN = value; }
// public java.util.regex.Pattern DOUBLE_PATTERN_IMPLICIT() { return wrapperContained.DOUBLE_PATTERN_IMPLICIT; }
// public void DOUBLE_PATTERN_IMPLICIT(java.util.regex.Pattern value) { wrapperContained.DOUBLE_PATTERN_IMPLICIT = value; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPECTED_KEY() { return wrapperContained.EXPECTED_KEY; }
// public void EXPECTED_KEY(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EXPECTED_KEY = value; }
// public java.util.regex.Pattern LONG_PATTERN() { return wrapperContained.LONG_PATTERN; }
// public void LONG_PATTERN(java.util.regex.Pattern value) { wrapperContained.LONG_PATTERN = value; }
public char COMMA() { return wrapperContained.COMMA; }
// public void COMMA(char value) { wrapperContained.COMMA = value; }
public char COLON() { return wrapperContained.COLON; }
// public void COLON(char value) { wrapperContained.COLON = value; }
// public char SQUARE_OPEN_BRACKET() { return wrapperContained.SQUARE_OPEN_BRACKET; }
// public void SQUARE_OPEN_BRACKET(char value) { wrapperContained.SQUARE_OPEN_BRACKET = value; }
// public char SQUARE_CLOSE_BRACKET() { return wrapperContained.SQUARE_CLOSE_BRACKET; }
// public void SQUARE_CLOSE_BRACKET(char value) { wrapperContained.SQUARE_CLOSE_BRACKET = value; }
// public char RIGHT_CURLY_BRACKET() { return wrapperContained.RIGHT_CURLY_BRACKET; }
// public void RIGHT_CURLY_BRACKET(char value) { wrapperContained.RIGHT_CURLY_BRACKET = value; }
// public char LEFT_CURLY_BRACKET() { return wrapperContained.LEFT_CURLY_BRACKET; }
// public void LEFT_CURLY_BRACKET(char value) { wrapperContained.LEFT_CURLY_BRACKET = value; }
public com.mojang.serialization.Codec STRINGIFIED_CODEC() { return wrapperContained.STRINGIFIED_CODEC; }
// public void STRINGIFIED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRINGIFIED_CODEC = value; }
public com.mojang.serialization.Codec NBT_COMPOUND_CODEC() { return wrapperContained.NBT_COMPOUND_CODEC; }
// public void NBT_COMPOUND_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NBT_COMPOUND_CODEC = value; }
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