package yarnwrap.nbt;
public class NbtParsingRule { public net.minecraft.nbt.NbtParsingRule wrapperContained; public NbtParsingRule(net.minecraft.nbt.NbtParsingRule wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.StringNbtReader nbtReader() { return new yarnwrap.nbt.StringNbtReader(wrapperContained.nbtReader); }
// public void nbtReader(yarnwrap.nbt.StringNbtReader value) { wrapperContained.nbtReader = value.wrapperContained; }
// public static yarnwrap.nbt.StringNbtReader nbtReader() { return new yarnwrap.nbt.StringNbtReader(net.minecraft.nbt.NbtParsingRule.nbtReader); }
// public static void nbtReader(yarnwrap.nbt.StringNbtReader value, ) { net.minecraft.nbt.NbtParsingRule.nbtReader = value.wrapperContained; }

public NbtParsingRule(com.mojang.serialization.DynamicOps ops) { this.wrapperContained = new net.minecraft.nbt.NbtParsingRule(ops); }

}