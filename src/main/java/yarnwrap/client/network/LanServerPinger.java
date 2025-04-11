package yarnwrap.client.network;
public class LanServerPinger { public net.minecraft.client.network.LanServerPinger wrapperContained; public LanServerPinger(net.minecraft.client.network.LanServerPinger wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String PING_ADDRESS() { return wrapperContained.PING_ADDRESS; }
// public void PING_ADDRESS(java.lang.String value) { wrapperContained.PING_ADDRESS = value; }
public int PING_PORT() { return wrapperContained.PING_PORT; }
// public void PING_PORT(int value) { wrapperContained.PING_PORT = value; }
// public long PING_INTERVAL() { return wrapperContained.PING_INTERVAL; }
// public void PING_INTERVAL(long value) { wrapperContained.PING_INTERVAL = value; }
// public java.util.concurrent.atomic.AtomicInteger THREAD_ID() { return wrapperContained.THREAD_ID; }
// public void THREAD_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.THREAD_ID = value; }
// public java.lang.String motd() { return wrapperContained.motd; }
// public void motd(java.lang.String value) { wrapperContained.motd = value; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public java.net.DatagramSocket socket() { return wrapperContained.socket; }
// public void socket(java.net.DatagramSocket value) { wrapperContained.socket = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String addressPort() { return wrapperContained.addressPort; }
// public void addressPort(java.lang.String value) { wrapperContained.addressPort = value; }
public java.lang.String createAnnouncement(java.lang.String motd,java.lang.String addressPort) { return wrapperContained.createAnnouncement(motd,addressPort); }
public java.lang.String parseAnnouncementMotd(java.lang.String announcement) { return wrapperContained.parseAnnouncementMotd(announcement); }
public java.lang.String parseAnnouncementAddressPort(java.lang.String announcement) { return wrapperContained.parseAnnouncementAddressPort(announcement); }

}