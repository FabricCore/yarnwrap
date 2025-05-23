package yarnwrap.util.annotation;
public class UsesSystemOut { public net.minecraft.util.annotation.UsesSystemOut wrapperContained; public UsesSystemOut(net.minecraft.util.annotation.UsesSystemOut wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String reason() { return wrapperContained.reason(); }
// public static java.lang.String reason() { return net.minecraft.util.annotation.UsesSystemOut.reason(); }

}