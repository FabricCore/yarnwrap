package yarnwrap.block.enums;
public class WireConnection { public net.minecraft.block.enums.WireConnection wrapperContained; public WireConnection(net.minecraft.block.enums.WireConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public boolean isConnected() { return wrapperContained.isConnected(); }

}