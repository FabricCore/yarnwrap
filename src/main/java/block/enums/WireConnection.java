package yarnwrap.block.enums;
public class WireConnection { public net.minecraft.block.enums.WireConnection wrapperContained; public WireConnection(net.minecraft.block.enums.WireConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public boolean isConnected() { return wrapperContained.isConnected(); }

}