package yarnwrap.block;
public class Stainable { public net.minecraft.block.Stainable wrapperContained; public Stainable(net.minecraft.block.Stainable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.Stainable.getColor()); }

}