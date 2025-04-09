package yarnwrap.client.network;
public class LanServerPinger { public net.minecraft.client.network.LanServerPinger wrapperContained; public LanServerPinger(net.minecraft.client.network.LanServerPinger wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String PING_ADDRESS() { return wrapperContained.PING_ADDRESS; }
public int PING_PORT() { return wrapperContained.PING_PORT; }
// public long PING_INTERVAL() { return wrapperContained.PING_INTERVAL; }
// public java.util.concurrent.atomic.AtomicInteger THREAD_ID() { return wrapperContained.THREAD_ID; }
// public java.lang.String motd() { return wrapperContained.motd; }
// public boolean running() { return wrapperContained.running; }
// public java.net.DatagramSocket socket() { return wrapperContained.socket; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.lang.String addressPort() { return wrapperContained.addressPort; }
public java.lang.String createAnnouncement(java.lang.String motd,java.lang.String addressPort) { return wrapperContained.createAnnouncement(motd,addressPort); }
public java.lang.String parseAnnouncementMotd(java.lang.String announcement) { return wrapperContained.parseAnnouncementMotd(announcement); }
public java.lang.String parseAnnouncementAddressPort(java.lang.String announcement) { return wrapperContained.parseAnnouncementAddressPort(announcement); }

}