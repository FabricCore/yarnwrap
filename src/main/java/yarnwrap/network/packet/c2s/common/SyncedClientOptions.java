package yarnwrap.network.packet.c2s.common;
public class SyncedClientOptions { public net.minecraft.network.packet.c2s.common.SyncedClientOptions wrapperContained; public SyncedClientOptions(net.minecraft.network.packet.c2s.common.SyncedClientOptions wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean chatColorsEnabled() { return wrapperContained.chatColorsEnabled; }
// public void chatColorsEnabled(boolean value) { wrapperContained.chatColorsEnabled = value; }
// public static boolean chatColorsEnabled() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.chatColorsEnabled; }
// public static void chatColorsEnabled(boolean value, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.chatColorsEnabled = value; }

// public int playerModelParts() { return wrapperContained.playerModelParts; }
// public void playerModelParts(int value) { wrapperContained.playerModelParts = value; }
// public static int playerModelParts() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.playerModelParts; }
// public static void playerModelParts(int value, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.playerModelParts = value; }

// public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm); }
// public void mainArm(yarnwrap.util.Arm value) { wrapperContained.mainArm = value.wrapperContained; }
// public static yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(net.minecraft.network.packet.c2s.common.SyncedClientOptions.mainArm); }
// public static void mainArm(yarnwrap.util.Arm value, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.mainArm = value.wrapperContained; }

// public boolean filtersText() { return wrapperContained.filtersText; }
// public void filtersText(boolean value) { wrapperContained.filtersText = value; }
// public static boolean filtersText() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.filtersText; }
// public static void filtersText(boolean value, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.filtersText = value; }

// public boolean allowsServerListing() { return wrapperContained.allowsServerListing; }
// public void allowsServerListing(boolean value) { wrapperContained.allowsServerListing = value; }
// public static boolean allowsServerListing() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.allowsServerListing; }
// public static void allowsServerListing(boolean value, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.allowsServerListing = value; }

// public int MAX_LANGUAGE_CODE_LENGTH() { return wrapperContained.MAX_LANGUAGE_CODE_LENGTH; }
// public void MAX_LANGUAGE_CODE_LENGTH(int value) { wrapperContained.MAX_LANGUAGE_CODE_LENGTH = value; }
public static int MAX_LANGUAGE_CODE_LENGTH() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.MAX_LANGUAGE_CODE_LENGTH; }
// public static void MAX_LANGUAGE_CODE_LENGTH(int value, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.MAX_LANGUAGE_CODE_LENGTH = value; }

public SyncedClientOptions(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.c2s.common.SyncedClientOptions(buf.wrapperContained); }
// public boolean chatColorsEnabled() { return wrapperContained.chatColorsEnabled(); }
// // public static boolean chatColorsEnabled() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.chatColorsEnabled(); }
// public int playerModelParts() { return wrapperContained.playerModelParts(); }
// // public static int playerModelParts() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.playerModelParts(); }
// public yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(wrapperContained.mainArm()); }
// // public static yarnwrap.util.Arm mainArm() { return new yarnwrap.util.Arm(net.minecraft.network.packet.c2s.common.SyncedClientOptions.mainArm()); }
// public boolean filtersText() { return wrapperContained.filtersText(); }
// // public static boolean filtersText() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.filtersText(); }
// public boolean allowsServerListing() { return wrapperContained.allowsServerListing(); }
// // public static boolean allowsServerListing() { return net.minecraft.network.packet.c2s.common.SyncedClientOptions.allowsServerListing(); }
// public yarnwrap.network.packet.c2s.common.SyncedClientOptions createDefault() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(wrapperContained.createDefault()); }
public static yarnwrap.network.packet.c2s.common.SyncedClientOptions createDefault() { return new yarnwrap.network.packet.c2s.common.SyncedClientOptions(net.minecraft.network.packet.c2s.common.SyncedClientOptions.createDefault()); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.c2s.common.SyncedClientOptions.write(buf.wrapperContained); }

}