package yarnwrap.network.listener;
public class TickablePacketListener { public net.minecraft.network.listener.TickablePacketListener wrapperContained; public TickablePacketListener(net.minecraft.network.listener.TickablePacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.network.listener.TickablePacketListener.tick(); }

}