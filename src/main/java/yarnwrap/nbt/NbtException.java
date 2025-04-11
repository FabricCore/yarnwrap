package yarnwrap.nbt;
public class NbtException { public net.minecraft.nbt.NbtException wrapperContained; public NbtException(net.minecraft.nbt.NbtException wrapperContained) { this.wrapperContained = wrapperContained; }

public NbtException(java.lang.String message) { this.wrapperContained = new net.minecraft.nbt.NbtException(message); }

}