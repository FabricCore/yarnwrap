package yarnwrap.util;
public class DelegatingDataOutput { public net.minecraft.util.DelegatingDataOutput wrapperContained; public DelegatingDataOutput(net.minecraft.util.DelegatingDataOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.DataOutput delegate() { return wrapperContained.delegate; }
// public void delegate(java.io.DataOutput value) { wrapperContained.delegate = value; }

}