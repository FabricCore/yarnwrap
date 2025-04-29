package yarnwrap.network.listener;
public class PacketListener { public net.minecraft.network.listener.PacketListener wrapperContained; public PacketListener(net.minecraft.network.listener.PacketListener wrapperContained) { this.wrapperContained = wrapperContained; }

public void onDisconnected(yarnwrap.network.DisconnectionInfo info) { wrapperContained.onDisconnected(info.wrapperContained); }
// public static void onDisconnected(yarnwrap.network.DisconnectionInfo info, ) { net.minecraft.network.listener.PacketListener.onDisconnected(info.wrapperContained); }
public boolean isConnectionOpen() { return wrapperContained.isConnectionOpen(); }
// public static boolean isConnectionOpen() { return net.minecraft.network.listener.PacketListener.isConnectionOpen(); }
public yarnwrap.network.NetworkPhase getPhase() { return new yarnwrap.network.NetworkPhase(wrapperContained.getPhase()); }
// public static yarnwrap.network.NetworkPhase getPhase() { return new yarnwrap.network.NetworkPhase(net.minecraft.network.listener.PacketListener.getPhase()); }
public boolean accepts(yarnwrap.network.packet.Packet packet) { return wrapperContained.accepts(packet.wrapperContained); }
// public static boolean accepts(yarnwrap.network.packet.Packet packet, ) { return net.minecraft.network.listener.PacketListener.accepts(packet.wrapperContained); }
public yarnwrap.network.NetworkSide getSide() { return new yarnwrap.network.NetworkSide(wrapperContained.getSide()); }
// public static yarnwrap.network.NetworkSide getSide() { return new yarnwrap.network.NetworkSide(net.minecraft.network.listener.PacketListener.getSide()); }
public void addCustomCrashReportInfo(yarnwrap.util.crash.CrashReport report,yarnwrap.util.crash.CrashReportSection section) { wrapperContained.addCustomCrashReportInfo(report.wrapperContained,section.wrapperContained); }
// public static void addCustomCrashReportInfo(yarnwrap.util.crash.CrashReport report,yarnwrap.util.crash.CrashReportSection section, ) { net.minecraft.network.listener.PacketListener.addCustomCrashReportInfo(report.wrapperContained,section.wrapperContained); }
public void fillCrashReport(yarnwrap.util.crash.CrashReport report) { wrapperContained.fillCrashReport(report.wrapperContained); }
// public static void fillCrashReport(yarnwrap.util.crash.CrashReport report, ) { net.minecraft.network.listener.PacketListener.fillCrashReport(report.wrapperContained); }
public void onPacketException(yarnwrap.network.packet.Packet packet,java.lang.Exception exception) { wrapperContained.onPacketException(packet.wrapperContained,exception); }
// public static void onPacketException(yarnwrap.network.packet.Packet packet,java.lang.Exception exception, ) { net.minecraft.network.listener.PacketListener.onPacketException(packet.wrapperContained,exception); }
public yarnwrap.network.DisconnectionInfo createDisconnectionInfo(yarnwrap.text.Text reason,java.lang.Throwable exception) { return new yarnwrap.network.DisconnectionInfo(wrapperContained.createDisconnectionInfo(reason.wrapperContained,exception)); }
// public static yarnwrap.network.DisconnectionInfo createDisconnectionInfo(yarnwrap.text.Text reason,java.lang.Throwable exception, ) { return new yarnwrap.network.DisconnectionInfo(net.minecraft.network.listener.PacketListener.createDisconnectionInfo(reason.wrapperContained,exception)); }

}