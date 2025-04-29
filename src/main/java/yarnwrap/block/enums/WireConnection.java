package yarnwrap.block.enums;
public class WireConnection { public net.minecraft.block.enums.WireConnection wrapperContained; public WireConnection(net.minecraft.block.enums.WireConnection wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.block.enums.WireConnection.name; }
// public static void name(java.lang.String value, ) { net.minecraft.block.enums.WireConnection.name = value; }

// public WireConnection(java.lang.String name) { this.wrapperContained = new net.minecraft.block.enums.WireConnection(name); }
public boolean isConnected() { return wrapperContained.isConnected(); }
// public static boolean isConnected() { return net.minecraft.block.enums.WireConnection.isConnected(); }

}