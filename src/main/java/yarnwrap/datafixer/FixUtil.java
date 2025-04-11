package yarnwrap.datafixer;
public class FixUtil { public net.minecraft.datafixer.FixUtil wrapperContained; public FixUtil(net.minecraft.datafixer.FixUtil wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixBlockPos(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixBlockPos(dynamic); }
// public com.mojang.datafixers.Typed withType() { return wrapperContained.withType(); }
public java.util.function.Function compose(java.util.function.Function[] fixes) { return wrapperContained.compose(fixes); }

}