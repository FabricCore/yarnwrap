package yarnwrap.util.dynamic;
public class ForwardingDynamicOps { public net.minecraft.util.dynamic.ForwardingDynamicOps wrapperContained; public ForwardingDynamicOps(net.minecraft.util.dynamic.ForwardingDynamicOps wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.DynamicOps delegate() { return wrapperContained.delegate; }
// public void delegate(com.mojang.serialization.DynamicOps value) { wrapperContained.delegate = value; }

}