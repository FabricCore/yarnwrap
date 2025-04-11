package yarnwrap.nbt;
public class NbtSizeValidationException { public net.minecraft.nbt.NbtSizeValidationException wrapperContained; public NbtSizeValidationException(net.minecraft.nbt.NbtSizeValidationException wrapperContained) { this.wrapperContained = wrapperContained; }

public NbtSizeValidationException(java.lang.String message) { this.wrapperContained = new net.minecraft.nbt.NbtSizeValidationException(message); }

}