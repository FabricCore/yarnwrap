package yarnwrap.network.packet;
public class BundlePacket { public net.minecraft.network.packet.BundlePacket wrapperContained; public BundlePacket(net.minecraft.network.packet.BundlePacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Iterable packets() { return wrapperContained.packets; }
// public void packets(java.lang.Iterable value) { wrapperContained.packets = value; }
public java.lang.Iterable getPackets() { return wrapperContained.getPackets(); }

}