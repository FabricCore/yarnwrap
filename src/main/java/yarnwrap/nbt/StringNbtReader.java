package yarnwrap.nbt;
public class StringNbtReader { public net.minecraft.nbt.StringNbtReader wrapperContained; public StringNbtReader(net.minecraft.nbt.StringNbtReader wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType TRAILING() { return wrapperContained.TRAILING; }
// public void TRAILING(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.TRAILING = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType TRAILING() { return net.minecraft.nbt.StringNbtReader.TRAILING; }
// public static void TRAILING(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.nbt.StringNbtReader.TRAILING = value; }

// public char COMMA() { return wrapperContained.COMMA; }
// public void COMMA(char value) { wrapperContained.COMMA = value; }
public static char COMMA() { return net.minecraft.nbt.StringNbtReader.COMMA; }
// public static void COMMA(char value, ) { net.minecraft.nbt.StringNbtReader.COMMA = value; }

// public char COLON() { return wrapperContained.COLON; }
// public void COLON(char value) { wrapperContained.COLON = value; }
public static char COLON() { return net.minecraft.nbt.StringNbtReader.COLON; }
// public static void COLON(char value, ) { net.minecraft.nbt.StringNbtReader.COLON = value; }

// public com.mojang.serialization.Codec NBT_COMPOUND_CODEC() { return wrapperContained.NBT_COMPOUND_CODEC; }
// public void NBT_COMPOUND_CODEC(com.mojang.serialization.Codec value) { wrapperContained.NBT_COMPOUND_CODEC = value; }
public static com.mojang.serialization.Codec NBT_COMPOUND_CODEC() { return net.minecraft.nbt.StringNbtReader.NBT_COMPOUND_CODEC; }
// public static void NBT_COMPOUND_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.nbt.StringNbtReader.NBT_COMPOUND_CODEC = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPECTED_COMPOUND() { return wrapperContained.EXPECTED_COMPOUND; }
// public void EXPECTED_COMPOUND(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.EXPECTED_COMPOUND = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType EXPECTED_COMPOUND() { return net.minecraft.nbt.StringNbtReader.EXPECTED_COMPOUND; }
// public static void EXPECTED_COMPOUND(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.nbt.StringNbtReader.EXPECTED_COMPOUND = value; }

// public com.mojang.serialization.Codec STRINGIFIED_CODEC() { return wrapperContained.STRINGIFIED_CODEC; }
// public void STRINGIFIED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRINGIFIED_CODEC = value; }
public static com.mojang.serialization.Codec STRINGIFIED_CODEC() { return net.minecraft.nbt.StringNbtReader.STRINGIFIED_CODEC; }
// public static void STRINGIFIED_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.nbt.StringNbtReader.STRINGIFIED_CODEC = value; }

// public yarnwrap.nbt.StringNbtReader DEFAULT_READER() { return new yarnwrap.nbt.StringNbtReader(wrapperContained.DEFAULT_READER); }
// public void DEFAULT_READER(yarnwrap.nbt.StringNbtReader value) { wrapperContained.DEFAULT_READER = value.wrapperContained; }
// public static yarnwrap.nbt.StringNbtReader DEFAULT_READER() { return new yarnwrap.nbt.StringNbtReader(net.minecraft.nbt.StringNbtReader.DEFAULT_READER); }
// public static void DEFAULT_READER(yarnwrap.nbt.StringNbtReader value, ) { net.minecraft.nbt.StringNbtReader.DEFAULT_READER = value.wrapperContained; }

// public yarnwrap.util.packrat.PackratParser parser() { return new yarnwrap.util.packrat.PackratParser(wrapperContained.parser); }
// public void parser(yarnwrap.util.packrat.PackratParser value) { wrapperContained.parser = value.wrapperContained; }
// public static yarnwrap.util.packrat.PackratParser parser() { return new yarnwrap.util.packrat.PackratParser(net.minecraft.nbt.StringNbtReader.parser); }
// public static void parser(yarnwrap.util.packrat.PackratParser value, ) { net.minecraft.nbt.StringNbtReader.parser = value.wrapperContained; }

// public com.mojang.serialization.DynamicOps ops() { return wrapperContained.ops; }
// public void ops(com.mojang.serialization.DynamicOps value) { wrapperContained.ops = value; }
// public static com.mojang.serialization.DynamicOps ops() { return net.minecraft.nbt.StringNbtReader.ops; }
// public static void ops(com.mojang.serialization.DynamicOps value, ) { net.minecraft.nbt.StringNbtReader.ops = value; }

// public StringNbtReader(com.mojang.serialization.DynamicOps ops,yarnwrap.util.packrat.PackratParser parser) { this.wrapperContained = new net.minecraft.nbt.StringNbtReader(ops,parser.wrapperContained); }
// public com.mojang.serialization.DataResult method_53502(java.lang.String snbt) { return wrapperContained.method_53502(snbt); }
// public static com.mojang.serialization.DataResult method_53502(java.lang.String snbt, ) { return net.minecraft.nbt.StringNbtReader.method_53502(snbt); }
// public yarnwrap.nbt.NbtCompound readCompoundAsArgument(com.mojang.brigadier.StringReader reader) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompoundAsArgument(reader)); }
// public static yarnwrap.nbt.NbtCompound readCompoundAsArgument(com.mojang.brigadier.StringReader reader, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.StringNbtReader.readCompoundAsArgument(reader)); }
// public yarnwrap.nbt.NbtCompound expectCompound(com.mojang.brigadier.StringReader reader,yarnwrap.nbt.NbtElement nbtElement) { return new yarnwrap.nbt.NbtCompound(wrapperContained.expectCompound(reader,nbtElement.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound expectCompound(com.mojang.brigadier.StringReader reader,yarnwrap.nbt.NbtElement nbtElement, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.StringNbtReader.expectCompound(reader,nbtElement.wrapperContained)); }
// public java.lang.Object read(com.mojang.brigadier.StringReader reader) { return wrapperContained.read(reader); }
// public static java.lang.Object read(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.nbt.StringNbtReader.read(reader); }
// public java.lang.Object read(java.lang.String snbt) { return wrapperContained.read(snbt); }
// public static java.lang.Object read(java.lang.String snbt, ) { return net.minecraft.nbt.StringNbtReader.read(snbt); }
// public yarnwrap.nbt.NbtCompound readCompound(java.lang.String snbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.readCompound(snbt)); }
// public static yarnwrap.nbt.NbtCompound readCompound(java.lang.String snbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.nbt.StringNbtReader.readCompound(snbt)); }
// public java.lang.Object readAsArgument(com.mojang.brigadier.StringReader reader) { return wrapperContained.readAsArgument(reader); }
// public static java.lang.Object readAsArgument(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.nbt.StringNbtReader.readAsArgument(reader); }
// public yarnwrap.nbt.StringNbtReader fromOps(com.mojang.serialization.DynamicOps ops) { return new yarnwrap.nbt.StringNbtReader(wrapperContained.fromOps(ops)); }
// public static yarnwrap.nbt.StringNbtReader fromOps(com.mojang.serialization.DynamicOps ops, ) { return new yarnwrap.nbt.StringNbtReader(net.minecraft.nbt.StringNbtReader.fromOps(ops)); }
public com.mojang.serialization.DynamicOps getOps() { return wrapperContained.getOps(); }
// public static com.mojang.serialization.DynamicOps getOps() { return net.minecraft.nbt.StringNbtReader.getOps(); }

}